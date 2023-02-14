//
package com.example.quranappjson;

import com.google.gson.annotations.SerializedName;

public class QuranData {
    @SerializedName("surah_number")
    private int surah_number;
    @SerializedName("surah_name")
    private String surah_name;


//    @SerializedName("englishNameTranslation")
//    private String englishNameTranslation;

    @SerializedName("juz")
    private int juz;

    @SerializedName("revelationType")
    private String revelationType;

    @SerializedName("ayah")
    private int ayah;

    @SerializedName("text")
    private String text;

    public QuranData(String surah_name,int surah_number,int juz, String revelationType ,int ayah, String text) {
        this.surah_name = surah_name;
        this.surah_number=surah_number;
//        this.englishNameTranslation=englishNameTranslation;
        this.juz = juz;
        this.revelationType=revelationType;
        this.ayah = ayah;
        this.text = text;
    }

    public String getSurah() {
        return surah_name;
    }

    public int getParah() {
        return juz;
    }

    public String getAyah() {
        return revelationType;
    }

    public String getText() {
        return text;
    }


//    @Override
//    public boolean equals(@Nullable String obj) {
//        return this.surah_name.equals(obj);
//    }

    @Override
    public String toString() {
        return "QuranData{" +
                "surah_name=" + surah_name +
                ", parah=" + juz +
                ", ayah=" + ayah +
                ", text='" + text + '\'' +
                '}';
    }
}
/*
import com.google.gson.annotations.SerializedName;

public class QuranData {
    @SerializedName("surah")
    private int surah;

    @SerializedName("parah")
    private int parah;

    @SerializedName("translation")
    private String translation;

    public QuranData(int surah, int parah, String translation) {
        this.surah = surah;
        this.parah = parah;
        this.translation = translation;
    }

    public int getSurah() {
        return surah;
    }

    public int getParah() {
        return parah;
    }

    public String getTranslation() {
        return translation;
    }
}
*/
