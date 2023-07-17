
//Ужас какой, подключать библиотеки для консольного ввода
import java.util.Scanner;

public class Main {
    // Переменные и ввод данных с клавиатуры
    public static String[] ArrNum = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    public static String[] ArrArb = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII",
            "XII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX"};

    public static void main(String[] args) {
        // Создание метода для ввода данных
        Scanner sc = new Scanner(System.in);

        String InS = sc.nextLine();
        String[] X = InS.split(" ");

        if (inArray(X[0]) == "num" && inArray(X[2]) == "num") {
            switch (X[1]) {
                case "+": System.out.println((Integer.parseInt(X[0]) + Integer.parseInt(X[2]))); break;
                case "-": System.out.println((Integer.parseInt(X[0]) - Integer.parseInt(X[2]))); break;
                case "*": System.out.println((Integer.parseInt(X[0]) * Integer.parseInt(X[2]))); break;
                case "/": System.out.println((Double.parseDouble(X[0]) / Double.parseDouble(X[2]))); break;
            }
        } else if (inArray(X[0]) == "arb" && inArray(X[2]) == "arb") {
            int a, b, c = 0;
            a = Anum(X[0]);
            b = Anum(X[2]);
            switch (X[1]) {
                case "+": c = (a + b); break;
                case "-": c = (a - b); break;
                case "*": c = (a * b); break;
                case "/": c = (a / b); break;
            }
            System.out.println(intArb(c));
        } else System.out.println("Не корректный формат");



    }
    //Метод преобразования арабских символов в обычные
    //"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII",
    //"XII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX"
    public static int Anum(String S) {
        if (inArray(S) == "arb") {
            switch (S) {
                case "I":
                    return 1;
                case "II":
                    return 2;
                case "III":
                    return 3;
                case "IV":
                    return 4;
                case "V":
                    return 5;
                case "VI":
                    return 6;
                case "VII":
                    return 7;
                case "VIII":
                    return 8;
                case "IX":
                    return 9;
                case "X":
                    return 10;
            }
        }
        return 0;
    }

    //Метод проверки наличия элемента в массиве
    public static String inArray(String S) {
        for (String A : ArrNum) {
            if (A.equals(S)) {
                return "num";
            }
        }
        for (String A : ArrArb) {
            if (A.equals(S)) {
                return "arb";
            }
        }
        return "err";
    }

    //Метод перевода инты в арабикан
    public static String intArb(int I) {
        if (I < 0) return "В римских цифрах нет нуля или отрицательных чисел";

        String[] O = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] T = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] H = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] F = {"", "M", "MM", "MMM", "MMMM"};

        String t = F[I / 1000];
        String h = H[I / 100 % 10];
        String te = T[I / 10 % 10];
        String o =  O[I % 10];

        return t+h+te+o;


    }
}

