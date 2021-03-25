package com.admin.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParamsDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String resNo;
    //微格编码
	private String wresNo;
    private String channelType;//渠道类型

 
    private Integer gwmFid;
    private Integer gwmId; //小区id
    
    //扩展表
    private String extend;
    
    private String gwmUserName;
    //场景编码
    private String sceneType;
    //场景表
    private String sceneTable;
    //分页起始
  	private Integer pageStart;
  	//一页多少条数据
  	private Integer pageSize;

  	
  	private String gwmSceneType;

	//数据来源
	private Integer gwmStatus;
	//小区名称
	private String gwmInfoName;
  	
  	//场景细类
  	private String gwmInfotype;
  	
  	/**
  	 * 层、房间的追加    参数定义
  	 */
  	// 楼层Id
 	private Integer buildIngEid;
    // 单元Id
  	private Integer unitEid;
  	// 新传进来的总层数
  	private Integer allFloorCount;
    // 原始层数
   	private Integer FloorCount;
   	
	// 新传进来的总户数
  	private Integer allRoomCount;
    // 原始户数
   	private Integer RoomCount; 
   	
   	private Integer isAdd;// 1 追加  、0新增不追加
   	
   	private String roomId;
   	

   	
   	/**
   	 * 导出功能参数
   	 */
   	// 是否宽带用户 (是或否)
    private String hastv;
  	// 移动、电信、联通 、其他
  	private String sptype;
  	private String hasnet;
  	
  	private String flag;
  	
  	private String names;
  	
  	private String scope;
	private String wgGrid;
	private Integer objectId;
	private Integer districtid;
	private Integer cityCode;
	private Integer countyCode;

	//表明
	private String tableName;
	//id
	private Integer id;
	
	//录入状态(0:已录入；1：未录入；2部分录入)
	private Integer status;
	//场景小类
	private String sceneSubClass;
}
