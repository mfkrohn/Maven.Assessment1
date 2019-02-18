package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        ArrayList<Integer> noEvens = new ArrayList<>();
        for (Integer currentNumber : ints) {
            if (currentNumber % 2 == 1) {
                noEvens.add(currentNumber);
            }
        }
        Object[] noEvensArr = noEvens.toArray();

        return Arrays.copyOf(noEvensArr, noEvensArr.length, Integer[].class);
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        ArrayList<Integer> noOdds = new ArrayList<>();
        for (Integer currentNumber : ints) {
            if (currentNumber % 2 == 0) {
                noOdds.add(currentNumber);
            }
        }
        Object[] noOddsArr = noOdds.toArray();

        return Arrays.copyOf(noOddsArr, noOddsArr.length, Integer[].class);
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        ArrayList<Integer> noThrees = new ArrayList<>();
        for (Integer currentNumber : ints) {
            if (currentNumber % 3 != 0) {
                noThrees.add(currentNumber);
            }
        }
        Object[] noThreesArr = noThrees.toArray();

        return Arrays.copyOf(noThreesArr, noThreesArr.length, Integer[].class);
    }

    /**
     * @param ints     array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        ArrayList<Integer> noN = new ArrayList<>();
        for (Integer currentNumber : ints) {
            if (currentNumber % multiple != 0) {
                noN.add(currentNumber);
            }
        }
        Object[] noNArr = noN.toArray();

        return Arrays.copyOf(noNArr, noNArr.length, Integer[].class);
    }
}

