package com.inspur.demo1;

public class Client {

    /**
     * 静态代理
     */
    public static void main(String[] args) {
        Host host = new Host();
        //代理
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
