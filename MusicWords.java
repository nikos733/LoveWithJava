package HW4.Nomer1;

import java.util.*;

public class MusicWords {
    public static void main(String[] args){
        List<String> words = Arrays.asList(
                "Rock", "Pop", "Jazz", "Country", "Electro",
                "Metal", "Classic", "Dubstep", "Rock", "Dubstep",
                "Jazz", "Jazz", "Country", "Rock", "Rock",
                "Metal", "Country", "Classic", "Metal", "Dubstep"
        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Original Array:");
        System.out.println(words.toString());
        System.out.println("Unique Words:");
        System.out.println(unique.toString());
        System.out.println("Word Occurrence:");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}
