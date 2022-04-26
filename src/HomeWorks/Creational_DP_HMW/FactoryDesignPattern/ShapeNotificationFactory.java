package HomeWorks.Creational_DP_HMW.FactoryDesignPattern;

import HomeWorks.Creational_DP_HMW.FactoryDesignPattern.models.Notification;

public abstract class ShapeNotificationFactory {
    public void GetDrawNotification(){
        Notification notification=createNotification();
        notification.GetShape();
    }
    public abstract Notification createNotification();

}

