package ru.koch.Java.pracrice;

public class LessonFifteen {

    public static void main(String[] args) {
        // byte, short, int, char, String, enum
        int month = 9;

        String result = switch  (month){
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default ->"Month is invalid";
        };
    }
}
