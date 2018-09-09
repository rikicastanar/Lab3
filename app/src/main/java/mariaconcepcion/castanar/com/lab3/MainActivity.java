package mariaconcepcion.castanar.com.lab3;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button constraint = (Button) findViewById(R.id.constraint);
        Button relative = (Button) findViewById(R.id.relative);
        Button linear = (Button) findViewById(R.id.linear);


        constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent constraint = new Intent(getApplicationContext(), constraint.class);
                startActivity(constraint);

            }
        });

        relative.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                Intent relative = new Intent(getApplicationContext(), relative.class);
                startActivity(relative);

            }
        });

        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linear = new Intent(getApplicationContext(), linear.class);
                startActivity(linear);

            }


        });
    }
}