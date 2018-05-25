package Work3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> one = new ArrayList<>();
        one.add(2);
        one.add(3);
        one.add(5);
        one.add(4);
        ArrayList<Integer> two = new ArrayList<>();
        two.add(1);
        two.add(2);
        two.add(3);
        two.add(4);
        Dynamic dynamic = new Dynamic();
        long start1 = System.nanoTime();
        ArrayList<Integer> result = dynamic.BiggstSubSequence(one, two);
        long finish1 = System.nanoTime();
        System.out.println(finish1-start1);
        System.out.println(Arrays.toString(result.toArray()));




        FullSearch fullSearch = new FullSearch();
        long start2 = System.nanoTime();
        long sf = System.currentTimeMillis();
        result = fullSearch.BiggestSubSequence(one, two);
        long finish2 = System.nanoTime();
        long fi = System.currentTimeMillis();
        System.out.println(finish2-start2);
        System.out.println(start2);
        System.out.println(finish2);
        System.out.println(sf-fi);
        System.out.println(sf);
        System.out.println(fi);
        System.out.println(Arrays.toString(result.toArray()));
    }
}
