package examples;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        boolean flag = true;
        flag = false;

        //Целочисленные типы данных
        byte aByte = -128; // -128 ... 127 (8 bit)
        aByte = (byte) (aByte + 1);
        short aShort = -32768; // -32768 ... 32767 (16 bit)
        int aInt = -2147483648; // -2147483648 ... 2147483647 (32 bit)
        long aLong = -2147483648; // 64 bit

        // Типы данных с плавающей точкой
        float aFloat = 1.0F; //32 bit
        //Используем *
        double aDouble = 1.0; // 64 bit

        char aChar = 'a';

        // Операторы

        // 1. Присвоение
        char bChar = 'a';

        //2. Матиматические + - * / %
        int result = 5 / 6;
        System.out.println("### boolean result: " + result);

        //3. Операторы сравнения >, <, >=, <=, !=, ==
        System.out.println("### boolean result: " + (3 == 3));

        //4. Логические операторы &(И) && (сокращенное И), | (ИЛИ) || (сокращение ИЛИ)
        if (!(3 > 2 || 3 > 10)) {

        }else if(1 == 1){

        }else{
            System.out.println("Default");
        }

//        switch (1){
//            case "dima":{
//                System.out.println("Thats Dima");
//            }
//            case "vasya":{
//                System.out.println("Thats Vasya");
//            }
//            default:{
//                System.out.println("Default");
//
//            }
//        }

        //5. Тернарный оператор
        int value;

        //6. instanceof

        //Wrapper types
        Integer aIntegerWrapper; // int
        Double aDoubleWrapper;
        Character aCharWrapper; // char

        Integer arg = 42;
        printInt(arg);
    }

    String s1 = "this is String";
    List<String> aList = new ArrayList<>();

    public static void printInt(int arg){
        System.out.println("### printInt: " + arg);
    }
}

