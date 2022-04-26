package HomeWorks.Creational_DP_HMW.FactoryDesignPattern;

import HomeWorks.Creational_DP_HMW.FactoryDesignPattern.models.CircleNotification;
import HomeWorks.Creational_DP_HMW.FactoryDesignPattern.models.Notification;

public class CircleShape extends  ShapeNotificationFactory{
    @Override
    public Notification createNotification() {
        return new CircleNotification();
    }
}
