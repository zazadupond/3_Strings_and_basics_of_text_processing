package by.epam.stady.stringObjectStringAndStringBuilder;

/* Подсчитать, сколько раз среди символов заданной строки встречается буква "а".*/
public class Task5 {

    public static void main(String[] args) {
        String txt = " abbabbbaaaaabbbabababab";
        countCharacter(txt);
        System.out.println(countCharacter(txt));
    }

    static int countCharacter(String text){

        int countCh = 0;
        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) == 'a'){
                countCh++;
            }
        }
        return countCh;
    }

}
