package cvv.udacity.portfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(R.string.activity_title);
    }

    public void onButtonClicked(View v) {
        Button btn = (Button) v;
        Toast.makeText(this, getString(R.string.toast_message, btn.getText()), Toast.LENGTH_SHORT).show();
    }
}
