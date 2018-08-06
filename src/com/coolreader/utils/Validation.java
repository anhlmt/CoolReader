/**
 * @author Anh Le Minh Tuan
 * @facebook fb.com/anh.leminhtuanfb
 * @date Jul 30, 2018
 */
package com.coolreader.utils;

public class Validation {

    public static boolean checkUsername(String username) {
        return !username.contains(" ");
    }

    public static boolean checkPassword(String username) {
        return !username.contains(" ");
    }

    public static void main(String[] args) {
        System.out.println(checkUsername("j av"));
    }
}
