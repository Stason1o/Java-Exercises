package firstTask;

import firstTask.com.endava.entity.MyDate;
import firstTask.com.endava.service.UserService;
import firstTask.com.endava.validator.MyDateValidator;

import java.time.LocalDate;

/**
 * Created by sbogdanschi on 15/03/2017.
 */

public class User {
    private String name;
    private String surname;
    private byte age;
    private String nationality;
    private MyDate myDate;
    private LocalDate localDate;

    public User() {
        initializeUserFields();
    }

    public User(String name, String surname, byte age, String nationality, MyDate myDate, LocalDate localDate) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.nationality = nationality;
        this.myDate = myDate;
        this.localDate = localDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){ this.name = name; }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname){ this.surname = surname; }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age){ this.age = age; }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality){ this.nationality = nationality; }

    public MyDate getMyDate() {
        return myDate;
    }

    public void setMyDate(MyDate myDate) {
        this.myDate = myDate;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public void printUserInformation(){
        System.out.println("User's name: " + this.getName());
        System.out.println("User's surname: " + this.getSurname());
        System.out.println("User's birth day: " + this.getMyDate().getDay() + '/' + this.getMyDate().getMonth() + '/' + this.getMyDate().getYear());
        System.out.println("User's age: " + this.getAge());
        System.out.println("User's nationality: " + this.getNationality());
    }

    private void initializeUserFields(){
        this.setName(UserService.setName());
        this.setSurname(UserService.setSurname());
        this.setMyDate(UserService.setDate());
        this.setNationality(UserService.setNationality());
        this.setAge((byte)(LocalDate.now().getYear() - myDate.getYear()));
        this.setLocalDate(LocalDate.of(MyDateValidator.setYear(), MyDateValidator.setMonth(), MyDateValidator.setDay()));
    }

    public static void main(String[] args) {
        User user = new User();
        user.printUserInformation();

        //TODO: SDFJKBVJHEASDFBVIJSKB
    }
}
