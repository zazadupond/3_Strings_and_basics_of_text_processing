package by.epam.stady.stringObjectStringAndStringBuilder;
/* Проверить, является ли заданное слово палиндромом*/

public class Task3 {
    public static void main(String[] args) {
        String text = " qwq ";
        wordIsPalindrom(text);

    }
    static boolean wordIsPalindrom(String text){
        boolean isPalindrom = false;

        StringBuilder newTextStrBuild = new StringBuilder(text);
        StringBuilder textStrBuild = new StringBuilder(text);
        newTextStrBuild.reverse();

        isPalindrom = textStrBuild.toString().equals(newTextStrBuild.toString());

        System.out.println(isPalindrom);


        return  isPalindrom;

    }
}
