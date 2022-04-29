import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamComparator {

    public static void main(String[] args) {

        // Create a list of Integers
        List<Integer> numbers = new ArrayList<>(){{
            add(1);
            add(2);
            add(5);
            add(3);
            add(-48);
            add(95);
            add(-33);
            add(26);
        }};

        // Collection size
        //System.out.println((long) numbers.size());

        /**
         * Natural sort is ascending order (1, 2, 3, ...)
         */
        /*numbers.stream()
                .peek(number -> System.out.println("Natural sort: " + number))// Peek is used to print the stream and debug
                .limit(5);// Limit is used to print only the first 5 elements*/

        /**
         * Reverse sort is descending order (95, 48, 33, 26, 5)
         */
        /*numbers.stream().sorted(Comparator.reverseOrder())
                        .forEach(number -> System.out.println("Reverse sort: " + number));*/


        /**
         * Sort by number nearest to 0
         */
        numbers.stream()
                        .filter(number -> number > 0)
                        .min(Comparator.naturalOrder())
                        .ifPresent(number -> System.out.println("min number: " + number));

    }
}
