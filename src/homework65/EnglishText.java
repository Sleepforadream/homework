package homework65;

import java.io.FileNotFoundException;

public class EnglishText {
    public static void main(String[] args) throws FileNotFoundException {
        DifferentStringsService differentStringsService = new DifferentStringsService();
        System.out.println(differentStringsService.findDifferentStrings("C:\\Users\\maxne\\Desktop\\Text.txt"));
    }
}
