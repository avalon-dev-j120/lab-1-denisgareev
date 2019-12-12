package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;

import java.util.Iterator;
import ru.avalon.java.j20.labs.models.Fibonacci;

/**
 * Задание №3
 *
 * <p>Тема: "Изучение интерфейсов {@link Iterable} и {@link Iterator}".
 */
public class Task3 implements Task {

    @Override
    public void run() {
        /*
         * TODO(Студент): Выполнить задание №3
         *
         * 1. Завершить описание класса Fibonacci так, чтобы класс
         *    возвращал заданное количество чисел последовательности
         *    Фибоначчи.
         *
         *    Количество чисел последовательности можно указывать
         *    при создании экземпляра класса.
         *
         *    Найти сумму 20 первых чисел последовательности Фибоначчи:
         *
         * 2. Создать экземпляр класса Fibonacci так, чтобы он
         *    возвращал последовательность чисел Фибоначчи длиной
         *    в 20 элементов.
         *
         * 3. Найти сумму полученных значений.
         *
         * 4. С использованием отладчика проверьте корректность
         *    выполнения задания.
         */
        
        Iterable<Integer> f = new Fibonacci(20, 2);
        Iterator<Integer> it = f.iterator();
        

        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        int sum = 0;
        for (int x : f) {
            sum += x;
        }
        System.out.println("Total first 20s: " + sum);
        
        
    }
    public static void main(String[] a) {
        new Task3().run();
        
    }
}
