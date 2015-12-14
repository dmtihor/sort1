import java.util.Comparator;

class ComparatorByPrice implements Comparator {
    public int compare(Object o1, Object o2) {
        return ((Car) o1).price - ((Car) o2).price;
    }
}