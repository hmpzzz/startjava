public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java");

        boolean man = false;
        if(!man) {
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
        }
        if(number > 0) {
            if(number % 2 == 0) {
                System.out.println(number + " является положительным и четным числом");
                } else {
                System.out.println(number + " является положительным и нечетным числом");
        }
        
        } else {
            if(number % 2 == 0) {
                System.out.println(number + " является отрицательным и четным числом");
            } else {
                System.out.println(number + " является отрицательным и нечетным числом");
            }
        }
        System.out.println("\n4. Поиск одинаковых цифр в числах");

        int number1 = 123;
        int number2 = 453;

        int hundredNumber1 = number1 / 100;
        int hundredNumber2 = number2 / 100;
        int tenNumber1 = (number1 / 10) % 10;
        int tenNumber2 = (number2 / 10) % 10;
        int unitNumber1 = number1 % 10;
        int unitNumber2 = number2 % 10;
          
        if((hundredNumber1 == hundredNumber2) || (tenNumber1 == tenNumber2) || 
            (unitNumber1 == unitNumber2)) {
            if(hundredNumber1 == hundredNumber2) {
                System.out.println("В числах " + number1 + " и " + number2 + " одинаковые цифры " + 
                    hundredNumber1 + " и " + hundredNumber2 + " в третьем разряде");
            }
            if(tenNumber1 == tenNumber2) {
                System.out.println("В числах " + number1 + " и " + number2 + " одинаковые цифры " + 
                    tenNumber1 + " и " + tenNumber2 + " во втором разряде");
            }
            if(unitNumber1 == unitNumber2) {
                System.out.println("В числах " + number1 + " и " + number2 + " одинаковые цифры " + 
                    unitNumber1 + " и " + unitNumber2 + " в первом разряде");
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
        if(depositAmount <= 100_000 && depositAmount >= 0) {
            System.out.println("Сумма вклада: " + depositAmount + " \nCумма начисленного %: " + 
                depositAmount / 100 * 5 + " \nИтоговая сумма с %: " + (depositAmount / 100 * 5 + 
                    depositAmount));
        }else if(depositAmount <= 300_000 && depositAmount >= 100_000){
            System.out.println("Сумма вклада: " + depositAmount + " \nCумма начисленного %: " + 
                depositAmount / 100 * 7 + " \nИтоговая сумма с %: " + (depositAmount / 100 * 5 + 
                    depositAmount));
        }else if(depositAmount >= 300_000){
            System.out.println("Сумма вклада: " + depositAmount + " \nCумма начисленного %: " + 
                depositAmount / 100 * 10 + " \nИтоговая сумма с %: " + (depositAmount / 100 * 5 + 
                    depositAmount));
        }

        System.out.println("\n7. Определение оценки по предметам %");

        int historyPrecent = 59;
        int programmingPrecent = 92;
        int historyResult = 0;
        int programmingResult = 0;

        if(historyPrecent <= 60 && historyPrecent >= 0) {
            historyResult = 2;
        }else if(historyPrecent > 60 && historyPrecent <= 73) {
            historyResult = 3;
        }else if(historyPrecent > 73 && historyPrecent <= 91) {
            historyResult = 4;
        }else if(historyPrecent > 91 && historyPrecent <= 100) {
            historyResult = 5;
        }
        if(programmingPrecent <= 60 && programmingPrecent >= 0) {
            programmingResult = 2;
        }else if(programmingPrecent > 60 && programmingPrecent <= 73) {
            programmingResult = 3;
        }else if(programmingPrecent > 73 && programmingPrecent <= 91) {
            programmingResult = 4;
        }else if(programmingPrecent > 91 && programmingPrecent <= 100) {
            programmingResult = 5;
        }
        System.out.println("История: " + historyResult);
        System.out.println("Программирование: " + programmingResult);
        System.out.println("Средний балл оценок по предметам: " + (historyResult + 
            programmingResult) / 2);
        System.out.println("Средний % по предметам: " + (historyPrecent + programmingPrecent) / 2);

        System.out.println("\n8. Расчет годовой прибыли");

        int productSale = 13000;
        int premisesRental = 5000;
        int productionCost = 9000;

        int yearResult = (productSale + premisesRental + productionCost) * 12;
        String sign = "";

        if(yearResult > 0) {
            sign = "+";
        }else if(yearResult < 0) { 
            sign = "-";
        }else if(yearResult == 0) {
            sign = "";
        }
        System.out.println("Прибыль за год: " + sign + yearResult);
    }
}