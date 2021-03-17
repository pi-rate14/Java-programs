public class Q15 {

    public static String arrayToString(char[] a) {
        String string = new String(a);
        return string;
    }

    static int wordCount(String string) {
        int count = 0;

        char ch[] = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            ch[i] = string.charAt(i);
            if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0)))
                count++;
        }
        return count;
    }

    static char mostFrequent(String str) {
        int count[] = new int[256];
        int len = str.length();
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;

        int max = -1;
        char result = ' ';
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "my name is apoorva srivastava";
        System.out.println("number of words in string: " + str + "=" + wordCount(str));
        char s[] = { 'a', 'p', 'o', 'o', 'r', 'v', 'a' };
        System.out.println("character array after concatenation: " + arrayToString(s));
        String str2 = "abbbaaaccdasdddhalsfjnsjkdfasddddeeef";
        System.out.println("most occuring character in string: " + str2 + " = " + mostFrequent(str2));
    }
}
