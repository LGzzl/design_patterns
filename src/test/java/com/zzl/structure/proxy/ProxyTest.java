package com.zzl.structure.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {

    public static void main(String[] args) {
        jdkProxy();
        cglibProxy();
    }

    public static void jdkProxy() {
        BookProduct bookProduct = new BookProduct();
        /*此处举例一个卖书的例子
        对书店来说,每卖一本书所赚的钱一般都只是部分,因为还有一部分是书本厂家的
        所以我们使用动态代理来模拟厂家抽成的过程*/
        Product product = (Product) Proxy.newProxyInstance(Product.class.getClassLoader(), BookProduct.class.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //只代理卖书方法
                if ("sellProduct".equals(method.getName())){
                    double price = (double) args[0];
                    //实际上书店可能只赚50%
                    price = price * 0.5;
                    method.invoke(bookProduct,price);
                }
                return null;
            }
        });
        product.sellProduct(100);//卖出了一本书,赚到了:50.0
    }

    public static void cglibProxy() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(ComputerProduct.class);
        enhancer.setInterfaces(ComputerProduct.class.getInterfaces());
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
                if ("sellComputer".equals(method.getName())){
                    double price = (double) args[0];
                    //实际上可能只赚50%
                    price = price * 0.5;
                    method.invoke(new ComputerProduct(),price);
                }
                return null;
            }
        });
        ComputerProduct computerProduct = (ComputerProduct) enhancer.create();
        computerProduct.sellComputer(998.98);//卖出了一台电脑,利润:499.49
    }
}
