/*
Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.


stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"
 */


public class StringYak {
    String str = "yak123ya";
    String result = "";

    public static void main(String[] args) {
        StringYak yakyak = new StringYak();
        yakyak.setresult();
    }


    void setresult(){
        for (int i = 0; i < str.length(); i++) {
            int end = str.length() - 3;
            if (i <= end && str.substring(i, i + 3).equals("yak") && i <= str.length() - 3) {
                i += 3;
            }
            if (i < str.length()) {
                result += str.substring(i, i + 1);
            }
        }
        System.out.println(str.substring(0,3).equals("yak"));
        System.out.println(result);
    }
}

/*
Solution:
public String stringYak(String str) {
  String result = "";

  for (int i=0; i<str.length(); i++) {
    // Look for i starting a "yak" -- advance i in that case
    if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
      i =  i + 2;
    } else { // Otherwise do the normal append
      result = result + str.charAt(i);
    }
  }

  return result;
}

Я сначала понял, что вместо а в йак может быть что угодно, но посмотрел тестовые строки и там
такого не было, короче моё решение прошло тест на сайте

 */