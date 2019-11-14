package by.epam.stady.stringcharacterarray;

/* Заменить в строке все вхождения 'word' на 'letter'*/

public class Task2 {

    public static void main(String[] args) {
        String line = "Заменить в строке все вхождения 'word' на 'letter', word ";
        changeString(line);

    }
    public static void changeString( String line){

       String newLine = line.replaceAll("word", "letter");
        System.out.println(newLine);
    }

}
