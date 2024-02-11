public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Вывод характеристик компьютера");

        //Количество ядер процессора
        byte cores = 6;
        System.out.println("Количество ядер процессора" + " = " + cores);

        //Количество пикселей дисплея
        short ppi = 3250;
        System.out.println("Количество пикселей дисплея" + " = " + ppi);

        //Серия процессора
        int cpuSeries = 5000;
        System.out.println("Cерия процессора" + " " + cpuSeries);

        //Количество кластеров SSD
        long numberSsdClusters = 127250000;
        System.out.println("Количество кластеров SSD" + " = " + numberSsdClusters);

        //Свободное место на диске
        float freeSpace = 44.21f;
        System.out.println("Свободное место на диске" + " = " + freeSpace);

        //Температура процессора
        double cpuTemperature = 34.38;
        System.out.println("Температура процессора" + " = " + cpuTemperature);

        //Работоспособность второго SSD
        char perfomanceSecondSsd = '†';
        System.out.println("Работоспособность второго SSD" + " = " + perfomanceSecondSsd);

        //Компьютер включен?
        boolean isComputerPowerOn = true;
        System.out.println("Компьютер включен?" + " = " + isComputerPowerOn);

        System.out.println("\n2. Расчет стоимости товара со скидкой");

        int penCost = 100;
        int bookCost = 200;
        int fullPrice = penCost + bookCost;
        int discountPrice = fullPrice / 100 * 11;

        System.out.println(fullPrice);
        System.out.println(discountPrice);
        System.out.println(fullPrice - discountPrice);

        System.out.println("\n3. Вывод слова JAVA");

        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");

        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long ln = 9223372036854775807L;

        System.out.println(b + " " + (++b) + " " + (--b) + "\n");
        System.out.println(s + " " + (++s) + " " + (--s) + "\n");
        System.out.println(i + " " + (++i) + " " + (--i) + "\n");
        System.out.println(ln + " " + (++ln) + " " + (--ln));
        
        System.out.println("\n5. Перестановка значений переменных");

        int x = 2;
        int y = 5;
        System.out.println("Перестановка значений с помощью третьей переменной");
        System.out.println("Исходные значения:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("После перестановки:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("Перестановка значений с помощью арифметических операций");
        System.out.println("Исходные значения:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("После перестановки:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("Перестановка значений с помощью побитовой операции");
        System.out.println("Исходные значения:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        x ^= y;
        y = x ^ y;
        x ^= y;
        System.out.println("После перестановки:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("\n6. Вывод символов и их кодов");

        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';
        int numericValueDollar = (int) dollar;
        int numericValueAsterisk = (int) asterisk;
        int numericValueAtSign = (int) atSign;
        int numericValueVerticalBar = (int) verticalBar;
        int numericValueTilde = (int) tilde;

        System.out.println("код символа: " + numericValueDollar + " соответствующий коду символ: " + dollar);
        System.out.println("код символа: " + numericValueAsterisk + " соответствующий коду символ: " + asterisk);
        System.out.println("код символа: " + numericValueAtSign + " соответствующий коду символ: " + atSign);
        System.out.println("код символа: " + numericValueVerticalBar + " соответствующий коду символ: " + verticalBar);
        System.out.println("код символа: " + numericValueTilde + " соответствующий коду символ: " + tilde);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");

        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';

        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underscore + leftParenthesis + " " + rightParenthesis + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash + backslash + underscore + underscore + backslash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");

        int number = 123;

        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;
        int sum = hundreds + tens + ones;
        int multiplication = hundreds * tens * ones;

        System.out.println("Число " + number + " содержит:");
        System.out.println("  сотен - " + hundreds);
        System.out.println("  десятков - " + tens);
        System.out.println("  единиц - " + ones);
        System.out.println("Сумма его цифр = " + sum);
        System.out.println("Произведение = "+ multiplication);

        System.out.println("\n9. Вывод времени");

        int time = 86399;
        int hours = time / 3600;
        int minutes = (time % 3600) / 60;
        int seconds = time % 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);

    }
}