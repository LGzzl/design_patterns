package com.zzl.structure.decorator;

public class DecoratorTest {

    public static void main(String[] args) {
        Component computer = new Computer();
        System.out.println("----------基本电脑----------");
        System.out.println("详情:" + computer.info());
        System.out.println("价格:" + computer.price());
        computer = new RamDecorator(computer);
        System.out.println("----------加内存后----------");
        System.out.println("详情:" + computer.info());
        System.out.println("价格:" + computer.price());
        computer = new HardDiskDecorator(computer);
        System.out.println("----------加硬盘后----------");
        System.out.println("详情:" + computer.info());
        System.out.println("价格:" + computer.price());
        /*----------基本电脑----------
        详情:一台普通的电脑
        价格:998
        ----------加内存后----------
        详情:一台普通的电脑+8G某品牌内存
        价格:1198
        ----------加硬盘后----------
        详情:一台普通的电脑+8G某品牌内存+500G固态硬盘
        价格:1698*/
    }
}
