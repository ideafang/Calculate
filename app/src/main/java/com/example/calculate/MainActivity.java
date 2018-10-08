package com.example.calculate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mBtn_1;
    private Button mBtn_2;
    private Button mBtn_3;
    private Button mBtn_4;
    private Button mBtn_5;
    private Button mBtn_6;
    private Button mBtn_7;
    private Button mBtn_8;
    private Button mBtn_9;
    private Button mBtn_0;
    private Button mBtn_add;
    private Button mBtn_sub;
    private Button mBtn_multiply;
    private Button mBtn_divide; // 除
    private Button mBtn_del;// 删除一个
    private Button mBtn_equal; // 等于
    private Button mBtn_point; // 点
    private Button mBtn_clean; // 清除
    private TextView mEdt_play; // 显示运算过程
    private TextView mTv_result;// 显示结果

    StringBuffer display = new StringBuffer();
    String result = "";
    char ch;
    double value;
    int flag = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        mEdt_play = (TextView) findViewById(R.id.edt_calc);
        mEdt_play.setText("0");
        mTv_result = (TextView) findViewById(R.id.txt_calc);

    }

    private boolean checkNum(String str){
        for (int i = 0; i < str.length(); i++){
            if (!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public void click(View v){
        if (display.toString().equals("0")){
            display = new StringBuffer();
        }
        if (flag == 1){
            display = new StringBuffer();
            flag = 0;
        }
        int id = v.getId();
        switch(id){
            case R.id.btn_0:
                if (result.length() != 0){
                    result = "";
                }
                display.append("0");
                mEdt_play.setText(display.toString());
                break;
            case R.id.btn_1:
                if (result.length() != 0){
                    result = "";
                }
                display.append("1");
                mEdt_play.setText(display.toString());
                break;
            case R.id.btn_2:
                if (result.length() != 0){
                    result = "";
                }
                display.append("2");
                mEdt_play.setText(display.toString());
                break;
            case R.id.btn_3:
                if (result.length() != 0){
                    result = "";
                }
                display.append("3");
                mEdt_play.setText(display.toString());
                break;
            case R.id.btn_4:
                if (result.length() != 0){
                    result = "";
                }
                display.append("4");
                mEdt_play.setText(display.toString());
                break;
            case R.id.btn_5:
                if (result.length() != 0){
                    result = "";
                }
                display.append("5");
                mEdt_play.setText(display.toString());
                break;
            case R.id.btn_6:
                if (result.length() != 0){
                    result = "";
                }
                display.append("6");
                mEdt_play.setText(display.toString());
                break;
            case R.id.btn_7:
                if (result.length() != 0){
                    result = "";
                }
                display.append("7");
                mEdt_play.setText(display.toString());
                break;
            case R.id.btn_8:
                if (result.length() != 0){
                    result = "";
                }
                display.append("8");
                mEdt_play.setText(display.toString());
                break;
            case R.id.btn_9:
                if (result.length() != 0){
                    result = "";
                }
                display.append("9");
                mEdt_play.setText(display.toString());
                break;
            case R.id.btn_add:
                result = "";
                if (display.toString().endsWith("/0")){
                    result = "除数不能为0";
                    mTv_result.setText(result);
                    display.delete(display.length() - 2, display.length());
                    mEdt_play.setText(display.toString());
                }else{
                    if (display.toString().length() == 0){
                        display.append("0+");
                        mEdt_play.setText(display.toString());
                    }else{
                        ch = display.charAt(display.length() - 1);
                        if (Character.isDigit(ch)){
                            display.append("+");
                            mEdt_play.setText(display.toString());
                        }else{
                            result = "语法错误";
                            mTv_result.setText(result);
                        }
                    }
                }
                break;
            case R.id.btn_sub:
                result = "";
                if (display.toString().endsWith("/0")){
                    result = "除数不能为0";
                    mTv_result.setText(result);
                    display.delete(display.length() - 2, display.length());
                    mEdt_play.setText(display.toString());
                }else{
                    if (display.toString().length() == 0){
                        display.append("0-");
                        mEdt_play.setText(display.toString());
                    }else{
                        ch = display.charAt(display.length() - 1);
                        if (Character.isDigit(ch)){
                            display.append("-");
                            mEdt_play.setText(display.toString());
                        }else{
                            result = "语法错误";
                            mTv_result.setText(result);
                        }
                    }
                }
                break;
            case R.id.btn_multiply:
                result = "";
                if (display.toString().endsWith("/0")){
                    result = "除数不能为0";
                    mTv_result.setText(result);
                    display.delete(display.length() - 2, display.length());
                    mEdt_play.setText(display.toString());
                }else{
                    if (display.toString().length() == 0){
                        display.append("0*");
                        mEdt_play.setText(display.toString());
                    }else{
                        ch = display.charAt(display.length() - 1);
                        if (Character.isDigit(ch)){
                            display.append("*");
                            mEdt_play.setText(display.toString());
                        }else{
                            result = "语法错误";
                            mTv_result.setText(result);
                        }
                    }
                }
                break;
            case R.id.btn_divide:
                result = "";
                if (display.toString().endsWith("/0")){
                    result = "除数不能为0";
                    mTv_result.setText(result);
                    display.delete(display.length() - 2, display.length());
                    mEdt_play.setText(display.toString());
                }else{
                    if (display.toString().length() == 0){
                        display.append("0/");
                        mEdt_play.setText(display.toString());
                    }else{
                        ch = display.charAt(display.length() - 1);
                        if (Character.isDigit(ch)){
                            display.append("/");
                            mEdt_play.setText(display.toString());
                        }else{
                            result = "语法错误";
                            mTv_result.setText(result);
                        }
                    }
                }
                break;
            case R.id.btn_point:
                if (display.length() == 0){
                    display.append("0.");
                    mEdt_play.setText(display.toString());
                }else{
                    ch = display.charAt(display.length() - 1);
                    if (Character.isDigit(ch)){
                        display.append(".");
                        mEdt_play.setText(display.toString());
                    }
                }
                break;
            case R.id.btn_equal:
                if (display.length() == 0){
                    result = "0";
                    mTv_result.setText(result);
                } else{
                    if (display.toString().endsWith("/0")){
                        result = "除数不能为0";
                        mTv_result.setText(result);
                        display.delete(display.length() - 2, display.length());
                        mEdt_play.setText(display.toString());
                    }else{
                        ch = display.charAt(display.length() - 1);
                        if (Character.isDigit(ch)){
                            if (checkNum(display.toString())){
                                result = display.toString();
                                mTv_result.setText(result);
                            }else{
                                try{
                                    value = Double.parseDouble(tools.Calc(display.toString()));
                                    result = String.valueOf(value);
                                    if (result.endsWith(".0")){
                                        StringBuffer tmp = new StringBuffer(result);
                                        tmp.delete(tmp.length() - 2, tmp.length());
                                        result = tmp.toString();
                                    }
                                    mTv_result.setText(result);
                                }catch (NumberFormatException e){
                                    result = "错误数据";
                                    mTv_result.setText(result);
                                }
                            }
                        }else{
                            result = "语法错误";
                            mTv_result.setText(result);
                        }
                    }
                }
                flag = 1;
                break;
            case R.id.btn_clean:
                display = new StringBuffer();
                result = "";
                mEdt_play.setText("0");
                mTv_result.setText("");
                break;
            case R.id.btn_del:
                if (display.length() !=  0){
                    display.deleteCharAt(display.length()-1);
                }
                mEdt_play.setText(display.toString());
                break;
        }
    }
}
