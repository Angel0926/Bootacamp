package HomeWorks.day19.task3;

public class ItCompany {
   protected int countOfEmployers;
   protected String companyName;

    public void account() {

    }

    public ItCompany(int countOfEmployers, String companyName) {
        super();
        this.countOfEmployers = countOfEmployers;
        this.companyName = companyName;
    }

    public ItCompany(String companyName) {
        this.companyName = companyName;

    }

    public int getCountOfEmployers() {
        return countOfEmployers;
    }

    public void setCountOfEmployers(int countOfEmployers) {
        this.countOfEmployers = countOfEmployers;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
