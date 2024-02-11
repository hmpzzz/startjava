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

        //Свбодное место на диске
        float freeSpace = 44.21f;
        System.out.println("Свбодное место на диске" + " = " + freeSpace);

        //Темперарутра процессора
        double cpuTemperature = 34.38;
        System.out.println("Темперарутра процессора" + " = " + cpuTemperature);

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
        int salePrice = (penCost + bookCost) / 100 * 11;

        System.out.println(fullPrice);
        System.out.println(salePrice);
        System.out.println(fullPrice - salePrice);

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

        System.out.println(b);
        System.out.println(++b);
        System.out.println(--b + "\n");
        
        System.out.println(s);
        System.out.println(++s);
        System.out.println(--s + "\n");
        
        System.out.println(i);
        System.out.println(++i);
        System.out.println(--i + "\n");
        
        System.out.println(ln);
        System.out.println(++ln);
        System.out.println(--ln);

        System.out.println("\n5. Перестановка значений переменных");

        int aa = 2;
        int bb = 5;
        System.out.println("Перестановка значений с помощью третьей переменной");
        System.out.println("Исходные значения:");
        System.out.println("a = " + aa);
        System.out.println("b = " + bb);
        int temp = aa;
        aa = bb;
        bb = temp;
        System.out.println("После перестановки:");
        System.out.println("a = " + aa);
        System.out.println("b = " + bb);

        System.out.println("Перестановка значений с помощью арифметических операций");
        System.out.println("Исходные значения:");
        System.out.println("a = " + aa);
        System.out.println("b = " + bb);
        aa = aa + bb;
        bb = aa - bb;
        aa = aa - bb;
        System.out.println("После перестановки:");
        System.out.println("a = " + aa);
        System.out.println("b = " + bb);

        System.out.println("Перестановка значений с помощью побитовой операции");
        System.out.println("Исходные значения:");
        System.out.println("a = " + aa);
        System.out.println("b = " + bb);
        aa = aa ^ bb;
        bb = aa ^ bb;
        aa = aa ^ bb;
        System.out.println("После перестановки:");
        System.out.println("a = " + aa);
        System.out.println("b = " + bb);

        System.out.println("\n6. Вывод символов и их кодов");

        char charCode36 = '$';
        char charCode42 = '*';
        char charCode64 = '@';
        char charCode124 = '|';
        char charCode126 = '~';
        int intCode36 = 36;
        int intCode42 = 42;
        int intCode64 = 64;
        int intCode124 = 124;
        int intCode126 = 126;

        System.out.println("код символа: " + intCode36 + " соответствующий коду символ: " + charCode36);
        System.out.println("код символа: " + intCode42 + " соответствующий коду символ: " + charCode42);
        System.out.println("код символа: " + intCode64 + " соответствующий коду символ: " + charCode64);
        System.out.println("код символа: " + intCode124 + " соответствующий коду символ: " + charCode124);
        System.out.println("код символа: " + intCode126 + " соответствующий коду символ: " + charCode126);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");

        char duke1 = '/';
        char duke2 = '\\';
        char duke3 = '_';
        char duke4 = '(';
        char duke5 = ')';
        char duke6 = '/';

        System.out.println("    " + duke1 + duke2);
        System.out.println("   " + duke1 + "  " + duke2);
        System.out.println("  " + duke1 + duke3 + duke4 + " " + duke5 + duke2);
        System.out.println(" " + duke1 + "      " + duke2);
        System.out.println("" + duke1 + duke3 + duke3 + duke3 + duke3 + duke1 + duke2 + duke3 + duke3 + duke2);

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