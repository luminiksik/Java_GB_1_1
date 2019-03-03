package Lesson_1.Additional;


import java.io.*;

public class FindLetter {
    public static int countLettesInFile(String fileName){
        int count = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
            String str = br.readLine();
            while(str != null){
                count += FindLetter.countLette(str);
                str = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    public static int countLette(String str){
        int count = 0;
        char[] chr = str.toCharArray();
        Dictionary dictionary = new Dictionary();
        for (char c: chr) {
            if (dictionary.dictionary.contains(c)){
                count++;
            }
        }
        System.out.println("Find " + count + " lettes in the string");
        return count;
    }
}
