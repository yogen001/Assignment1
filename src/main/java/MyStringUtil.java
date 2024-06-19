import java.util.ArrayList;

public class MyStringUtil {
    String str;

    public MyStringUtil(String str) {
        this.str = str;
    }


    public String getStr() {
        return str;
    }


    public void setStr(String str) {
        this.str = str;
    }

    /**
     *
     * @return
     */
    public int size() {
        return str.length();
    }




    //Pattern pattern = Pattern.compile(regex);

    /**
     *
     * @return
     */
    public String toUpperCase() {
        String upperCase;
        if (str == null || str.isEmpty() || str.equals(" ")) {
            upperCase = "";
        } else {
            upperCase = getString(str);
        }
        return upperCase;
    }

    /**
     *
     * @param str
     * @return
     */
    private String getString(String str) {
        StringBuilder uppercase = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            uppercase.append(ch);
        }
        return uppercase.toString();
    }

    /**
     *
     * @param input
     * @return
     */
    public String toUpperCase(String input) {
        String upperCase;
        if (input == null || input.trim().isEmpty()) {
            upperCase = " ";
        } else upperCase = getString(input);
        return upperCase;
    }

    /**
     *
     */
    public void printOneByOne() {
        if (str == null) {
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }

    /**
     *
     * @return
     */
    public String reverse() {
        String reverseBuilder;
        if (str == null || str.isEmpty()) {
            reverseBuilder = "";
        } else {
            StringBuilder reverseString = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--) {
                char ch = str.charAt(i);
                reverseString.append(ch);
            }
            reverseBuilder = reverseString.toString();
        }
        return reverseBuilder;
    }

    /**
     *
     * @return
     */
    public Boolean isPalindrome() {
        boolean flag;
        if (str == null || str.trim().isEmpty()) {
            flag = true;
        } else {
            String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            String reverseBuilder = new StringBuilder(cleanedStr).reverse().toString();
            flag = reverseBuilder.equals(cleanedStr);
        }
        return flag;
    }

    /**
     *
     * @param input
     * @return
     */
    public String reverse(String input) {
        String reversedInput;
        if (input == null) {
            reversedInput = null;
        } else {
            StringBuilder reverseString = new StringBuilder();
            for (int i = input.length() - 1; i >= 0; i--) {
                char ch = input.charAt(i);
                reverseString.append(ch);
            }
            reversedInput = reverseString.toString();
        }
        return reversedInput;
    }

    /**
     *
     * @param input
     * @return
     */
    public Boolean isPalindrome(String input) {
        boolean flag;
        if (str == null || str.trim().isEmpty()) {
            flag = true;
        }else {
            String cleanedStr = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            String reverseBuilder = new StringBuilder(cleanedStr).reverse().toString();
            flag = reverseBuilder.equals(cleanedStr);
        }
        return flag;
    }

    /**
     *
     * @return
     */
    public char getMaxChar() {
        char max = 0;
        if (str == null || str.isEmpty()) {
            max = ' ';
        } else {

            String uppercase = str.toUpperCase();

            int maxCharAt = 0;

            for (int i = 0; i < this.size(); i++) {
                char currentCharacter = uppercase.charAt(i);
                if (currentCharacter > max) {
                    max = currentCharacter;
                    maxCharAt = i;
                }
            }
            max = str.charAt(maxCharAt);
        }
        return max;
    }

    /**
     *
     * @return
     */
    public String reverseEachWord() {
        String reversedWords;
        if (str == null) {
            reversedWords = null;
        } else {

            String[] stringArray = str.trim().split("\\s+");
            StringBuilder reverseBuilder = new StringBuilder(" ");
            for (String s : stringArray) {
                reverseBuilder.append(reverse(s)).append(" ");
            }
            reversedWords = reverseBuilder.toString().trim();
        }
        return reversedWords;
    }

    /**
     *
     * @param start
     * @param end
     * @return
     */
    public String sub(int start, int end) {
        String substring;
        if (str == null) {
            substring = "string is null";
        } else if (start < 0 || start >= str.length() || end < 0 || end > str.length() || start > end) {
            substring = "invalid indexing";
        } else {

            StringBuilder substringBuilder = new StringBuilder();
            for (int i = start; i < end; i++) {
                char ch = str.charAt(i);
                substringBuilder.append(ch);
            }
            substring = substringBuilder.toString();
        }
        return substring;
    }

    /**
     *
     * @return
     */
    public int[] countEachWordLength() {
        int[] countArray;
        if (str == null || str.trim().isEmpty()) {
            countArray = new int[]{-1};
        } else {
            String regex = "[\\s,!.?;:()\"']+";
            String[] words = str.trim().split(regex);
            countArray = new int[words.length];
            for (int i = 0; i < countArray.length; i++) {
                countArray[i] = words[i].length();
            }
        }
        return countArray;
    }

    /**
     *
     * @param prefix
     * @return
     */
    public String prefix(String prefix) {
        return prefix + this.str;
    }

    /**
     *
     * @param suffix
     * @return
     */
    public String suffix(String suffix) {
        return this.str + suffix;
    }

    /**
     *
     * @return
     */
    public String reverseCase() {
        String result;
        StringBuilder swapCase = new StringBuilder();
        if (str == null) {
            result = null;
        } else {

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    ch = (char) (ch - 32);
                } else if (ch >= 'A' && ch <= 'Z') {
                    ch = (char) (ch + 32);
                }

                swapCase.append(ch);
            }
            result = swapCase.toString();
        }
        return result;
    }

    /**
     *
     * @return
     */
    public String findLargestPalindrome() {
        String LargestPalindrome;
        if (str == null || str.trim().isEmpty()) {
            LargestPalindrome = "";
        } else {
            String[] stringList = this.str.trim().split("\\s+");
            ArrayList<String> wordList = new ArrayList<>();
            for (String string : stringList) {
                if (isPalindrome(string)) {
                    wordList.add(string);
                }
            }
            int max = 0;
            String palindrome = " ";
            for (String s : wordList) {
                if (s.length() > max) {
                    max = s.length();
                    palindrome = s;
                }
            }
            LargestPalindrome = palindrome;
        }
        return LargestPalindrome;
    }

    /**
     *
     * @return
     */
    public String altFindLargestPalindrome() {
        String palindrome;
        if (str == null || str.trim().isEmpty()) {
            palindrome = "";
        } else {
            String regex = "[\\s,!.?;:()\"']+";
            String[] stringArray = str.trim().split(regex);
            String largestPalindrome = " ";
            int maxlength = 0;
            for (String subString : stringArray) {
                if (isPalindrome(subString) && subString.length() >= maxlength) {
                    largestPalindrome = subString;
                    maxlength = subString.length();
                }
            }

            palindrome = largestPalindrome;
        }
        return palindrome;
    }

    /**
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
        myStringUtil.setStr("substringBuilder method");
        System.out.println("Substring (0, 9): " + myStringUtil.sub(0, 9));
        System.out.println("Substring (10, 100): " + myStringUtil.sub(10, 100)); // Test out-of-bounds

        // Testing countEachWordLength method
        myStringUtil.setStr("Why do flamingos stand on one leg? It's a mystery of nature.");

        int[] lengths = myStringUtil.countEachWordLength();
        System.out.print("Word Lengths: {");
        for (int length : lengths) {
            System.out.print(length + " ,");
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