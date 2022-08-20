package homeworkA;

import java.util.*;

public class homeworkA {
    public static void main(String[] args) {
        Integer[] list = new Integer[] {1,3,4,5,6,8,23,72,3,1,1};
        List<Integer> arrayList = new ArrayList<>(List.of(list));
        Collections.sort(arrayList);
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(arrayList);
        System.out.println(hashSet);
    }

}
