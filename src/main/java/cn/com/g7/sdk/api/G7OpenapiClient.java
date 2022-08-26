package cn.com.g7.sdk.api;

import cn.com.g7.sdk.api.enums.ApiEnum;
import cn.com.g7.sdk.api.enums.GetCountEnum;
import cn.com.g7.sdk.api.request.G7OpenapiResult;
import cn.com.g7.sdk.api.request.IRequest;
import cn.com.g7.sdk.api.request.RequestContext;
import cn.com.g7.sdk.api.request.impl.RestTemplateRequest;
import cn.com.g7.sdk.api.util.AssertUtil;
import cn.com.g7.sdk.api.vo.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Type;
import java.time.Duration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 接口调用客户端
 *
 * 使用方式
 * 1. 根据构造方法创建客户端bean：G7OpenapiClient（可以根据spring boot配置properties或自定义 new G7OpenapiClient(...))，详见README.md
 * 2. 调用接口，每个 G7OpenapiClient 方法代表一个接口
 *
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/9/17 1:56 下午
 */
public class G7OpenapiClient {

    /** 开放平台host，不同环境不一样*/
    private final String url;

    /** 认证accessKey*/
    private final String accessKey;

    /** 认证accessSecret*/
    private final String accessSecret;

    /** 发起请求的具体实现类*/
    private final IRequest request;

    public G7OpenapiClient(String accessKey, String accessSecret) {
        this.url = ApiConstants.URL_ONLINE;
        this.accessKey = accessKey;
        this.accessSecret = accessSecret;
        RestTemplate restTemplate = new RestTemplateBuilder()
                .setReadTimeout(Duration.ofSeconds(ApiConstants.READ_TIMEOUT))
                .setConnectTimeout(Duration.ofSeconds(ApiConstants.CONNECT_TIMEOUT))
                .build();
        this.request = new RestTemplateRequest(restTemplate);
    }

    public G7OpenapiClient(String url, String accessKey, String accessSecret) {
        this.url = url;
        this.accessKey = accessKey;
        this.accessSecret = accessSecret;
        RestTemplate restTemplate = new RestTemplateBuilder()
                .setReadTimeout(Duration.ofSeconds(ApiConstants.READ_TIMEOUT))
                .setConnectTimeout(Duration.ofSeconds(ApiConstants.CONNECT_TIMEOUT))
                .build();
        this.request = new RestTemplateRequest(restTemplate);
    }

    public G7OpenapiClient(String accessKey, String accessSecret, Long connectTimeout, Long readTimeout) {
        this.url = ApiConstants.URL_ONLINE;
        this.accessKey = accessKey;
        this.accessSecret = accessSecret;
        RestTemplate restTemplate = new RestTemplateBuilder()
                .setReadTimeout(Duration.ofSeconds(readTimeout))
                .setConnectTimeout(Duration.ofSeconds(connectTimeout))
                .build();
        this.request = new RestTemplateRequest(restTemplate);
    }

    public G7OpenapiClient(String url, String accessKey, String accessSecret, Long connectTimeout, Long readTimeout) {
        this.url = url;
        this.accessKey = accessKey;
        this.accessSecret = accessSecret;
        RestTemplate restTemplate = new RestTemplateBuilder()
                .setReadTimeout(Duration.ofSeconds(readTimeout))
                .setConnectTimeout(Duration.ofSeconds(connectTimeout))
                .build();
        this.request = new RestTemplateRequest(restTemplate);
    }

    public G7OpenapiClient(String url, String accessKey, String accessSecret, IRequest request) {
        this.url = url;
        this.accessKey = accessKey;
        this.accessSecret = accessSecret;
        this.request = request;
    }

    private RequestContext buildContext(ApiEnum api) {
        RequestContext context = new RequestContext();
        context.setUrl(url);
        context.setUri(api.getUri());
        context.setMethod(api.getMethod());
        context.setAccessKey(accessKey);
        context.setAccessSecret(accessSecret);
        return context;
    }

