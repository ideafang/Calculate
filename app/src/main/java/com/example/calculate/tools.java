package com.example.calculate;

public class tools {
    //计算方法
    public static String Calc(String str){
        char opt[] = new char[20]; //存放运算符
        float num[] = new float[21]; //存放中间计算结果
        char strch[] = str.toCharArray();
        int j = 0;
        String[] str1 = str.split("[+-]");
        for (int i = 0; i < str1.length; i++){
            if (str1[i].indexOf("/") > 0 || str1[i].indexOf("*") > 0){
                str1[i] = Calc_MD(str1[i]);
            }
            num[i] = Float.parseFloat(str1[i]);
        }
        for (int i = 0; i < strch.length; i++){
            if (strch[i] == '+'){
                opt[j] = '+';
                j++;
            }
            if (strch[i] == '-'){
                opt[j] = '-';
                j++;
            }
        }
        for(int i = 1; i < opt.length; i++){
            if (opt[i-1] == '+'){
                num[0] += num[i];
            }
            if (opt[i-1] == '-'){
                num[0] -= num[i];
            }
        }
        String result = String.valueOf(num[0]);
        return result;
    }

    //Todo:计算*/操作
    private static String Calc_MD(String str){
        char opt[] = new char[20];
        int j = 0;
        float num[] = new float[21];
        String str1[] = str.split("[*/]");
        for (int i = 0; i < str1.length; i++){
            num[i] = Float.parseFloat(str1[i]);
        }
        char strch[] = str.toCharArray();
        for (int i = 0; i < strch.length; i++){
            if (strch[i] == '*'){
                opt[j] = '*';
                j++;
            }
            if (strch[i] == '/'){
                opt[j] = '/';
                j++;
            }
        }
        for (int i = 1; i < opt.length; i++){
            if (opt[i-1] == '*'){
                num[0] *= num[i];
            }
            if (opt[i-1] == '/'){
                num[0] /= num[i];
            }
        }
        String result = String.valueOf(num[0]);
        return result;
    }
}
