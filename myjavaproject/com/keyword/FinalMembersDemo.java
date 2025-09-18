// Final class: cannot be extended

final class FinalMembersDemo {

    // Final variable: constant value
    public final int MAX_EMPLOYEES = 100;

    // Final method: cannot be overridden
    public final void showLimit() {
        System.out.println("Maximum employees allowed: " + MAX_EMPLOYEES);
    }
}

public class Main {
    public static void main(String[] args) {
        FinalMembersDemo obj = new FinalMembersDemo();
        obj.showLimit();

        
        // obj.MAX_EMPLOYEES = 200; // ❌ Cannot assign a value to final variable
    }
}