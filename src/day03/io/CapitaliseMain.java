package day03.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CapitaliseMain {
    
    public static void main(String[] args) throws FileNotFoundException,IOException {
        

        String inputFile = args[0];
        String outputFile = args[1];

        // open inputFile for reading
        Reader reader = new FileReader(inputFile);
        BufferedReader bufferedReader = new BufferedReader(reader);

        // open outputFile for writing
        Writer writer = new FileWriter(outputFile);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        String line = "q";

        while (null != line) {
            // read a line
            line = bufferedReader.readLine();

            // if line is null, we have reached the end of file
            if (null == line)
                break;

            String transformed = line.toUpperCase();

            // write to file
            bufferedWriter.write(transformed + "\n");
        }

        // close the files
        reader.close();

        // flush remaining data to file
        bufferedWriter.flush();
        //writer.flush();
        writer.close();
    }
}
