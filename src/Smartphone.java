interface Smartphone {
    void getDetails();
}
interface Laptop {
    void getDetails();
}
class AppleSmartphone implements Smartphone {
    @Override
    public void getDetails() {
        System.out.println("Apple Smartphone.");
    }
}
class AppleLaptop implements Laptop {
    @Override
    public void getDetails() {
        System.out.println("Apple Laptop.");
    }
}
class SamsungSmartphone implements Smartphone {
    @Override
    public void getDetails() {
        System.out.println("Samsung Smartphone.");
    }
}
class SamsungLaptop implements Laptop {
    @Override
    public void getDetails() {
        System.out.println("Samsung Laptop.");
    }
}
interface DeviceFactory {
    Smartphone createSmartphone();
    Laptop createLaptop();
}
class AppleFactory implements DeviceFactory {
    @Override
    public Smartphone createSmartphone() {
        return new AppleSmartphone();
    }
    @Override
    public Laptop createLaptop() {
        return new AppleLaptop();
    }
}
class SamsungFactory implements DeviceFactory {
    @Override
    public Smartphone createSmartphone() {
        return new SamsungSmartphone();
    }
    @Override
    public Laptop createLaptop() {
        return new SamsungLaptop();
    }
}