package edu.io.pack4.run;

import edu.io.pack4.service.FileMethodService;

public class FileMethodRun {
    public static void main(String[] args) {
        FileMethodService fms = new FileMethodService();
        // fms.createDirMethod();
        fms.createFileMethod();
    }
}