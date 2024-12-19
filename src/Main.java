
public class Main {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskThree();
        taskFour();
        taskFive();


    }

    public static void taskOne() {
        System.out.println("Задача 1");
        int clientOC = 0;
        if (clientOC == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOC == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println();
    }

    public static void taskTwo() {
        System.out.println("Задача 2");
        int clientOC = 0;
        int year = 1987;
        if (clientOC == 0 && year >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOC == 0 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOC == 1 && year >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOC == 1 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        System.out.println();
    }

    public static void taskThree() {
        System.out.println("Задача 3");
        int year = 2025;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(+year + " Год я вляется високосным");
        } else {
            System.out.println(+year + " год не год не является високосным");
        }
        System.out.println();
    }

    public static void taskFour() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance >= 0 && deliveryDistance <= 20) {
            System.out.println("Потребуется 1 день для доставки");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется 2 дня для доставки");
        }
        else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется 3 дня для доставки");
        } else {
            System.out.println("Доставка не осуществляется");
        }
        System.out.println();
    }

    public static void taskFive() {
        System.out.println("Задача 5");
        int monthNumber = 8;
        String season;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                season =  "Зима";
                break;
            case 3:
            case 4:
            case 5:
                season =  "Весна";
                break;
            case 6:
            case 7:
            case 8:
                season =  "Лето";
                break;

            case 9:
            case 10:
            case 11:
                season =  "Осень";
                break;
            default:
                season =" которого не существует";
        }
        System.out.println(+monthNumber +" относится к сезону " + season);
    }
}

