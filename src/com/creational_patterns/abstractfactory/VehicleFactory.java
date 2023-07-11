package com.creational_patterns.abstractfactory;

/**
 * @author yameng.dym
 */
public interface VehicleFactory {
    /**
     * 获取运输方式
     *
     * @return
     */
    Transport createTransport();

    /**
     * 获取对应的引擎
     *
     * @return
     */
    Engine createEngine();

    /**
     * 获取操作
     *
     * @return
     */
    Operation createOperation();
}
