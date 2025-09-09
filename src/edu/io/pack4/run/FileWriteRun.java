package edu.io.pack4.run;

import edu.io.pack4.service.FileWriteService;

public class FileWriteRun {
    public static void main(String[] args) {
        FileWriteService fileWriteService = new FileWriteService();
        fileWriteService.고전방식();
    }
}
