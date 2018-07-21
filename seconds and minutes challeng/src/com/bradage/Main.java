package com.bradage;

public class Main {
    public static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {


        System.out.println(getDurationString(3600));
    }
    public static String getDurationString(long minutes, long seconds){
        long XX = 0;
        long YY = 0;
        long ZZ = 0;

        if(minutes < 0 || seconds < 0 || seconds > 59){
            return INVALID_VALUE_MESSAGE;
        } else if(minutes > 60) {
            XX = minutes / 60;
            YY = minutes % 60;
            ZZ = seconds;

            return XX + "h " + YY + "m " + ZZ + "s";
        } else
            YY = minutes;
            ZZ = seconds;

            return XX + "h " + YY + "m " + ZZ + "s";

    }

    public static String getDurationString(long seconds){
        long YY = 0;
        long ZZ = 0;
        if(seconds < 0){
            return INVALID_VALUE_MESSAGE;
        } else if(seconds < 60){
            ZZ = seconds;
            return "00h 00m " + ZZ + "s";
        } else
            YY = seconds / 60;
            ZZ = seconds % 60;

            return getDurationString(YY, ZZ);
    }

}
