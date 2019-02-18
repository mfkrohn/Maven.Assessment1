package com.zipcodewilmington.assessment1.part2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int numberOfOccurences = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if(objectArray[i].equals(objectToCount)){
                numberOfOccurences++;
            }
        }

        return numberOfOccurences;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Integer[] removeValue(Integer[] objectArray, Integer objectToRemove) {
        ArrayList<Integer> arrayBuilder = new ArrayList<>();
        for(Integer currentObject:objectArray) {
            if (currentObject.equals(objectToRemove)) {}
            else{
                arrayBuilder.add(currentObject);
            }
        }
        Object[] newArray = arrayBuilder.toArray();
        Integer[] finalArray = Arrays.copyOf(newArray,newArray.length,Integer[].class);
        return finalArray;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        TreeMap<Object,Integer> bins = new TreeMap<>();
        for (int i = 0; i < objectArray.length; i++) {
            bins.put(objectArray[i],0);
        }
        for (int i = 0; i < objectArray.length; i++) {
            bins.put(objectArray[i],bins.get(objectArray[i])+1);
        }
        Object mostCommon = null;
        Integer highCount = 0;
        for (Map.Entry currentEntry : bins.entrySet()){

            if((Integer)currentEntry.getValue() > highCount){
            mostCommon = currentEntry.getKey();
            highCount = (Integer)currentEntry.getValue();
            }
        }




        return mostCommon;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        TreeMap<Object,Integer> bins = new TreeMap<>();
        for (int i = 0; i < objectArray.length; i++) {
            bins.put(objectArray[i],0);
        }
        for (int i = 0; i < objectArray.length; i++) {
            bins.put(objectArray[i],bins.get(objectArray[i])+1);
        }
        Object leastCommon = null;
        Integer lowCount = 10000;
        for (Map.Entry currentEntry : bins.entrySet()){

            if((Integer)currentEntry.getValue() < lowCount){
                leastCommon = currentEntry.getKey();
                lowCount = (Integer)currentEntry.getValue();
            }
        }
        return leastCommon;
    }


    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Integer[] mergeArrays(Integer[] objectArray, Integer[] objectArrayToAdd) {
        ArrayList<Integer> objectList = new ArrayList<>();
        for(Integer currentNumber : objectArray){
            objectList.add(currentNumber);
        }
        for(Integer currentNumber : objectArrayToAdd){
            objectList.add(currentNumber);
        }
        Object[] fullObjectArr = objectList.toArray();
        Integer[] mergedArray = Arrays.copyOf(fullObjectArr,fullObjectArr.length,Integer[].class);



        return mergedArray;
    }
}
