import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;

public class test {
    public static void main(String[] args) {
        String sjiachun = "6.1000000000103E19";
        BigDecimal db = new BigDecimal(sjiachun);
        String ii = db.toPlainString();
        BigInteger b = new BigInteger(ii).add(new BigInteger(String.valueOf(1)));
        System.out.println(b);
    }
}
