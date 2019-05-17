package sg.edu.rp.c346.intentdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv1 = findViewById(R.id.tv1);

        Intent intentReceived = getIntent();
        int value = intentReceived.getIntExtra("value",0);
        tv1.setText("Integer value received is " + value);
    }
}
