package ua.ithillel.lessons.lesson06;

import java.util.Arrays;

public class TaskLesson6 {

    public static void main(String[] args) {
        int[] array = {4, 9, 7, 2, 1, 6};

        if (array.length%2 == 0){
            int newArrayLength = 0;
            for (int i=0; i<array.length-1; i+=2){
                newArrayLength += array[i];
            }
            int[] newArray = new int[newArrayLength];

            int indexOfArray = 0;
            for(int i=0; i<newArray.length; i++){
                newArray[i] = array[indexOfArray+1];
                array[indexOfArray]--;
                if (array[indexOfArray] == 0){
                    indexOfArray += 2;
                }
            }
            System.out.println(Arrays.toString(newArray));
        }
    }
}