    /**
     * 查询车辆列表
     * 模糊匹配查询车辆
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fbase%2Ftruck%2Ftruck_list&method=POST&id=4
     *
     * @param req 查询车辆列表请求参数
     * @return 车辆列表
     */
    public List<TruckListInfoResp> truckList(TruckListReq req) {
        RequestContext context = buildContext(ApiEnum.TRUCK_LIST);
        context.setBody(JSON.toJSONString(req));
        Type type = new TypeReference<G7OpenapiResult<List<TruckListInfoResp>>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 查询车辆列表总数
     * 模糊匹配查询车辆
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fbase%2Ftruck%2Ftruck_list&method=POST&id=4
     *
     * @param req 查询车辆列表总数请求参数
     * @return 车辆总数
     */
    public TruckListCountResp truckListCount(TruckListCountReq req) {
        RequestContext context = buildContext(ApiEnum.TRUCK_LIST);
        req.setGetCount(GetCountEnum.OBTAIN.getCode());
        context.setBody(JSON.toJSONString(req));
        Type type = new TypeReference<G7OpenapiResult<TruckListCountResp>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 查询车辆详情
     * 查询车辆详情（有自定义字段），返回所有字段
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fbase%2Ftruck%2Ftruckinfo_include_custom_fields&method=POST&id=5
     *
     * @param req 查询车辆详情请求参数
     * @return 车辆详情（自定义字段）
     */
    public TruckInfoAndCustomFieldResp truckInfoAndCustomField(TruckInfoCustomReq req) {
        RequestContext context = buildContext(ApiEnum.TRUCK_INFO_CUSTOM_FIELDS);
        context.setBody(JSON.toJSONString(req));
        Type type = new TypeReference<G7OpenapiResult<TruckInfoAndCustomFieldResp>>() {}.getType();
        return request.request(context, type);
    }

    /**
     * 车辆车型详情V1.0
     *
     * @param req 车辆车型详情 请求参数
     *            https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fbase%2Ftruck%2Fget_truck_model_info&method=POST&id=6
     * @return 车辆车型详情
     */
    public Map<String, TruckModelInfoResp> getTruckModelInfo(TruckModelInfoReq req) {
        RequestContext context = buildContext(ApiEnum.GET_TRUCK_MODEL_INFO);
        context.setBody(JSON.toJSONString(req));
        Type type = new TypeReference<G7OpenapiResult<LinkedHashMap<String, TruckModelInfoResp>>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 查询车辆
     * 查询车辆详情，可以通过车牌号和绑定关系的设备号查询车辆详情
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fbase%2Ftruck%2Ftruck_info&method=POST&id=3
     *
     * @param req 查询车辆请求参数
     * @return 返回车辆信息列表
     */
    public List<TruckInfoResp> truckInfo(TruckInfoReq req) {
        RequestContext context = buildContext(ApiEnum.TRUCK_INFO);
        context.setBody(JSON.toJSONString(req));
        Type type = new TypeReference<G7OpenapiResult<List<TruckInfoResp>>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 设备位置和状态查询
     * 查询指定设备的最新位置和状态信息
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fdevice%2Fequipment%2Fsimple_currents_by_gpsnos&method=POST&id=45
     *
     * @param req 设备位置和状态查询请求参数
     * @return 设备的最新位置和状态信息
     */
    public List<SimpleCurrentsGpsNoResp> simpleCurrentsGpsNo(SimpleCurrentsGpsNoReq req) {
        RequestContext context = buildContext(ApiEnum.SIMPLE_CURRENTS_BY_GPSNOS);
        context.setBody(JSON.toJSONString(req));
        Type type = new TypeReference<G7OpenapiResult<List<SimpleCurrentsGpsNoResp>>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 批量车辆状态查询
     * 批量返回车辆最新的各种数据，包括定位、状态、温度、等等(最多1Constants.RESULT_CODEConstants.RESULT_CODE)
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fdevice%2Ftruck%2Fcurrent_info%2Fbatch&method=POST&id=33
     *
     * @param req 批量车辆状态查询请求参数
     * @return 车辆最新的各种数据
     */
    public Map<String, TruckCurrentInfoBatchResp> truckCurrentInfoBatch(TruckCurrentInfoBatchReq req) {
        RequestContext context = buildContext(ApiEnum.TRUCK_CURRENT_INFO_BATCH);
        context.setBody(JSON.toJSONString(req));
        Type type = new TypeReference<G7OpenapiResult<LinkedHashMap<String, TruckCurrentInfoBatchResp>>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 增加车辆
     * 增加车辆，在机构中以车牌号添加车辆
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fbase%2Ftruck%2Fadd_self_truck&method=POST&id=1
     *
     * @param req 增加车辆请求参数
     * @return 添加车辆操作信息
     */
    public SelfTruckAddResp addSelfTruck(SelfTruckAddReq req) {
        RequestContext context = buildContext(ApiEnum.ADD_SELF_TRUCK);
        context.setBody(JSON.toJSONString(req));
        Type type = new TypeReference<G7OpenapiResult<SelfTruckAddResp>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 删除车辆
     * 删除车辆，通过车牌号和绑定关系删除车辆
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fbase%2Ftruck%2Ftruck_delete&method=POST&id=2
     *
     * @param req 删除车辆请求参数
     * @return 删除车辆操作信息
     */
    public Map<String, TruckDeleteResp> truckDelete(TruckDeleteReq req) {
        RequestContext context = buildContext(ApiEnum.TRUCK_DELETE);
        context.setBody(JSON.toJSONString(req));
        Type type = new TypeReference<G7OpenapiResult<LinkedHashMap<String, TruckDeleteResp>>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 更新自有车接口V1
     * 更新自有车接口
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fbase%2Ftruck%2Fupdate_self_truck&method=POST&id=7
     *
     * @param req 更新自有车请求参数
     * @return 操作接口是否成功
     */
    public SelfTruckUpdateResp updateSelfTruck(SelfTruckUpdateReq req) {
        RequestContext context = buildContext(ApiEnum.UPDATE_SELF_TRUCK);
        context.setBody(JSON.toJSONString(req));
        Type type = new TypeReference<G7OpenapiResult<SelfTruckUpdateResp>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 按机构查询指定状态设备列表
     * 根据机构号和指定状态查询设备，状态有无法定位、信号中断、未定位、车辆静止、车辆运动中、未启用
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fdevice%2Fequipment%2Flist_gpsno_by_status_from_orgcode&method=GET&id=46
     *
     * @param req 按机构查询指定状态设备列表请求参数
     * @return 设备列表
     */
    public GpsNoStatusListResp gpsNoStatusList(GpsNoStatusListReq req) {
        RequestContext context = buildContext(ApiEnum.LIST_GPSNO_BY_STATUS_FROM_ORGCODE);
        Map<String, String> query = new HashMap<>(2);
        query.put("orgcode", req.getOrgcode());
        query.put("status", req.getStatus());
        context.setQuery(query);
        Type type = new TypeReference<G7OpenapiResult<GpsNoStatusListResp>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 车辆设备绑定
     * 将设备和车辆进行绑定操作
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fbase%2Fdevice%2Fbind_device&method=POST&id=50
     *
     * @param req 车辆设备绑定请求参数
     * @return 车辆设备绑定操作结果
     */
    public DeviceBindResp bindDevice(DeviceBindReq req) {
        RequestContext context = buildContext(ApiEnum.BIND_DEVICE);
        context.setBody(JSON.toJSONString(req));
        Type type = new TypeReference<G7OpenapiResult<DeviceBindResp>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 车辆设备解绑
     * 将设备和车辆进行解绑操作
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fbase%2Fdevice%2Funbind_device&method=POST&id=51
     *
     * @param req 车辆设备解绑请求参数
     * @return 设备和车辆进行解绑操作结果
     */
    public Map<String, DeviceUnbindRsp> unbindDevice(DeviceUnbindReq req) {
        RequestContext context = buildContext(ApiEnum.UNBIND_DEVICE);
        context.setBody(JSON.toJSONString(req));
        Type type = new TypeReference<G7OpenapiResult<LinkedHashMap<String, DeviceUnbindRsp>>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 查询司机信息
     * 查询司机，返回司机的车辆id，司机姓名，司机身份证号等已经设置和编辑的信息
     * http://openapi.huoyunren.com/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fbase%2Fdriver%2Fdriver_list&method=POST
     *
     * @param req 查询司机信息请求参数
     * @return 查询的司机列表信息
     */
    public List<DriverListResp> driverList(DriverListReq req) {
        RequestContext context = buildContext(ApiEnum.DRIVER_LIST);
        context.setBody(JSON.toJSONString(req));
        Type type = new TypeReference<G7OpenapiResult<List<DriverListResp>>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 查询司机信息总数  只返回总数
     * 查询司机，返回司机的车辆id，司机姓名，司机身份证号等已经设置和编辑的信息
     * http://openapi.huoyunren.com/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fbase%2Fdriver%2Fdriver_list&method=POST
     *
     * @param req 查询司机信息总数请求参数
     * @return 司机信息总数
     */
    public DriverListCountResp driverListCount(DriverListCountReq req) {
        RequestContext context = buildContext(ApiEnum.DRIVER_LIST);
        req.setGetCount(GetCountEnum.OBTAIN.getCode());
        context.setBody(JSON.toJSONString(req));
        Type type = new TypeReference<G7OpenapiResult<DriverListCountResp>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 新建司机
     * 增加司机，以司机姓名和机构号增加司机以及详细信息
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fbase%2Fdriver%2Fcreate_driver&method=POST&id=8
     *
     * @param req 新建司机请求参数
     * @return 新建司机的信息
     */
    public Map<String, DriverCreateResp> createDriver(DriverCreateReq req) {
        RequestContext context = buildContext(ApiEnum.CREATE_DRIVER);
        context.setBody(JSON.toJSONString(req));
        Type type = new TypeReference<G7OpenapiResult<LinkedHashMap<String, DriverCreateResp>>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 删除司机
     * 删除司机，删除指定司机的所有信息
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fbase%2Fdriver%2Fdelete_driver&method=POST&id=13
     *
     * @param req 删除司机请求参数
     * @return 删除司机操作结果
     */
    public DriverDeleteResp deleteDriver(DriverDeleteReq req) {
        RequestContext context = buildContext(ApiEnum.DELETE_DRIVER);
        context.setBody(JSON.toJSONString(req));
        Type type = new TypeReference<G7OpenapiResult<DriverDeleteResp>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 编辑司机信息
     * 编辑司机，编辑车辆的姓名，身份证号，所属机构号等信息。司机车辆信息不可编辑，只可以解绑和绑定
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fbase%2Fdriver%2Fedit_driver&method=POST&id=12
     *
     * @param req 编辑司机信息请求参数
     * @return 编辑司机信息结果
     */
    public OperationDefaultResult editDriver(DriverEditReq req) {
        RequestContext context = buildContext(ApiEnum.EDIT_DRIVER);
        context.setBody(JSON.toJSONString(req));
        Type type = new TypeReference<G7OpenapiResult<OperationDefaultResult>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 司机绑定车辆
     * 操作司机和车辆的绑定，通过车辆的id和司机id绑定关系
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fbase%2Fdriver%2Fbind_driver&method=POST&id=9
     *
     * @param req 司机绑定车辆请求参数
     * @return 司机绑定车辆操作结果
     */
    public OperationDefaultResult bindDriver(DriverBindReq req) {
        RequestContext context = buildContext(ApiEnum.BIND_DRIVER);
        context.setBody(JSON.toJSONString(req));
        Type type = new TypeReference<G7OpenapiResult<OperationDefaultResult>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 查询子机构
     * 支持跨级查询子机构
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fucenter%2Forgan%2FgetAllSubOrgans&method=GET&id=214
     *
     * @param req 查询子机构请求参数
     * @return 子机构信息
     */
    public SubOrgansGetAllResp getAllSubOrgans(SubOrgansGetAllReq req) {
        RequestContext context = buildContext(ApiEnum.GET_ALL_SUBORGANS);
        Map<String, String> query = new HashMap<>(3);
        //参数判断
        AssertUtil.notNull(req);
        query.put("parent", req.getParent());
        query.put("marker", req.getMarker());
        if (null != req.getLimit()) {
            query.put("limit", String.valueOf(req.getLimit()));
        }
        context.setQuery(query);
        Type type = new TypeReference<G7OpenapiResult<SubOrgansGetAllResp>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 根据orgcode获取机构信息
     * 根据机构号查询机构信息，包括机构编码，机构名称
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fbase%2Forg%2Fget_org_by_code&method=POST&id=18
     *
     * @param req 根据orgcode获取机构信息请求参数
     * @return 机构信息
     */
    public Map<String, OrgGetByCodeResp> getOrgByCode(OrgGetByCodeReq req) {
        RequestContext context = buildContext(ApiEnum.GET_ORG_BY_CODE);
        context.setBody(JSON.toJSONString(req));
        Type type = new TypeReference<G7OpenapiResult<LinkedHashMap<String, OrgGetByCodeResp>>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 查询机构的角色
     * 返回角色列表
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fucenter%2Frole%2FgetAllByOrgcode&method=GET&id=212
     *
     * @param req 查询机构的角色请求参数
     * @return 返回角色列表
     */
    public OrgRoleGetAllResp getAllRoleByOrgCode(OrgRoleGetAllReq req) {
        RequestContext context = buildContext(ApiEnum.GET_ALL_BY_ORGCODE);
        Map<String, String> query = new HashMap<>(3);
        //参数判断
        AssertUtil.notNull(req);
        query.put("orgcode", req.getOrgcode());
        query.put("marker", req.getMarker());
        if (null != req.getLimit()) {
            query.put("limit", String.valueOf(req.getLimit()));
        }
        context.setQuery(query);
        Type type = new TypeReference<G7OpenapiResult<OrgRoleGetAllResp>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 新建标注点
     * 在物流场景中，标注点一般设置为仓库、物流中转站、经销商点，该接口为新建标注点
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fbase%2Fmarker%2Fcreate&method=POST&id=98
     *
     * @param req 新建标注点请求参数
     * @return 标注点信息
     */
    public MarkerCreatResp markerCreat(MarkerCreatOrUpdateReq req) {
        RequestContext context = buildContext(ApiEnum.MARKER_CREATE);
        context.setBody(JSON.toJSONString(req));
        Type type = new TypeReference<G7OpenapiResult<MarkerCreatResp>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 删除标注点
     * 在物流场景中，标注点一般设置为仓库、物流中转站、经销商点，该接口为删除标注点
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fbase%2Fmarker%2Fdelete&method=POST&id=99
     *
     * @param req 删除标注点请求参数
     * @return 删除标注点操作信息
     */
    public MarkerDeleteResp markerDelete(MarkerDeleteReq req) {
        RequestContext context = buildContext(ApiEnum.MARKER_DELETE);
        context.setBody(JSON.toJSONString(req));
        Type type = new TypeReference<G7OpenapiResult<MarkerDeleteResp>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 更新标注点
     * 在物流场景中，标注点一般设置为仓库、物流中转站、经销商点，该接口为更新标注点
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fbase%2Fmarker%2Fupdate&method=POST&id=100
     *
     * @param req 更新标注点请求参数
     * @return 更新标注点操作信息
     */
    public MarkerUpdateResp markerUpdate(MarkerCreatOrUpdateReq req) {
        RequestContext context = buildContext(ApiEnum.MARKER_UPDATE);
        context.setBody(JSON.toJSONString(req));
        Type type = new TypeReference<G7OpenapiResult<MarkerUpdateResp>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 车辆当前定位V1.0
     * 车辆当前定位
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fdevice%2Ftruck%2Fcurrent_location&method=GET&id=42
     *
     * @param req 车辆当前定位请求参数
     * @return 车辆定位信息
     */
    public TruckCurrentLocationResp truckCurrentLocation(TruckCurrentLocationReq req) {
        RequestContext context = buildContext(ApiEnum.TRUCK_CURRENT_LOCATION);
        Map<String, String> query = new HashMap<>(2);
        //参数判断
        AssertUtil.notNull(req);
        query.put("plate_num", req.getPlateNum());
        query.put("map", req.getMap());
        context.setQuery(query);
        Type type = new TypeReference<G7OpenapiResult<TruckCurrentLocationResp>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 车辆状态查询
     * 车辆状态查询，查询单车的车辆状态包括定位、状态、温度、等等
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fdevice%2Ftruck%2Fcurrent_info&method=GET&id=31
     *
     * @param req 车辆状态查询请求参数
     * @return 车辆定位信息
     */
    public TruckCurrentInfoResp truckCurrentInfo(TruckCurrentInfoReq req) {
        RequestContext context = buildContext(ApiEnum.TRUCK_CURRENT_INFO);
        Map<String, String> query = new HashMap<>(3);
        //参数判断
        AssertUtil.notNull(req);
        //请求参数
        query.put("plate_num", req.getPlateNum());
        query.put("fields", req.getFields());
        if (!ObjectUtils.isEmpty(req.getAddrRequired())) {
            query.put("addr_required", String.valueOf(req.getAddrRequired()));
        }
        context.setQuery(query);
        Type type = new TypeReference<G7OpenapiResult<TruckCurrentInfoResp>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 车辆历史轨迹查询
     * 车辆历史轨迹查询，返回时间范围内的经纬度点、速度和角度，可以描绘出一组轨迹。
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fdevice%2Ftruck%2Fhistory_location&method=GET&id=28
     *
     * @param req 车辆历史轨迹查询请求参数
     * @return 车辆定位信息
     */
    public List<TruckHistoryLocationResp> truckHistoryLocation(TruckHistoryLocationReq req) {
        RequestContext context = buildContext(ApiEnum.TRUCK_HISTORY_LOCATION);
        Map<String, String> query = new HashMap<>(5);
        //参数判断
        AssertUtil.notNull(req);
        //请求参数
        query.put("plate_num", req.getPlateNum());
        query.put("from", req.getFrom());
        query.put("to", req.getTo());
        if (!StringUtils.isEmpty(req.getMap())) {
            query.put("map", req.getMap());
        }
        if (!StringUtils.isEmpty(req.getTimeInterval())) {
            query.put("timeInterval", req.getTimeInterval());
        }
        context.setQuery(query);
        Type type = new TypeReference<G7OpenapiResult<List<TruckHistoryLocationResp>>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 车辆GPS总里程查询
     * 车辆GPS总里程查询，查询时间范围内的总里程
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fdevice%2Ftruck%2Fmileage&method=GET&id=29
     *
     * @param req 车辆GPS总里程查询请求参数
     * @return 车辆GPS总里程
     */
    public TruckMileageResp truckMileage(TruckMileageReq req) {
        RequestContext context = buildContext(ApiEnum.TRUCK_MILEAGE);
        Map<String, String> query = new HashMap<>(3);
        //参数判断
        AssertUtil.notNull(req);
        //请求参数
        query.put("plate_num", req.getPlateNum());
        query.put("from", req.getFrom());
        query.put("to", req.getTo());
        context.setQuery(query);
        Type type = new TypeReference<G7OpenapiResult<TruckMileageResp>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 根据车辆，司机，机构查询事件
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fdevice%2Fevent%2Fquery_event&method=POST&id=186
     *
     * @param req 查询事件请求参数
     * @return 事件信息
     */
    public EventQueryResp queryEvent(EventQueryReq req) {
        RequestContext context = buildContext(ApiEnum.QUERY_EVENT);
        context.setBody(JSON.toJSONString(req));
        Type type = new TypeReference<G7OpenapiResult<EventQueryResp>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 根据设备查询车辆状态
     * 批量车辆状态查询，批量返回车辆状态包括定位、状态、温度、等等
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fdevice%2Ftruck%2Fcurrent_info_by_gpsno&method=GET&id=32
     *
     * @param req 车辆状态
     * @return - 车辆状态
     */
    public TruckCurrentInfoResp currentInfoByGpsNo(CurrentInfoByGpsNoReq req) {
        RequestContext context = buildContext(ApiEnum.CURRENT_INFO_BY_GPSNO);
        Map<String, String> query = new HashMap<>(3);
        //参数判断
        AssertUtil.notNull(req);

        //请求参数
        query.put("fields", req.getFields());
        query.put("gpsno", req.getGpsno());

        if (null != req.getAddrRequired()) {
            query.put("addr_required", String.valueOf(req.getAddrRequired()));
        }
        context.setQuery(query);
        Type type = new TypeReference<G7OpenapiResult<TruckCurrentInfoResp>>(){}.getType();
        return this.request.request(context, type);
    }

    /**
     * 实时视频查询
     * 操作设备回传实时视频
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fmedia%2Fvideo%2Freal_time_url&method=GET&id=54
     *
     * @param req 实时视频查询请求参数
     * @return 实时视频查询
     */
    public List<VideoRealTimeUrlResp> videoRealTimeUrl(String req) {
        RequestContext context = buildContext(ApiEnum.REAL_TIME_URL);
        Map<String, String> query = new HashMap<>(1);
        //参数判断
        AssertUtil.notNull(req);
        //请求参数
        query.put("plate_num", req);
        context.setQuery(query);
        Type type = new TypeReference<G7OpenapiResult<List<VideoRealTimeUrlResp>>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 根据设备查询车辆历史轨迹
     * 根据设备查询车辆历史轨迹，返回时间范围内的经纬度点、速度和角度，可以描绘出一组轨迹
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fdevice%2Ftruck%2Fhistory_location_by_gpsno&method=GET&id=43
     *
     * @param req 根据设备查询车辆历史轨迹请求参数
     * @return 根据设备查询车辆历史轨迹
     */
    public List<TruckHistoryLocationResp> truckHistoryLocationByGpsNo(TruckHistoryLocationByGpsNoReq req) {
        RequestContext context = buildContext(ApiEnum.TRUCK_HISTORY_LOCATION_BY_GPSNO);
        Map<String, String> query = new HashMap<>(5);
        //参数判断
        AssertUtil.notNull(req);
        //请求参数
        if (null != req.getGpsno()) {
            query.put("gpsno", String.valueOf(req.getGpsno()));
        }

        query.put("to", req.getTo());
        query.put("from", req.getFrom());
        if (!StringUtils.isEmpty(req.getMap())) {
            query.put("map", req.getMap());
        }
        if (!StringUtils.isEmpty(req.getTimeInterval())) {
            query.put("timeInterval", req.getTimeInterval());
        }
        context.setQuery(query);
        Type type = new TypeReference<G7OpenapiResult<List<TruckHistoryLocationResp>>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 温度明细
     * 分页查询温度明细数据
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fcoldchain%2Fdaily%2Ftemperature&method=GET&id=204
     *
     * @param req 温度明细请求参数
     * @return 温度明细
     */
    public DailyTemperatureResp dailyTemperature(DailyTemperatureReq req) {
        RequestContext context = buildContext(ApiEnum.DAILY_TEMPERATURE);
        Map<String, String> query = new HashMap<>(11);
        //参数判断
        AssertUtil.notNull(req);
        //请求参数
        query.put("truckNum", req.getTruckNum());
        query.put("imei", req.getImei());
        query.put("gpsno", req.getGpsno());
        query.put("from", req.getFrom());
        query.put("to", req.getTo());
        if (null != req.getSpace()) {
            query.put("space", String.valueOf(req.getSpace()));
        }
        if (null != req.getSeparate()) {
            query.put("separate", String.valueOf(req.getSeparate()));
        }
        if (null != req.getPageSize()) {
            query.put("page_size", String.valueOf(req.getPageSize()));
        }
        if (null != req.getPageNo()) {
            query.put("page_no", String.valueOf(req.getPageNo()));
        }
        query.put("orderby", req.getOrderBy());
        if (null != req.getMars()) {
            query.put("mars", String.valueOf(req.getMars()));
        }
        context.setQuery(query);
        Type type = new TypeReference<G7OpenapiResult<DailyTemperatureResp>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 实时视频-根据车牌获取实时视频连接
     * 根据车牌获取实时视频连接
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fdevice%2Fvideo%2Freal_time_by_carnum&method=GET&id=164
     *
     * @param req 根据车牌获取实时视频连接请求参数
     * @return 实时视频
     */
    public List<RealTimeVideoResp> realTimeByCarNum(RealTimeVideoReq req) {
        RequestContext context = buildContext(ApiEnum.REAL_TIME_BY_CAR_NUM);
        Map<String, String> query = new HashMap<>(5);
        //参数判断
        AssertUtil.notNull(req);
        //请求参数
        query.put("carnum", req.getCarnum());
        query.put("orgcode", req.getOrgcode());
        if (!StringUtils.isEmpty(req.getHttps())) {
            query.put("https", String.valueOf(req.getHttps()));
        }
        query.put("channelNos", req.getChannelNos());
        if (!StringUtils.isEmpty(req.getStorage())) {
            query.put("storage", String.valueOf(req.getStorage()));
        }
        if (null != req.getStreamType()) {
            query.put("streamType", String.valueOf(req.getStreamType()));
        }
        context.setQuery(query);
        Type type = new TypeReference<G7OpenapiResult<List<RealTimeVideoResp>>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 人脸识别-创建人脸用户信息
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fapi%2Fface%2Fuser%2Fcreate&method=POST&id=426
     *
     * @param req - 创建人脸用户请求参数
     * @return FaceUserResp - 创建人脸用户返回信息
     */
    public FaceUserResp faceUserCreate(FaceUserCreateReq req) {
        RequestContext context = buildContext(ApiEnum.FACE_DETECT_USER_CREATE);
        AssertUtil.notNull(req);

        context.setBody(JSON.toJSONString(req));
        Type type = new TypeReference<G7OpenapiResult<FaceUserResp>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 人脸识别-修改人脸用户信息
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fapi%2Fface%2Fuser%2Fupdate&method=POST&id=432
     *
     * @param req - 修改人脸用户请求参数
     * @return FaceUserResp - 修改人脸用户返回信息
     */
    public FaceUserResp faceUserUpdate(FaceUserUpdateReq req) {
        RequestContext context = buildContext(ApiEnum.FACE_DETECT_USER_UPDATE);
        AssertUtil.notNull(req);

        context.setBody(JSON.toJSONString(req));
        Type type = new TypeReference<G7OpenapiResult<FaceUserResp>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 人脸识别-删除人脸用户信息
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fapi%2Fface%2Fuser%2Fdelete&method=POST&id=431
     *
     * @param req - 删除人脸用户请求参数
     * @return FaceUserResp - 删除人脸用户返回信息
     */
    public FaceUserResp faceUserDelete(FaceUserDeleteOrQueryReq req) {
        RequestContext context = buildContext(ApiEnum.FACE_DETECT_USER_DELETE);
        AssertUtil.notNull(req);

        context.setBody(JSON.toJSONString(req));
        Type type = new TypeReference<G7OpenapiResult<FaceUserResp>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 人脸识别-查询人脸用户信息
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fapi%2Fface%2Fuser%2Fquery&method=GET&id=427
     *
     * @param req - 查询人脸用户请求参数
     * @return List<FaceUserResp> - 查询人脸用户返回信息
     */
    public FaceUserResp faceUserQuery(FaceUserDeleteOrQueryReq req) {
        RequestContext context = buildContext(ApiEnum.FACE_DETECT_USER_QUERY);
        AssertUtil.notNull(req);

        Map<String, String> query = new HashMap<>(4);
        query.put("orgcode", req.getOrgcode());
        query.put("user_id", req.getUserId());
        context.setQuery(query);
        Type type = new TypeReference<G7OpenapiResult<FaceUserResp>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 人脸识别-创建车辆标签
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fapi%2Ftruck%2Flabel%2Fsave&method=POST&id=428
     *
     * @param req - 创建车辆标签请求参数
     * @return List<FaceTruckLabel> - 创建车辆标签返回信息
     */
    public List<FaceTruckLabel> faceTruckLabelSave(FaceTruckLabelCreateReq req) {
        RequestContext context = buildContext(ApiEnum.FACE_DETECT_TRUCK_LABEL_SAVE);
        AssertUtil.notNull(req);

        context.setBody(JSON.toJSONString(req));
        Type type = new TypeReference<G7OpenapiResult<List<FaceTruckLabel>>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 人脸识别-删除车辆标签
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fapi%2Ftruck%2Flabel%2Fdelete&method=POST&id=429
     *
     * @param req - 删除车辆标签请求参数
     * @return Void - null
     */
    public Void faceTruckLabelDelete(FaceTruckLabelDeleteOrQueryReq req) {
        RequestContext context = buildContext(ApiEnum.FACE_DETECT_TRUCK_LABEL_DELETE);
        AssertUtil.notNull(req);

        context.setBody(JSON.toJSONString(req));
        Type type = new TypeReference<G7OpenapiResult<Void>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 人脸识别-查询车辆标签
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fapi%2Ftruck%2Flabel%2Fquery&method=POST&id=430
     *
     * @param req - 查询车辆标签请求参数
     * @return List<FaceTruckLabel> - 查询车辆标签返回信息
     */
    public List<FaceTruckLabel> faceTruckLabelQuery(FaceTruckLabelDeleteOrQueryReq req) {
        RequestContext context = buildContext(ApiEnum.FACE_DETECT_TRUCK_LABEL_QUERY);
        AssertUtil.notNull(req);

        context.setBody(JSON.toJSONString(req));
        Type type = new TypeReference<G7OpenapiResult<List<FaceTruckLabel>>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 批量下发语音接口（多信息多车辆）
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fapi%2Fmessage%2Fbatch_send_voice&method=POST&id=1246
     * 
     * @param req 批量消息下发请求参数
     * @return    消息下发 响应参数
     */
    public List<MsgCommonVoiceSendResp> batchSendVoice(List<MsgBatchSendVoiceReq> req) {
        RequestContext context = buildContext(ApiEnum.BATCH_SEND_VOICE);
        AssertUtil.notNull(req);
        context.setBody(JSON.toJSONString(req));
        Type type = new TypeReference<G7OpenapiResult<List<MsgCommonVoiceSendResp>>>() {}.getType();
        return this.request.request(context, type);
    }

    // 语音对讲
    public Object batchSendVoiceIntercom(Map<String,String> query) {
        RequestContext context = buildContext(ApiEnum.VOICE_INTERCOM);
        AssertUtil.notNull(query);
        context.setQuery(query);
        Type type = new TypeReference<G7OpenapiResult<Object>>() {}.getType();
        return this.request.request(context, type);
    }

    /**
     * 消息下发结果查询
     * https://openapi.g7.com.cn/app/docopenapi/#/productCenter/restApi/detail?uri=%2Fv1%2Fdevice%2Fmessage%2Fsend_result&method=GET&id=53
     *
     * @param messageId 消息id
     * @return    消息下发结果
     */
    public MessageSendResultResp messageSendResult(String messageId) {
        RequestContext context = buildContext(ApiEnum.MESSAGE_SEND_RESULT);
        AssertUtil.notEmpty(messageId);
        Map<String, String> query = new HashMap<>(1);
        query.put("message_id", messageId);
        context.setQuery(query);
        Type type = new TypeReference<G7OpenapiResult<MessageSendResultResp>>() {}.getType();
        return this.request.request(context, type);
    }

}
