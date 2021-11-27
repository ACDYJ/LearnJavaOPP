package com.jie.corejava.chapter2;

public class testUser {

    public static void main(String[] args) {
        User user1 = new User();

        user1.money=20;
        System.out.println(user1.getMoney());
        User user2 = new User();
        System.out.println(user2.getMoney());

    }
}
