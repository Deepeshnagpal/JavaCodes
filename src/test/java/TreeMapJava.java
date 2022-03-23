import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapJava {
    public static void main(String[] args) {

        HashMap<String, Integer> hMap = new HashMap<>();
        hMap.put("JAN", 1);
        hMap.put("FEB", 2);
        hMap.put("MAR", 3);
        hMap.put("APR", 4);
        hMap.put("MAY", 5);
        hMap.put("JUN", 6);

        String testData = "MAR";

        Integer currMonth = hMap.get(testData);
        System.out.println(currMonth);

        String nextMonth = getMonthByValue(hMap,5);
        System.out.println(nextMonth);
    }

    public static String getMonthByValue(HashMap<String, Integer> hmMap , Integer nextMonth){
        for(Map.Entry<String, Integer> mapEntry : hmMap.entrySet()){
            if(mapEntry.getValue().equals(nextMonth)){
                return mapEntry.getKey();
            }
        }

        return null;
    }
}
