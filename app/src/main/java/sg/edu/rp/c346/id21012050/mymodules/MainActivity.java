package sg.edu.rp.c346.id21012050.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView C218;
    TextView C206;
    TextView G953;
    TextView C346;
    TextView C203;
    TextView C235;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        C218 = findViewById(R.id.c218);
        C206 = findViewById(R.id.c206);
        G953 = findViewById(R.id.g953);
        C346 = findViewById(R.id.c346);
        C203 = findViewById(R.id.c203);
        C235 = findViewById(R.id.c235);

        C218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("module", "C218");
                intent.putExtra("name", "UI/UX Design for Apps");
                intent.putExtra("year","2022");
                intent.putExtra("semester","1");
                intent.putExtra("credit","4");
                intent.putExtra("venue","E66B");
                startActivity(intent);
            }
        });

        C206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("module", "C206");
                intent.putExtra("name", "Software Development Process");
                intent.putExtra("year","2022");
                intent.putExtra("semester","1");
                intent.putExtra("credit","4");
                intent.putExtra("venue","E66K");
                startActivity(intent);
            }
        });

        G953.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("module", "G953");
                intent.putExtra("name", "Life Skills III");
                intent.putExtra("year","2022");
                intent.putExtra("semester","1");
                intent.putExtra("credit","4");
                intent.putExtra("venue","HB01");
                startActivity(intent);
            }
        });

        C346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("module", "C346");
                intent.putExtra("name", "Mobile App Programming");
                intent.putExtra("year","2022");
                intent.putExtra("semester","1");
                intent.putExtra("credit","4");
                intent.putExtra("venue","E62E");
                startActivity(intent);
            }
        });

        C203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("module", "C203");
                intent.putExtra("name", "Web Appln Development in php");
                intent.putExtra("year","2022");
                intent.putExtra("semester","1");
                intent.putExtra("credit","4");
                intent.putExtra("venue","W65H");
                startActivity(intent);
            }
        });

        C235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("module", "C235");
                intent.putExtra("name", "IT Security and Management");
                intent.putExtra("year","2022");
                intent.putExtra("semester","1");
                intent.putExtra("credit","4");
                intent.putExtra("venue","E65H");
                startActivity(intent);
            }
        });

    }
}