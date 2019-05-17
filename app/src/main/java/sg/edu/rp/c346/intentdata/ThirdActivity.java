package sg.edu.rp.c346.intentdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tv2 = findViewById(R.id.tv2);
        Intent intentReceived = getIntent();
        Character value = intentReceived.getCharExtra("value",'a');
        tv2.setText("Character value received is: " +value);

    }
}
