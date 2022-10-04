package com.inspur.demo2;

public class Client {

    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        Proxy proxy = new Proxy(userService);

        proxy.select();
    }
}
