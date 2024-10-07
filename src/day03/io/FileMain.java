package day03.io;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileMain {
    
    public static void main(String[] args) {
        
        System.out.printf("args.length = %d\n", args.length);

       // for (int i =0; i < args.length; i++)
            //System.out.printf("%d. %s\n", i, args[i]);

       // for (String value: args) 
            //System.out.printf(">>> %s\n", value);

    if (args.length <= 0) {
        System.err.println("Please provide a file name");
        System.exit(1);
    }

    //loop through files and print info
    for (String a: args) {
        System.out.printf(">>>>> Processing %s\n", a);

        Path p = Paths.get(a);
        File file = p.toFile();

        System.out.printf("path: %s\n", file.getAbsolutePath());
        System.out.printf("is file: %s\n", file.isFile());
        System.out.printf("exists: %s\n", file.exists());
        System.out.printf("write: %s\n", file.canWrite());

    }
        
    
    }
}
