package com.android.provider.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import java.util.Date;

import io.realm.Realm;

public class InsertData extends AppCompatActivity {

    EditText eName, eEmail;

    Realm realm;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.insert_view);

        eName = findViewById(R.id.username);
        eEmail = findViewById(R.id.email);

        Realm.init(this);
        realm = Realm.getDefaultInstance();

        findViewById(R.id.submit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                realm.beginTransaction();

                DataObjek obj = realm.createObject(DataObjek.class);
                obj.setId(new Date().toString());
                obj.setEmail(eEmail.getText().toString());
                obj.setNama(eName.getText().toString());

                realm.commitTransaction();

                Intent i = new Intent(InsertData.this, ViewData.class);
                startActivity(i);
                finish();
            }
        });

    }
}
