package firstTask.com.endava.validator;

import firstTask.com.endava.entity.MyDate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

/**
 * Created by Stas on 18.03.2017.
 */
public class MyDateValidator {
    public MyDateValidator() {
    }

    public static int setDay(){
        int day;
        boolean flag = true;
        do{
            System.out.println("Enter day:");
            day = inInt();
            if(day > 0 && day < 31) {
                return day;
            }else {
                System.out.println("Input is wrong. Re-input please.");
            }
        }while(flag);
        return -1;
    }

    public static int setMonth(){
        int month;
        boolean flag = true;
        do{
            System.out.println("Enter month:");
            month = inInt();
            if(month > 0 && month < 13) {
                return month;
            }else {
                System.out.println("Input is wrong. Re-input please.");
            }
        }while(flag);
        return -1;
    }

    public static int setYear(){
        int year;
        boolean flag = true;
        do{
            System.out.println("Enter year:");
            year = inInt();
            if(year > 1920 && year <= LocalDate.now().getYear()) {
                return year;
            }else {
                System.out.println("Input is wrong. Re-input please.");
            }
        }while(flag);
        return -1;
    }

    public static MyDate setDate(){
        return new MyDate(setDay(), setMonth(), setYear());
    }

    private static int inInt(){
        return Integer.valueOf(inString()).intValue();
    }

    static String inString() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        boolean flag = true;
        do{
            try{
                str = reader.readLine();
            } catch(IOException e){ e.printStackTrace();}
            if(str.matches("[1-9]([0-9])*([0-9])*([0-9])*")){
                return str;
            } else System.out.println("Input is incorrect. Re-input");
        }while(flag);
        return "";
    }
}
