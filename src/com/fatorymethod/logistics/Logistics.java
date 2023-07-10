package com.fatorymethod.logistics;

/**
 * @author yameng.dym
 */
public abstract class Logistics {

    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }

    /**
     * 获取实际运输方式
     *
     * @return
     */
    public abstract Transport createTransport();
}
