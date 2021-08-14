package com.zzl.structure.facade;

public class FacadeTest {

    public static void main(String[] args) {
        CounterFacade facade = new CounterFacade();
        facade.buyCamera();//购买了相机产品,花费1111元
        facade.buyComputer();//购买一台电脑,花费998元
        facade.buyPhone();//购买了手机产品,花费999
    }
}
