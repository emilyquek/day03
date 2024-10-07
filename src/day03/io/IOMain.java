package day03.io;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class IOMain {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        File file = new File(args[0]);
        InputStream fis = new FileInputStream(file);

       DataInputStream ois = new DataInputStream(fis);
       // ObjectInputStream ois = new ObjectInputStream(fis);

       int totalWords = 0;
       
        
        while (true) {
            String line = ois.readLine();
            if (null == line)
                break;
            System.out.printf(">>> line: %s\n", line);
            String[] words = line.split(" ");
            totalWords += words.length;
        }
        System.out.printf("Total words: %d\n", totalWords);

        //create a buffer
       // byte[] buffer = new byte[1024];

        //read the file
        //int bytesRead = 0;
       // int total = 0;
        //while ((bytesRead = is.read(buffer)) >= 0)  { }
        // while (bytesRead >= 0) {
        //     bytesRead = is.read(buffer);

        //     if (bytesRead >= 0)
        //         total += bytesRead;

        //     System.out.printf(">>> bytes read: %d (%d)\n", bytesRead, total);
        // }

        // after reading close the stream
        fis.close();
    }
}
