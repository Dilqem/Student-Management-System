/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import bean.Config;
import util.MenuUtil;

/**
 *
 */
public class Main {

//
    public static void main(String[] args) throws Exception {
        //   Thread.setDefaultUncaughtExceptionHandler(new MyExceptionHandler());
        //   test(0);
        Config.initialize();
        MenuUtil.showMenu();
    }
//    private static void test(int i) {
//        if (i == 0) {
//            throw new IllegalArgumentException();
//        }
//    }
}