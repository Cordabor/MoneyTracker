package loftschool.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddItemActivity extends AppCompatActivity {
    private static final String TAG = "AddItemActivity";
private EditText name;
private EditText price;
private Button addBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_additem);
name = findViewById(R.id.name);
price = findViewById(R.id.price);
addBtn = findViewById(R.id.add_btn);

name.addTextChangedListener(new TextWatcher() {
    @Override
    public void beforeTextChanged(CharSequence s, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence s, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        //Log.i(TAG, "afterTextChanged: "+s);
        addBtn.setEnabled(!TextUtils.isEmpty(s));
    }
});

addBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
String itemName=name.getText().toString();
String itemPrice=price.getText().toString();
    }
});

    }
}