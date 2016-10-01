package com.ysnet.android.app160924.calc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.ysnet.android.app160924.R;

public class CalcActivity extends AppCompatActivity implements View.OnClickListener{
    EditText et_num_1,et_num_2;
    Button bt_plus,bt_minus,bt_multiply,bt_devide,bt_equal;
    TextView tv_calc;
    int result;
    CalcService service = new CalcServiceImpl();
    CalcDTO cal = new CalcDTO();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        et_num_1 = (EditText) findViewById(R.id.et_num_1);
        et_num_2 = (EditText) findViewById(R.id.et_num_2);
        bt_plus = (Button)findViewById(R.id.bt_plus);
        bt_minus = (Button)findViewById(R.id.bt_minus);
        bt_multiply = (Button)findViewById(R.id.bt_multiply);
        bt_devide = (Button)findViewById(R.id.bt_devide);
        bt_equal = (Button)findViewById(R.id.bt_equal);
        tv_calc = (TextView)findViewById(R.id.tv_calc);

        bt_plus.setOnClickListener(this);
        bt_minus.setOnClickListener(this);
        bt_multiply.setOnClickListener(this);
        bt_devide.setOnClickListener(this);
        bt_equal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int num1 = Integer.parseInt(et_num_1.getText().toString());
        int num2 = Integer.parseInt(et_num_2.getText().toString());
        cal.setNum1(num1);
        cal.setNum2(num2);

        switch (v.getId()){
            case R.id.bt_plus :
                 result = service.plus(cal).getResult();
                break;
            case R.id.bt_minus :
                result = service.minus(cal).getResult();
                break;
            case R.id.bt_multiply :
                result = service.multi(cal).getResult();
                break;
            case R.id.bt_devide :
                result = service.devide(cal).getResult();
                break;
            case R.id.bt_equal :
                tv_calc.setText("계산결과 : " + result);
                break;
        }
    }
}
