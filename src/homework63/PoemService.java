package homework63;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PoemService {

    ArrayList<String> getStringsArray(String filePath) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filePath));
        ArrayList<String> stringsArray = new ArrayList<>();
        while (sc.hasNextLine()) {
            stringsArray.add(sc.nextLine());
        }
        return stringsArray;
    }

    void sortByStringsLength(ArrayList<String> arrayList) {
        int countStringLength = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < arrayList.size(); j++) {
                if (arrayList.get(i).length() > arrayList.get(j).length()) {
                    swap(arrayList, i, j);
                }
            }
        }
    }

    public void swap(ArrayList<String> arrayList, int ind1, int ind2) {
        String tmp = arrayList.get(ind1);
        arrayList.set(ind1, arrayList.get(ind2));
        arrayList.set(ind2, tmp);
    }
}