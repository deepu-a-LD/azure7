package com.spring.azure.demo;

import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

@Service
public class azureService {
//    Float.MAX_VALUE
    public void check(int num) throws IOException {
        File file = new File("countfile.txt");
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);

        for(int i=num; i<=1000000000;i++){
            System.out.println("working  " + i);
            pw.println(i);
        }
        pw.close();
    }
}
