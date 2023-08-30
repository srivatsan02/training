import java.util.HashMap;

public class MapDemo {

    

    public static void main(String[] args) {

        
        HashMap<String,String> map=new HashMap<>();

        
        map.put("Scott", "Tiger");
        map.put("Jack", "Jill");
        map.put("Polo", "Lili");
        map.put("Jack", "Rose");

        
        System.out.println("Scott: "+map.get("Scott"));
        System.out.println("Polo: "+map.get("Polo"));
        System.out.println("Jack: "+map.get("Jack"));
        //Print all the keys and values without manually feeding key
        
    }
}