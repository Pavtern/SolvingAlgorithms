package CodingBat;/*Given an array of ints, return the number of 9's in the array.


        CodingBat.arrayCount9([1, 2, 9]) → 1
        CodingBat.arrayCount9([1, 9, 9]) → 2
        CodingBat.arrayCount9([1, 9, 9, 3, 9]) → 3*/



public class arrayCount9 {
    int[] nums = {};
    int result = 0;

    public static void main(String[] args) {
        arrayCount9 arrayCount9 = new arrayCount9();
        arrayCount9.setResult();
        //CodingBat.arrayCount9.getResult();
    }

    void setResult(){
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 9){
                result++;
            }

        }
        System.out.println(result);
    }

}
