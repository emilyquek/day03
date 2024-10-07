package day03.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class WordCountMain {
    
    public static void main(String[] args) throws FileNotFoundException,IOException {

        String inputFile = args[0];


        // open inputFile for reading
        Reader reader = new FileReader(inputFile);
        BufferedReader bufferedReader = new BufferedReader(reader);

        

        // create a set of string
        // <> - generics
       // Set<String> uniqueWords = new HashSet<>();

        // create a map
        Map<String, Integer> uniqueWords = new HashMap<>();


        String line = "q";

        while (null != line) {
            // read a line
            line = bufferedReader.readLine();

            // if line is null, we have reached the end of file
            if (null == line)
                break;

        //     // remove punctuation from each line and converted to lower case
            String transformed = line.replaceAll("\\p{Punct}", "").toLowerCase().trim();

            // split up line into an array of words
            for (String word: transformed.split(" ")) {

                int currentCount = 0;
                if (uniqueWords.containsKey(word))
                    currentCount = uniqueWords.get(word);

                currentCount++;

                uniqueWords.put(word, currentCount);

                // if (uniqueWords.containsKey(word)) {
                //     // retrieve the word
                //     int currentCount = uniqueWords.get(word);
                //     // add 1 to the count
                //     currentCount++;
                //     // put word away
                //     uniqueWords.put(word, currentCount);
                // } else {
                //     // word not in list
                //     uniqueWords.put(word,1);
                // }
            }
        
        }

        // close the files
        reader.close();

        System.out.println();
        // print keys set in alphabetical order
        for (String word: uniqueWords.keySet())
            System.out.printf("%s = %d\n", word, uniqueWords.get(word));
    }
}
