package by.epam.stady.stringObjectStringAndStringBuilder;
/* В строке вставить после каждого символа 'a' символ 'b'.*/

public class Task2 {

    public static void main(String[] args) {
        String text = " a a aa ra rgasd";
        inserterCharacterBAfterCharacterA(text);
        //System.out.println(inserterCharacterBAfterCharacterA(text));

    }

    static String inserterCharacterBAfterCharacterA(String text){
        String newText = "0";
        StringBuilder textStrBuild = new StringBuilder(text);

        for (int i = 0; i < textStrBuild.length(); i++){

            if (textStrBuild.charAt(i) == 'a'){
                textStrBuild.insert(i+1, 'b');
            }
        }

        newText = String.valueOf(textStrBuild);

        return newText;
    }
}
