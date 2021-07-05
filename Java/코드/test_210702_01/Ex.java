package test_210702_01;

import java.util.function.ToIntBiFunction;

public class Ex {
    public static void main(String[] args) {
        ToIntBiFunction<String, String> function;

        function = (a, b)->a.compareToIgnoreCase(b);
        System.out.println(function.applyAsInt("java8", "java8"));

        function = String ::compareToIgnoreCase;
        System.out.println(function.applyAsInt("java8", "java8"));
    }
}
