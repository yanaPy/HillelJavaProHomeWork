package HW10;


import HW8.CollectionService;

import java.util.Collection;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
//        1. Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.
//
//        2. Написать итератор по коллекции реализованной в ДЗ №8 - надо заимплементить интерфейс Iterator
//
//        3. написать программу для вычисления корней квадратного уравнения

        CollectionService collection = new CollectionService(10);
        System.out.println(collection);

        Iterator iterator = new Iterator(collection);

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        QuadraticEquation.calc(2,3,5);
    }

    public Collection deleteDublicate(Collection collection) {

        return new HashSet<>(collection);
    }

}
