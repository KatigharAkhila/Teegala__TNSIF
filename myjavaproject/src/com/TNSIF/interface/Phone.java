// Define the Phone interface
interface Phone {
    void makeCall(String number);
    void sendSMS(String number, String message);
}

// JioPhone class implementing Phone interface
class JioPhone implements Phone {
    @Override
    public void makeCall(String number) {
        System.out.println("JioPhone calling " + number + "...");
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("JioPhone sending SMS to " + number + ": " + message);
    }
}

// SamsungPhone class implementing Phone interface
class SamsungPhone implements Phone {
    @Override
    public void makeCall(String number) {
        System.out.println("SamsungPhone calling " + number + "...");
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("SamsungPhone sending SMS to " + number + ": " + message);
    }
}

// Main class to test the phones
public class PhoneTest {
    public static void main(String[] args) {
        Phone jio = new JioPhone();
        Phone samsung = new SamsungPhone();

        jio.makeCall("9876543210");
        jio.sendSMS("9876543210", "Hello from Jio!");

        samsung.makeCall("9123456780");
        samsung.sendSMS("9123456780", "Hello from Samsung!");
    }
}