package HomeWorks.Creational_DP_HMW.SingletonDesignPattern;

public class Main {
    public static void main(String[] args) {

        DatabaseConnectionService v = DatabaseConnectionService.getInstance();
        DatabaseConnectionService p = DatabaseConnectionService.getInstance();
        System.out.println(v.hashCode());
        System.out.println(p.hashCode());
        v.createConnection();
    }
}
