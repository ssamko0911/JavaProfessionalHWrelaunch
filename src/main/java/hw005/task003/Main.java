package hw005.task003;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;

/*
Задание 3.
Спроектируйте и разработайте метод, определяющий, сколько времени прошло с заданной даты.
С помощью этого методы выведите в консоль, сколько времени прошло с вашего дня рождения
в удобном для восприятия виде, например: «Вам исполнилось 20 лет, 3 месяца, 18 дней,
4 часа, 5 минут и 10 секунд».
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("How old are you?".toUpperCase(Locale.ROOT));
        try {
            showResult(getDateOfBirth());
        } catch (InputMismatchException exception) {
            System.err.println("Program has finished.");
        }
    }

    public static LocalDateTime getDateOfBirth() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the year of your birth:");
        int year = in.nextInt();
        System.out.println("Input the month of your birth:");
        int month = in.nextInt();
        System.out.println("Input the day of your birth:");
        int dayOfMonth = in.nextInt();
        System.out.println("Input the hour of your birth:");
        int hour = in.nextInt();
        System.out.println("Input the minute of your birth:");
        int minute = in.nextInt();
        System.out.println("Input the second of your birth (if not sure, input 0):");
        int second = in.nextInt();
        in.close();
        return LocalDateTime.of(year, month, dayOfMonth, hour, minute, second);
    }

    public static void showResult(LocalDateTime somebodyDayOfBirth) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        ZonedDateTime birthDay = ZonedDateTime.of(somebodyDayOfBirth, ZoneId.of("Europe/Uzhgorod"));
        ZonedDateTime currentDate = ZonedDateTime.of(currentDateTime, ZoneId.of("Europe/Uzhgorod"));
        long year = ChronoUnit.YEARS.between(birthDay, currentDate);
        birthDay = birthDay.plusYears(year);
        long day = ChronoUnit.DAYS.between(birthDay, currentDate);
        birthDay = birthDay.plusDays(day);
        long hour = ChronoUnit.HOURS.between(birthDay, currentDate);
        birthDay = birthDay.plusHours(hour);
        long minute = ChronoUnit.MINUTES.between(birthDay, currentDate);
        birthDay = birthDay.plusMinutes(minute);
        long second = ChronoUnit.SECONDS.between(birthDay, currentDate);
        System.out.printf("You are %d years, %d days, %d hours, %d minutes, %d seconds old!", year, day, hour, minute, second);
    }
}
