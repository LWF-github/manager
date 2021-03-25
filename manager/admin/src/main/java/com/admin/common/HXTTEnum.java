//package com.admin.common;
//
///**
// * 枚举
// *
// * @author prodigal
// * @date 2020/05/13
// */
//public class HXTTEnum {
//
//    // 地市常量
//    public static enum District {
//        // 广东省编码
//        GDCODE("GDCODE", "4400"),
//
//        // 广州市编码
//        GZCODE("GZCODE", "4401");
//
//        private final String name;
//
//        private final String value;
//
//        private District(String name, String value) {
//            this.name = name;
//            this.value = value;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public String getValue() {
//            return value;
//        }
//    }
//
//    /** 场景分类拓展 - 数组 **/
//    /**
//     * "HXTT_SENCE1EXT","HXTT_SENCE2EXT","HXTT_SENCE3EXT","HXTT_SENCE4EXT","HXTT_SENCE5EXT","HXTT_SENCE6EXT",
//    		"HXTT_SENCE7EXT","HXTT_SENCE8EXT","HXTT_SENCE9EXT","HXTT_SENCE10EXT","HXTT_SENCE11EXT","HXTT_SENCE12EXT","HXTT_SENCE13EXT","HXTT_SENCE14EXT",
//    		"HXTT_SENCE15EXT","HXTT_SENCE16EXT","HXTT_SENCE17EXT"
//     */
//    public static final String SENCEEXT_TYPE[] = {"HXTT_SENCE14EXT","HXTT_SENCE7EXT"};
//    public static final String TABLE_SCENE[] = {"HXTT_SCENE_P","HXTT_SCENE_TYPE","HXTT_CUNWEIHUI","HXTT_JIAOTONGFUWU","HXTT_JIAOTONGSHUNIU",
//            "HXTT_JUMINGXIAOQU","HXTT_MINGZHAI","HXTT_QIYE","HXTT_SHANGPU","HXTT_SHEQU","HXTT_WENHUALVYOU","HXTT_SHICHANG",
//            "HXTT_XUEXIAO","HXTT_YUANQU","HXTT_ZHENGFUJIGUAN","HXTT_ZHUSU","HXTT_SHANGWULOUYU","HXTT_YILIAO","HXTT_SHANGYEZONGHETI"};
//    public static final String LAYER_TABLE[] = {"Accommodation","Government","Medical","School","CulturalTourism","Market","Community",
//            "ShoppingMall","Block","Store","Enterprise","PrivateHouse","Residence","TrafficService","Village","TrafficHinge","IndustrialPark"};
//    //居民小区细类信息
//    public static final String SENCE_TYPE[] = {"存量小区总数量","已关联场景面家宽小区数量","未关联场景面家宽小区数量","未采集家宽小区数量"};
//
//    //4A验证标识符
//    public static final String TOKEN = "sx_gis";
//
//  //DES加密秘钥
//    public static final String PASSWORD = "sxgis";
//
//    // user信息
//    public static enum UserConstant {
//        // 组织名称
//        ORG_NAME("ORG_NAME_DISPLAY"),
//
//        // 组织编码
//        HR_ORG_CODE("MDM_ORG_CODE"),
//
//        // 组织父级编码
//        BIG_ORG_CODE("BIG_ORG_CODE"),
//
//        // PRI_KEY
//        PRI_KEY("PRI_KEY"),
//
//        // 人员基本信息
//        SB_SOA_SOA_IMPORTEMPBPELINFOSRVINPUTITEM("SB_SOA_SOA_ImportEmpBpelInfoSrvInputItem"),
//
//        // 人员账号信息实体
//        EMP_EMAIL_INFO("EMP_EMAIL_INFO"),
//
//        // 人员岗位信息实体
//        EMP_SITE_INFO("EMP_SITE_INFO"),
//
//        // 人员通讯录信息实体
//        EMP_NOTE_INFO("EMP_NOTE_INFO"),
//
//        // 人员银行信息实体
//        EMP_BANK_INFO("EMP_BANK_INFO"),
//
//        // 业务类型 1新增 2修改 3删除
//        COMMANDTYPE("COMMANDTYPE"),
//
//        // HR编码
//        HR_CODE("HR_EMP_CODE"),
//
//        // 人员编码
//        EMP_CODE("MDM_EMP_CODE"),
//
//        // 账号
//        EMP_ACCOUNT("EMAIL_ID"),
//
//        // 姓名
//        EMP_NAME("EMP_NAME"),
//
//        // 人员类型 1:HR人员、3营业性外包人员（挂渠道组织）、4:劳务派遣人员、5:紧密型外包人员、6:退休人员、7:临时人员
//        EMP_TYPE("CUNC_PERSON_TYPE"),
//
//        // 手机号码
//        EMP_PHONE_NUM("MOB_TEL"),
//
//        // 邮箱地址
//        EMP_EMAIL("EMAIL_ADDRESS"),
//
//        // 部门编码
//        EDPT_CODE("DEPT_CODE"),
//
//        // 部门名称
//        EDPT_NAME("DEPT_NAME"),
//
//        // 岗位类型
//        POSITION_TYPE("SITE_TYPE"),
//
//        // 账号状态 0有效 1无效
//        ACCOUNT_STATUS("RESERVED_5"),
//
//        // 人员状态 0有效 1无效
//        EMP_STATUS("RESERVED_12");
//
//        private UserConstant(String tag) {
//            this.tag = tag;
//        }
//
//        private String tag;
//
//        public String getTag() {
//            return tag;
//        }
//    }
//
//    // 业务类型
//    public static enum BusinessType {
//        // 同步用户成功
//        SYNCHUSERSUCCESS("自助区域分析用户同步成功", "1"),
//
//        // 同步组织成功
//        SYNCHORGSUCCESS("自助区域分析组织同步成功", "1"),
//
//        // 同步组织失败
//        SYNCHORGFAILURE("自助区域分析组织同步失败", "0"),
//
//        // 同步用户失败
//        SYNCHUSERFAILURE("自助区域分析用户同步失败", "0"),
//
//        // 系统编码
//        SYS_CODE("AUTO_ANALYSIS", "0"),
//
//        // 新增
//        ADD("ADD", "1"),
//
//        // 修改
//        EDIT("EDIT", "2"),
//
//        // 删除
//        DEL("DEL", "3"),
//
//        // 组织新增
//        ORGANIZEADD("ORGANIZEADD", "8"),
//
//        // 组织修改
//        ORGANIZEEDIT("ORGANIZEEDIT", "9"),
//
//        // 组织删除
//        ORGANIZEDEL("ORGANIZEDEL", "10"),
//
//        // 有效
//        EFFECTIVE("有效", "0"),
//
//        // 无效
//        INVALID("无效", "1"),
//
//        // HR人员
//        HR_STAFF("HR人员", "1"),
//
//        // 营业性外包人员
//        COMMERCIALOUTSOURCING_STAFF("营业性外包人员", "3"),
//
//        // 劳务派遣人员
//        LABORDISPATCH_STAFF("劳务派遣人员", "4"),
//
//        // 紧密型外包人员
//        TIGHTOUTSOURCING_STAFF("紧密型外包人员", "5"),
//
//        // 退休人员
//        RETIRED_STAFF("退休人员", "6"),
//
//        // 临时人员
//        TEMPORARY_STAFF("临时人员", "2"),
//
//        // 主岗
//        MAINDUTY("主岗", "1"),
//
//        // 借调
//        SECONDMENT("借调", "2"),
//
//        // 兼职
//        MOONLIGHT("兼职", "3");
//
//        private String des;
//
//        private String num;
//
//        private BusinessType(String des, String num) {
//            this.des = des;
//            this.num = num;
//        }
//
//        public String getDes() {
//            return des;
//        }
//
//        public String getNum() {
//            return num;
//        }
//    }
//
//    public static enum Module {
//        /* 操作类型 */
//        ADD("|ADD", "增加"),
//        DELETE("|DELETE", "删除"),
//        UPDATE("|UPDATE", "修改"),
//        QUERY("|QUERY", "查询"),
//        UPLOAD("|UPLOAD", "上传"),
//        DOWNLOAD("|DOWNLOAD", "下载"),
//
//
//        AUTOANALYSIS("AUTOANALYSIS", "自助区域分析"),
//        INTEGRATION4A("INTEGRATION4A", "4A"),
//        ELASTICSEARCH("ELASTICSEARCH", "es"),
//        INITLOGIN("INITLOGIN", "init login"),
//        NETWORK("NETWORK", "网络"),
//        SYNCHDATA("SYNCHDATA", "SYNCHDATA"),
//        EXPORTEXCEL("EXPORTEXCEL", "导出Excel"),
//        PRINTMAP("PRINTMAP", "打印地图"),
//        FEEDBACK("FEEDBACK", "反馈"),
//        REGION("REGION", "区域"),
//        RELATION_ANALYSIS("RELATION_ANALYSIS", "关联分析"),
//        DRAW_TRAFFIC("DRAW_TRAFFIC", "门店精准引流"),
//        RESOURCE_ANALYSIS("RESOURCE_ANALYSIS", "客服关系平台"),
//        GRIDMANAGER("GRIDMANAGER", "网格资源化管理"),
//        COMPLAINT("COMPLAINT", "客服投诉综合应用平台"),
//
//        /** unicom-file */
//        FILE_UPLOAD("FILE_UPLOAD", "上传多个文件"),
//        FILE_DOWNLOAD("FILE_DOWNLOAD", "下载文件"),
//        FILE_DELETE("FILE_DELETE", "删除文件"),
//        DATAEXCEL5G_UPLOAD("DATAEXCEL5G_UPLOAD", "5G数据上传"),
//        DATAEXCELPUBLIC_UPLOAD("DATAEXCELPUBLIC_UPLOAD", "社会渠道模板上传"),
//        DATAEXCELSERVICE_UPLOAD("DATAEXCELSERVICE_UPLOAD", "自有渠道模板上传"),
//        DATAEXCELPUBLIC_SERVICE_UPLOAD("DATAEXCELPUBLIC_SERVICE_UPLOAD", "渠道模板数据上传(两个sheet一起解析)"),
//
//        /* 工单 unicom-geofenceserver */
//        ORDER("ORDER", "工单模块"),
//        RESOURSE("RESOURSE", "资源模块"),
//        ORDERFILE("ORDERFILE", "附件模块"),
//
//        PLATFORM_MANAGER_APPLICATION("PLATFORM_MANAGER_APPLICATION", "平台管理#应用管理模块"),
//        PLATFORM_MANAGER_ENTITY("PLATFORM_MANAGER_ENTITY", "平台管理#受控实体管理模块"),
//        PLATFORM_MANAGER_ENTITYATTIBUTE("PLATFORM_MANAGER_ENTITYATTIBUTE", "平台管理#实体属性管理模块"),
//        PLATFORM_MANAGER_ROLE("PLATFORM_MANAGER_ROLE", "平台管理#角色模块"),
//        PLATFORM_MANAGER_FOLDER("PLATFORM_MANAGER_FOLDER", "平台管理#菜单模块"),
//        PLATFORM_MANAGER_LAYER("PLATFORM_MANAGER_LAYER", "平台管理#图层模块"),
//        PLATFORM_MANAGER_USER("PLATFORM_MANAGER_USER", "平台管理#人员模块"),
//        PLATFORM_MANAGER_ORGANIZATION("PLATFORM_MANAGER_ORGANIZATION", "平台管理#组织模块"),
//        PLATFORM_MANAGER_DISTRICT("PLATFORM_MANAGER_DISTRICT", "平台管理#行政区划模块"),
//        PLATFORM_MANAGER_INDICATOR("PLATFORM_MANAGER_INDICATOR", "平台管理#指标模块"),
//        PLATFORM_MANAGER_ROLESET("PLATFORM_MANAGER_ROLESET", "平台管理#角色设定模块"),
//        PLATFORM_MANAGER("PLATFORM_MANAGER", "平台管理")
//
//        ;
//
//        private String module;
//        private String name;
//
//        private Module(String module, String name) {
//            this.module = module;
//            this.name = name;
//        }
//
//        public String getModule() {
//            return module;
//        }
//        public String getName() {
//            return name;
//        }
//
//    }
//
//    public static enum AppTag {
//        AUTOANALYSIS("AUTOANALYSIS", "自助区域分析"),
//        GEOFENCE("GEOFENCE", "资源标注"),
//        G2NET("G2NET", "2g网络精简"),
//        SYNCH("SYNCH", "同步组织、人员"),
//        DRAW_TRAFFIC("DRAW_TRAFFIC", "门店精准引流"),
//        FILE("FILE", "unicom-file文件系统"),
//        GRIDMANAGER("GRIDMANAGER", "网格资源化管理"),
//        RESOURCE_ANALYSIS("RESOURCE_ANALYSIS", "客服关系平台"),
//        PLATFORM_MANAGER("PLATFORM_MANAGER", "平台管理"),
//        RED_SEPTEMBER_SCHOOL("RED_SEPTEMBER_SCHOOL", "红9月校园专题"),
//        COMPLAINT("COMPLAINT", "客服投诉综合应用平台");
//
//        private String appId;
//        private String name;
//
//        private AppTag(String appId, String name) {
//            this.appId = appId;
//            this.name = name;
//        }
//
//        public String getAppId() {
//            return appId;
//        }
//        public String getName() {
//            return name;
//        }
//
//    }
//
//    public static enum Layer {
//        HXTT_STATION_2G(1, "HXTT_STATION_2G", "2G基站服务"),
//        HXTT_STATION_3G(2, "HXTT_STATION_3G", "3G基站服务"),
//        HXTT_STATION_4G(3, "HXTT_STATION_4G", "4G基站服务"),
//        HXTT_STATION_5G(4, "HXTT_STATION_5G", "5G基站服务"),
//        HXTT_CHL_PUBLIC(5, "HXTT_CHL_PUBLIC", "社会渠道服务"),
//        HXTT_CHL_SERVICEHALL(6, "HXTT_CHL_SERVICEHALL", "营业厅服务"),
//        HXTT_ACCESS_POINT(7, "HXTT_ACCESS_POINT", "接入间服务"),
////        HXTT_ACCESS_POLYGON(8, "HXTT_ACCESS_POLYGON", "接入间面图层"),
//        HXTT_STATION_5G_JW(9, "HXTT_STATION_5G_JW", "5G自建服务"),
//        HXTT_STATION_5G_SHARE(10, "HXTT_STATION_5G_SHARE", "5G共享服务"),
//        HXTT_EQUIPMENT_OBD(11, "HXTT_EQUIPMENT_OBD", "分光器服务"),
//        HXTT_EQUIPMENT_FDPOINT(12, "HXTT_EQUIPMENT_FDPOINT", "分纤盒服务"),
//
////        HXTT_COMPLAINT(13,"complaint", "投诉服务"),
//        HXTT_POPULATION_PT(14,"HXTT_POPULATION_PT", "常住人口服务"),
//        HXTT_STATION_CAP_SCHOOL(15,"schoolList", "校园服务"),
//
//        HXTT_COMPLAINT(15, "complaint", "投诉图层"),
//        HXTT_SCORE(16, "score", "评分图层");
//
//        private int layerId;
//
//        private String layerName;
//
//        private String layerRemark;
//
//        private Layer(int layerId, String layerName, String layerRemark) {
//            this.layerId = layerId;
//            this.layerName = layerName;
//            this.layerRemark = layerRemark;
//        }
//
//        public int LayerId() {
//            return layerId;
//        }
//
//        public String LayerName() {
//            return layerName;
//        }
//
//        public String layerRemark() {
//            return layerRemark;
//        }
//
//        public static Integer getLayerId(String layerName) {
//            Layer[] layers = values();
//            for (Layer layer : layers) {
//                if (layer.LayerName().equals(layerName)) {
//                    return layer.LayerId();
//                }
//            }
//            return null;
//        }
//    }
//
//    /***
//     * 分析类型
//     */
//    public static enum AnalysisType {
//
//        /** 圆形选择 */
//        CIRCLE("circle", "圆形选择"),
//        /** 多边形选择 */
//        POLYGON("polygon", "多边形选择"),
//        /** 行政区划查询 */
//        ADMIN_AREA("adminArea", "行政区划查询");
//
//        private String code;
//
//        private String name;
//
//        private AnalysisType(String code, String name) {
//            this.code = code;
//            this.name = name;
//        }
//
//        public String getCode() {
//            return code;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//    }
//
//    /***
//     * 运营商类型
//     */
//    public static enum Sptype {
//
//        /** 联通 */
//        UNICOM("UNICOM", "联通"),
//        /** 电信 */
//        TELECOM("TELECOM", "电信"),
//        /** 移动 */
//        MOBILE("MOBILE", "移动"),
//        /** 其他 */
//        OTHER("OTHER","其他");
//
//        private final String type;
//        private String name;
//
//        private Sptype(String name,String type) {
//            this.name = name;
//            this.type = type;
//        }
//        public String getName() {
//            return name;
//        }
//        public String getType() {
//            return type;
//        }
//    }
//
//    public static enum Status{
//
//    	ALLYESSTATU(0,"已录入"),
//    	NOSTATU(1,"未录入"),
//    	YESSTATU(2,"部分录入");
//
//    	private Integer statu;
//    	private String value;
//
//	    private Status(Integer statu,String value) {
//            this.statu = statu;
//            this.value = value;
//        }
//	    public Integer getStatu() {
//			return statu;
//		}
//		public String getValue() {
//			return value;
//		}
//
//    }
//
//    public static enum SceneTypes {
//    	HXTT_CUNWEIHUI("HXTT_CUNWEIHUI", "村委会"),
//    	HXTT_JIAOTONGFUWU("HXTT_JIAOTONGFUWU", "交通服务"),
//    	HXTT_JIAOTONGSHUNIU("HXTT_JIAOTONGSHUNIU", "交通枢纽"),
//    	HXTT_JUMINGXIAOQU("HXTT_JUMINGXIAOQU", "居民小区"),
//    	HXTT_MINGZHAI("HXTT_MINGZHAI", "民宅"),
//    	HXTT_QIYE("HXTT_QIYE", "企业"),
//    	HXTT_SHANGPU("HXTT_SHANGPU", "商铺"),
//    	HXTT_SHEQU("HXTT_SHEQU", "社区"),
//    	HXTT_SHICHANG("HXTT_SHICHANG", "市场"),
//    	HXTT_WENHUALVYOU("HXTT_WENHUALVYOU", "文化旅游"),
//    	HXTT_XUEXIAO("HXTT_XUEXIAO", "学校"),
//    	HXTT_YILIAO("HXTT_YILIAO", "医疗"),
//    	HXTT_YUANQU("HXTT_YUANQU", "园区"),
//    	HXTT_ZHENGFUJIGUAN("HXTT_ZHENGFUJIGUAN", "政府机关"),
//    	HXTT_ZHUSU("HXTT_ZHUSU", "住宿");
//
//        private String code;
//
//        private String label;
//
//        private SceneTypes(String code, String label) {
//            this.code = code;
//            this.label = label;
//        }
//
//        public String getCode() {
//            return code;
//        }
//
//        public String getLabel() {
//            return label;
//        }
//
//        public static SceneTypes getByCode(String code) {
//        	SceneTypes[] types = values();
//            for (SceneTypes type : types) {
//                if (type.getCode().equals(code)) {
//                    return type;
//                }
//            }
//            return null;
//        }
//    }
//
//    //poi图层
//    public static enum PoiSceneTypes {
//        VILLAGE("VILLAGE", "村委会"),
//        TRAFFICSERVICE("TRAFFICSERVICE", "交通服务"),
//        TRAFFICHINGE("TRAFFICHINGE", "交通枢纽"),
//        RESIDENCE("RESIDENCE", "居民小区"),
//        PRIVATEHOUSE("PRIVATEHOUSE", "民宅"),
//        HXTT_QIYE("ENTERPRISE", "企业"),
//        STORE("STORE", "商铺"),
//        COMMUNITY("COMMUNITY", "社区"),
//        MARKET("MARKET", "市场"),
//        CULTURALTOURISM("CULTURALTOURISM", "文化旅游"),
//        SCHOOL("SCHOOL", "学校"),
//        MEDICAL("MEDICAL", "医疗"),
//        INDUSTRIALPARK("INDUSTRIALPARK", "园区"),
//        GOVERNMENT("GOVERNMENT", "政府机关"),
//        ACCOMMODATION("ACCOMMODATION", "住宿"),
//        BLOCK("BLOCK", "商务楼宇"),
//        SHOPPINGMALL("SHOPPINGMALL", "商业综合体");
//
//        public String code;
//
//        public String label;
//
//        private PoiSceneTypes(String code, String label) {
//            this.code = code;
//            this.label = label;
//        }
//
//        public String getCode() {
//            return code;
//        }
//
//        public String getLabel() {
//            return label;
//        }
//
//        public static String getByCode(String code) {
//            PoiSceneTypes[] types = values();
//            for (PoiSceneTypes type : types) {
//                if (type.getCode().equals(code)) {
//                    return type.getLabel();
//                }
//            }
//            return null;
//        }
//        public static String getByLabel(String label) {
//            PoiSceneTypes[] types = values();
//            for (PoiSceneTypes type : types) {
//                if (type.getLabel().equals(label)) {
//                    return type.getCode();
//                }
//            }
//            return null;
//        }
//    }
//
//    public static enum ResourceType {
//        HXTT_ACCESS_POINT("HXTT_ACCESS_POINT", "接入间"),
//        HXTT_EQUIPMENT_OBD("HXTT_EQUIPMENT_OBD", "分光器"),
//        HXTT_EQUIPMENT_FDPOINT("HXTT_EQUIPMENT_FDPOINT", "分纤盒");
//
//        private String code;
//
//        private String label;
//
//        private ResourceType(String code, String label) {
//            this.code = code;
//            this.label = label;
//        }
//
//        public String getCode() {
//            return code;
//        }
//
//        public String getLabel() {
//            return label;
//        }
//
//        public static ResourceType getByCode(String code) {
//            ResourceType[] types = values();
//            for (ResourceType type : types) {
//                if (type.getCode().equals(code)) {
//                    return type;
//                }
//            }
//            return null;
//        }
//    }
//    /**
//     * 场景枚举
//     * @author 86132
//     *
//     */
//    public static enum SceneType {
//    	HXTT_SENCE1EXT("政府机关", "HXTT_SENCE1EXT","ZF00001"),
//    	HXTT_SENCE2EXT("学校", "HXTT_SENCE2EXT","XX90002"),
//    	HXTT_SENCE3EXT("医疗", "HXTT_SENCE3EXT","YL90003"),
//    	HXTT_SENCE4EXT("社区", "HXTT_SENCE4EXT","SQ90004"),
//    	HXTT_SENCE5EXT("住宿", "HXTT_SENCE5EXT","ZS90005"),
//    	HXTT_SENCE6EXT("市场", "HXTT_SENCE6EXT","SC90006"),
//    	HXTT_SENCE7EXT("商铺", "HXTT_SENCE7EXT","SP90007"),
//    	HXTT_SENCE8EXT("商业综合体", "HXTT_SENCE8EXT","SY90008"),
//    	HXTT_SENCE9EXT("企业", "HXTT_SENCE9EXT","QY90009"),
//    	HXTT_SENCE10EXT("园区", "HXTT_SENCE10EXT","YQ90010"),
//    	HXTT_SENCE11EXT("交通枢纽", "HXTT_SENCE11EXT","JS90011"),
//    	HXTT_SENCE12EXT("交通服务", "HXTT_SENCE12EXT","JF90012"),
//    	HXTT_SENCE13EXT("商务楼宇", "HXTT_SENCE13EXT","SW90013"),
//    	HXTT_SENCE14EXT("居民小区", "HXTT_SENCE14EXT","JM90014"),
//    	HXTT_SENCE15EXT("民宅", "HXTT_SENCE15EXT","MZ90015"),
//    	HXTT_SENCE16EXT("文化旅游", "HXTT_SENCE16EXT","WH90016"),
//    	HXTT_SENCE17EXT("村委会", "HXTT_SENCE17EXT","CW90017");
//
//        private String code;
//
//        private String label;
//
//        private String encrypt;
//
//        private SceneType(String code, String label,String encrypt) {
//            this.code = code;
//            this.label = label;
//            this.encrypt = encrypt;
//        }
//
//        public String getCode() {
//            return code;
//        }
//
//        public String getLabel() {
//            return label;
//        }
//
//        public String getEncrypt() {
//			return encrypt;
//		}
//
//		public static String getByCodes(String code) {
//        	SceneType[] types = values();
//            for (SceneType type : types) {
//                if (type.getCode().equals(code)) {
//                    return type.getEncrypt();
//                }
//
//            }
//            return null;
//        }
//
//		public static String getByCodesV1(String code) {
//        	SceneType[] types = values();
//            for (SceneType type : types) {
//                if (type.getEncrypt().equals(code)) {
//                    return type.getCode();
//                }
//
//            }
//            return null;
//        }
//
//		public static String getByCode(String code) {
//        	SceneType[] types = values();
//            for (SceneType type : types) {
//                if (type.getCode().equals(code)) {
//                    return type.getLabel();
//                }
//            }
//            return null;
//        }
//
//		public static String getEncrypt(String encrypt) {
//        	SceneType[] types = values();
//            for (SceneType type : types) {
//                if (type.getEncrypt().equals(encrypt)) {
//                    return type.getLabel();
//                }
//            }
//            return null;
//        }
//    }
//
//    /**
//     * 场景枚举
//     * @author 86132
//     *
//     */
//    public static enum SceneTable {
//    	HXTT_JUMINXIAOQU("政府机关", "HXTT_ZHENGFUJIGUAN"),
//    	HXTT_SHUANGPU("学校", "HXTT_XUEXIAO"),
//    	HXTT_YILIAO("医疗", "HXTT_YILIAO"),
//    	HXTT_SHEQU("社区", "HXTT_SHEQU"),
//    	HXTT_ZHUSU("住宿", "HXTT_ZHUSU"),
//    	HXTT_SHICHANG("市场", "HXTT_SHICHANG"),
//    	HXTT_SHANGPU("商铺", "HXTT_SHANGPU"),
//    	HXTT_SHANGYEZONGHETI("商业综合体", "HXTT_SHANGYEZONGHETI"),
//    	HXTT_QIYE("企业", "HXTT_QIYE"),
//    	HXTT_YUANQU("园区", "HXTT_YUANQU"),
//    	HXTT_JIAOTONGSHUNIU("交通枢纽", "HXTT_JIAOTONGSHUNIU"),
//    	HXTT_JIAOTONGFUWU("交通服务", "HXTT_JIAOTONGFUWU"),
//    	HXTT_SHANGWULOUYU("商务楼宇", "HXTT_SHANGWULOUYU"),
//    	HXTT_JUMINGXIAOQU("居民小区", "HXTT_JUMINGXIAOQU"),
//    	HXTT_MINGZHAI("民宅", "HXTT_MINGZHAI"),
//    	HXTT_WENHUALVYOU("文化旅游", "HXTT_WENHUALVYOU"),
//    	HXTT_CUNWEIHUI("村委会", "HXTT_CUNWEIHUI");
//
//        private String code;
//
//        private String label;
//
//        private SceneTable(String code, String label) {
//            this.code = code;
//            this.label = label;
//        }
//
//        public String getCode() {
//            return code;
//        }
//
//        public String getLabel() {
//            return label;
//        }
//
//        public static String getByCode(String code) {
//        	SceneTable[] tables = values();
//            for (SceneTable type : tables) {
//                if (type.getCode().equals(code)) {
//                    return type.getLabel();
//                }
//            }
//            return null;
//        }
//    }
//}
