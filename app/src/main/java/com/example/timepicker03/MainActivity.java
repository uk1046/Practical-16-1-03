package com.example.timepicker03;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
/** @noinspection ALL*/
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button showTimeButton = findViewById(R.id.showTimeButton);
    }
    public void showSelectedTime(View view) {
        TimePicker timePicker = findViewById(R.id.timePicker);

        int hour;
        int minute;

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            hour = timePicker.getHour();
            minute = timePicker.getMinute();
        } else {
            hour = timePicker.getCurrentHour();
            minute = timePicker.getCurrentMinute();
        }
        String formattedTime = String.format("%02d:%02d", hour, minute);
        Toast.makeText(this, "Selected Time: " + formattedTime, Toast.LENGTH_SHORT).show();
    }
}