public class Main {
    public static void main(String[] args) {
        task1(1);
        task1(0);
        task1(-3);

        System.out.println("-------------");

        task2(1);
        task2(0);
        task2(-3);

        System.out.println("-------------");

        task3(1);
        task3(0);
        task3(-3);

        System.out.println("-------------");

        task4(1);
        task4(0);
        task4(-3);

        System.out.println("-------------");

        task5(1);
        task5(0);
        task5(-3);

        System.out.println("-------------");

        task6(1);
        task6(0);
        task6(-3);

        System.out.println("-------------");

        task7(12,3);
        task7(12,12);

        System.out.println("-------------");

        task8(1);
        task8(3);

        System.out.println("-------------");

        task9(true);
        task9(false);

        System.out.println("-------------");

        task10(false);
        task10(true);

        System.out.println("-------------");

        task11(5);
        task11(0);
        task11(-3);
        task11(2);

        System.out.println("-------------");

        task12(5);
        task12(0);
        task12(-3);
        task12(2);

        System.out.println("-------------");

        task13(1,3);
        task13(0,6);
        task13(3,5);

        System.out.println("-------------");

        task14(1,3);
        task14(3,5);
        task14(1,2);
        task14(2,6);

        System.out.println("-------------");

        System.out.println(task15(2,""));

        System.out.println("-------------");

        task16(31);

        System.out.println("-------------");

        task17(1);

        System.out.println("-------------");

        String[] abcde = {"a", "b", "c", "d", "e"};

        System.out.println("-------------");

        int[] base = {1,2,5};
        task20(0);
    }
    public static int task1(int a) {
        if (a == 0) {
            System.out.println("Right!");
        } else {
            System.out.println("Nope");
        }

        return a;
    }
    public static int task2(int a) {
        if (a > 0) {
            System.out.println("Right!");
        } else {
            System.out.println("Nope");
        }
        return a;
    }
    public static int task3(int a) {
        if (a < 0) {
            System.out.println("Right!");
        } else {
            System.out.println("Nope!");
        }
        return a;
    }
    public static int task4(int a) {
        if (a >= 0) {
            System.out.println("Right!");
        } else {
            System.out.println("Nope");
        }
        return a;
    }
    public static int task5(int a) {
        if (a <= 0) {
            System.out.println("Right!");
        } else {
            System.out.println("Nope");
        }
        return a;
    }
    public static int task6(int a) {
        if (a != 0 ) {
            System.out.println("Right!");
        } else {
            System.out.println("Nope");
        }
        return a;
    }
    public static int task7(int a, int test) {
        if (a == test) {
            System.out.println("Right!");
        } else {
            System.out.println("Nope");
        }
        return a;
    }
    public static int task8(int a) {
        if (a == 1) {
            System.out.println("Right!");
        } else {
            System.out.println("Nope");
        }
        return a;
    }
    public static boolean task9(boolean test) {
        if (test == true) {
            System.out.println("Right!");
        } else {
            System.out.println("Nope");
        }
        return test;
        // System.out.println(test ? "Right!" : "Nope!");
    }
    public static boolean task10(boolean test) {
        if (test != true) {
            System.out.println("Right!");
        } else {
            System.out.println("Nope");
        }
        return test;
        // System.out.println(test ? "Right!" : "Nope");
    }
    public static int task11(int a) {
        if (a > 0 && a < 5) {
            System.out.println("Right!");
        } else {
            System.out.println("Nope");
        }
        return a;
    }
    public static int task12(int a) {
        if (a == 0 || a == 2) {
            a = a + 7;
            System.out.println(a);
        } else {
            a = a / 7;
            System.out.println(a);
        }
        return a;
    }
    public static int task13(int a, int b) {
        if (a <= 1 && b >= 3) {
            System.out.println(a + b);
        } else {
            System.out.println(a - b);
        }
        return a;
    }
    public static int task14(int a, int b) {
        if (a > 2 && a < 11 || b >= 6 && b < 14) {
            System.out.println("Right!");
        } else {
            System.out.println("Nope");
        }
        return a;
    }
    public static String task15(int num, String result) {

        switch (num) {
            case 1:
                result = "Зима";
                break;
            case 2:
                result = "Весна";
                break;
            case 3:
                result = "Лето";
                break;
            case 4:
                result = "Осень";
                break;
        }
        return result;
    }
    public static int task16(int day) {
        if (day >= 1 && day <= 10) {
            System.out.println("Перша декада");
        } else if (day > 10 && day <= 20) {
            System.out.println("Друга декада");
        } else if (day > 20 && day <= 30) {
            System.out.println("Третя декада");
        } else {
            System.out.println("Четверта декада");
        }
        return day;
    }
    public static int task17(int month) {
        if (month >= 1 && month <= 3) {
            System.out.println("Зима");
        } else if (month > 3 && month <= 6) {
            System.out.println("Лето");
        } else if (month > 6 && month <= 9) {
            System.out.println("Весна");
        } else if (month > 9 && month <= 12) {
            System.out.println("Осень");
        }
        return month;
    }
}