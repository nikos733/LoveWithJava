package HW4.Nomer2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PhoneDirectory {

    private HashMap<String, List<String>> book;

    public PhoneDirectory(){
        this.book = new HashMap<>();
    }

    public void add(String surname, String number){
        if(book.containsKey(surname)){
            List<String> numbers = book.get(surname);
            if(!numbers.contains(number)){
                numbers.add(number);
                System.out.println(String.format("Number %s added for last name %s", number, surname));
            } else {
                System.out.println(String.format("Number %s exists for the family name %s", number, surname));
            }
        } else {
            book.put(surname, new ArrayList<>(Arrays.asList(number)));
            System.out.println(String.format("Number %s added for last name %s", number, surname));
        }
    }

    public List<String> get(String surname){
        if(book.containsKey(surname)){
            return book.get(surname);
        } else {
            System.out.println(String.format("There is no surname entry in the directories %s", surname));
            return new ArrayList<>();
        }
    }
}
