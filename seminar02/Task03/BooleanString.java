// 📌 Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает
// boolean значение).

package seminar02.Task03;

public class BooleanString {
    static boolean isPalindrom(String inputStr) {
        for (int i = 0; i < inputStr.length() / 2; i++) {
        if (inputStr.charAt(i) != inputStr.charAt(inputStr.length() - 1 - i))
        return false;
        }
        return true;
        }
        public static void main(String[] args) {
        String word = "довод";
        //System.out.println(checkStringToPalindrom(word));
        System.out.println(isPalindrom(word));
        }
}
