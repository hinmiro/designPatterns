package strategy;

import java.util.Random;

public class Main {
    static Random random = new Random();

    public static void main(String[] args) {
        SortingContext sortingHandler = new SortingContext(new GnomeSortStrategy());

        int[] numbers = new int[100];
        int[] moreNumbers = new int[100000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(0, 500);
        }

        for (int i = 0; i < moreNumbers.length; i++) {
            moreNumbers[i] = random.nextInt(0, 30000);
        }

        long startTime = System.nanoTime();
        int[] sortedNumbers = sortingHandler.initializeSorting(numbers);
        long endTime = System.nanoTime();

        System.out.println("Time it took to sort " + numbers.length + " numbers with gnomesort: " + ((endTime - startTime) / 1_000_000.0) + " milliseconds.");

        startTime = System.nanoTime();
        int[] moreSortedNumbers = sortingHandler.initializeSorting(moreNumbers);
        endTime = System.nanoTime();

        System.out.println("Time it took to sort " + moreNumbers.length + " numbers with gnomesort: " + ((endTime - startTime) / 1_000_000_000.0) + " seconds.");

        sortingHandler.setStrategy(new BubbleSortStrategy());

        startTime = System.nanoTime();
        int[] bubbleSortedNumbers = sortingHandler.initializeSorting(moreNumbers);
        endTime = System.nanoTime();

        System.out.println("Time it took to sort " + bubbleSortedNumbers.length + " numbers with bubblesort: " + ((endTime - startTime) / 1_000_000_000.0) + " seconds.");

        sortingHandler.setStrategy(new QuickSortStrategy());

        startTime = System.nanoTime();
        int[] quickSortedNumbers = sortingHandler.initializeSorting(moreNumbers);
        endTime = System.nanoTime();

        System.out.println("Time it took to sort " + quickSortedNumbers.length + " numbers with quicksort: " + ((endTime - startTime) / 1_000_000.0) + " milliseconds.");

        sortingHandler.setStrategy(new StalinSort());

        startTime = System.nanoTime();
        int[] stalinsNumbers = sortingHandler.initializeSorting(moreNumbers);
        endTime = System.nanoTime();

        System.out.println("Time it took to sort " + stalinsNumbers.length + " numbers with stalinsort: " + ((endTime - startTime) / 1_000_000.0) + " milliseconds.");


    }
}
