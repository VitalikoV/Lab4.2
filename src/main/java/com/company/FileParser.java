package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileParser {
    public String readCSVFile(String fileName) {
        String data = "";
        Path pathToFile = Paths.get(fileName);
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {
            data = br.readLine();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return data;
    }

    public void generateCSVFile(String data, String fileName) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName + ".txt"), "UTF-8"));
        bw.write(data);
        bw.flush();
        bw.close();
    }
}
