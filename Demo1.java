package com.itheima04;

/*
再控制台打印输出下面的图案
*****
*****
*****
*****
 */
public class Demo1 {
    public static void main(String[] args) {


    }


    //打印输出一天中的小时和分钟
    public static void method2() {
        //一天中的小时一共24个小时
        for (int i = 0; i < 24; i++) {
            //一个小时有60分钟
            for (int j = 0; j < 60; j++) {
                //一分中有60秒
                for(int z=0;z<60;z++){
                    System.out.println(i+"时"+j+"分"+z+"秒");

                    try {
                        Thread.sleep(100);  //休眠1000毫秒(1秒)
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    //打印输出10行10列的*图案
    public static void method1() {
        //外层循环: 10行
        for(int j=1;j<=10;j++){
            //内层循环：每一行有10列
            for (int i = 1; i <=10; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
