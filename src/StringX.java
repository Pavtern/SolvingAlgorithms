/*
Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.


stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
 */
public class StringX {
    String str = "xHxjkfx";
    String result = "";

    public static void main(String[] args) {
        StringX stringX = new StringX();
        stringX.result();
    }

    void result() {
        if(str.length() > 2){
            result = str.substring(0,1);
            for (int i = 1; i < str.length() - 1; i++){
                if (!str.substring(i,i+1).equals("x")){
                    result += str.substring(i,i+1);
                }
            }
            result += str.substring(str.length()-1);
        }
        System.out.println(result);
    }
}
/*
Решение с сайта:
String result = "";
  for (int i=0; i<str.length(); i++) {
    // Only append the char if it is not the "x" case
    if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
      result = result + str.substring(i, i+1); // Could use str.charAt(i) here
    }
  }
  return result;

  Ушло около часа на то чтобы понять данное решение, хотя своё я написал максимум за 15 мин.))))
 */
