package com.java.core.string;

/**
 * 将英文中每句话的首字母大写，其他变成小写。
 */
public class StringTest {
    public static void main(String[] args) {
        final String LETTER = "[a-zA-z]";
        String sentence = "today is sunNY!  i want to Go to swim.that IS amazing!are you sure?yEs be sure.";
        System.out.println("before:" + sentence);
        String result = caseConvert(sentence);
        System.out.printf("after:" + result);
    }

    private static String caseConvert(String sentence) {
        sentence = sentence.toLowerCase();
        StringBuffer sb = new StringBuffer();
        char[] c = sentence.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (i == 0) {
                sb.append((c[i] + "").toUpperCase());
                continue;
            }
            /**
             * ASCII码依次为'!'-33 '.'-46 '?'-63 ' '-32
             */
            if (c[i] == 33 || c[i] == 46 || c[i] == 63) {
                sb.append(c[i]);
                if (i + 1 < c.length) {
                    while (!((c[i + 1] >= 65 && c[i + 1] <= 90) || (c[i + 1] >= 97 && c[i + 1] <= 122))) {
                        sb.append(c[i + 1]);
                        i++;
                    }
                    sb.append((c[i + 1] + "").toUpperCase());
                    i++;
                }
            } else {
                sb.append(c[i]);
            }
        }
        return sb.toString();
    }

//    private static String caseConvert(String sentence) {
//
//        sentence = sentence.toLowerCase();
//        System.out.println("toLowerCase:"+sentence);
//        for (int i = 0; i < sentence.length()-1; i++) {
//            if (( sentence.charAt(i)) == '!' || sentence.charAt(i) == '.'){
//                for (int j = 1; j < 2; j++) {
//                    if (sentence.charAt(i+j) != ' ' /*&& sentence.*/) {
//                        String.valueOf(sentence.charAt(i+j)).toUpperCase();
//                        sentence.replace(sentence.charAt(i+j)+"",String.valueOf(sentence.charAt(i+j)).toUpperCase());
//                        break;
//                    }
//                }
//            }
//        }
//        return sentence;
//    }
}
