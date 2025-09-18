package com.name.assignment;

import com.name.assignment.employees.*;
import com.name.assignment.utilities.EmployeeUtils;

public class Main {
    public static void main(String[] args) {
        Manager mgr = new Manager();
        mgr.setDetails("Ravi", 40, 90000);
        mgr.scheduleMeeting();
        EmployeeUtils.displayDetails(mgr);
        System.out.println("Bonus: " + EmployeeUtils.calculateBonus(mgr));

        Developer dev = new Developer();
        dev.setDetails("Akhila", 28, 75000);
        dev.writeCode();
        EmployeeUtils.displayDetails(dev);
        System.out.println("Bonus: " + EmployeeUtils.calculateBonus(dev));
    }
}