package com.zzl.structure.composite;

public class CompositeTest {

    public static void main(String[] args) {
        //一级
        Menu menu = new Menu("某管理系统菜单","红色三角形",null);
        //二级
        Menu menu1 = new Menu("系统管理", "绿色圆形", null);
        Menu menu2 = new Menu("用户管理", "黄色圆形", null);
        //三级
        Menu menu3 = new Menu("登录设置", "黑色五角星", "/system/login");
        Menu menu4 = new Menu("主题设置", "蓝色五角星", "/system/theme");
        Menu menu5 = new Menu("用户列表", "蓝色六边形", "/user/list");
        Menu menu6 = new Menu("用户角色", "黄色六边形", "/user/role");
        Menu menu7 = new Menu("用户权限", "紫色六边形", "/user/permission");
        //组合
        menu1.add(menu3);
        menu1.add(menu4);
        menu2.add(menu5);
        menu2.add(menu6);
        menu2.add(menu7);
        menu.add(menu1);
        menu.add(menu2);
        //打印
        menu.display(1);
    }
}
