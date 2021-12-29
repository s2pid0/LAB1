package com.company;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {


    private static String name;
    private static int number, newnumber;

    public static void func1() {
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        String phnumber = scanner.nextLine();
        number = Integer.parseInt(phnumber);
    }



    public static void main(String[] args) {

        func1();
        Person one = new Person( name, number);

        System.out.println( one.name);
        System.out.println( one.phnumber);

        System.out.println("Вывод информации о пользователе");
        one.getName();
        one.getPhnumber();

        System.out.println("Введите новый номер ");

        Scanner scanner = new Scanner(System.in);
        String phnumber = scanner.nextLine();



        newnumber = Integer.parseInt(phnumber);
        System.out.println("Новый номер: " + one.changeNumber(newnumber));




    }


}