public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");

        int start = -10;
        int end = 21;
        int counter = start;

        int sumEven = 0;
        int sumOdd = 0;

        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= end);

        System.out.println("В отрезке [" + start + ", " + end + "] сумма четных чисел = " + sumEven +
                 ", а нечетных = " + sumOdd);

        System.out.println();

        System.out.println("2. Вывод чисел в порядке убывания");

        int num1 = 10;
        int num2 = 5;
        int num3 = -1;

        int max = num1;
        if (num2 > max) max = num2; 
        if (num3 > max) max = num3;

        int min = num1;
        if (num2 < min) min = num2;
        if (num3 < min) min = num3;

        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("3. Вывод реверсивного числа и суммы его цифр");

        int number3 = 1234;
        int number3copy = number3;
        int sum = 0;

        int reverseNumber = 0;
        while (number3copy > 0) {
            int digit = number3copy % 10;
            reverseNumber = reverseNumber * 10 + digit;
            sum += digit;
            number3copy /= 10;
        }

        System.out.println("Исходное число в обратном порядке: " + reverseNumber);
        System.out.println("Сумма цифр: " + sum);

        System.out.println();
         
        System.out.println("4. Вывод чисел в несколько строк");

        int start4 = 1;
        int end4 = 24;
        int numbersPerLine = 5;
        int count = 0;

        for (int i = start4; i < end4; i++) {
            if (i % 2 != 0) {
                System.out.printf("%5d", i);
                count++;

                if (count == numbersPerLine) {
                    count = 0;
                    System.out.println();
                }
            }
        }

        if (count > 0) {
            int remainingNumbers = numbersPerLine - count;
            for (int i = 0; i < remainingNumbers; i++) {
                System.out.printf("%5s", 0);
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("5. Проверка количества двоек числа на четность/нечетность");

        int number5 = 3242592;
        int countTwos = 0;
        int number5copy = number5;

        while (number5 > 0) {
            if (number5 % 10 == 2) {
                countTwos++;
            }
            number5 /= 10;
        }

        String parityResult = "четное";
        if (countTwos % 2 != 0) {
            parityResult = "нечетное";        
        }

        System.out.printf("В %d %s количество двоек — %d\n", number5copy, parityResult, countTwos);

        System.out.println();

        System.out.println("6. Отображение геометрических фигур");

        int height = 5;

        for (int row = 0; row < height; row++) {
            for (int i = 0; i < 10; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int row = 0;
        while (row < height) {
            int j = 0;
            while (j < height - row) {
                System.out.print("#");
                j++;
            }
            System.out.println();
            row++;
        }
        System.out.println();

        int currentRow = 1;
        do {
            int i = 0;
            do {
                System.out.print("$");
                i++;
            } while (i < currentRow);
            System.out.println();
            currentRow++;
        } while (currentRow <= 3);

        currentRow = 2;
        do {
            int i = 0;
            do {
                System.out.print("$");
                i++;
            } while (i < currentRow);
            System.out.println();
            currentRow--;
        } while (currentRow > 0);

        System.out.println();

        System.out.println("7. Отображение ASCII-символов");

        System.out.printf("%-10s %-10s %-40s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");

        for (int i = 33; i <= 122; i += 2) {
            if ((i >= 33 && i < 48) || (i >= 98 && i <= 122)) {
                char character = (char) i;
                String description = "          " + Character.getName(i);
                System.out.printf("%5d %10c %-40s%n", i, character, description);
            }
        }

        System.out.println();

        System.out.println("8. Проверка, является ли число палиндромом");

        int number8 = 1234321;
        int number8copy = number8;
        int reversedNumber = 0;

        while (number8 > 0) {
            int digit8 = number8 % 10;
            reversedNumber = reversedNumber * 10 + digit8;
            number8 /= 10;
        }

        if (number8copy == reversedNumber) {
            System.out.printf("Число %d палиндромом\n", number8copy);
        } else {
            System.out.printf("Число %d не палиндромом", number8copy);
        }

        System.out.println();

        System.out.println("9. Проверка, является ли число счастливым");

        int number9 = 123456;
        int number9copy = number9;
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;

        for (int i = 0; i < 6; i++) {
            int digit = number9 % 10;
            number9 /= 10;

            if (i < 3) {
                sumSecondHalf += digit;
            } else {
                sumFirstHalf += digit;
            }
        }

        String result = (sumFirstHalf == sumSecondHalf) ? "счастливое" : "не счастливое";
        System.out.printf("Число %d - %s\n", number9copy, result);

        System.out.printf("Сумма цифр %d = %d\n", number9copy / 1000, sumFirstHalf);
        System.out.printf("Сумма %d = %d\n", number9copy % 1000, sumSecondHalf);

        System.out.println();

        System.out.println("10. Отображение таблицы умножения Пифагора");

        System.out.println("     |  1  2  3  4  5  6  7  8  9");
        System.out.println("   ------------------------------");

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%4d | ", i);
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%2d ", i * j);
            }
            System.out.println();
        }
    }
}
