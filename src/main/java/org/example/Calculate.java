package org.example;

public class Calculate {
    public int GetAverage(int[] list) {
        int average = 0;
        for (int i = 0; i < list.length; i++) {
            average += list[i];
        }
        if (list.length > 0) {
            average /= list.length;
            return average;
        }
        return 0;
    }
    public void CompareAverage(int[] list1, int[] list2) {
        int average1 = GetAverage(list1);
        int average2 = GetAverage(list2);

        if (average1 > average2) {
            System.out.println("Первый список имеет большее среднее значение");
        }
        else if(average2 > average1) {
            System.out.println("Второй список имеет большее среднее значение");
        }
        else {
            System.out.println("Средние значения равны");
        }


    }
}
