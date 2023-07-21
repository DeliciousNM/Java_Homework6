package homework6;

import java.util.HashSet;

public class program {
    public static void main(String[] args) {
        task1();
    }
    public static void task1() {
        HashSet<kitten> catSet = new HashSet<>();
        kitten cat1 = new kitten("Барсик", 3);
        kitten cat2 = new kitten("Мия", 1);
        kitten cat3 = new kitten("Муська", 5);
        kitten cat4 = new kitten("Муська", 5);
        kitten cat5 = new kitten("Пушок", 2);
        kitten cat6 = new kitten("Барсик", 3);
        kitten cat7 = new kitten("Барсик", 3);

        catSet.add(cat1);
        catSet.add(cat2);
        catSet.add(cat3);
        catSet.add(cat4);
        catSet.add(cat5);
        catSet.add(cat6);
        catSet.add(cat7);

        System.out.println(catSet);
    }
}
