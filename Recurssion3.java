public class Recurssion3 {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(int idx, String str, char element) {
        if(idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char ch = str.charAt(idx);
        if(ch == element) {
            if(first == -1) {
                first = idx;
            }
            else {
                last = idx;
            }   
        }
        
        findOccurance(idx+1, str, element);
    }
    public static void main(String[] args) {
        String str = "abaacadefgham";
        findOccurance(0, str, 'a');
    }
}
