package strategy;

import java.util.ArrayList;
import java.util.List;

public class StalinSort implements SortingStrategy {

    @Override
    public int[] initializeSorting(int[] numbers) {
            List<Integer> sortedList = new ArrayList<>();
            int max = numbers[0];

            for (int number : numbers) {
                if (number >= max) {
                    sortedList.add(number);
                    max = number;
                }
            }

            int[] sortedNumbers = new int[sortedList.size()];
            for (int i = 0; i < sortedList.size(); i++) {
                sortedNumbers[i] = sortedList.get(i);
            }

            return sortedNumbers;
    }
}
