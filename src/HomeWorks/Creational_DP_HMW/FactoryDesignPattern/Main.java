package HomeWorks.Creational_DP_HMW.FactoryDesignPattern;

public class Main {
    public static void main(String[] args) {
        ShapeNotificationFactory snf=new CircleShape();
        snf.GetDrawNotification();
    }
}
