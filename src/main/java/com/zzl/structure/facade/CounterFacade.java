package com.zzl.structure.facade;

/**
 * 商店外观
 * @author zzl
 * @since 2021/8/14 22:43
 */
public class CounterFacade {

    private final ComputerProduct computerProduct;
    private final CameraProduct cameraProduct;
    private final PhoneProduct phoneProduct;

    public CounterFacade() {
        this.computerProduct = new ComputerProduct();
        this.cameraProduct = new CameraProduct();
        this.phoneProduct = new PhoneProduct();
    }

    public void buyComputer(){
        computerProduct.info();
    }

    public void buyPhone(){
        phoneProduct.info();
    }

    public void buyCamera(){
        cameraProduct.info();
    }
}
