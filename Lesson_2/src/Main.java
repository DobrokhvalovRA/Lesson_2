import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    //№1. - Выводим в столбец фрукты
    public static void printFruits(){
        System.out.println("Задача№1:");
        System.out.println("Orange,\nBanana,\nApple.");
    }

    //№2. - Определяем сумму
    public static void checkSumSign(){
        System.out.println("\nЗадача №2:");
        int a, b, sum;
        a = 5;
        b = -10;
        sum = a + b;
        if (sum >= 0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");
    }

    //№3. - Определяем цвет
    public static  void printColor(){
        System.out.println("\nЗадача №3:");
        int value;
        value = 101;
        if (value <= 0)
            System.out.println("Красный");
        else if (value > 0 && value <= 100)
            System.out.println("Желтый");
        else if (value > 100)
            System.out.println("Зеленный");
    }

    //№4. - Сравниваем числа
    public static void compareNumbers(){
        System.out.println("\nЗадача №4:");
        int a, b;
        a = 5;
        b = -10;

        if (a >= b)
            System.out.println("a >= b");
        else
            System.out.println("a < b");
    }

    //№5. - Проверяем сумму
    public static boolean checkSum(int a, int b) {
        System.out.println("\nЗадача №5:");
        int sum;
        sum = a + b;

        if (sum <= 20 && sum >= 10) {
            return true;
        } else {
            return false;
            }
    }

    //№6. - Проверяем числа
    public static void checkNumber(int value){
        System.out.println("\nЗадача №6:");

        if (value >= 0)
            System.out.println("Число положительное.");
        else
            System.out.println("Число отрицательное.");
    }

    //№7. - Проверяем сумму
    public static boolean checkNumber2(int value) {
        System.out.println("\nЗадача №7:");

        if (value < 0) {
            return true;
        } else {
            return false;
        }
    }

    //№8. - Печатаем строку
    public static void printRow(String row, int quantity) {
        System.out.println("\nЗадача №8:");
        int i = 0;
        while (i < quantity){
            System.out.println(row);
            i++;
        }
    }

    //№9. - Проверяем год
    public static boolean checkYear(int year) {
        System.out.println("\nЗадача №9:");
        if (year%4 == 0){
            if(year%100 > 0 | year%400 == 0) {
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    //№10. - Замена значений в массиве
    public static void enterArr() {
        System.out.println("\nЗадача №10:");
        int i;
        int [] arr;
        arr = new int [10];
        Random random = new Random();

        System.out.println("Первый массив:");
        for (i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(2);;
            System.out.print(arr[i]);
        }

        System.out.println("\nВторой массив:");
        for (i = 0; i < arr.length; i++){
            switch (arr[i]){
                case (0):
                    arr[i] = 1;
                    break;
                case  (1):
                    arr[i] = 0;
                    break;
            }
            System.out.print(+arr[i]);
        }
    }

    //№11. - Массив 100
    public static void enterArr100() {
        System.out.println("\nЗадача №11:");
        int i=0;
        int [] arr;
        arr = new int [100];

        while (i < arr.length){
            arr[i] = i+1;
            System.out.print(arr[i]);
            i++;
        }
    }

    //№12. - Умножение в массиве
    public static void multiplicationNumArr() {
        System.out.println("\nЗадача №12:");
        int i=0;
        int [] arr;
        arr = new int []{1,5,3,2,11,4,5,2,4,8,9,1};

        while (i < arr.length){
            if (arr[i] < 6){
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i]+" ");
            i++;
        }
    }

    //№13. - Двумерный массив
    public static void squareArr() {
        System.out.println("\nЗадача №13:");
        int i,j;
        int [][] arr = new int [5][5];

        for (i = 0; i < arr.length; i++){
            for (j = 0; j < arr.length; j ++){
                if (i == j) {
                    arr [i][j] = 1;
                }else if (j+1 == arr.length-i) {
                    arr[i][j] = 1;
                }else
                    arr[i][j] = 0;
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
    }

    //№14. - Возвращение аргументов массива
    public static int [] returnArgArr(int len, int initialValue) {
        System.out.println("\nЗадача №14:");
        int i;
        int [] arr = new int [len];

        for (i = 0; i < arr.length; i++){
                arr[i]= initialValue;
        }
        return  arr;
    }

    public static void main(String[] args) {
        printFruits();
        checkSumSign();
        printColor();
        compareNumbers();

        if (checkSum(11,10) == true){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        checkNumber(-1);

        if (checkNumber2(-1) == true){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        printRow("Cool", 2);

        if (checkYear(2000) == true){
            System.out.println("Год високосный!");
        } else {
            System.out.println("Год не високосный!");
        }

        enterArr();
        enterArr100();
        multiplicationNumArr();
        squareArr();


        int arr[] = new int [5];
        int i;
        arr = returnArgArr(5,15);

        for (i=0; i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}