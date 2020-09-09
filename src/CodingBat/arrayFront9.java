package CodingBat;/*Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.


        CodingBat.arrayFront9([1, 2, 9, 3, 4]) → true
        CodingBat.arrayFront9([1, 2, 3, 4, 9]) → false
        CodingBat.arrayFront9([1, 2, 3, 4, 5]) → false*/

public class arrayFront9 {
    int[] nums = {9};
    boolean result = false;
    void getResult(){
        for (int i = 0; i < nums.length; i++) {
            if(i < 4) {
                if (nums[i] == 9) {
                    result = true;
                }
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        arrayFront9 arrayFront9 = new arrayFront9();
        arrayFront9.getResult();
    }
}
/*
Solvation from CodingBat:
public boolean CodingBat.arrayFront9(int[] nums) {
        // First figure the end for the loop
        int end = nums.length;
        if (end > 4) end = 4;

        for (int i=0; i<end; i++) {
        if (nums[i] == 9) return true;
        }

        return false;
        }*/
