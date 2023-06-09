package works;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.time.*;
public class task3 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Ваше имя:");
        String username = sc.nextLine();
        LocalTime currentTime = LocalTime.now();

        if (currentTime.isAfter(LocalTime.parse("05:00:00")) && currentTime.isBefore(LocalTime.parse("12:00:00"))){
            System.out.println("Доброе утро, " + username);}
        else if (currentTime.isAfter(LocalTime.parse("12:00:00")) && currentTime.isBefore(LocalTime.parse("18:00:00"))){
            System.out.println("Добрый день, " + username);}
        else if (currentTime.isAfter(LocalTime.parse("18:00:00")) && currentTime.isBefore(LocalTime.parse("23:00:00"))){
            System.out.println("Добрый вечер, " + username);}
        else if (currentTime.isAfter(LocalTime.parse("00:00:00")) && currentTime.isBefore(LocalTime.parse("05:00:00"))){
            System.out.println("Доброй ночи, " + username);
        }
    }
}

