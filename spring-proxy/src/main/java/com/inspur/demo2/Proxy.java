package com.inspur.demo2;

public class Proxy implements UserService {

    private UserServiceImpl userService;

    public Proxy() {
    }

    public Proxy(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void add() {
        log("add");
        userService.add();
    }

    public void delete() {
        log("delete");
        userService.delete();
    }

    public void update() {
        log("update");
        userService.update();
    }

    public void select() {
        log("select");
        userService.select();
    }

    //日志方法
    public void log(String msg) {
        System.out.println("使用了" + msg + "方法");
    }
}
