package Session6;

import java.util.ArrayList;

public class StringArrayList {
    public static void main(String[] args) {
        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Artem");
        strArrayList.add("Vladyslav");
        strArrayList.add("Eugen");
        strArrayList.add("Elena");
        strArrayList.add("Gegam");
        strArrayList.add("Nastia");
        strArrayList.add("Vitalii");

        System.out.println(strArrayList);
        strArrayList.remove(0);
        strArrayList.remove("Gegam");
        System.out.println(strArrayList);
    }

}
