import java.util.ArrayList;
import java.util.regex.*;


public class MyStringUtil {
    String str;
    public MyStringUtil(String str) {
        this.str = str;
    }

    /**
     *
     * @return
     */
    public String getStr() {
        return str;
    }

    /**
     *
     * @param str
     */
    public void setStr(String str) {
        this.str = str;
    }

    /**
     *
     * @return
     */
    public int size(){
        return str.length();
    }

    /**
     *
     */
    public String regex = "[\\s,!.?;:()\"']+";

    //Pattern pattern = Pattern.compile(regex);

    /**
     *
     * @return
     */
    public String toUpperCase(){
        if (str == null){
            return null;
        }else if ( str.isEmpty() || str.equals(" ")){
            return " ";
        }
        StringBuilder uppercase = new StringBuilder();
        for (int i = 0; i< str.length();i++){
             char ch = str.charAt(i);
            if ( ch >= 'a' && ch <= 'z'){
                ch = (char) (ch -32);
            }
            uppercase.append(ch);
        }
        return uppercase.toString();
    }

    /**
     *
     * @param s
     * @return
     */

    public String toUpperCase(String s){
        if (s == null){
            return null;
        }
        if (s.isEmpty()){
            return null;
        }
        StringBuilder uppercase = new StringBuilder();
        for (int i = 0; i< s.length();i++){
            char ch = s.charAt(i);
            if ( ch >= 'a' && ch <= 'z'){
                ch = (char) (ch -32);
            }
            uppercase.append(ch);
        }
        return uppercase.toString();
    }

    /**
     *
     */
    public void printOneByOne(){
        if (str == null){
            return;
        }
        for (int i = 0; i< str.length();i++){
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }

    /**
     *
     * @return
     */
    public String reverse(){
        if (str == null){
            return null;
        } else if (str.isEmpty()){
            return "";
        }
        StringBuilder reverseString = new StringBuilder();
        for (int i = str.length() -1; i>=0;i--){
            char ch = str.charAt(i);
            reverseString.append(ch);
        }
        return reverseString.toString();
    }

    /**
     *
     * @return
     */
    public Boolean isPalindrome(){
        if (str == null){
            return null;
        }
        String reversedString = this.reverse();
        return reversedString.equals(str);
    }

    /**
     *
     * @param s
     * @return
     */

    public String reverse(String s){
        if (s == null){
            return null;
        }
        StringBuilder reverseString = new StringBuilder();
        for (int i = s.length() -1; i>=0;i--){
            char ch = s.charAt(i);
            reverseString.append(ch);
        }
        return reverseString.toString();
    }

    /**
     *
     * @param s
     * @return
     */

    public Boolean isPalindrome(String s){
        if (s == null){
            return true;
        }
        String reversedString = reverse(toUpperCase(s));
        return reversedString.equals(toUpperCase(s));
    }

    /**
     *
     * @return
     */

    public char getMaxChar(){
        if (str == null || str.isEmpty()) {
            return ' ';
        }

        String uppercase = str.toUpperCase();
        char max = ' ';
        int maxCharAt = 0;

        for (int i = 0; i < this.size(); i++) {
            char currentCharacter = uppercase.charAt(i);
            if (currentCharacter > max) {
                max = currentCharacter;
                maxCharAt = i;
            }
        }
        return str.charAt(maxCharAt);
    }

    /**
     *
     * @return
     */


    public String reverseEachWord(){
        if (str == null){
            return null;
        }

        String[] stringArray = str.trim().split("\\s+");
        StringBuilder reversedWordString = new StringBuilder(" ");
        for (String s : stringArray) {
            reversedWordString.append(reverse(s)).append(" ");
        }
        return reversedWordString.toString().trim();
    }

    /**
     *
     * @param start
     * @param end
     * @return
     */

    public String sub(int start, int end){
        if (str == null){
            return "string is null";
        } else if (start >= this.size() || start < 0 || end < 0 || end < start|| end >= str.length() ){
            return "invalid indexing";
        }
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++){
            char ch = str.charAt(i);
            substring.append(ch);
        }
        return substring.toString();
    }

    /**
     *
     * @return
     */
    public int[] countEachWordLength(){
        if (str == null|| str.trim().isEmpty()){
            return new int[] {-1};
        }
        String regex = "[\\s,!.?;:()\"']+";
        String[] s = str.trim().split(regex);
        int[] wordLengths = new int[s.length];
        for (int i = 0; i < wordLengths.length;i++){
            wordLengths[i] = s[i].length();
        }
        return wordLengths;
    }

    /**
     *
     * @param prefix
     * @return
     */

    public String prefix(String prefix){
        return prefix + this.str;
    }

