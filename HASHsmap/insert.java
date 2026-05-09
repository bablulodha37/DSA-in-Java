import java.util.*;

public class insert {
    public static void main(String[] args) {
        
        HashMap<String,Integer> country=new HashMap<>();

        country.put("india",120);// insert
        country.put("dubai",10);
        country.put("us",12);
        country.put("russia",20);
        
        System.out.println(country);

        //search
        if (country.containsKey("bablu")) {
            System.out.println("country is present ");
        } else {
            System.out.println("key is not present ");
        }

        System.out.println(country.get("india"));// return vaule
        System.out.println(country.get("don"));// return null

        // int arr[]={1,2,3,7,4,8,9};

        // for(int val:arr){
        //     System.out.println(val);
        // }

        for(Map.Entry<String,Integer>e :country.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // remove vaule 
        country.remove("india");

        // dusra tarika print karane ke liye
        Set<String> kays=country.keySet();
        for(String key:kays){
            System.out.println(key+" "+country.get(key));
        }
    }
}
