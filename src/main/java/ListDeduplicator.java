import java.util.ArrayList;
import java.util.List;

/**
 * An utility class that removes duplicate numbers
 * from a list.
 */
public class ListDeduplicator implements GenericListDeduplicator{
    private final GenericListSorter sorter;
    public ListDeduplicator(GenericListSorter sorter) {
        this.sorter = sorter;
    }

    /**
     * Removes duplicate numbers from a list.
     * @return A list having the same numbers as the original
     * but withou duplicates. The order of the numbers might
     * change.
     */


    public List<Integer> deduplicate(List<Integer> list) {
        List<Integer> sorted = sorter.sort(list);
        List<Integer> unique = new ArrayList<>();
        Integer last = null;
        for (Integer number : sorted)
            if (!number.equals(last)) {
                last = number;
                unique.add(number);
            }
        return unique;
    }
}