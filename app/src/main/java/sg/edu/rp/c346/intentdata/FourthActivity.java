package sg.edu.rp.c346.intentdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {
    TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        tv3 = findViewById(R.id.tv3);

        Intent intentReceived = getIntent();
        Double value = intentReceived.getDoubleExtra("value",99.99);
        tv3.setText("Double value received is" + value);

    }
}
