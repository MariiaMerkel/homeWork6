import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(doubleChars("The"));
        System.out.println(setMiddleString("<<>>", "hi"));
        System.out.println(concatenateFirstAndLastCharacters("", "gfhf"));
        System.out.println(swapLastTwoCharacters("ba"));
        System.out.println(concatenatePartiallyCutWords("Hello", "JAVA"));
        System.out.println(countOfSubstrings("parampampampam", "pam"));
        System.out.println(repeatLastFewCharacters("parampamlam", 5));
        System.out.println(countIdenticalConsecutiveCharacters("ddfffee"));
        System.out.println(repeatFewTimesWithSeparator("hello", "-1-", 5));
    }

    public static String doubleChars(String str) {
        char[] chars = str.toCharArray();
        char[] doubleChars = new char[chars.length * 2];
        int j = 0;
        for (char c : chars) {
            doubleChars[j++] = c;
            doubleChars[j++] = c;
        }
        return String.valueOf(doubleChars);
    }

    public static String setMiddleString(String str, String middleStr) {
        int middle = str.length() / 2;
        return str.substring(0, middle) + middleStr + str.substring(middle);
    }

    public static String concatenateFirstAndLastCharacters(String first, String last) {
        String result = "";
        if (first.length() != 0) {
            result = Character.toString(first.charAt(0));
        } else {
            result = Character.toString('@');
        }

        if (last.length() != 0) {
            result += last.charAt(last.length() - 1);
        } else {
            result += Character.toString('@');
        }
        return result;
    }

    public static String swapLastTwoCharacters(String string) {
        int indexOfPenultimateCharacter = string.length() - 2;
        char lastCharacter = string.charAt(string.length() - 1);
        char penultimateCharacter = string.charAt(indexOfPenultimateCharacter);
        String result = string.substring(0, indexOfPenultimateCharacter) + lastCharacter + penultimateCharacter;
        return result;
    }

    public static String concatenatePartiallyCutWords(String oneString, String twoString) {
        int length = Math.min(oneString.length(), twoString.length());
        return oneString.substring(0, length) + twoString.substring(0, length);
    }

    public static int countOfSubstrings(String string, String subString) {
        int c = 0;
        while (string.contains(subString)) {
            string = string.substring(string.indexOf(subString) + subString.length());
            c++;
        }
        return c;
    }

    public static String repeatLastFewCharacters(String string, int few) {
        String result = "";
        for (int i = few; i > 0; i--) {
            result += string.substring(string.length() - few);
        }
        return result;
    }

    public static int countIdenticalConsecutiveCharacters(String string) {
        int count = Math.min(1, string.length());
        int maxCount = Math.min(1, string.length());
        for (int i = 0; i < string.length() - 1; ) {
            if (string.charAt(i) == string.charAt(++i)) {
                count++;
                maxCount = Math.max(count, maxCount);
            } else {
                count = 1;
            }
        }
        return maxCount;
    }

    public static String repeatFewTimesWithSeparator(String string, String separator, int few) {
        if (few > 0) {
            int i = few - 1;
            String result = string;
            while (i > 0) {
                result += separator + string;
                i--;
            }
            return result;
        } else {
            return "";
        }
    }
}