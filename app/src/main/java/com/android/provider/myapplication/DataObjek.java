package com.android.provider.myapplication;

import io.realm.RealmObject;

public class DataObjek extends RealmObject {

    String id;
    String Nama;
    String Email;

    public String getId() {
        return id;
    }

    public String getNama() {
        return Nama;
    }

    public String getEmail() {
        return Email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
