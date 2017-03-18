package firstTask.com.endava.service;

import firstTask.com.endava.entity.MyDate;
import firstTask.com.endava.validator.MyDateValidator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Stas on 18.03.2017.
 */
public class UserService {

    public UserService() {
    }

    public static String setName(){
        System.out.println("Enter your name: ");
        return stringInput();
    }

    public static String setSurname(){
        System.out.println("Enter your surname");
        return stringInput();
    }

    public static String setNationality(){
        System.out.println("Enter your nationality");
        return stringInput();
    }

    public static MyDate setDate(){
        System.out.println("Enter your birth date:");
        return MyDateValidator.setDate();
    }

    private static String stringInput(){
        boolean flag;
        flag = true;

        do{
            String name = inString();

            if(name.matches("[A-Za-z]+")) {
                return name;
            }else {
                System.out.println("Input is wrong. Re-input please.");
            }
        }while(flag);

        return "";
    }

    private static String inString() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = "";

        try{
            str = reader.readLine();
        } catch(IOException e){}

        return str;
    }

}
