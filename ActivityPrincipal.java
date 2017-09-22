package com.example.ice.revisaoex2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityPrincipal extends AppCompatActivity {

    private Button btn1;
    private Integer num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btn1 = (Button) findViewById(R.id.btn1);

        Acrescentar acrescentar = new Acrescentar();
        btn1.setOnClickListener(acrescentar);

    }

    private class Acrescentar implements View.OnClickListener
    {
        @Override
        public void onClick(View view)
        {
            num++;
            String ac = num.toString();
            btn1.setText(ac);
        }
    }
}
