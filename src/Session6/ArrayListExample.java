package Session6;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        int [] array = {4, 3, 2, 5, 6};
        ArrayList<Integer> intArrayList= new ArrayList<>();
        intArrayList.add(43);
        intArrayList.add(12);
        intArrayList.add(32);
        intArrayList.add(54);
        System.out.println(intArrayList);
        intArrayList.remove(0);
        System.out.println(intArrayList);
        intArrayList.remove(Integer.valueOf(54));
        System.out.println(intArrayList);
    }
}
