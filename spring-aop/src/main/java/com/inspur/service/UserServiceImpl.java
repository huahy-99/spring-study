package com.inspur.service;

public class UserServiceImpl implements UserService {
    public void add() {
        System.out.println("增加了一个用户");
    }

    public void delete() {
        System.out.println("删除了一个用户");
    }

    public void update() {
        System.out.println("修改了一个用户");
    }

    public void select() {
        System.out.println("查询了一个用户");
    }

    void noBack(){
        System.out.println("测试");
    }
    
     void test(){
        System.out.println("测试");
    }
}
