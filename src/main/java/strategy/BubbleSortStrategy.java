package strategy;

public class BubbleSortStrategy implements SortingStrategy {

    @Override
    public int[] initializeSorting(int[] numbers) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < numbers.length - 1; i++) {
            swapped = false;
            for (j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
        return numbers;
    }
}
