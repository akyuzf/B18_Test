package Test;

import java.util.ArrayList;
import java.util.List;

public class A180 {

    public static ArrayList<String> test(){
        ArrayList<String> names = new ArrayList<>();

        names.add(0, "Ali");
        names.add(1, "Veli");
        names.add(2, "Deli");

        return names;

    }


    public static void main(String[] args) {
        List<String> names = test();

        System.out.println(names);
    }

}
