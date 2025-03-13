package com.huoyunren.openapi.enums.uow;

public enum ErrorCode {
    /**
     * 系统内部异常
     */
    SYS_ERROR(500001, "系统内部处理出现异常"),

    /**
     * 业务异常
     */
    BIZ_ERROR(500002, "{0}"),

    /**
     * 参数异常
     */
    PARAMETER_ERROR(500003, "参数异常:{0}"),

    /**
     * 外部接口异常
     */
    REMOTE_API_ERROR(500004, "外部接口异常:{0}"),

    /**
     * 外部接口失败
     */
    REMOTE_API_FAIL(500005, "外部接口失败:{0}"),

    /**
     * 指定外部接口失败
     */
    APPOINT_REMOTE_API_FAIL(500006, "{0}外部接口失败:{1}"),

    /**
     * 参数业务系统与请求业务系统不一致
     */
    PARAMETER_SYSTEM_CODE_DISAGREE_ERROR(500101, "参数业务系统与请求业务系统不一致"),

    /**
     * 运单回单审核通过通用错误
     */
    EVENT_WAYBILL_RECEIPT_CHECK_PASSED_ERROR(501001, "运单回单审核通过通用错误"),

    /**
     * 运单回单审核通过批量查询订单信息出错
     */
    EVENT_WAYBILL_RECEIPT_CHECK_PASSED_BATCH_QUERY_ORDER_ERROR(501002, "运单回单审核通过批量查询订单信息出错"),
    /**
     * 运单运输过程操作信息不能为空
     */
    EVENT_WAYBILL_TRANSPORT_PROCESSES_ERROR(501003, "运单运输过程操作信息不能为空"),
    EVENT_WAYBILL_BASE_ERROR(501004, "运单基础信息不能为空"), EVENT_WAYBILL_SYS_ERROR(501005, "运单系统信息不能为空"),
    EVENT_WAYBILL_HANDLE_ERROR(501006, "运单事件处理器不存在"), EVENT_WAYBILL_ORDER_ERROR(501007, "订单信息缺失"),
    EVENT_WAYBILL_CANCEL_ID_ERROR(501008, "取消事件ID不能为空"),
    EVENT_WAYBILL_NODE_CODE_ERROR(501009, "运单节点编码不能为空"),

    /**
     * 运单创建外部接口调用请求参数异常
     */
    EVENT_WAYBILL_CREATED_REQ_DATA_ERROR(502000, "运单创建外部接口调用请求参数异常"),

    /**
     * 运单创建外部接口调用订单数据异常
     */
    EVENT_WAYBILL_CREATED_ORDER_DATA_ERROR(502001, "运单创建外部接口调用订单数据异常"),

    EVENT_ORDER_NOT_EXIT(503001, "订单不存在"),

    EVENT_ORDER_ASSOCIATED_NUMBER_NOT_EXIT(503002, "委托单号不存在"),

    /**
     * 运单修改原子订单数据异常
     */
    EVENT_WAYBILL_UPDATED_ORI_SUB_ORDER_DATA_ERROR(503003, "运单修改原子订单数据异常"),

    ASSEMBLY_ORDER_DATA_ERROR(503004, "组装订单信息异常"), ASSEMBLY_WAYBILL_DATA_ERROR(503005, "组装运单信息异常"),
    LOAD_WAYBILL_DATA_ERROR(503006, "配载订运单异常"), LOAD_CARRIER_BILLNO_IS_BLANK(503007, "承运商或者运单号为空"),
    SOURCE_TARGET_UNIT_MUST_COEXIST(503008, "源单位和目标单位必须同时传入"),

    SOURCE_TARGET_UNIT_MUST_SAME_TYPE(503009, "源单位和目标单位必须是同一种类型"),
    SOURCE_TARGET_UNIT_NOT_EXIST(503010, "源单位或目标单位未配置"),
    EXTERNAL_TO_EXTERNAL_NOT_SUPPORT(503011, "不支持外部单位转外部"),
    ;

    private final Long code;
    private final String message;

    ErrorCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
    }