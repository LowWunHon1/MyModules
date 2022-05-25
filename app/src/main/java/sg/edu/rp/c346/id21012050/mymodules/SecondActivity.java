package sg.edu.rp.c346.id21012050.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView code;
    TextView name;
    TextView year;
    TextView Semester;
    TextView credit;
    TextView Venue;
    Button Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        code = findViewById(R.id.moduleCode);
        name = findViewById(R.id.moduleName);
        year = findViewById(R.id.academicYear);
        Semester = findViewById(R.id.semester);
        credit = findViewById(R.id.moduleCredit);
        Venue = findViewById(R.id.venue);
        Back = findViewById(R.id.back);

        Intent intentReceived = getIntent();

        String ModuleCode = intentReceived.getStringExtra("module");
        code.setText("Module Code: " + ModuleCode);

        String ModuleName = intentReceived.getStringExtra("name");
        name.setText("Module Name: " + ModuleName);

        int AcademicYear = intentReceived.getIntExtra("year",2022);
        year.setText("Academic Year: " + AcademicYear);

        int SchoolSemester = intentReceived.getIntExtra("semester",1);
        Semester.setText("Semester: " + SchoolSemester);

        int ModuleCredit = intentReceived.getIntExtra("credit",4);
        credit.setText("Module Credit: " + ModuleCredit);

        String ModuleVenue = intentReceived.getStringExtra("venue");
        Venue.setText("Venue: " + ModuleVenue);

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}