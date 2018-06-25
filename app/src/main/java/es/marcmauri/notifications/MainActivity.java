package es.marcmauri.notifications;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.editTextTitle) EditText editTextTitle;
    @BindView(R.id.editTextMessage) EditText editTextMessage;
    @BindView(R.id.switchImportance) Switch switchImportance;

    private boolean isHighImportance = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this); // Right after setContentView
    }

    @OnClick(R.id.buttonSend)
    public void click() {
        sendNotification();
    }

    @OnCheckedChanged(R.id.switchImportance)
    public void change(CompoundButton compoundButton, boolean isChecked) {
        isHighImportance = isChecked;
    }

    private void sendNotification() {
        //
    }
}
