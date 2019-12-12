package ru.avalon.java.j20.labs.tasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.core.RandomArrayFactory;

import java.util.List;
import java.util.Set;

/**
 * Задание №5.
 *
 * <p>Тема: "Изучение отличия между списками и наборами".
 */
public class Task5 implements Task {

    /**
     * Фабрика, генерирующая массивы чисел случайного характера.
     */
    private final RandomArrayFactory arrayFactory = new RandomArrayFactory();

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        final Integer[] array = arrayFactory.getInstance(20);

        List<Integer> list = new ArrayList<>();
        for(Integer i : array) {
            list.add(i);
        }
         for(Iterator it = list.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }
        //for(int i = 0; i < array.length; i++) {
        //    list.add(array[i]);
        //}

        Set<Integer> set = new LinkedHashSet<>();
        for(Integer i : array) {
            set.add(i);
        }
        System.out.println("------------------------------");
        for(Iterator it = set.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }

        /**
         * TODO(Студент): Выполните задание №5
         *
         * 1. Проинициализируйте переменные list и set объектами
         *    подходящих классов.
         *
         * 2. В обе коллекции поместите элементы массива array.
         *
         * 3. С использованием отладчика проверьте корректность
         *    выполнения задания.
         */
    }
    
    public static void main(String[] a) {
        new Task5().run();
        
    }
}
