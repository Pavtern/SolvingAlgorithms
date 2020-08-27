public class StringMatch {
    String a = "xxcaazz";
    String b = "xxbaazx";
    int num = 0;

    public static void main(String[] args) {
        StringMatch stringMatch = new StringMatch();
        stringMatch.result();
    }

    void result() {
        for (int i = 0; i < a.length()-1  & i < b.length()-1 ; i++){
            if(a.substring(i, i+2).equals(b.substring(i, i+2))){
                num++;
            }
        }
        System.out.println(num);
    }
}
