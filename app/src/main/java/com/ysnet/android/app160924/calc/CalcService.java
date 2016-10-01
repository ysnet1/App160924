package com.ysnet.android.app160924.calc;

/**
 * Created by Young on 2016-09-24.
 */

public interface CalcService {
    public CalcDTO plus(CalcDTO call);
    public CalcDTO minus(CalcDTO call);
    public CalcDTO multi(CalcDTO call);
    public CalcDTO devide(CalcDTO call);
    public CalcDTO remainder(CalcDTO call);
}
