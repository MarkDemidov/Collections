import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Sweet candy1 = new Candy("Masha", 100d, 55d, 5d);
        Sweet candy2 = new Candy("Alenka", 200d, 7d, 7d);
        Sweet candy3 = new Candy("Mishka", 250d, 11d, 9d);

        List<Sweet> sweetList = new ArrayList<>();
        sweetList.add(candy1);
        sweetList.add(candy2);
        sweetList.add(candy3);
        Present happyNewYear = new Present(sweetList);
        System.out.println(happyNewYear.getWeight());
        System.out.println(happyNewYear.findSweetBySugar(8, 10).toString());
        System.out.println(candy1.compareTo(candy2));
        System.out.println(happyNewYear);
        happyNewYear.sortSweets();
        System.out.println(happyNewYear);
    }
}