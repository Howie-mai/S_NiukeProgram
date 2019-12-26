package com.zhku.mh.jvmgc;

/**
 * ClassName：RefCountGC
 * Time：2019/12/17 15:18
 * Description：JVM的GC算法：引用计数法
 * Author： mh
 */
public class RefCountGC {
    /**
     * 这个成员属性唯一的作用就是占用一点内存
     */
    private byte[] bigSize = new byte[2 * 1024 * 1024];

    Object instance = null;

    public static void main(String[] args) {
        RefCountGC objectA = new RefCountGC();
        RefCountGC objectB = new RefCountGC();
        objectA.instance = objectB;
        objectB.instance = objectA;

        objectA = null;
        objectB = null;

        /**
         * 手动唤醒GC ，并不会立刻执行
         */
        System.gc();
    }
}
