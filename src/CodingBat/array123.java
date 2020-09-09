package CodingBat;

/*
Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.


        CodingBat.array123([1, 1, 2, 3, 1]) → true
        CodingBat.array123([1, 1, 2, 4, 1]) → false
        CodingBat.array123([1, 1, 2, 1, 2, 3]) → true
*/
public class array123 {
    int[] nums = {1, 1, 2, 3, 1};
    int a = 0;
    int b = 0;
    int c = 0;

    public static void main(String[] args) {
        array123 array123 = new array123();
        array123.result();
    }

    void result() {
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 1){
                a++;
            }
            if (nums[i] == 2){
                b++;
            }
            if (nums[i] == 3){
                c++;
            }
        }
        System.out.println(a > 0 && b > 0 && c > 0);
    }
}
/*
Решение с сайта:
public boolean CodingBat.array123(int[] nums) {
  // Note: iterate < length-2, so can use i+1 and i+2 in the loop
  for (int i=0; i < (nums.length-2); i++) {
    if (nums[i]==1 && nums[i+1]==2 && nums[i+2]==3) return true;
  }
  return false;
}
1
Я неправильно понял задание, подумал, что если эти числа вообще есть в массиве, а не находятся в определенной
последовательности.
 */
