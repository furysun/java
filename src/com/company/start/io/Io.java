package com.company.start.io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Io {
    //writer
    public static void main(String[] args) {
        Path path = Paths.get("/Users/yana/Desktop/filename.txt");

        System.out.format("toString: %s%n", path.toString());
        System.out.format("getFileName: %s%n", path.getFileName());
        System.out.format("getName(0): %s%n", path.getName(0));
        System.out.format("getNameCount: %d%n", path.getNameCount());
        System.out.format("subpath(0,2): %s%n", path.subpath(0,2));
        System.out.format("getParent: %s%n", path.getParent());
        System.out.format("getRoot: %s%n", path.getRoot());

        try (PrintWriter out = new PrintWriter("/Users/yana/Desktop/filename.txt")) {
            out.println("mrr");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
