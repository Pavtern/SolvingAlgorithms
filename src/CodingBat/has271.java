package CodingBat;/*
Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value,
followed by the value plus 5, followed by the value minus 1. Additionally
the 271 counts even if the "1" differs by 2 or less from the correct value.
 */

public class has271 {
    int[] nums = {2, 7, -2};
    int n = 0;

    public static void main(String[] args) {
        has271 has = new has271();
        has.getNum();
    }

    void getNum(){
        for(int i = 0; i < nums.length - 2; i++){
            int n1 = nums[i];
            int n2 = nums[i+1] - 5;
            int n3 = nums[i+2];
            if(n1 == n2 && n3 <= (n1+1) && n3 >= (n1 - 3)){
                n++;
            }
        }
        System.out.println(n);
    }
}

/*
Решение с сайта:
public boolean CodingBat.has271(int[] nums) {
  // Iterate < length-2, so can use i+1 and i+2 in the loop.
  // Return true immediately when seeing 271.
  for (int i=0; i < (nums.length-2); i++) {
    int val = nums[i];
    if (nums[i+1] == (val+5) &&              // the "7" check
      Math.abs(nums[i+2] - (val-1)) <= 2) {  // the "1" check
        return true;
    }
  }

  // If we get here ... none found.
  return false;
}

Долго тупил с этой задачей, пытался справиться без записей на бумагу - не получилось))
 */
