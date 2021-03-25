package com.admin.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 客户信息DTO
 * @author w_b
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    //客户标识
  	private Integer gwmId;
  	//客户类型
  	private String gwmCustType;
  	//房号
  	private String gwmRoom;
  	//楼层数
  	private Integer gwmFloor;
  	//证件号码
  	private String gwmName;
  	//姓名
  	private String gwmUsername;
  	//电话号码
  	private String gwmPhone;
  	//家庭成员数
  	private Integer gwmHomePeople;
  	//是否有儿童
  	private String gwmHaschilds;
  	//是否有老人
  	private String gwmHasold;
  	//当前套餐
  	private String gwmProduct;
  	//是否办理宽带
  	private String gwmHasnet;
  	//运营商类型
  	private String gwmSptype;
  	//宽带到期时间
  	private String gwmExpdate;
  	//是否有电视
  	private String gwmHastv;
  	//地址
  	private String gwmAddress;
  	//登记
  	private String gwmCuslevel;
  	//房间id
  	private Integer roomEid;
  	//是否含有固话
  	private String gwmHastelephone;
  	//数据来源(数据打标状态(1:导入用户;2:页面新增用户)
	private Integer gwmStatus;
  	//小区名称
	private String gwmInfoName;
}