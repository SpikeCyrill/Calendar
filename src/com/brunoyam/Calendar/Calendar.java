package com.brunoyam.Calendar;

public class Calendar {

    private static final String GET_BY_MONTH_RESULT = "месяц номер %d называется %s, время года - %s";

    private final KeyType currentKey;

    public Calendar(KeyType currentKey) {
        this.currentKey = currentKey;
    }

    public void start(Integer number) {


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

    private String getMonthAndTime(Integer monthNumber) {

        Month month = Month.getByPosition(monthNumber);
        String monthName = month.getName();

        Season season = month.getSeason();
        String seasonName = season.getName();

        return String.format(GET_BY_MONTH_RESULT, monthNumber, monthName, seasonName);
    }

    private String getWeekAndMonthAndTime(Integer day) {
        Month month = Month.getByDay(day);
        String monthName = month.getName();

        Season season = month.getSeason();
        String seasonName = season.getName();

        Integer weekNumber = day / 7 + 1;

        return "неделя номер " + weekNumber
                + " месяц называется \"" + monthName
                + "\", время года - " + seasonName;
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
        calendar.start(Integer.valueOf(args[1]));

    }

    private static void error(String errorMessage) {
        System.out.println(errorMessage);
        System.exit(1);
    }

}
