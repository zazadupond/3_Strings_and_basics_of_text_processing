package by.epam.stady.stringcharacterarray;

/* В строке найти количество чисел*/

public class Task4 {
    public static void main(String[] args) {
        String line = " 965 г. - Разгром Хазарского каганата войском Киевского князя Святослава Игоревича. " +
                "988 г. - Крещение Руси. Киевская Русь принимает православное христианство. " +
                "1223 г. - Битва на Калке - первое сражение между русскими и моголами." +
                "1240 г. - Невская битва - военный конфликт между русскими_test12345_test во главе с новгородским князем Александром и шведами." +
                "1242 г. - Битва на Чудском озере - 34 сражение между русскими во главе с Александром Невским и рыцарями Ливонского ордена. Эта битва вошла в историю, как Ледовое побоище" +
                "Подробнее." +
                "1380 г. - Куликовская битва - сражение между объединенной армией русских княжеств во главе с Дмитрием Донским и армией Золотой Орды во главе с Мамаем. Подробнее" +
                "1556 г. — Присоединение Астраханского ханства к Москвкой Руси.\n" +
                "\n" +
                "1558 — 1583 г. — Ливонская война. Война Русского царства против Ливонского ордена и последующий конфликт Русского царства с Великим княжеством Литовским, Польшей и Швецией.";


        searchCountNumbersInLine(line);
    }

    public static int searchCountNumbersInLine(String line){

        int numberDigit = 0;

        char[] charArrayLine = line.toCharArray();
        for (int i = 0; i < charArrayLine.length; ){

            if (Character.isDigit(charArrayLine[i])){
                i++;
                while ((i < charArrayLine.length) & Character.isDigit(charArrayLine[i]) ){
                    i++;
                    System.out.println(i);
                }
                numberDigit++;
            } else {
                i++;
            }

        }
        System.out.println(numberDigit);

        return numberDigit;
    }


    /*public static int searchCountNumbersInLine(String line){

        String[] lineArray = line.replaceAll("[^0-9]+", " ").trim().split(" ");*//* ^ - убираем все строки (без ^ - останутся наоборот только слова без чисел), заменяем убранные строки на
        пробелы, получается строка с числами через пробел. trim убирает пробел перед строкой. split делит строку на элементы по пробелы, каждый отделенный элемент кладет в элемент массива*//*

        for (int i = 0; i < lineArray.length; i++){
            System.out.println(i + " " + lineArray[i] + " ");

        }
        System.out.println("\n" + lineArray.length);

        return lineArray.length; // возвращаем количество элементов в массиве - это будет количество найденных чисел.
    }*/
}
