package com.ziafat_majeed.assignment_1;


import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class OpenAiViewHolder extends RecyclerView.ViewHolder {
    ImageView image ;
    TextView title;
    TextView author;
    TextView date;
    LinearLayout post;
    public OpenAiViewHolder(@NonNull View itemView) {
        super(itemView);
        image=itemView.findViewById(R.id.image);
        title=itemView.findViewById(R.id.title);
        author=itemView.findViewById(R.id.author);
        date=itemView.findViewById(R.id.date);
        post=itemView.findViewById(R.id.post);
    }
}
