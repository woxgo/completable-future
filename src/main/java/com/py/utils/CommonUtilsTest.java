package com.py.utils;

public class CommonUtilsTest {

    public static void main(String[] args) {
        String content = CommonUtils.readFile("news.txt");
        CommonUtils.printThreadLog(content);
    }
}
