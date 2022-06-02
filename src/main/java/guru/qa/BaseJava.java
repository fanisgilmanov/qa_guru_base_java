package guru.qa;

import java.util.Arrays;

public class BaseJava {
        public static void main(String[] args)   {
            operationsOnVariables();
            strClass();
            logicalComparisonConditions();
            arrays();

        }

        public  static void primitiveVariables() {
            // Целочисленные типы
            byte aByte = 127; // Диапазон от -128 до 127, Размер 8 бит
            short aShort = -32768; // Диапазон от -32768 до 32767, Размер 16 бит
            char aChar = 'b'; // Беззнаковое целое число, представляющее собой символ UTF-16 (буквы и цифры), Размер 16 бит
            int aInt = 2147483647; // Диапазон от -2147483648 до 2147483647, Размер 32 бит
            long aLong = -9223372036854775808L; // Диапазон от -9223372036854775808L до 9223372036854775807L, Размер 32 бит

            // Целочисленные типы
            float aFloat = 5.25f; // Диапазон от 1.4e-45f до 3.4e+38f, Размер 32 бит
            double aDouble = 2837.73; // Диапазон от  4.9e-324 до 1.7e+308, Размер 64 бит

            // Булевый тип
            boolean aBoolean = true; //true (истина) или false (ложь)

        }

        public static void operationsOnVariables () {
            //Обьявление основных виды математических операторов
            byte sumByte = 53 + 31;
            System.out.println("Сложение типа байт: " + sumByte);
            int timesInt = 758 * 32;
            System.out.println("Умножение типа int: " + timesInt);
            long differenceLong = 6785978 - 2738878;
            System.out.println("Вычитание типа long: " + differenceLong);
            double dividedDouble = 6423.32 / 235567.5;
            System.out.println("Деление типа double: " + dividedDouble);
            short moduleShort = 364 % 15;
            System.out.println("Деление по модулю типа double: " + moduleShort);


            //Переполнения типов int, long, double
            long overflowLong = 9223372036854775807L + 1;
            System.out.println("Перполнение типа long: " + overflowLong);
            int overflowMaxInt = 2147483647 + 1;
            System.out.println("Перполнение max типа int: " + overflowMaxInt);
            int overflowMinInt = -2147483648 - 1;
            System.out.println("Перполнение min типа int: " + overflowMinInt);
            double overflowDouble = 1.7e+308 * 2;
            System.out.println("Перполнение типа double: " + overflowDouble);


            // Вычисления комбинаций типов данных (int и double)
            System.out.println("Сложение типа int и double: " + 253 + 232.4);
            System.out.println("Вычитание типа int и double: " + 211.85 + 232);

        }

        public static void strClass(){
            //Обьявление строки - final класса String
            String aStr = "Тестовый ";
            String bStr = "текст";
            //Конкатенация строк
            System.out.println(aStr + bStr + "!");

        }
        public static void logicalComparisonConditions() {
            if (5 > 3 && 23 == 23) {
                System.out.println("использование логических операторов \" > и =  \" и оператора сравнения \" &&-и \" ");
            } else if (743 < 790 || 53 >= 32) {
                System.out.println("использование логических операторов \" < и >=  \" и оператора сравнения \" ||-или \" ");
            } else if (584 != 32) {
                System.out.println("использование логических операторов \" != Не равно  \"");
            }
        }

        public static void arrays() {
            //Объявление массива
            int[] arrayExample = new int[] {236, 4, 7, 16, 23, 53};
            System.out.println("Массив: " + Arrays.toString(arrayExample));

        }
}
