package com.py.basic._02_completablefuture_create;

import com.py.basic.utils.CommonUtils;

import java.util.concurrent.CompletableFuture;

public class RunAsyncDemo2 {
    public static void main(String[] args) {


        //开启一个异步任务读取文件
        /**
         * CompletableFuture 中的异步任务底层通过开启线程的方式完成的
         */
        // runAsync 创建异步任务
        CommonUtils.printThreadLog("main start");
        // 使用Runnable匿名内部类
        // CompletableFuture.runAsync(new Runnable() {
        //     @Override
        //     public void run() {
        //         CommonUtils.printThreadLog("读取文件开始");
        //         //使用睡眠来模拟一个长时间的工作任务（例如读取文件，网络请求等）
        //         CommonUtils.sleepSecond(3);
        //         CommonUtils.printThreadLog("读取文件结束");
        //     }
        // });

        // 使用lambda表达式
        CompletableFuture.runAsync(()->{
                CommonUtils.printThreadLog("读取文件开始");
                //使用睡眠来模拟一个长时间的工作任务（例如读取文件，网络请求等）
                CommonUtils.sleepSecond(3);
                CommonUtils.printThreadLog("读取文件结束");
        });
        CommonUtils.printThreadLog("here are not blocked,mian continue");
        CommonUtils.sleepSecond(4);//此处休眠为的是等待completableFuture 背后的线程池执行完成。
        CommonUtils.printThreadLog("main end");
    }
}
