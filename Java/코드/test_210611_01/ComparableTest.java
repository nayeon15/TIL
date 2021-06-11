package test_210611_01;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableTest {
        public static void main(String[] args) {
            TreeSet<Person> treeSet = new TreeSet<Person>();

            treeSet.add(new Person("홍길동", 45));
            treeSet.add(new Person("감자바", 23));
            treeSet.add(new Person("박지원", 31));

            Iterator<Person> iterator =treeSet.iterator();
            while (iterator.hasNext()){
                Person person = iterator.next();
                System.out.println(person.name+":"+person.age);
            }
        }
    }

