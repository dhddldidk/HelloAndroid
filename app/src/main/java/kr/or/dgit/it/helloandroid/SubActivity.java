package kr.or.dgit.it.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView tv = new TextView(SubActivity.this);
        tv.setText(R.string.subavtivity);
        setContentView(tv);
    }
}
