package com.brianway.learning.java.base.constructor;

public class ConstructorTest {

    {
        System.out.println("主调类的非静态代码块");
    }

    static {
        System.out.println("主调类的静态代码块");
    }

    public static void main(String[] args) {

        new SonClass("aaa");
        System.out.println("----------------");
        new SonClass();
    }

}

/*
父类的静态属性count初始化:10
子类可以访问父类的静态属性count 10
子类的静态属性countSon初始化:0
执行了父类的无参构造方法
执行了子类的构造方法SonClass(String name) aaa
执行了父类的无参构造方法
执行了子类的无参构造方法
 */
