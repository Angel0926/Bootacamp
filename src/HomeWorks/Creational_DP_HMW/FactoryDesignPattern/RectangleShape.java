package HomeWorks.Creational_DP_HMW.FactoryDesignPattern;

import HomeWorks.Creational_DP_HMW.FactoryDesignPattern.models.Notification;
import HomeWorks.Creational_DP_HMW.FactoryDesignPattern.models.RectangleNotification;

public class RectangleShape extends  ShapeNotificationFactory {

    @Override
    public Notification createNotification() {
        return new RectangleNotification();
    }
}
