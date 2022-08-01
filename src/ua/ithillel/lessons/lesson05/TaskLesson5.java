package ua.ithillel.lessons.lesson05;

public class TaskLesson5 {

    public static void main(String[] args) {
        int[] numbers1 = new int[] {45, 7, 9, 78, 129};
        int[] numbers2 = new int[numbers1.length];
        for (int i = 0; i < numbers2.length; i++){
            for (int j = 0; j <= i; j++){
                numbers2[i] += numbers1[j];
            }
        }
        for (int array: numbers2){
            System.out.print(array + " ");
        }
    }
}
