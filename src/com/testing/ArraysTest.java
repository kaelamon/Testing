package com.testing;

import java.util.*;

public class ArraysTest {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3}; //Инициализируем массив arr1 с числами 1 2 3
        int[] arr2 = {1, 2, 3}; //Инициализируем массив arr1 с числами 1 2 3
        int[] arr3 = {1, 2, 3}; //Инициализируем массив arr1 с числами 1 2 3
        Arrays.fill(arr3, 0, 3, 4); //Заполняем массив с 0 по 3 индекс числом 4
        System.out.println(Arrays.equals(arr1, arr2)); //Сравниваем массив arr1 и arr2
        System.out.println(Arrays.equals(arr1, arr3)); //Сравниваем массив arr1 и arr3
        System.out.println(Arrays.toString(arr3)); //Выводим что у нас там в массиве arr3
        System.out.println(Arrays.asList(arr1)); //Сохранения массива в лист
        System.out.println(Arrays.hashCode(arr3)); //Выдача хеш-кода массива
        System.out.println(Arrays.binarySearch(arr1, 2)); // Поиск индекса в массиве по "ключу"
        System.out.println(Arrays.compare(arr1, arr2)); // Сравнение массивов
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr1, 0, 9))); //Копирует массив с новой длиной

        int i1 = 13_37; // Инициируем int с подчеркиванием в середине
        int i2 = 13____________37; // Инициируем int с большим подчеркиванием в середине
        float f1 = 13_37; // Инициируем float с подчеркиванием в середине
        float f2 = 1_3_3_7; // Инициируем float с множественным подчеркиванием
        double d1 = 13_3.7; // Инициируем double с подчеркиванием в середине
        double d2 = 1.3_______________3_7; // Инициируем float с множественным подчеркиванием и огромным поддчеркиванием в середине
        System.out.println(i1); // Ниже вывод результата в консоль
        System.out.println(i2); // Для того чтобы все сломать достаточно поставить подчеркивание до или после числа
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
    }
}
