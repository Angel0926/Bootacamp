package HomeWorks.day19.task2;

import HomeWorks.day19.task3.TaxAccounting;

public class FinancialAccount extends TaxAccounting {
    private int countOfEmployers;
    private String departmentName;


    public FinancialAccount(String companyName, int countOfEmployers, String departmentName) {
        super(companyName);
        this.countOfEmployers = countOfEmployers;
        this.departmentName = departmentName;
    }

    @Override
    public void account() {
        System.out.println(" salryOfEployeers");
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
