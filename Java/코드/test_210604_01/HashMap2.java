package test_210604_01;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {
        public static void main(String[] args) {
            Map<Student, Integer> map = new HashMap<Student, Integer>();

            map.put(new Student(1, "이승윤"), 85);
            map.put(new Student(2, "김해교"), 90);
            System.out.println("총 Entry 수 : " + map.size());
        }
}
