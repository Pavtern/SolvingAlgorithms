package CodingBat;

public class Chocolate {
    int choco = -1;
    int small = 6;
    int big = 2;
    int goal = 11;

    public static void main(String[] args) {
        Chocolate chocolate = new Chocolate();
        chocolate.result();
    }

    void result(){
        if(big * 5 + small >= goal && goal % 5 <= small){
            if (goal > big * 5){
                choco = goal - big * 5;
            }
            else {
                choco = goal % 5;
            }
            }
         else {
             choco = -1;
        }
        System.out.println(choco);
    }
}



