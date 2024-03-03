
public class Main {
    public static void main(String[] args) {

        //task1
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        //task2
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        //task3
        for (int i = 0; i < 18; i = i + 2) {
            System.out.println(i);
        }

        //task4
        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }

        //task5
        for (int i = 1904; i < 2097; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        //task6
        for (int i = 1; i < 15; i++) {
            int x = 7 * i;
            System.out.println(x);
        }

        //task7
        for (int i = 1; i < 513; i = i * 2) {
            System.out.println(i);
        }

        //task8
        int total = 0;
        for (int i = 1; i < 13; i++) {
            int forMonth = 29000;
            total = total + forMonth;
            System.out.println("Месяц "  + i + ", сумма накоплений равна " + total);
        }

        //task9
        total = 0;
        for (int i = 1; i < 13; i++) {
            int forMonth = 29000;
            total = total + (total / 100) + forMonth;
            System.out.println("Месяц "  + i + ", сумма накоплений равна " + total);
        }

        //task10
        for (int i = 1; i < 11; i++) {
            int x = 2;
            x = x * i;
            System.out.println("2*" + i + "=" + x);
        }
    }
}