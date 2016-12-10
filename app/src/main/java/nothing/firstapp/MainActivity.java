package nothing.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView titleTexts,centerText;
    Button pushButtons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Defining our views and their references
        titleTexts = (TextView) findViewById(R.id.titleText);
        //centerText = (TextView) findViewById(R.id.centerText);

        // Buttons that we're going to use in our app
        pushButtons = (Button) findViewById(R.id.submitButton);

        // This is the Method to Execute in Button
        pushButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setThisMethod();
            }
        });
    }

    public void setThisMethod(){
        //This is View That we're doing
        titleTexts.setText("We just Pushed This Button");
        //centerText.setText("");
    }
}
