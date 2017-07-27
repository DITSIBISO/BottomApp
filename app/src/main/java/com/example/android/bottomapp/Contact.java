package com.example.android.bottomapp;

/**
 * Created by eKasiLab Alex CDTB on 2017/07/24.
 */

public class Contact {

    private String title;
    private String Tembisa;
    private String Gauteng;
    private String Lebogang;


    public Contact() {

    }
    public Contact(String tittle, String tembisa, String gauteng, String lebogang) {
        title = title;
        Tembisa = tembisa;
        Gauteng = gauteng;
        Lebogang = lebogang;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTembisa() {
        return Tembisa;
    }

    public void setTembisa(String tembisa) {
        Tembisa = tembisa;
    }

    public String getGauteng() {
        return Gauteng;
    }

    public void setGauteng(String gauteng) {
        Gauteng = gauteng;
    }

    public String getLebogang() {
        return Lebogang;
    }

    public void setLebogang(String lebogang) {
        Lebogang = lebogang;
    }
}


