package HomeWorks.day19.task3;


public class TaxAccounting extends Accounting {




    public TaxAccounting(String companyName) {
        super(companyName);
    }

    @Override
    public void account() {
        System.out.println("taxOfCompany");
    }


}
