package com.zzl.structure.facade;

/**
 * 相机产品
 * @author zzl
 * @since 2021/8/14 22:48
 */
public class CameraProduct implements Product {

    @Override
    public void info() {
        System.out.println("购买了相机产品,花费1111元");
    }
}
