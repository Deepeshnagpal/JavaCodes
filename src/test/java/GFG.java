import sun.reflect.generics.tree.Tree;

import java.util.*;

public class GFG {
    public static void main(String[] args) {
      Map<Integer, String> tset = new HashMap<>();
        tset.put(1, "Apple");
        tset.put(1, "Banana");
        tset.put(2, "Pears");
        // Duplicate removed

       System.out.println(tset);
    }
}
