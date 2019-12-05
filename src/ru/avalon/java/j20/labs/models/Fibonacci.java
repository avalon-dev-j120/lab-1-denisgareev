package ru.avalon.java.j20.labs.models;

import java.util.Iterator;

/**
 * Модель получения последовательности чисел Фибоначчи.
 *
 * <p>
 * Числа Фибонааччи (иногда пишут Фибона́чи[1]) — элементы числовой
 * последовательности 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377,
 * 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, … (последовательность A000045
 * в OEIS), в которой первые два числа равны либо 1 и 1, либо 0 и 1, а каждое
 * последующее число равно сумме двух предыдущих чисел. Названы в честь
 * средневекового математика Леонардо Пизанского (известного как Фибоначчи).
 *
 * @see
 * <a href="https://ru.wikipedia.org/wiki/%D0%A7%D0%B8%D1%81%D0%BB%D0%B0_%D0%A4%D0%B8%D0%B1%D0%BE%D0%BD%D0%B0%D1%87%D1%87%D0%B8">Числа
 * Фибоначчи</a>
 */
public class Fibonacci implements Iterable<Integer> {

    private int maxNumbers;

    private int start;
    //private int num;

    public Fibonacci(int maxNumbers, int start) {
        this.maxNumbers = maxNumbers;
        this.start = start;
    }

    //public Fibonacci(int start, int num) {
    //this.start = start;
    //this.num = num;
    /**
     * Итератор, выполняющий обход последовательности чисел Фибоначчи.
     */
    private static class FibonacciIterator implements Iterator<Integer> {

        private int start;
        private int maxNumbers;
        private int count = 0;
        private int n1 = 0;
        private int n2 = 1;

        private FibonacciIterator(int maxNumbers, int start) {
            this.maxNumbers = maxNumbers;
//            this.start = start;
            //for (int i = this.start; i < start + maxNumbers; )
            for (int i = 1; i < start; i++) {
                int ret = n1 + n2;
                n1 = n2;
                n2 = ret;
            }
        }

        /**
         * Определяет, есть ли следующее значение последовательности чисел
         * Фибоначчи.
         *
         * @return {@code true}, если следующее число последовательности
         * существует. В обратном случае {@code false}.
         */
        @Override
        public boolean hasNext() {
            return count < maxNumbers;
        }

        /**
         * Возвращает следующее число последовательности чисел Фибоначчи.
         *
         * @return следующее число последовательности.
         */
        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new UnsupportedOperationException("Недопустимое кол-во!");
            }
            count++;
            if (count == 1) {
                return n1;
            }
//            if (count == 2) {
//                return n2;
//            }
            int ret = n1 + n2;
            n1 = n2;
            n2 = ret;
            return n1;
        }
    }

    /**
     * Возвращает итератор, позволяющий выполнить обход последовательности чисел
     * Фибоначчи.
     *
     * @return итератор последовательности чисел Фибоначчи
     */
    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator(maxNumbers, start);
    }
}
