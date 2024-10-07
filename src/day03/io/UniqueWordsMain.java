package day03.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueWordsMain {
    
    public static void main(String[] args) throws FileNotFoundException,IOException {
        

        String inputFile = args[0];


        // open inputFile for reading
        Reader reader = new FileReader(inputFile);
        BufferedReader bufferedReader = new BufferedReader(reader);

        

        // create a set of string
        // <> - generics
        Set<String> uniqueWords = new HashSet<>();


        String line = "q";

        while (null != line) {
            // read a line
            line = bufferedReader.readLine();

            // if line is null, we have reached the end of file
            if (null == line)
                break;

            // remove punctuation from each line and converted to lower case
            String transformed = line.replaceAll("\\p{Punct}", "").toLowerCase().trim();

            // split up line into an array of words
            for (String word: transformed.split(" "))
                // adding each word to the set uniqueWords
                uniqueWords.add(word);

            
        }

        // open stop words file for reading
        Reader reader2 = new FileReader("listofstopwords.txt");
        BufferedReader bufferedReader2 = new BufferedReader(reader2);

        // create new set with stop words
        Set<String> stopWords = new HashSet<>();

        String line2 = "q";

        while (null != line2) {

            // read a line
            line2 = bufferedReader2.readLine();
            // add word to set
            stopWords.add(line2);

            if (null == line2)
                break;        
        
        //System.out.printf("list of stop words: %s ", stopWords);
        }

        // remove stop words from input file
        uniqueWords.removeAll(stopWords);

        // transform set into an array
        Object[] inOrder = uniqueWords.toArray();
        
        // sort the elements in array alphabetically
        Arrays.sort(inOrder);

        System.out.println("Here are the words in alphabetical order: ");
        for (int i = 0; i < inOrder.length; i++) {
        System.out.printf("%s ", inOrder[i]);
        }


        // close the files
        reader.close();
        bufferedReader2.close();

        System.out.printf("\nUnique words in %s: %d\n", inputFile, uniqueWords.size());

        // set has no order, cannot be indexed, can only be printed like this
        for (String word: uniqueWords)
            System.out.printf("%s ", word);

        System.out.println();
    }
}
