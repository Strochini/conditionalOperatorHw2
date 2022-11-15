public class Main {
    public static void main(String[] args) {
        System.out.println("First and second exercise\n");

        byte clientOS = 0;
        int madeYear = 2013;
        int fullVersionDateFrom = 2015;

        if (clientOS == 0 && madeYear >= fullVersionDateFrom) {
            System.out.println("Установите приложение для IOS по ссылке");
        } else {
            if (clientOS == 0 && madeYear < fullVersionDateFrom) {
                System.out.println("Установите облегченную версию для IOS  по ссылке");
            } else if (clientOS == 1 && madeYear >= fullVersionDateFrom) {
                System.out.println("Установите приложение для Android по ссылке");
            } else {
                if (clientOS == 1 && madeYear < fullVersionDateFrom) {
                    System.out.println("Установите облегченное приложение для Android по ссылке");
                }
            }

        }
        System.out.println("\nThird exercise\n");

        int year = 2015;
        int leapYearCondition0 = 4;
        int leapYearCondition1 = 100;
        int leapYearCondition2 = 400;

        if (((year % leapYearCondition0 == 0) && (year % leapYearCondition1 != 0)) || (year % leapYearCondition2 == 0)) {
            System.out.println("Is a leap year");
        } else {
            System.out.println("Is a not leap year");
        }
        System.out.println("\nFourth exrcise\n");

        int deliveryDistance = 95;
        int deliveryDay = 1;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDay);
        } else {
            if (deliveryDistance > 20 && deliveryDistance <= 60) {
                System.out.println("Потребуется дней: " + (deliveryDay + 1));
            } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
                System.out.println("Потребуется дней: " + (deliveryDay + 2));

            }
        }
        System.out.println("\nFifth exercise\n");

        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("No such month");
        }
    }
}