package homework65;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class DifferentStringsService {

    HashSet<String> findDifferentStrings(String path) throws FileNotFoundException {
        File doc = new File(path);
        Scanner sc = new Scanner(doc);
        HashSet<String> unique = new HashSet<>();
        HashSet<String> tmp = new HashSet<>();
        while (sc.hasNext()) {
            String nextString = sc.next().replaceAll("\\W", "");
            if (!unique.add(nextString)) {
                tmp.add(nextString);
            } else {
                unique.add(nextString);
            }
        }
        for (String f : tmp) {
            unique.removeIf(j -> j.equalsIgnoreCase(f));
        }
        return unique;
    }
}
