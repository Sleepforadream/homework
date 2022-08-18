package homework63;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Poem {
    public static void main(String[] args) throws FileNotFoundException {
        PoemService poemService = new PoemService();
        ArrayList<String> poemArray = poemService.getStringsArray("c:\\Users\\79191\\Desktop\\Poem.txt");
        poemService.sortByStringsLength(poemArray);
        System.out.println(poemArray);
    }
}