package by.epam.stady.stringcharacterarray;

/* Заменить в строке все вхождения 'word' на 'letter'*/

public class Task2 {

    public static void main(String[] args) {
        String line = "Заменить в строке все вхождения 'word' на 'letter', word1234wordwor";
        changeString(line);
        System.out.println(changeString(line));
    }

    public static String changeString(String line) { // какой-то трэш получился

        char[] charLine = line.toCharArray();
        char[] newCharLine;
        int wordCount = 0;
        for (int i = 0; i < charLine.length - 3; i++) {
            if ((String.valueOf(charLine[i]) + String.valueOf(charLine[i + 1]) + String.valueOf(charLine[i + 2]) + String.valueOf(charLine[i + 3])).equals("word")) {
                wordCount++;
            }
        }

        newCharLine = new char[charLine.length + wordCount * 2];//создаем новый массив размером старого массива + количество найденных слов * 2( т.к в новом слове на 2 буквы больше)

        for (int i = 0 ,j = 0 ; i < charLine.length; i++) {

            if (i < charLine.length - 3){

                if ((String.valueOf(charLine[i]) + String.valueOf(charLine[i + 1]) + String.valueOf(charLine[i + 2]) + String.valueOf(charLine[i + 3])).equals("word")) {

                    newCharLine[j] = 'l';
                    newCharLine[j+1] = 'e';
                    newCharLine[j+2] = 't';
                    newCharLine[j+3] = 't';
                    newCharLine[j+4] = 'e';
                    newCharLine[j+5] = 'r';

                    i+=3;
                    j+=6;

                } else {
                    newCharLine[j] = charLine[i];
                    j++;
                }

            } else {
                newCharLine[j] = charLine[i];
                j++;
            }
        }

        return String.valueOf(newCharLine);
    }

    /*public static void changeString( String line){

       String newLine = line.replaceAll("word", "letter");
        System.out.println(newLine);
    }*/

}
