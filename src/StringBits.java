/*Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".


        stringBits("Hello") → "Hlo"
        stringBits("Hi") → "H"
        stringBits("Heeololeo") → "Hello"*/

//
//public class StringBits {
//    public String str = "Heeololeo";
//    String result = "";
//    public static void main (String) {
//
//        System.out.println(result);
//
//
//        void setResult() {
//        for (int i = 0; i < str.length(); i = i + 2) {
//            result += str.charAt(i);
//        }
//
//    }
//    }
//}
public class StringBits{
    String str = "Heeololeo";
    String result = "";
    public static void main(String[] args) {
        StringBits stringBits = new StringBits();
        stringBits.setResult();
        stringBits.getResult();
    }
    void setResult() {
        for (int i = 0; i < str.length(); i = i + 2) {
            result += str.charAt(i);
        }
    }
    void getResult() {
        System.out.println(result);
    }
}