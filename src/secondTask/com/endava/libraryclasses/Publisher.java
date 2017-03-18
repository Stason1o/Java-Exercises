package secondTask.com.endava.libraryclasses;

/**
 * Created by sbogdanschi on 15/03/2017.
 */
public class Publisher {
    private String companyName;
    private String location;
    private int foundYear;

    public Publisher() {
    }

    public Publisher(String companyName, String location, int foundYear) {
        this.companyName = companyName;
        this.location = location;
        this.foundYear = foundYear;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getFoundYear() {
        return foundYear;
    }

    public void setFoundYear(int foundYear) {
        this.foundYear = foundYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Publisher)) return false;

        Publisher publisher = (Publisher) o;

        if (foundYear != publisher.foundYear) return false;
        if (!companyName.equals(publisher.companyName)) return false;
        return location.equals(publisher.location);
    }

    @Override
    public int hashCode() {
        int result = companyName.hashCode();
        result = 31 * result + location.hashCode();
        result = 31 * result + foundYear;
        return result;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "companyName='" + companyName + '\'' +
                ", location='" + location + '\'' +
                ", foundYear=" + foundYear +
                '}';
    }
}