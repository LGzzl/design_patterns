package com.zzl.objectCreation.builder.product;

/**
 * 车==>具体产品
 * @author zzl
 * @since 2021/8/3 22:56
 */
public class CarProduct {

    /**
     * 发动机引擎
     */
    private String engine;

    /**
     * 轮胎
     */
    private String tire;

    /**
     * 车架
     */
    private String frame;

    /**
     * 方向盘
     */
    private String steeringWheel;

    /**
     * 制动器
     */
    private String brake;

    /**
     * 速度
     */
    private int speed;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTire() {
        return tire;
    }

    public void setTire(String tire) {
        this.tire = tire;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(String steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public String getBrake() {
        return brake;
    }

    public void setBrake(String brake) {
        this.brake = brake;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "CarProduct{" +
                "engine='" + engine + '\'' +
                ", tire='" + tire + '\'' +
                ", frame='" + frame + '\'' +
                ", steeringWheel='" + steeringWheel + '\'' +
                ", brake='" + brake + '\'' +
                ", speed=" + speed +
                '}';
    }
}
