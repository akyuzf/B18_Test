package Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class Example2 {

    public static void main(String[] args) {

        String input="java is java best language is java or java or mava";
        List<String> list= Arrays.asList(input.split(" "));
        System.out.println("list = " + list);

        Map<String,Long> frequent=list.stream().filter(each-> Collections.frequency(list, each) > 1)
                .collect(Collectors.groupingBy(Function.identity(), counting()));

        System.out.println(frequent);

    }

}
