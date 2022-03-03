package HomeWorks.day19.task3;

public class SEO extends Marketing {

    public SEO(int countOfEmployers, String companyName) {
        super(countOfEmployers, companyName);
    }

    @Override
    public void marketing() {
        System.out.println("SEO");
    }

}
