package strategy;

import java.util.List;

public class GnomeSortStrategy implements SortingStrategy {
    @Override
    public int[] initializeSorting(int[] numbers) {
        int index = 0;

        while (index < numbers.length) {
            if (index == 0)
                index++;
            if (numbers[index] >= numbers[index - 1])
                index++;
            else {
                int temp = 0;
                temp = numbers[index];
                numbers[index] = numbers[index - 1];
                numbers[index - 1] = temp;
                index--;
            }
        }
        return numbers;
    }
}
