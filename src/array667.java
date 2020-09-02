/*Given an array of ints, return the number of times that two 6's are next to each other in the array.
Also count instances where the second "6" is actually a 7.


        array667([6, 6, 2]) → 1
        array667([6, 6, 2, 6]) → 1
        array667([6, 7, 2, 6]) → 1
*/
public class array667 {
    int[] nums = {6,6,2};
    int num = 0;

    public static void main(String[] args) {
        array667 array667 = new array667();
        array667.getNum();
    }

    void getNum(){
        int num = 0;
        for (int i = 0; i < nums.length-1; i++){
            if(nums[i] == 6 && (nums[i+1] == 6 || nums[i+1] == 7))
                num++;
        }
        System.out.println(num);
    }
}
/*
никак не могу понять разницу между equals и ==
 */
