package com.zhku.mh.jvmgc;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Date;

/**
 * ClassName：JMMDemo
 * Time：2019/12/18 11:07
 * Description：JMM(Java内存模型模型)
 * Author： mh
 */

class MyNumber {
    volatile int number = 10;

    public void addTo1205() {
        this.number = 1205;
    }
}

/**
 * JMM = 可见性（通知机制）A线程改了，通知其他线程知道，同步值
 */
public class JMMDemo {

    public static void main(String[] args) {

        MyNumber myNumber = new MyNumber();

        new Thread(() -> {
            System.out.println(new Date() + "\t" + Thread.currentThread().getName() +"\t =========come in");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myNumber.addTo1205();
            System.out.println(new Date() + "\t" + Thread.currentThread().getName() + " ，value：" + myNumber.number);
        }, "AAA").start();

        /**
         * 线程之间不共享，没有通知main线程更改了值，陷入死循环
         * 加 volatile 增加可见通知性
         */
        while (myNumber.number == 10) {
//            System.out.println(new Date() + "\t Wait.....Not change");
        }

        System.out.println(new Date() + "\t" + Thread.currentThread().getName() + "\t misson is over");
    }
}
