package secondTask.com.endava.libraryclasses;


import secondTask.com.endava.entity.MyDate;

/**
 * Created by sbogdanschi on 15/03/2017.
 */
public class Reader {
    private String name;
    private String surname;
    private int age;
    private MyDate myDate;

    public Reader() {
    }

    public Reader(String name, String surname, int age, MyDate myDate) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.myDate = myDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyDate getMyDate() {
        return myDate;
    }

    public void setMyDate(MyDate myDate) {
        this.myDate = myDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reader)) return false;

        Reader reader = (Reader) o;

        if (age != reader.age) return false;
        if (!name.equals(reader.name)) return false;
        if (!surname.equals(reader.surname)) return false;
        return myDate.equals(reader.myDate);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + age;
        result = 31 * result + myDate.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", myDate=" + myDate +
                '}';
    }
}
