package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T6ExpresionesRegulares {
    public static void main(String[] args) {
        //1.
//        String regex = "he ido al \\w*";
//        String input = "he ido al cine";
//        String input2 = "he ido al supermercado";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(input);
//        Matcher matchers = pattern.matcher(input2);
//        boolean matches = matcher.matches();
//        boolean matchess = matchers.matches();
//        System.out.println(matches);
//        System.out.println(matchess);

        //2
//        String regex = "he ido al \\w*";
//        String input = "he ido al cine";
//        String input2 = "he ido al supermercado";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(input);
//        Matcher matchers = pattern.matcher(input2);
//        boolean matches = matcher.matches();
//        boolean matchess = matchers.matches();
//        System.out.println(matches);
//        System.out.println(matchess);

        //3
//        String regex = "\\+\\$+\\+";
//        String input = "Ciclo+$+formativo+$$+Desarrollo+$$$$+de+$$+aplicaciones+$+multiplataforma";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(input);
//        String replaced = matcher.replaceAll("_");
//        System.out.println(replaced);

        //4
//        String regex = "a*bc+d{3}e.*";
//        String input = "aaabcccccccdddefffg";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(input);
//        boolean matches = matcher.matches();
//        System.out.println(matches);
//
//
//        String texto = "sssdd aaabcccccccdddefffg ffffccc aaabcccccccdddefffg";
//        if (texto.matches("s*d*\\sa*bc*d*ef*g\\sf*c*\\sa*bc*d*ef*g")) {
//            System.out.println("Correcto");
//        } else {
//            System.out.println("Incorrecto");
//        }

//        String text = "sssdd aaabcccccccdddefffg ffffccc aaabcccccccdddefffg";
//        int cont=0;
//        Pattern pattern = Pattern.compile("aaabcccccccdddefffg");
//        Matcher matcher = pattern.matcher(text);
//        while (matcher.find()) {
//            cont++;
//        }
//        System.out.println(cont);

        //5
//        String regex = "[a-z]+\\.\d+";
//        String input = "abcdge.1234";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(input);
//        boolean matches = matcher.matches();
//        System.out.println(matches);


        //6
//        String text = "abcde.1234jd.6tjuk.000";
//        Pattern pattern = Pattern.compile("a-z]+\\.(\\d+)");
//        Matcher matcher = pattern.matcher(text);
//        while (matcher.find()) {
//            System.out.println(matcher.group(1));
//        }

        //7
//        String text = "192.168.1.10 - - [11/Apr/2024:12:00:00] \"GET /pagina1 HTTP/1.1\" 200 1234\n" +
//                "192.168.3.40 - - [11/Apr/2024:12:01:00] \"GET /pagina2 HTTP/1.1\" 200 3456\n" +
//                "192.168.4.60 - - [12/Apr/2024:12:02:00] \"GET /pagina3 HTTP/1.1\" 200 6789\n" +
//                "192.168.1.20 - - [14/Apr/2024:12:03:00] \"GET /pagina4 HTTP/1.1\" 200 9876\n" +
//                "192.168.3.50 - - [14/Apr/2024:12:04:00] \"GET /pagina5 HTTP/1.1\" 200 5432\n" +
//                "192.168.4.70 - - [18/Apr/2024:12:05:00] \"GET /pagina6 HTTP/1.1\" 200 8765\n" +
//                "192.168.1.30 - - [18/May/2024:12:06:00] \"GET /pagina7 HTTP/1.1\" 200 2345";
//
//
//        String regex = "(192\\.168\\.1\\.\\d{1,3}) - - \\[(\\d{2}/\\w{3}/\\d{4})";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(text);
//        while (matcher.find()) {
//            System.out.println("IP " + matcher.group(1) + " Fecha " + matcher.group(2));
//        }

    }
}
