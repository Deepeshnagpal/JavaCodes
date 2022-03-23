import java.util.*;

public class SortArrayBasedOnFrequency {
    public static void main(String[] args) {
        String arr[] = {"www.google.com", "www.fb.com", "www.twitter.com", "www.alibaba.com",  "www.google.com", "www.alibaba.com", "www.google.com"};
        List<String> list = Arrays.asList(arr);
        System.out.println(sortValuesBasedOnFrequencyAndIndex(list));

    }
    public static List<String> sortValuesBasedOnFrequencyAndIndex(List<String> list){

        Map<String, Integer> map = new HashMap<>();
        for(int i =0; i< list.size() ; i++){
            map.put(String.valueOf(list.get(i)),map.getOrDefault(list.get(i),0) +1 );
        }
        Collections.sort(list, (a, b) -> {
            int freq1 = map.get(a);
            int freq2 = map.get(b);

            if(freq1!= freq2){
                return  freq2 - freq1;
            }
            return map.get(a) - map.get(b);
        });

        return list;
    }
}
