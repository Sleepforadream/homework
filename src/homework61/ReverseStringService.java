package homework61;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReverseStringService {

    ArrayList<String> getStringsArray(String filePath) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filePath));
        ArrayList<String> stringsArray = new ArrayList<>();
        while (sc.hasNextLine()) {
            stringsArray.add(sc.nextLine());
        }
        return stringsArray;
    }

    ArrayList<String> reverseStringArray(String filePath) throws FileNotFoundException {
        ArrayList<String> stringsArray = getStringsArray(filePath);
        ArrayList<String> reverseArray = new ArrayList<>();
        for (int i = 0; i < stringsArray.size(); i++) {
            reverseArray.add(stringsArray.get(stringsArray.size() - (i + 1)));
        }
        return reverseArray;
    }

    void writeStringsInFile(String filePath) throws IOException {
        String text = "";
        for (String con : reverseStringArray(filePath)) {
            text += con + "\n";
        }
        File output = new File(filePath);
        FileWriter writer = new FileWriter(output);

        writer.write(text);
        writer.flush();
        writer.close();
    }
}