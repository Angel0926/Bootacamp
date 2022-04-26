package HomeWorks.Creational_DP_HMW.FactoryDesignPattern;

import HomeWorks.Creational_DP_HMW.FactoryDesignPattern.models.Notification;
import HomeWorks.Creational_DP_HMW.FactoryDesignPattern.models.TriangleNotification;

public class TriangleShape extends  ShapeNotificationFactory{
    @Override
    public Notification createNotification() {
        return new TriangleNotification();
    }
}
