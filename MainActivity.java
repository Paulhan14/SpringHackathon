package rt.roadtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sendMessage(View view) {
        EditText editText = (EditText)findViewById(R.id.editText2);
        String numberGot = editText.getText().toString();
        //int managerNumber = Integer.parseInt(numberGot);
        Intent i = new Intent(this, Main2Activity.class);
        //i.putExtra("ManagerNumber", numberGot);
        startActivity(i);
    }
}
