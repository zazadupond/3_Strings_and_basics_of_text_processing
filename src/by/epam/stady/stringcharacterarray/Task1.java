package by.epam.stady.stringcharacterarray;
/* Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.*/

public class Task1 {
    public static void main(String args[]){

        String[] arrayString = {"biCapitalization", "bumpyCaps", "bumpyCase",
                "camelCaps", "camelHumpedWord", "capWords", "coolCapsCapsCapsCaps","humpBackNotation"};

        camelCaseInSnakeCase(arrayString);

        for (int i = 0; i < arrayString.length; i++){
            System.out.println(arrayString[i]);
        }
    }
    public static String[] camelCaseInSnakeCase( String array[]){

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].replaceAll("([A-Z]+)","\\_$1").toLowerCase(); //"\\_$1" вставляем знак _ перед каждой большой буквой.
        }

        return array;
    }

}
