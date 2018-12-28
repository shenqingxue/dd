package com.array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {
        //排序
        int[] ints = {2, 3, 6, 8, 3, 10};
        Arrays.sort(ints); //从小到大
        int[] newin = new int[ints.length];
        for (int i = ints.length - 1; i >= 0; i--) {
            newin[ints.length - 1 - i] = ints[i]; //从大到小
        }
        for (int i = 0; i < newin.length; i++) {
            System.out.println(newin[i]);
        }

        //源码add程序
        //跟进源码首先第一次add进行默认扩容为10 每一次add都会copy原数组 进行
        ArrayList<Integer> integers = new ArrayList<Integer>(10);
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }
        integers.add(1, 5);
        integers.add(1);
        integers.trimToSize();
        Object[] array = integers.toArray();
        Integer[] ss = new Integer[3];
        Integer[] strings = integers.toArray(ss);
        System.out.println("args = [" + strings.toString() + "]");

    }
}
