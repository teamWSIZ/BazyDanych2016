package Offline;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Wykorzystanie streamów w Java 8
 */

@Component
public class A {
    public static void main(String[] args) {
        List<Integer> w = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        //Test streamów w Javie
        double x = w.stream()
            .filter(i->(i%3==0))
            .map(i->2*i)
            .mapToDouble(i->i)
            .max().getAsDouble();
        System.out.println(x);
    }
}
