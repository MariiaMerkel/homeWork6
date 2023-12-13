import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        splitFullName("Ivanov Ivan Ivanovich");
        changeFirstChar("ivanov ivan ivanovich");
        mixTwoArray("135", "246");
        mixTwoArrayWithSB("135", "246");
        deleteDuplicate("aabccddefgghiijjkk");
    }

    public static void splitFullName(String fullName) {
        String firstName = fullName.substring(0, fullName.indexOf(" ")).trim();
        String middleName = fullName.substring(fullName.indexOf(" "), fullName.lastIndexOf(" ")).trim();
        String secondName = fullName.substring(fullName.lastIndexOf(" ")).trim();
        System.out.println("Имя сотрудника — " + firstName + "\nФамилия сотрудника — " + middleName + "\nОтчество сотрудника — " + secondName);
    }
    
    public static void changeFirstChar(String fullName) {
        String firstName = fullName.substring(0, fullName.indexOf(" ")).trim();
        String middleName = fullName.substring(fullName.indexOf(" "), fullName.lastIndexOf(" ")).trim();
        String secondName = fullName.substring(fullName.lastIndexOf(" ")).trim();
        char[] charsFirstName = firstName.toCharArray();
        char[] charsMiddleName = middleName.toCharArray();
        char[] charsSecondName = secondName.toCharArray();
        charsFirstName[0] = Character.toUpperCase(charsFirstName[0]);
        charsMiddleName[0] = Character.toUpperCase(charsMiddleName[0]);
        charsSecondName[0] = Character.toUpperCase(charsSecondName[0]);
        String [] strings = new String[] {String.valueOf(charsFirstName), String.valueOf(charsMiddleName), String.valueOf(charsSecondName)};
        String  changedFullName = String.join(" ", strings);
        System.out.println(changedFullName);
    }
    public static void mixTwoArray(String str1, String str2) {
        if (str1.length() == str2.length()) {
            char[] chars1 = str1.toCharArray();
            char[] chars2 = str2.toCharArray();
            char[] fullChars = new char[chars1.length + chars2.length];
            for(int i = 0; i < fullChars.length;) {
                for(int j = 0; j < chars1.length; j++) {
                    fullChars[i++] = chars1[j];
                    fullChars[i++] = chars2[j];
                }
            }
            String fullString = String.valueOf(fullChars);
            System.out.println(fullString);
        }
    }
    public static void mixTwoArrayWithSB(String str1, String str2) {
        if (str1.length() == str2.length()) {
            char[] chars1 = str1.toCharArray();
            char[] chars2 = str2.toCharArray();
            StringBuilder finalStr = new StringBuilder();
            for (int i = 0; i < str1.length(); i++){
                finalStr.append(chars1[i]);
                finalStr.append(chars2[i]);
            }
            System.out.println(finalStr);
        }
    }

    public static void deleteDuplicate(String str) {
        char[] chars = str.toCharArray();
        HashSet hashSet = new HashSet<>();
        for (int i = 0; i<chars.length; i++) {
            hashSet.add(chars[i]);
        }
        StringBuilder newString = new StringBuilder();
        hashSet.forEach(hs -> newString.append(hs));
        System.out.println(newString);
    }

}