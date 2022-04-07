package HomeWorks.day27.task1;

import java.io.*;
import java.util.Scanner;

public class Day27 {

    /**
     * Write a method to count the number of “hello” for each line in the text file.
     * Example:
     * The line
     * “Hello world, hello darkness my old friend”
     * Will output
     * Line 1 - 2
     * So, have a text file as an input for counting hellos and another file for outputting the line
     * number with corresponding count of “hello”.
     *
     * @param args
     */

    public static void main(String[] args) {

        String len = "world  my hello , \n hello darkness hello my old friend,hello my dearworld  my hello ," +
                "\n hello darkness hello my old friend,hello my dear" +
                "world  my hello , hello darkness hello my old friend,hello my dear\n" +
                "world  my hello , hello darkness hello my old friend,hello my dear" +
                "\n dsjlkdshgkhdfigdfjs"+
                "\nworld  my hello , hello darkness hello my old friend,hello my dear" +
                "world  my hello , hello darkness hello my old friend,hello my dearworld  my hello , " +
                "hello darkness hello my old friend,hello my dear\n" +
                "world  my hello , hello darkness hello my old friend,hello my dearworld  my hello " +
                "\n hello darkness hello my old friend,hello my dear";

        File fileText = new File("src/HomeWorks/day27/task1/InputText.txt");
        File fileResult = new File("src/HomeWorks/day27/task1/OutputLinesCount.txt");


        try (BufferedWriter out = new BufferedWriter(new FileWriter(fileText))) {
            if (!fileText.exists()) {
                fileText.createNewFile();
            } else {
                out.write(len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (BufferedReader in = new BufferedReader(new FileReader(fileText));
                BufferedWriter out=new BufferedWriter(new FileWriter(fileResult))) {
            String keyword = "hello";
            String line = "";
            int lineInt = 0;
            while ((line = in.readLine()) != null) {

                lineInt++;
                int count = 0;
                String[] s = line.split(" ");
                for (String word : s) {
                    if (word.equals(keyword)) {
                        count++;
                    }
                }
                String message= "in line " + lineInt + " hello exists "+ count + " times";
                out.write(message +"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

        /*

        try(PrintWriter pw = new PrintWriter(file1));
            pw.println(len);
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        String line = null;
        int count = 0;
        String word = null;
        try {
            Scanner scanner1 = new Scanner(new File("C:\\Users\\User\\IdeaProjects\\" +
                    "Bootacamp\\src\\HomeWorks\\day27\\InputText"));
            word = "my";
          
            while (scanner1.hasNext()) {
                line = scanner1.next();
                //   System.out.println(line);
                if (line.contains(word)) {
                    count = count + 1;
                }
            }
            System.out.println(count);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        

        File file2 = new File("C:\\Users\\User\\IdeaProjects\\Bootacamp\\src\\HomeWorks\\day27\\OutputLinesCount");
        try {
            PrintWriter pw1 = new PrintWriter(file2);

            pw1.println("the word " +word+ " repeated in ->  "+ count+ " time" );
            pw1.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
} */
