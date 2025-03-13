package com.huoyunren.openapi.api.uow.waybill;

/**
 * 运单处理接口
 *
 * @param <T>    the type parameter
 * @param <WRES> the type parameter
 */
public interface WaybillProcessService<T, WRES> {


  /**
   * Handel load wres. 处理配载信息
   *
   * @param input the input
   * @return the wres
   */
  WRES doProcess(T input);

}
