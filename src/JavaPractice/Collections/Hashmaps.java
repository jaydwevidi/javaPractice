package JavaPractice.Collections;

import java.util.*;

public class Hashmaps {
    public static void main(String[] args) {

        Map<String , Double >  animals = new HashMap<>();

        animals.put("Dog" , 4.0);
        animals.put("Peacock" , 2.0);
        animals.put("octopus" , 8.0);



        System.out.println(animals.containsKey("Dog"));

        System.out.println(animals.containsValue("Random Batman")); // should be double

        System.out.println(animals.containsValue(4.0));

        System.out.println(animals.get("Dog"));
        System.out.println(animals.get("Fish"));

        Set<String> animalNamesSet = animals.keySet();
        var animalValues = animals.values().stream().toArray();

        System.out.println(animalNamesSet);
        System.out.println("values =  "+ animalValues[0] + " , " + animalValues[1]);
        //System.out.println(animalValues);
        System.out.println(animals);






    }
}
