package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int h;
        int mm;
        int ss;
        seconds %=86400;
        h = seconds/3600;
        mm = (seconds-h*3600)/60;
        ss = seconds%60;

        System.out.printf(" %01d:%02d:%02d " , h, mm, ss) ;
    }
}
