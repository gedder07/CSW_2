public class Main {
public static void main(String args[]) {
try {
String input = "abc123def456";
String numericString = parseString(input);
if (numericString == null) {
System.out.println("No numeric characters were preceded by a vowel and consonant.");
} else {
System.out.println(numericString);
}
} catch (NullPointerException e) {
System.err.println("NullPointerException was thrown: " + e.getMessage());
}
}
public static String parseString(String input) {
if (input == null || input.isEmpty()) {
throw new NullPointerException("Input string is null or empty.");
}
StringBuilder numericString = new StringBuilder();
for (int i = 0; i < input.length() - 1; i++) {
char currChar = input.charAt(i);
if (Character.isAlphabetic(currChar)) {
if (isVowel(currChar) && Character.isDigit(input.charAt(i + 1))) {
numericString.append(input.charAt(i + 1));
}
}
}
if (numericString.length() == 0) {
return null;
}
return numericString.toString();
}
public static boolean isVowel(char character) {
return "aeiou".indexOf(character) > -1;
}
}
