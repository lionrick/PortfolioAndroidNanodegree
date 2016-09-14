package portfolio.nanodegree.ricardo.com.appportfolioandroidnanodegree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);


        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                showGenericMessage(((Button) v).getText().toString());
                break;
            case R.id.button2:
                showGenericMessage(((Button) v).getText().toString());
                break;
            case R.id.button3:
                showGenericMessage(((Button) v).getText().toString());
                break;
            case R.id.button4:
                showGenericMessage(((Button) v).getText().toString());
                break;
            case R.id.button5:
                showGenericMessage(((Button) v).getText().toString());
                break;
            case R.id.button6:
                showGenericMessage(((Button) v).getText().toString());
                break;
        }
    }

    /**
     * Default method until the true app come
     *
     * @param name
     */
    private void showGenericMessage(String name) {
        Toast.makeText(this, "This button will launch my " + name + " app", Toast.LENGTH_SHORT).show();
    }

}
