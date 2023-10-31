import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    String number;
    private HashMap<String, HashSet<String>> phonebook;

    public PhoneBook() {
        phonebook = new HashMap<>();
    }

    public void addNumber(String name, String number) {
        if (phonebook.containsKey(name)) {
            HashSet<String> numbers = phonebook.get(name);
            if (!numbers.contains(number)) {
                numbers.add(number);
                phonebook.put(name, numbers);
            }
        } else {
            HashSet<String> numbers = new HashSet<>();
            numbers.add(number);
            phonebook.put(name, numbers);
        }
    }


    public void showNumbersOf(String name) {
        if (phonebook.containsKey(name)) {
            HashSet<String> numbers = phonebook.get(name);
            for (String number : numbers) {
                System.out.println(number);
            }
        }
    }
        public void show () {
            if (!phonebook.isEmpty()) {
                for (String name : phonebook.keySet()) {
                    System.out.printf("%s%n", name);
                    HashSet<String> numbers = phonebook.get(name);
                    for (String number : numbers) {
                        System.out.printf(" %s%n", number);
                    }
                }

        }
    }
}
