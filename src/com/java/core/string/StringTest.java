package com.java.core.string;

/**
 * Created by zhongyao on 2016/5/31.
 */
public class StringTest {
    public static void main(String[] args) {
        //将英文中每句话的首字母大写，其他小写。
        String sentence = "today is sunNY!i want to Go to swim.that IS amazing!";
        System.out.println("before:"+sentence);
        String result = caseConvert(sentence);
        System.out.printf("after:"+result);
    }

    private static String caseConvert(String sentence) {

        sentence = sentence.toLowerCase();
        System.out.println("toLowerCase:"+sentence);
        for (int i = 0; i < sentence.length()-1; i++) {
            if (( sentence.charAt(i)) == '!' || sentence.charAt(i) == '.'){
                for (int j = 1; j < 2; j++) {
                    if (sentence.charAt(i+j) != ' ' /*&& sentence.*/) {
                        String.valueOf(sentence.charAt(i+j)).toUpperCase();
                        sentence.replace(sentence.charAt(i+j)+"",String.valueOf(sentence.charAt(i+j)).toUpperCase());
                        break;
                    }
                }
            }
        }
        return sentence;
    }
}
