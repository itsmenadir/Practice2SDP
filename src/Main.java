public class Main {
    public static void main(String[] args) {
        // Singleton Pattern Example
        System.out.println("Singleton Pattern:");
        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        DatabaseConnection connection2 = DatabaseConnection.getInstance();
        System.out.println(connection1 == connection2); // true, same instance
        System.out.println();
        // Factory Method Pattern Example
        System.out.println("Factory Method Pattern:");
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification emailNotification = notificationFactory.createNotification("EMAIL");
        Notification smsNotification = notificationFactory.createNotification("SMS");
        emailNotification.notifyUser();
        smsNotification.notifyUser();
        System.out.println();
        // Abstract Factory Pattern Example
        System.out.println("Abstract Factory Pattern:");
        DeviceFactory appleFactory = new AppleFactory();
        Smartphone applePhone = appleFactory.createSmartphone();
        Laptop appleLaptop = appleFactory.createLaptop();
        applePhone.getDetails();
        appleLaptop.getDetails();
        DeviceFactory samsungFactory = new SamsungFactory();
        Smartphone samsungPhone = samsungFactory.createSmartphone();
        Laptop samsungLaptop = samsungFactory.createLaptop();
        samsungPhone.getDetails();
        samsungLaptop.getDetails();
        System.out.println();
        // Builder Pattern Example
        System.out.println("Builder Pattern:");
        House house = new House.HouseBuilder("Concrete", "Wood")
                .withRoof("Shingle")
                .withGarage(true)
                .withPool(false)
                .build();
        System.out.println(house);
        System.out.println();
        // Prototype Pattern Example
        System.out.println("Prototype Pattern:");
        ShapeCache.loadCache();
        Shape clonedShape1 = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape1.getType());
        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());
    }
}