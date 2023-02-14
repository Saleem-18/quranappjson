package com.example.quranappjson;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class QuranAdapter extends RecyclerView.Adapter<QuranAdapter.ViewHolder> {
    private List<QuranData> quranDataList;

    public QuranAdapter(List<QuranData> quranDataList) {
        this.quranDataList = quranDataList;
    }

    public void setData(List<QuranData> quranDataList) {
        this.quranDataList = quranDataList;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_quran, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        QuranData quranData = quranDataList.get(position);
        holder.surahTextView.setText(String.valueOf(quranData.getSurah()));
        holder.parahTextView.setText(String.valueOf(quranData.getParah()));
        holder.ayahTextView.setText(String.valueOf(quranData.getAyah()));
        holder.textTextView.setText(quranData.getText());
    }

    @Override
    public int getItemCount() {
        return quranDataList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView surahTextView;
        TextView parahTextView;
        TextView ayahTextView;
        TextView textTextView;

        ViewHolder(View itemView) {
            super(itemView);
            surahTextView = itemView.findViewById(R.id.surah_text_view);
            parahTextView = itemView.findViewById(R.id.parah_text_view);
            ayahTextView = itemView.findViewById(R.id.ayah_text_view);
            textTextView = itemView.findViewById(R.id.text_text_view);
        }
    }
}

//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.List;
//
//public class QuranAdapter extends RecyclerView.Adapter<QuranAdapter.ViewHolder> {
//    private List<QuranData> quranDataList;
//
//    public QuranAdapter(List<QuranData> quranDataList) {
//        this.quranDataList = quranDataList;
//    }
//
//    @Override
//    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_quran, parent, false);
//        return new ViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(ViewHolder holder, int position) {
//        QuranData quranData = quranDataList.get(position);
//        holder.surahTextView.setText(String.valueOf(quranData.getSurah()));
//        holder.parahTextView.setText(String.valueOf(quranData.getParah()));
//        holder.ayahTextView.setText(String.valueOf(quranData.getAyah()));
//        holder.textTextView.setText(quranData.getText());
//    }
//
//    @Override
//    public int getItemCount() {
//        return quranDataList.size();
//    }
//    public static class ViewHolder extends RecyclerView.ViewHolder {
//        public TextView surahTextView;
//        public TextView parahTextView;
//        public TextView ayahTextView;
//        public TextView textTextView;
//
//        public ViewHolder(View itemView) {
//            super(itemView);
//            surahTextView = itemView.findViewById(R.id.surah_text_view);
//            parahTextView = itemView.findViewById(R.id.parah_text_view);
//            ayahTextView = itemView.findViewById(R.id.ayah_text_view);
//            textTextView = itemView.findViewById(R.id.text_text_view);
//        }
//    }
//}
/*
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class QuranAdapter extends RecyclerView.Adapter<QuranAdapter.QuranViewHolder> {

    private List<QuranData> quranDataList;
    private int selectedTranslation;

    public QuranAdapter(List<QuranData> quranDataList) {
        this.quranDataList = quranDataList;
        selectedTranslation = 0;
    }

    @NonNull
    @Override
    public QuranViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_quran, parent, false);
        return new QuranViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuranViewHolder holder, int position) {
        QuranData quranData = quranDataList.get(position);
        holder.textViewSurah.setText(quranData.getSurah());
        holder.textViewPara.setText(quranData.getParah());
        holder.textViewTranslation.setText(quranData.getTranslation().get(selectedTranslation));
    }

    @Override
    public int getItemCount() {
        return quranDataList.size();
    }

    public void setSelectedTranslation(int selectedTranslation) {
        this.selectedTranslation = selectedTranslation;
    }

    static class QuranViewHolder extends RecyclerView.ViewHolder {

        private TextView textViewSurah;
        private TextView textViewPara;
        private TextView textViewTranslation;

        public QuranViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewSurah = itemView.findViewById(R.id.text_view_surah);
            textViewPara = itemView.findViewById(R.id.text_view_para);
            textViewTranslation = itemView.findViewById(R.id.text_view_translation);
        }
    }
}
*/
