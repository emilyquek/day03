package day03.io;

import java.io.File;
import java.nio.file.Paths;
import java.nio.file.Path;


public class Main {

    public static void main(String[] args) {

        //reference to the file
        Path p = Paths.get("catinthehat.txt");
        System.out.printf("toString: $s\n", p.toString());

        //get the file
        File f = p.toFile();

        //information on the file
        System.out.printf("get absolute path: %s\n", f.getAbsolutePath());
        System.out.printf("get name: %s\n", f.getName());
        System.out.printf("file size: %d\n", f.length());

        //use file
        //File cat = new File("src/day03/io/Main.java");

    }
    
}
