import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetJava {
    public static void main(String[] args) {

        HashSet<ArrayList> hSet = new HashSet<>();

        ArrayList<Integer> list1 = new ArrayList<>();

        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list2.add(1);
        list2.add(2);
        hSet.add(list1);
        hSet.add(list2);

        System.out.println(hSet);
        System.out.println(hSet.size());
    }
}
