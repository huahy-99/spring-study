package com.inspur.demo3;

public class Client {

    /**
     * 动态代理
     */
    public static void main(String[] args) {

        Host host = new Host();

        //代理角色 现在没有
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setRent(host);

        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
    }
}
