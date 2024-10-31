public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java");

        boolean isMale = false;
        if(!isMale) {
            System.out.println("Мужчина");
        } else {
            System.out.println("Женщина");
        }
        int age = 19;
        if(age > 18) {
            System.out.println("Можно пить бурбон");
        } else {
            System.out.println("Нельзя пить бурбон");
        }
        double height = 1.9;
        if(height < 1.8) {
            System.out.println("Полтарашка");
        } else {
            System.out.println("Каланча");
        }
        char firstLetterName = "Yakov".charAt(0);
        if(firstLetterName == 'M') {
            System.out.println("Maksim");
        } else if(firstLetterName == 'I') {
            System.out.println("Ilya");
        } else {
            System.out.println("Yakov");
        }

        System.out.println("\n2. Поиск большего числа");

        int a = 5;
        int b = 10;
        if(a > b) {
            System.out.println("а больше b");
        } else if(b > a) {
            System.out.println("b больше a");
        } else {
            System.out.println("Значения равны");
        }

        System.out.println("\n3. Проверка числа");

        int number = -15;
        if(number == 0) {
            System.out.println("является нулем");
            System.exit(0);
        } else {
            System.out.println(number + " является ");
                if (number > 0) {
                    System.out.println("положительным и ");
                } else {
                     System.out.println("отрицательным и ");
                }
                if (number % 2 == 0) {
                    System.out.println("четным");
                } else {
                    System.out.println("нечетным"); 
                }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");

        int number1 = 123;
        int number2 = 453;

        int hundredsNumber1 = number1 / 100;
        int hundredsNumber2 = number2 / 100;
        int tensNumber1 = (number1 / 10) % 10;
        int tensNumber2 = (number2 / 10) % 10;
        int onesNumber1 = number1 % 10;
        int onesNumber2 = number2 % 10;
          
        if((hundredsNumber1 == hundredsNumber2) || (tensNumber1 == tensNumber2) || 
            (onesNumber1 == onesNumber2)) {
            System.out.println("В числах " + number1 + " и " + number2 + " одинаковые цифры " + "");
            if(hundredsNumber1 == hundredsNumber2) {
                System.out.println(hundredsNumber1 + " и " + hundredsNumber2 + " в третьем разряде");
            }
            if(tensNumber1 == tensNumber2) {
                System.out.println(tensNumber1 + " и " + tensNumber2 + " во втором разряде");
            }
            if(onesNumber1 == onesNumber2) {
                System.out.println(onesNumber1 + " и " + onesNumber2 + " в первом разряде");
            }
        } else {
            System.out.println("Равных чисел нет");
        }

        System.out.println("\n5. Определение символа по его коду");
        char symbol = '\u0057';
        if(symbol >= 'A' && symbol <= 'Z') {
            System.out.println("Символ " + symbol + " является большой буквой");
        } else if(symbol >= 'a' && symbol <= 'z') {
            System.out.println("Символ " + symbol + " является маленькой буквой");
        } else if(symbol >= '0' && symbol <= '9') {
            System.out.println("Символ " + symbol + " является цифрой");
        } else {
            System.out.println("Символ " + symbol + " не является буквой и не является цифрой");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");

        int depositAmount = 450_000;
        int percent = 5;

        if(depositAmount >= 0 && depositAmount <= 100_000) {
        } else if(depositAmount >= 100_000 && depositAmount <= 300_000) {
            percent = 7;
        } else if(depositAmount >= 300_000) {
            percent = 10;
        } else {
            System.out.println("Некорректная сумма вклада");
        }

        int accruedInterest = depositAmount * percent / 100;
        int totalAmount = depositAmount + accruedInterest;

        System.out.println("Сумма вклада: " + depositAmount);
        System.out.println("Сумма начисленного %: " + accruedInterest);
        System.out.println("Итоговая сумма с %: " + totalAmount);

        System.out.println("\n7. Определение оценки по предметам %");

        int historyPrecent = 59;
        int historyGrade = -1;

        if(historyPrecent >= 0 && historyPrecent <= 60) {
            historyGrade = 2;
        } else if(historyPrecent > 60 && historyPrecent <= 73) {
            historyGrade = 3;
        } else if(historyPrecent > 73 && historyPrecent <= 91) {
            historyGrade = 4;
        } else if(historyPrecent > 91 && historyPrecent <= 100) {
            historyGrade = 5;
        }
        int programmingPrecent = 92;
        int programmingGrade = -1;

        if(programmingPrecent >= 0 && programmingPrecent <= 60) {
            programmingGrade = 2;
        } else if(programmingPrecent > 60 && programmingPrecent <= 73) {
            programmingGrade = 3;
        } else if(programmingPrecent > 73 && programmingPrecent <= 91) {
            programmingGrade = 4;
        } else if(programmingPrecent > 91 && programmingPrecent <= 100) {
            programmingGrade = 5;
        }
        System.out.println("История: " + historyGrade);
        System.out.println("Программирование: " + programmingGrade);
        System.out.println("Средний балл оценок по предметам: " + 
                (historyGrade + programmingGrade) / 2);
        System.out.println("Средний % по предметам: " + (historyPrecent + programmingPrecent) / 2);

        System.out.println("\n8. Расчет годовой прибыли");

        int productSale = 13_000;
        int premisesRental = 5_000;
        int productionCost = 9_000;

        int yearGrade = (productSale + premisesRental + productionCost) * 12;
        String sign = "";

        if(yearGrade > 0) {
            sign = "+";
        }
        System.out.println("Прибыль за год: " + sign + yearGrade);
    }
}


