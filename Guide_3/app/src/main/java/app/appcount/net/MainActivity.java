package app.appcount.net;


import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    private TextView tv1;
    private int number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView)findViewById(R.id.txadd);
    }
    public void add(View v){
        number++;
        if(number > 9){
            number = 0;
        }
        tv1.setText(String.valueOf(number));
    }
    @Override
    public void onSaveInstanceState(Bundle outState){
        outState.putInt("saved", number);
        super.onSaveInstanceState(outState);
    }
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        number = savedInstanceState.getInt("saved");
        tv1.setText(String.valueOf(number));
    }




}