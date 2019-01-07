package com.android.provider.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import io.realm.Realm;
import io.realm.RealmResults;

public class ViewData extends AppCompatActivity {

    TextView tNama, tEmail;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_view);

        tNama = findViewById(R.id.showNama);
        tEmail = findViewById(R.id.showEmail);

        Realm.init(this);
        Realm realm = Realm.getDefaultInstance();

        RealmResults<DataObjek> results = realm.where(DataObjek.class).findAll();

        for (int i=0; i<results.size();i++){
            tNama.append(results.get(i).getNama());
            tEmail.append(results.get(i).getEmail());
        }

    }
}
