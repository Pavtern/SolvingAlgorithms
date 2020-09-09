package CodingBat;

public class noTriples {
    int[] nums = {1,1,1};
    int n = 0;

    public static void main(String[] args) {
        noTriples noTriples = new noTriples();
        noTriples.getRes();

    }

    void getRes(){
        for (int i = 0; i < nums.length - 2; i++){
            if((nums[i] == nums[i+1]) &&  (nums[i+1] == nums[i+2])){
                n = 1;
            }
        }
        System.out.println(n == 0);
    }
}
