package by.epam.stady.stringObjectStringAndStringBuilder;
/* Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.*/

public class Task1 {

    public static void main(String[] args) {
        String text = " 1  2 1   3  2 1     5";
        mostConsecutiveSpaces(text);


    }

    static int mostConsecutiveSpaces(String text){
        int countSpaces = 0;
        int tempCountSpaces = 0;

        StringBuilder textStringBuilder = new StringBuilder(text);

        for (int i = 0; i < textStringBuilder.length(); i++){
            if (textStringBuilder.charAt(i) == ' '){

                for (int j = i; j < textStringBuilder.length(); ){

                    while (textStringBuilder.charAt(i) == textStringBuilder.charAt(j)){
                        tempCountSpaces++;
                        j++;
                    }

                    if (countSpaces < tempCountSpaces) {
                        countSpaces = tempCountSpaces;
                    }

                    tempCountSpaces = 0;
                    j++;
                }

            }

        }
        System.out.println(countSpaces);

        return countSpaces;
    }

}
