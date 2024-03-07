package com.ziafat_majeed.assignment_1;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;

import java.util.List;

public class OpenAiAdapter extends RecyclerView.Adapter<OpenAiViewHolder> {

    Context context;
    List<OpenAi> data;

    public OpenAiAdapter(Context context, List<OpenAi> data) {
        this.context = context;
        this.data = data;
    }

    public OpenAiAdapter(MainActivity context, List articleList) {

    }

    @NonNull
    @Override
    public OpenAiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_article,parent,false);
        return new OpenAiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OpenAiViewHolder holder, int position) {
        OpenAi article=data.get(position);
        holder.author.setText(article.getAuthor());
        holder.date.setText(article.getDate());
        holder.title.setText(article.getTitle());
        holder.image.setImageResource(article.getImage());
        holder.post.setOnClickListener(v -> {
            Intent intent=new Intent(context, OpenAiDetailsActivity.class);
            intent.putExtra("data",new Gson().toJson(article));
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
