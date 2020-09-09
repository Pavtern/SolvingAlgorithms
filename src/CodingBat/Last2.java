package CodingBat;/*
Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).


        last2("hixxhi") → 1
        last2("xaxxaxaxx") → 1
        last2("axxxaaxx") → 2
*/

public class Last2 {
    String str = "";
    int result = 0;
    int len = str.length();


    public static void main(String[] args) {
        Last2 last2 = new Last2();
        last2.setResult();
        last2.getResult();
    }

    void setResult() {
        if(len > 2) {
            String end = str.substring(len - 2, len);
            for (int i = 0; i < str.length() - 2; i++) {
                System.out.println(str.substring(i, i + 2));
                if (str.substring(i, i + 2).equals(end)) {
                    result++;
                }
            }
        }
    }
    void getResult(){
        System.out.println(result);
    }

}
