package by.epam.stady.stringObjectStringAndStringBuilder;
/* Из заданной строки получить новую, повторив каждый символ дважды.*/

public class Task6 {

    public static void main(String[] args) {
        String text = "qwerty";
        doubleCharacter(text);
        System.out.println(doubleCharacter(text));

    }
    public static String doubleCharacter (String text){
        String textDone = "";
        StringBuilder newText = new StringBuilder(text);
        StringBuilder newtext2 = new StringBuilder(text);

        for (int i = 0, j = 0; j < newText.length(); i+=2 , j++){
            newtext2.insert(i, newText.charAt(j));
        }

        text = String.valueOf(newtext2);
        return text;
    }
}
