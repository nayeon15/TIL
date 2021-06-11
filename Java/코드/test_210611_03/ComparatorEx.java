package test_210611_03;

import sun.text.normalizer.CharTrie;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorEx {
    public static void main(String[] args) {
        TreeSet <Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator());
        treeSet.add(new Fruit("포도", 3000));
        treeSet.add(new Fruit("수박", 2000));
        treeSet.add(new Fruit("딸기", 1000));

        Iterator<Fruit>iterator=treeSet.iterator();
        while (iterator.hasNext()){
            Fruit fruit = iterator.next();
            System.out.println(fruit.name+":"+fruit.price);
        }
    }
}
