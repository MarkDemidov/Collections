import java.util.Collections;
import java.util.List;

public class Present {
    private List<Sweet> sweets;

    public double getWeight() {
        double ves = 0;
        for (Sweet sweet : sweets) {
            ves += sweet.getWeight();
        }
        return ves;
    }

    public List<Sweet> getSweets() {
        return sweets;
    }

    public Present(List<Sweet> sweetList) {
        sweets = sweetList;
    }

    public Sweet findSweetBySugar(double from, double to) {
        for (Sweet sweet : sweets) {
            if (sweet.getSugar() < to && sweet.getSugar() > from)
                return sweet;
        }
        return null;
    }

    public void sortSweets() {
        Collections.sort(sweets);
    }

    @Override
    public String toString() {
        return "Present{" +
                "sweets=" + sweets +
                '}';
    }
}
