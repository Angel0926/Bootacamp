package HomeWorks.day19.task2;

import HomeWorks.day19.task3.Accounting;

public class TaxAccounting extends Accounting {
    private int countOfEmployers;
    private String departmentName;

    public TaxAccounting(String companyName, int countOfEmployers, String departmentName) {
        super(companyName);
        this.countOfEmployers = countOfEmployers;
        this.departmentName = departmentName;
    }

    @Override
    public void account() {

        System.out.println("taxOfCompany");
    }

    public int getCountOfEmployers() {
        return countOfEmployers;
    }

    public void setCountOfEmployers(int countOfEmployers) {
        this.countOfEmployers = countOfEmployers;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
