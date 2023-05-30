package Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cipher {
    private static final List<Character> chars = Arrays.asList(
            'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9'
    );
    private static final List<Character> code = Arrays.asList(
            'q','v','d','9','0','g','n','8','h','6','s','y','l','r','i','4','o','x','a','t','w','m','u','5','j','2','3','1','p','e','7','f','k','c','z','b'
    );
    public static void encrypt(String text){
        List<Character[]> pairs = new ArrayList<>();
        for (int i = 0; i < chars.size(); i++) {
            pairs.add(new Character[]{chars.get(i),code.get(i)});
        }

        StringBuilder sb = new StringBuilder(text.toLowerCase());

        for (int i = 0; i < sb.length(); i++) {
            for (int j = 0; j < pairs.size(); j++) {
                if (Arrays.stream(pairs.get(j)).toList().get(0).equals(sb.charAt(i))){
                    sb.setCharAt(i,Arrays.stream(pairs.get(j)).toList().get(1));
                    break;
                }
            }
        }

        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == ' '){
                sb.deleteCharAt(i);
            }
        }

        System.out.println(sb);
    }
    public static void decrypt(String text){
        List<Character[]> pairs = new ArrayList<>();
        for (int i = 0; i < chars.size(); i++) {
            pairs.add(new Character[]{chars.get(i),code.get(i)});
        }

        StringBuilder sb = new StringBuilder(text.toLowerCase());

        for (int i = 0; i < sb.length(); i++) {
            for (int j = 0; j < pairs.size(); j++) {
                if (Arrays.stream(pairs.get(j)).toList().get(1).equals(sb.charAt(i))){
                    sb.setCharAt(i,Arrays.stream(pairs.get(j)).toList().get(0));
                    break;
                }
            }
        }

        System.out.println(sb);
    }
}