package com.busra.bnt.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //tanımlama
    TextView result;
    EditText editText, editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //uygulama acıldığında ne olmasını istersek bu metod icinde yazilir
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        //başlatma initalition
        editText = (EditText) findViewById ( R.id.editText );
        editText2 = (EditText) findViewById ( R.id.editText2 );
        result = (TextView) findViewById ( R.id.textView );
        //result.setText ("Test test");
    }

    public void sum(View view) {

        if (editText.getText ( ).toString ( ).matches ( "" ) || editText2.getText ( ).toString ( ).matches ( "" )) {
            //edittext boş ise demek
            result.setText ( "Numara Yok" );
        } else {

            int a = Integer.parseInt ( editText.getText ( ).toString ( ) );
            int b = Integer.parseInt ( editText2.getText ( ).toString ( ) );
            int resultInteger = a + b;

            result.setText ( "Result:" + resultInteger );
        }
    }

    public void deduct(View view) {

        if (editText.getText ( ).toString ( ).matches ( "" ) || editText2.getText ( ).toString ( ).matches ( "" )) {
            //edittext boş ise demek
            result.setText ( "Numara Yok" );
        } else {

            int a = Integer.parseInt ( editText.getText ( ).toString ( ) );
            int b = Integer.parseInt ( editText2.getText ( ).toString ( ) );
            int resultInteger = a - b;

            result.setText ( "Result:" + resultInteger );

        }
    }

    public void multiply(View view) {
        if (editText.getText ( ).toString ( ).matches ( "" ) || editText2.getText ( ).toString ( ).matches ( "" )) {
            //edittext boş ise demek
            result.setText ( "Numara Yok" );
        } else {

            int a = Integer.parseInt ( editText.getText ( ).toString ( ) );
            int b = Integer.parseInt ( editText2.getText ( ).toString ( ) );
            int resultInteger = a * b;

            result.setText ( "Result:" + resultInteger );
        }
    }

    public void divide(View view) {
        if (editText.getText ( ).toString ( ).matches ( "" ) || editText2.getText ( ).toString ( ).matches ( "" )) {
            //edittext boş ise demek
            result.setText ( "Numara Yok" );
        } else {

            int a = Integer.parseInt ( editText.getText ( ).toString ( ) );
            int b = Integer.parseInt ( editText2.getText ( ).toString ( ) );
            int resultInteger = a / b;

            result.setText ( "Result:" + resultInteger );
        }
    }
}