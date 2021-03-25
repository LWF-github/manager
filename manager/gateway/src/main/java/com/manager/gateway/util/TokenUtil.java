package com.manager.gateway.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Date;

/**
 * ClassName:TokenUtil
 */
@Slf4j
public class TokenUtil {
    //过期时间
    private static final long EXPIRE_TIME = 15 * 60 * 1000;
    //私钥
    private static final String TOKEN_SECRET = "privateKey";

    /**
     * 生成Token
     *
     * @param username  账户
     * @param password 密码
     * @return 返回Token
     */
    public static String createJwtToken(String username, String password) {
        //签名算法
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
        //生成签发时间，直接获取系统毫秒数
        long nowTime = System.currentTimeMillis();
        Date nowDate = new Date(nowTime);
        //通过密钥签名JWT
        byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(TOKEN_SECRET);
        String string = signatureAlgorithm.getJcaName();
        Key signingkey = new SecretKeySpec(apiKeySecretBytes, string);
        //设置JWT声明
        JwtBuilder jwtBuilder = Jwts.builder()
                .setId(username)
                .claim("password", password)
                .setIssuedAt(nowDate)
                .signWith(signatureAlgorithm, signingkey);
        //过期时间
        long expMillis = nowTime + EXPIRE_TIME;
        Date exp = new Date(expMillis);
        jwtBuilder.setExpiration(exp);
        //构建JWT并将其序列化为一个紧凑的url安全字符串
        return jwtBuilder.compact();
    }

    public static void main(String[] args) {
        String jwtToken = createJwtToken("zhangsan", "123456");
        System.out.println(jwtToken);
        Claims jwt = parseJWT(jwtToken);
        System.out.println(jwt);
    }

    /**
     * Token解析方法
     */
    public static Claims parseJWT(String jwt) {
        return Jwts.parser().setSigningKey(DatatypeConverter.parseBase64Binary(TOKEN_SECRET)).parseClaimsJws(jwt).getBody();
    }

    /**
     * Token验证
     * <p>true：验证成功</p>
     */
    public static boolean checkToken(String token) {
        if (StringUtils.isEmpty(token)) {
            log.error("用户token验证失败，token为空！");
            return false;
        }
        try {
            Jwts.parser().setSigningKey(DatatypeConverter.parseBase64Binary(TOKEN_SECRET)).parseClaimsJws(token);
            return true;
        } catch (Exception e) {
            log.error("用户token验证失败，token：[" + token + "]", e);
            return false;
        }
    }

}
