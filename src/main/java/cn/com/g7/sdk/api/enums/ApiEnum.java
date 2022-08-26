package cn.com.g7.sdk.api.enums;

/**
 * api地址常量
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/9/17 4:43 下午
 */
public enum ApiEnum {

    /** 查询车辆列表*/
    TRUCK_LIST("/v1/base/truck/truck_list", MethodEnum.POST_BODY),

    /** 查询车辆详情*/
    TRUCK_INFO_CUSTOM_FIELDS("/v1/base/truck/truckinfo_include_custom_fields", MethodEnum.POST_BODY),

    /** 车辆车型详情V1.0*/
    GET_TRUCK_MODEL_INFO("/v1/base/truck/get_truck_model_info", MethodEnum.POST_BODY),

    /** 查询车辆*/
    TRUCK_INFO("/v1/base/truck/truck_info", MethodEnum.POST_BODY),

    /** 设备位置和状态查询*/
    SIMPLE_CURRENTS_BY_GPSNOS("/v1/device/equipment/simple_currents_by_gpsnos", MethodEnum.POST_BODY),

    /** 批量车辆状态查询*/
    TRUCK_CURRENT_INFO_BATCH("/v1/device/truck/current_info/batch", MethodEnum.POST_BODY),

    /** 增加车辆*/
    ADD_SELF_TRUCK("/v1/base/truck/add_self_truck", MethodEnum.POST_BODY),

    /** 删除车辆*/
    TRUCK_DELETE("/v1/base/truck/truck_delete", MethodEnum.POST_BODY),

    /** 更新自有车接口V1.0*/
    UPDATE_SELF_TRUCK("/v1/base/truck/update_self_truck", MethodEnum.POST_BODY),

    /** 按机构查询指定状态设备列表*/
    LIST_GPSNO_BY_STATUS_FROM_ORGCODE("/v1/device/equipment/list_gpsno_by_status_from_orgcode", MethodEnum.GET),

    /** 车辆设备绑定*/
    BIND_DEVICE("/v1/base/device/bind_device", MethodEnum.POST_BODY),

    /** 车辆设备解绑*/
    UNBIND_DEVICE("/v1/base/device/unbind_device", MethodEnum.POST_BODY),

    /** 查询司机信息*/
    DRIVER_LIST("/v1/base/driver/driver_list", MethodEnum.POST_BODY),

    /** 新建司机*/
    CREATE_DRIVER("/v1/base/driver/create_driver", MethodEnum.POST_BODY),

    /** 删除司机*/
    DELETE_DRIVER("/v1/base/driver/delete_driver", MethodEnum.POST_BODY),

    /** 编辑司机信息*/
    EDIT_DRIVER("/v1/base/driver/edit_driver", MethodEnum.POST_BODY),

    /** 司机绑定车辆*/
    BIND_DRIVER("/v1/base/driver/bind_driver", MethodEnum.POST_BODY),

    /** 查询子机构*/
    GET_ALL_SUBORGANS("/v1/ucenter/organ/getAllSubOrgans", MethodEnum.GET),

    /** 根据orgcode获取机构信息*/
    GET_ORG_BY_CODE("/v1/base/org/get_org_by_code", MethodEnum.POST_BODY),

    /** 查询机构的角色*/
    GET_ALL_BY_ORGCODE("/v1/ucenter/role/getAllByOrgcode", MethodEnum.GET),

    /** 新建标注点*/
    MARKER_CREATE("/v1/base/marker/create", MethodEnum.POST_BODY),

    /** 删除标注点*/
    MARKER_DELETE("/v1/base/marker/delete", MethodEnum.POST_BODY),

    /** 更新标注点*/
    MARKER_UPDATE("/v1/base/marker/update", MethodEnum.POST_BODY),

    /** 车辆当前定位V1.0*/
    TRUCK_CURRENT_LOCATION("/v1/device/truck/current_location", MethodEnum.GET),

    /** 车辆状态查询*/
    TRUCK_CURRENT_INFO("/v1/device/truck/current_info", MethodEnum.GET),

    /** 车辆历史轨迹查询*/
    TRUCK_HISTORY_LOCATION("/v1/device/truck/history_location", MethodEnum.GET),

    /** 车辆GPS总里程查询*/
    TRUCK_MILEAGE("/v1/device/truck/mileage", MethodEnum.GET),

    /** 根据车辆，司机，机构查询事件*/
    QUERY_EVENT("/v1/device/event/query_event", MethodEnum.POST_BODY),

    /** 根据设备查询车辆状态*/
    CURRENT_INFO_BY_GPSNO("/v1/device/truck/current_info_by_gpsno", MethodEnum.GET),

    /** 实时视频查询*/
    REAL_TIME_URL("/v1/media/video/real_time_url", MethodEnum.GET),

    /** 根据设备查询车辆历史轨迹*/
    TRUCK_HISTORY_LOCATION_BY_GPSNO("/v1/device/truck/history_location_by_gpsno", MethodEnum.GET),

    /** 温度明细*/
    DAILY_TEMPERATURE("/v1/coldchain/daily/temperature", MethodEnum.GET),

    /** 实时视频-根据车牌获取实时视频连接*/
    REAL_TIME_BY_CAR_NUM("/v1/device/video/real_time_by_carnum", MethodEnum.GET),

    /** 人脸识别-人脸用户信息创建*/
    FACE_DETECT_USER_CREATE("/v1/api/face/user/create", MethodEnum.POST_BODY),

    /** 人脸识别-人脸用户信息修改*/
    FACE_DETECT_USER_UPDATE("/v1/api/face/user/update", MethodEnum.POST_BODY),

    /** 人脸识别-人脸用户信息删除*/
    FACE_DETECT_USER_DELETE("/v1/api/face/user/delete", MethodEnum.POST_BODY),

    /** 人脸识别-人脸用户信息查询*/
    FACE_DETECT_USER_QUERY("/v1/api/face/user/query", MethodEnum.GET),

    /** 人脸识别-车辆标签创建*/
    FACE_DETECT_TRUCK_LABEL_SAVE("/v1/api/truck/label/save", MethodEnum.POST_BODY),

    /** 人脸识别-车辆信息删除*/
    FACE_DETECT_TRUCK_LABEL_DELETE("/v1/api/truck/label/delete", MethodEnum.POST_BODY),

    /** 人脸识别-车辆信息查询*/
    FACE_DETECT_TRUCK_LABEL_QUERY("/v1/api/truck/label/query", MethodEnum.POST_BODY),

    /** 批量下发语音接口（多信息多车辆）*/
    BATCH_SEND_VOICE("/v1/api/message/batch_send_voice", MethodEnum.POST_BODY),

    /** 消息下发结果查询 */
    MESSAGE_SEND_RESULT("/v1/device/message/send_result", MethodEnum.GET),

    //语音对讲
    VOICE_INTERCOM("/v1/api/message/intercom_by_channel", MethodEnum.GET),

    ;

    /** 接口地址*/
    private final String uri;

    /** 请求方式*/
    private final MethodEnum method;

    ApiEnum(String uri, MethodEnum method) {
        this.uri = uri;
        this.method = method;
    }

    public String getUri() {
        return uri;
    }

    public MethodEnum getMethod() {
        return method;
    }
}
