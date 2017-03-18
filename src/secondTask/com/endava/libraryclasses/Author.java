package secondTask.com.endava.libraryclasses;

/**
 * Created by sbogdanschi on 15/03/2017.
 */
public class Author {
    private String name;
    private String surname;
    private byte age;
    private boolean alive;

    public Author() {
    }

    public Author(String name, String surname, byte age, boolean alive) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.alive = alive;
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

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;

        Author author = (Author) o;

        if (age != author.age) return false;
        if (alive != author.alive) return false;
        if (!name.equals(author.name)) return false;
        return surname.equals(author.surname);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + (int) age;
        result = 31 * result + (alive ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", alive=" + alive +
                '}';
    }
}
