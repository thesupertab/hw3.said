package com.example.hw3said;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    private TextView tvName;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        this.tvName = tvName;
    }

    public void onBind(String contactName){
        tvName.setText(contactName);
    }
}
