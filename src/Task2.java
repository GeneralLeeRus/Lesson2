public class Task2 {
    public static void main(String args[]) {
        System.out.println("Lesson 2");
        System.out.println("-----------------------------------------");
        System.out.println("Task 1");
        System.out.println("-----------------------------------------");
        int clientOS = 0;
        int clientAndroid = 1;
        int client = 0;
        if (client == 0) {
            System.out.println("Вы пользуетесь операционной системой iOS");
        }
        if (client == 1) {
            System.out.println("Вы пользуетесь операционной системой Android");

        }
        System.out.println("-----------------------------------------");
        System.out.println("Task 2");
        System.out.println("-----------------------------------------");
        int clientDeviceYear = 2655;
        if (client == 0 && clientDeviceYear > 2014) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (client == 0 && clientDeviceYear <= 2014) {
            System.out.println("Установите упрощенную версию приложения для iOS по ссылке");
        }
        if (client == 1 && clientDeviceYear > 2014) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (client == 1 && clientDeviceYear <= 2014) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        System.out.println("-----------------------------------------");
        System.out.println("Task 3");
        System.out.println("-----------------------------------------");
        int year = 1561;
        if (year % 4 == 0 || year % 400 == 0) {
            if (year % 100 == 0) {
                System.out.println("Год " + year + " не високосный год");
            } else {
                System.out.println("Год " + year + " високосный год");
            }
        } else {
            System.out.println("Год " + year + " не високосный год");
        }
        System.out.println("-----------------------------------------");
        System.out.println("Task 4");
        System.out.println("-----------------------------------------");
        int deliveryDistance = 150;
        int time;
        if (deliveryDistance < 20) {
            time = 1;
            System.out.println("Для доставки Вашей карты потребуется дней: " + time);
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            time = 2;
            System.out.println("Для доставки Вашей карты потребуется дней: " + time);
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            time = 3;
            System.out.println("Для доставки Вашей карты потребуется дней: " + time);
        } else {
            System.out.println("К сожалению, мы не сможем доставить Ваш заказ.");
        }
        System.out.println("Lesson 2");
        System.out.println("-----------------------------------------");
        System.out.println("Task 5");
        System.out.println("-----------------------------------------");
        int monthNumber = 8;
        switch (monthNumber) {
            case 1:
            case 2:
                System.out.println("Зимний сезон");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний сезон");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний сезон");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний сезон");
                break;
            case 12:
                System.out.println("Зимний сезон");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}