    /**
     *
     * @param suffix
     * @return
     */
    public String suffix(String suffix){
        return this.str + suffix;
    }

    /**
     *
     * @return
     */
    public String reverseCase(){
        StringBuilder swapCase = new StringBuilder();
        if (str == null){
            return null;
        }

        for (int i = 0; i< str.length();i++){
            char ch = str.charAt(i);
            if ( ch >= 'a' && ch <= 'z'){
                ch = (char) (ch -32);
            }else if ( ch >= 'A' && ch <= 'Z'){
                ch = (char) (ch +32);
            }

            swapCase.append(ch);
        }
        return swapCase.toString();
    }

    /**
     *
     * @return
     */
    public String findLargestPalindrome(){
        if (str == null || str.trim().isEmpty()){
            return "";
        }
        String[] stringList = this.str.trim().split("\\s+");
        ArrayList<String> wordList = new ArrayList<>();
        for (String string : stringList) {
            if (isPalindrome(string)) {
                wordList.add(string);
            }
        }
        int max = 0;
        String palindrome = " " ;
        for ( String s : wordList){
            if (s.length() > max){
                max = s.length();
                palindrome = s;
            }
        }
        return palindrome;
    }

    public String altFindLargestPalindrome(){
        if (str == null|| str.trim().isEmpty()){
            return "";
        }
        str = str.trim();
        String largestPalindrome = " ";
        int maxlength = 0;
        for (int i = 0; i < str.length(); i++){
            for (int j = i+1; j<= str.length(); j++){
                String subString = str.substring(i,j);
                if (isPalindrome(subString) && subString.length() >= maxlength){
                    largestPalindrome = subString;
                    maxlength = subString.length();
                }
            }
        }
        return largestPalindrome;
    }
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // Let's create an object of MyStringUtil with a sample string
        MyStringUtil myStringUtil = new MyStringUtil("hello world");

        // Testing the getStr and setStr methods
        System.out.println("Original String: " + myStringUtil.getStr());
        myStringUtil.setStr("new string");
        System.out.println("Updated String: " + myStringUtil.getStr());

        // Testing the size method
        System.out.println("Size of String: " + myStringUtil.size());

        // Testing toUpperCase method
        System.out.println("Uppercase: " + myStringUtil.toUpperCase());

        // Testing toUpperCase with parameter method
        System.out.println("Uppercase (with param): " + myStringUtil.toUpperCase("another string"));

        // Testing printOneByOne method
        System.out.println("Print one by one:");
        myStringUtil.setStr("print this"); // Update the string for this method
        myStringUtil.printOneByOne();

        // Testing reverse method
        System.out.println("Reversed String: " + myStringUtil.reverse());

        // Testing isPalindrome method
        myStringUtil.setStr("madam");
        System.out.println("Is Palindrome: " + myStringUtil.isPalindrome());

        // Testing reverse with parameter method
        System.out.println("Reversed (with param): " + myStringUtil.reverse("example"));

        // Testing isPalindrome with parameter method
        System.out.println("Is Palindrome (with param): " + myStringUtil.isPalindrome("radar"));

        // Testing getMaxChar method
        myStringUtil.setStr("zyxwvutsrqponmlkjihgfedcba");
        System.out.println("Max Character: " + myStringUtil.getMaxChar());

        // Testing reverseEachWord method
        myStringUtil.setStr("reverse each word");
        System.out.println("Reversed Each Word: " + myStringUtil.reverseEachWord());

        // Testing sub method
        myStringUtil.setStr("substring method");
        System.out.println("Substring (0, 9): " + myStringUtil.sub(0, 9));
        System.out.println("Substring (10, 100): " + myStringUtil.sub(10, 100)); // Test out-of-bounds

        // Testing countEachWordLength method
        myStringUtil.setStr("The platypus danced under the disco ball, oblivious to the peanut butter tornado approaching.");

        int[] lengths = myStringUtil.countEachWordLength();
        System.out.print("Word Lengths: {");
        for (int length : lengths) {
            System.out.print(length + " ," );
        }
        System.out.println();

        // Testing prefix method
        System.out.println("With Prefix: " + myStringUtil.prefix("Prefix"));

        // Testing suffix method
        System.out.println("With Suffix: " + myStringUtil.suffix("Suffix"));

        // Testing reverseCase method
        myStringUtil.setStr("Reverse CASE");
        System.out.println("Reverse Case: " + myStringUtil.reverseCase());

        // Testing findLargestPalindrome method
        myStringUtil.setStr("madam racecar apple malayalam level kayak");
        System.out.println("Largest Palindrome: " + myStringUtil.altFindLargestPalindrome());
    }

}

