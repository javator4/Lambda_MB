package pl.sda.lambda;


import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class App {



    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kasia", "Ania", "Zosia", "Bartek");

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        Collections.sort(names, (String s1, String s2) -> s1.compareTo(s2));

        System.out.println(names);


        Collections.sort(SampleData.membersOfTheBeatles, new Comparator<Artist>() {
            @Override
            public int compare(Artist o1, Artist o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        Square square = (int x) -> x * x;
        System.out.println(square.square(2));

        String[] a = {"cat","dog","mouse","rat","pig","rabbit","hamster","parrot"};
        List animals = Arrays.asList(a);

        for(String animal : animals) {
            System.out.print(animal +"; ");
        }

        animals.forEach((x) -> System.out.print(x +"; "));
        animals.forEach(System.out::println);

        List<String> fruits =
                Arrays.asList("apple", "banana", "cherry", "plum", "pear", "pinaple");
        List<String> result = fruits.stream()
                .filter((x) -> x.startsWith("a"))
                .map((x) -> x.toUpperCase())
                .collect(Collectors.toList());


    }

}
