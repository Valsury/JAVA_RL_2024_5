import java.math.BigInteger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Long.MAX_VALUE + 1
        BigInteger start = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);
        int count = 0;
        int primesToFind = 5;

        System.out.println("Первые 5 простых чисел больше Long.MAX_VALUE:");
        while (count < primesToFind) {
            if (start.isProbablePrime(10)) { // 10 - высокая вероятность проверки на простоту
                System.out.println(start);
                count++;
            }
            start = start.add(BigInteger.ONE);
        }
        System.out.println("\n");

        System.out.println("Простые числа Мерсенна для p ≤ 100:");

        for (int p = 2; p <= 100; p++) {
            // 2^p - 1
            BigInteger mersenne = BigInteger.valueOf(2).pow(p).subtract(BigInteger.ONE);

            // Проверяем, является ли число простым
            if (mersenne.isProbablePrime(10)) { // 10 - высокая вероятность проверки на простоту
                System.out.printf("p = %d, Mersenne Prime = %s%n", p, mersenne);
            }
        }

        System.out.println("\n");
        // Начинаем с Long.MAX_VALUE + 1
        BigInteger begin = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);
        int numeric = 0;
        int numbersToFind = 10;

        System.out.println("Первые 10 чисел, больших Long.MAX_VALUE, которые кратны 5 или 6:");

        while (numeric < numbersToFind) {
            // Проверяем кратность 5 или 6
            if (begin.mod(BigInteger.valueOf(5)).equals(BigInteger.ZERO) ||
                    begin.mod(BigInteger.valueOf(6)).equals(BigInteger.ZERO)) {
                System.out.println(begin);
                numeric++;
            }
            begin = begin.add(BigInteger.ONE);
        }
    }
}