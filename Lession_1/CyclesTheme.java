public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");

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

        System.out.println("\n2. Вывод чисел в порядке убывания");

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

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");

        int number3 = 1234;
        int temp = number3;
        int sum = 0;

        int reverseNumber = 0;
        while (temp > 0) {
            int digit = temp % 10;
            reverseNumber = reverseNumber * 10 + digit;
            sum += digit;
            temp /= 10;
        }

        System.out.println("Исходное число в обратном порядке: " + reverseNumber);
        System.out.println("Сумма цифр: " + sum);
        
        System.out.println("\n4. Вывод чисел в несколько строк");

        int start4 = 1;
        int end4 = 24;
        int numbersPerLine = 5;
        int count = 0;
        int remainingNumbers = 0;

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

        remainingNumbers = numbersPerLine - count;

        for (int i = 0; i < remainingNumbers; i++) {
            System.out.printf("%5s", 0);
        }

         System.out.println("\n5. Проверка количества двоек числа на четность/нечетность");

        int number5 = 3242592;
        int countTwos = 0;
        int originalNumber = number5;

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

        System.out.printf("В %d %s количество двоек — %d\n", originalNumber, parityResult, countTwos);

        System.out.println("\n6. Отображение геометрических фигур");

        int height = 5; // Высота фигур

        for (int row = 0; row < height; row++) {
            for (int i = 0; i < 10; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int row = 0; row < height; row++) {
            for (int j = 0; j < height - row; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();

        for (int row = 0; row < height; row++) {
            if (row == 0 || row == 4) {
                System.out.print("$");
            } else if (row == 1 || row == 3) {
                System.out.print("$$");
            } else if (row == 2) { //
                System.out.print("$$$");
            }
            System.out.println();
        }

        System.out.println("\n7. Отображение ASCII-символов");

        System.out.printf("%-8s  %-10s  %-35s\n", "DECIMAL", "CHARACTER", "DESCRIPTION");

        int start7 = 33;
        int end7 = 126;

        for (int i = start7; i < end7; i++) {
            char ch = (char) i;
            String categoryName = Character.getName(ch);

            if (!Character.isDigit(ch) && i % 2 != 0) {
                System.out.printf("%-8d  %-10c  %-35s\n", i, ch, categoryName);
            }

            if (Character.isLowerCase(ch) && i % 2 == 0) {
                System.out.printf("%-8d  %-10c  %-35s\n", i, ch, categoryName);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");

        int number8 = 1234321;
        String numStr = Integer.toString(number8);

        boolean isPalindrome = true;
        for (int i = 0; i < numStr.length() / 2; i++) {
            if (numStr.charAt(i) != numStr.charAt(numStr.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.printf("Число %d является палиндромом\n", number8);
        } else {
            System.out.printf("Число %d не является палиндромом\n", number8);
        }

        System.out.println("\n9. Проверка, является ли число счастливым");

        int number9 = 123456;
        int firstHalf = number9 / 1000;
        int secondHalf = number9 % 1000;

        int sumFirstHalf = 0;
        while (firstHalf > 0) {
            sumFirstHalf += firstHalf % 10;
            firstHalf /= 10;
        }

        int sumSecondHalf = 0;
        while (secondHalf > 0) {
            sumSecondHalf += secondHalf % 10;
            secondHalf /= 10;
        }

        if (sumFirstHalf == sumSecondHalf) {
            System.out.printf("Число %d является счастливым\n", number9);
        } else {
            System.out.printf("Число %d не является счастливым\n", number9);
        }

        System.out.printf("Сумма цифр %d = %d, а сумма %d = %d\n", 
                          number9 / 1000, sumFirstHalf, number9 % 1000, sumSecondHalf);

        System.out.println("\n10. Отображение таблицы умножения Пифагора");

        System.out.println("     |  1  2  3  4  5  6  7  8  9");
        System.out.println("-----------------------------------");

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%4d | ", i);
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%2d ", i * j);
            }
            System.out.println();
        }
    }
}

123123111123123
