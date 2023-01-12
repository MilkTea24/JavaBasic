package ch15.sec05.exam04;

import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args){
        TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new FruitComparator());

        treeSet.add(new Fruit("포도", 5000));
        treeSet.add(new Fruit("딸기", 4000));
        treeSet.add(new Fruit("수박", 7000));

        for (Fruit fruit : treeSet) {
            System.out.println(fruit.name);
        }
    }
}
