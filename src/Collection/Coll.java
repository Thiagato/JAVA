package Collection;

import Collection.modelos.Aluno;

import java.util.*;

public class Coll {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        Map<Integer, String> map = new HashMap();
        List<String> list = new ArrayList<>();

//        set.add(5);
//        set.add(4);
//        set.add(3);
//
//        for (Integer value: set) {
//            System.out.println(value);
//        }
//
//        list.add("brito");
//        list.add("jean");
//        list.add("dinarte");
//        list.add("rafael");
//        list.add("julia");
//
//        Collections.sort(list);
//
//        for (String value: list) {
//            System.out.println(value);
//        }

        set.add(new Aluno("MARIA"));
        set.add(new Aluno("ana"));


    }

}
