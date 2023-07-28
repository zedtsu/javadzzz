import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task4();
    }

    public static void task1(){
        // Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
        // и возвращает введенное значение.
        // Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
        // необходимо повторно запросить у пользователя ввод данных.

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
            try {
                System.out.print("Введите дробное число: ");
                Object a = sc.nextFloat();
                System.out.println(a);
                flag = false;
            } catch (Exception e) {
                System.out.println("Вы ввели неверный формат дробного числа, попробуйте еще раз.");
                task1();
        }
    }

    public static void task2(){
        try {
            int d = 0;
            double catchedRes1 = 8 / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }

    public static void task4(){
        //Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
        //Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку(не пустую): ");
        String line = sc.nextLine();
        if (line.equals("")){
            throw new RuntimeException("Ошибка! Пустой вввод строки запрещён.");
        } else {
            System.out.println("До свидания!");
        }
    }

}
