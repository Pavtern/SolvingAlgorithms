package CodingBat;/*

Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".


CodingBat.altPairs("kitten") → "kien"
CodingBat.altPairs("CodingBat.Chocolate") → "Chole"
CodingBat.altPairs("CodingHorror") → "Congrr"
 */

public class altPairs {
    String str = "CodingBat.Chocolate";
    String result = "";

    public static void main(String[] args) {
        altPairs altPairs = new altPairs();
        altPairs.result();
    }

    void result(){
        for (int i = 0; i < str.length(); i+=4){

            if (i != str.length() - 1){
                result += str.substring(i,i+2);
            }

            else{
                result += str.substring(i);
            }
        }
        System.out.println(result);
    }
}

/*
Решение с сайта:
String result = "";

  // Run i by 4 to hit 0, 4, 8, ...
  for (int i=0; i<str.length(); i += 4) {
    // Append the chars between i and i+2
    int end = i + 2;
    if (end > str.length()) {
      end = str.length();
    }
    result = result + str.substring(i, end);
  }
  Красиво.
 */
