public class Task10_R1 {

//    Count recursively the total number of "abc" and "aba" substrings
//    that appear in the given string.
//    countAbc("abc") → 1
//    countAbc("abcxxabc") → 2
//    countAbc("abaxxaba") → 2

    public static void main(String[] args) {
        System.out.println(countAbc("ababc"));
    }

    public static int countAbc(String str) {
        if (str.length() == 0) {
            return 0;
        }
        if (str.startsWith("abc") || str.startsWith("aba")) {
            return 1 + countAbc(str.substring(1));
        }
        return countAbc(str.substring(1));
    }
}
