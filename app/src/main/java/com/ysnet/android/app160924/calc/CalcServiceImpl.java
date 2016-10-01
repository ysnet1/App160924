package com.ysnet.android.app160924.calc;

/**
 * Created by Young on 2016-09-24.
 */

public class CalcServiceImpl implements CalcService {


    @Override
    public CalcDTO plus(CalcDTO cal) {
        int num1 = cal.getNum1();
        int num2 = cal.getNum2();
        int result = num1 + num2;
        cal.setResult(result);
        return cal;
    }

    @Override
    public CalcDTO minus(CalcDTO cal) {
        int num1 = cal.getNum1();
        int num2 = cal.getNum2();
        int result = num1 - num2;
        cal.setResult(result);
        return cal;
    }

    @Override
    public CalcDTO multi(CalcDTO cal) {
        int num1 = cal.getNum1();
        int num2 = cal.getNum2();
        int result = num1 * num2;
        cal.setResult(result);
        return cal;
    }

    @Override
    public CalcDTO devide(CalcDTO cal) {
        int num1 = cal.getNum1();
        int num2 = cal.getNum2();
        int result = num1 / num2;
        cal.setResult(result);
        return cal;
    }

    @Override
    public CalcDTO remainder(CalcDTO cal) {
        int num1 = cal.getNum1();
        int num2 = cal.getNum2();
        int result = num1 % num2;
        cal.setResult(result);
        return cal;
    }
}
