/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Scanner;

/**
 *
 * @author V&V
 */
public class MenuUtil {

    public static void showMenu() {
        System.out.println("Please select menu");
        Menu.showAllMenu();

        Scanner sc = new Scanner(System.in);
        
        int selectedMenuNumber = sc.nextInt();

        Menu selectedMenu = Menu.find(selectedMenuNumber);
        selectedMenu.process();
    }

//    public static void menuProcess(Menu menu) {
//        menu.process();
//    }
}
