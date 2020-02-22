package com.brunoyam.Calendar;

public class Calendar {

    private final KeyType currentKey;

    public Calendar(KeyType currentKey) {
        this.currentKey = currentKey;
    }

    public void start(int number) {


        switch (currentKey) {
            case DAY:
                System.out.println(
                        getWeekAndMonthAndTime(number)
                );
                break;
            case MONTH:
                System.out.println(
                        getMonthAndTime(number)
                );
                break;
            default:
                System.out.println("Не найден обработчик ключа.");
        }


    }

    private String getMonthAndTime(int month) {
        return "";
    }

    private String getWeekAndMonthAndTime(int day) {
        return "";
    }



    public static void main(String[] args) {

        if(args.length != 2) {
            error("Не верное количество аргументов!");
        }

        KeyType currentKey = KeyType.getByString(args[0]);
        
        if(currentKey == null) {
            error("Не существующий ключ.");
        }

        Calendar calendar = new Calendar(currentKey);
        calendar.start(11);

    }

    private static void error(String errorMessage) {
        System.out.println(errorMessage);
        System.exit(1);
    }

}
