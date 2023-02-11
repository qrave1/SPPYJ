package Prak2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human(25, "John", "Doe", LocalDate.of(1998, 1, 1), 80);
        Human h2 = new Human(19, "Rostislav", "Romensky", LocalDate.of(2004, 1, 17), 70);
        Human h3 = new Human(19, "Artem", "Smirnov", LocalDate.of(2003, 12, 26), 60);
        Human h4 = new Human(19, "Ivan", "Ivanov", LocalDate.of(2004, 1, 1), 50);
        List<Human> input = new ArrayList<>();
        input.add(h1);
        input.add(h2);
        input.add(h3);
        input.add(h4);
        Stream<Human> stream = input.stream();
        stream.map(human -> human.weight - 5).forEach(System.out::println);
        System.out.println();

        Stream<Human> stream1 = input.stream();
        LocalDate date = LocalDate.of(1999, 2, 3);
        stream1.filter(human -> human.birthDate.isAfter(date)).forEach(System.out::println);
        System.out.println();

        Stream<Human> stream2 = input.stream();
        String result = stream2.map(human -> human.lastName).collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
