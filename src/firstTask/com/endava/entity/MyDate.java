package firstTask.com.endava.entity;

// TODO create new file/class for each class in the file DONE ----------------
// TODO toString, equals, hashCode missing DONE --------------------
public class MyDate{
    // TODO: missing access modificators DONE -----------------
    // TODO: add additional field date type of LocalDateTime
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) { this.day = day; }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) { this.month = month; }

    public int getYear() {
        return year;
    }

    public void setYear(int year) { this.year = year; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyDate)) return false;

        MyDate myDate = (MyDate) o;

        if (day != myDate.day) return false;
        if (month != myDate.month) return false;
        return year == myDate.year;
    }

    @Override
    public int hashCode() {
        int result = day;
        result = 31 * result + month;
        result = 31 * result + year;
        return result;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}