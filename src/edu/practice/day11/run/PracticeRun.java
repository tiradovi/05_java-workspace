package edu.practice.day11.run;

import edu.practice.day11.BankAccountManager;
import edu.practice.day11.SafeFileManager;
import edu.practice.day11.StoreInventoryManager;

public class PracticeRun {
    public static void main(String[] args) {
        SafeFileManager manager1 = new SafeFileManager();
        BankAccountManager manager2 = new BankAccountManager();
        StoreInventoryManager manager3 = new StoreInventoryManager();
        //  manager1.method1();
        manager2.method2();
        // manager3.method3();
    }
}
