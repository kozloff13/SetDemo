import java.util.HashSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        HashSet<Box> hashSet = new HashSet<>();
        hashSet.add(new Box(5,6));
        hashSet.add(new Box(1,6));
        hashSet.add(new Box(5,3));
        hashSet.add(new Box(3,4));
        hashSet.add(new Box(5,6));
        hashSet.add(new Box(2,5));
        System.out.println(hashSet);

        TreeSet<String> treeSet = new TreeSet<>();

        for (int i = 0; i < 20; i++) {
            treeSet.add(String.valueOf(i));
        }
        System.out.println(treeSet);
    }
}
