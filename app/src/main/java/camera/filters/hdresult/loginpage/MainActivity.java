package camera.filters.hdresult.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name,password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.etUserName);
        login=findViewById(R.id.btnLogin);
        password=findViewById(R.id.etPassword);

    }
    public void onLogin(View view){
        String username = name.getText().toString();
        String userPassword= password.getText().toString();
        String type = "login";
        backgroundworker bckgrnd = new backgroundworker(this);
        bckgrnd.execute(type,username,userPassword);
    }
}
