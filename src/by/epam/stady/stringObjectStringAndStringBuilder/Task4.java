package by.epam.stady.stringObjectStringAndStringBuilder;

/* С поиощью функции копирования и операции конкатенации составить из частей слова "информатика" слово "торт".*/

public class Task4 {
    public static void main(String[] args) {
        makeUpWord("информатика");

    }

    static void makeUpWord(String text){
        String newText = "".concat(String.valueOf(text.charAt(7))).concat(String.valueOf(text.charAt(3)))
                .concat(String.valueOf(text.charAt(4))).concat(String.valueOf(text.charAt(7)));
        System.out.println(newText);

    }
}
