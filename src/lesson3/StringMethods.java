package lesson3;

public class StringMethods {
    public static void main(String[] args) {
       /* int x = 23;
        String text = new String("This is my text");
        String anotherText = "This is my another text";
        System.out.println(text);
        System.out.println(anotherText);
        System.out.println("My new String");
        String anotherText2 = "22";

        int y = Integer.parseInt(anotherText2);
        System.out.println(y);

        System.out.println(anotherText.concat(". Some additional."));
        String update = anotherText.concat(". Some additional.");
        anotherText = anotherText.concat(". Some additional.");
        System.out.println(anotherText);*/

       /* String input = "Input your summ ";
        int mySum = 3000;
        String word = " for example ";
        String symbol1 = ":";
        boolean v = true;
        String newString = input.concat(" ").concat(" ").concat(word)
                .concat(symbol1).concat(" ").concat(String.valueOf(mySum)).concat(".");
        System.out.println(newString);

        String newAString = input + word + symbol1 + " " + mySum + " " + v;
        System.out.println(newAString);*/


        //valueOf -возвращает строковое представление
        //значений примитивных типов.


        // символы экранирования \n, \", \', \b
      /*  String string = "This is text in \"symbol\"";
        String string2 = "This is text in\n \b'symbol'";
        System.out.println(string2);*/


        //Все методы класса String не изменяют строку, а возвращают ссылку на новый объект
        //конкатенация


        //charAt – возвращает символ из строки по указанному индексу;


        //length – возвращает количество символов в строке.
      /*  int lenthOfString;
        String  string3 = "This is text in \"symbol\"";
        lenthOfString = string3.length();
        System.out.println("The length of string is: "+lenthOfString);

        System.out.println(string3.charAt(0));
        System.out.println(string3.charAt(4));*/


        //isEmpty – есди строка пустая возвращает истину,
        //если нет - ложь.
        /*String wewew = "";
        System.out.println(wewew.isEmpty());*/


        //contains – возвращает истину, если в строке
        //хотя бы раз встречается указанная строка.
    /*    String cont = "The length of string is: 24";
        String cont2 = "sTriNg iS: 2";
        boolean con = cont.contains(cont2);
        System.out.println(con);

        boolean con2 = cont.contains(cont2.toLowerCase());
        System.out.println(cont2.toLowerCase());
        System.out.println(cont2.toUpperCase());
        System.out.println(con2);
*/

        //startsWith – возвращает истину, если указанный символ или строка
        // совпадают с началом строки.
       /* String startsWith = "string";
        System.out.println(startsWith.startsWith("+"));
        System.out.println(startsWith.endsWith("g"));*/


        //toLowerCase – возвращае строку в нижнем регистре.
        //toUpperCase – возвращает строку, в верхнем регистре.


        //indexOf – ищет указанный символ начиная с начала строки.
      /*  String startsWith2 = "strinrg";
        int index = startsWith2.indexOf("r");
        int indexLast = startsWith2.lastIndexOf('r');
        System.out.println(index);
        System.out.println(indexLast);*/

        //lastIndexOf ищет с конца


        //substring – вырезает указанный промежуток символов
        //возвращает новую строку
        String cont5 = "The length of string is: 24";
        int indexO = cont5.indexOf("o");
        System.out.println(cont5.substring(indexO + 1));

        int indexS = cont5.lastIndexOf("s");
        System.out.println(cont5.substring(indexO, indexS + 1));


        //replace – возвращает строку, заменяя указанные символы или строки.
        String cont6 = "The length of string is: 24";
        String cont7 = cont6.replace("is: 24", "Twenty five");
        System.out.println(cont7);

        String example = "Catch up on what you missed at Team '23! Sessions are now available on demand.";
        String resultFromExample = example.replace("! Sessions are now available on demand.", "")
                .replace("Catch up on what you missed at Team '", "");
        String expect = "23";
        System.out.println(example.replace("! Sessions are now available on demand.", "")
                .replace("Catch up on what you missed at Team '", ""));
        System.out.println(resultFromExample);


        boolean c = resultFromExample.equals(expect);


        int one = Integer.parseInt(resultFromExample);
        int two = Integer.parseInt(expect);
        System.out.println(one);
        System.out.println(two);
        boolean d = one == two;
        boolean f = (Integer.parseInt(resultFromExample)) == (Integer.parseInt(expect));
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);


        //split
        String example2 = "Catch up on what you missed at Team '23!";
        String[] arrayOfString = example2.split("\\s");
        int size = arrayOfString.length;

        String firstWord = example2.split("\\s")[1];

        String secondtWord = example2.split("t")[1];
        System.out.println(secondtWord);

        System.out.println("================================");
        String digit = "123456";
        String nonDidit = "advavdv";
        System.out.println(Character.isDigit(digit.charAt(0)));
        System.out.println(Character.isDigit(nonDidit.charAt(0)));


        System.out.println("____________________________");

        System.out.println(digitOrNot(digit));
        System.out.println(digitOrNot(nonDidit));
        System.out.println(digitOrNot("123klj242"));


        //trim - убирает открывающие и закрывающие пробелы
        String sa = " string ";
        System.out.println(sa);
        System.out.println(sa.trim());


    }

    public static boolean digitOrNot(String s) {
        boolean result = true;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)) != true) {
                result = false;
                break;
            }
        } return result;
    }
}
