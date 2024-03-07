package com.ziafat_majeed.assignment_1;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    OpenAiAdapter adapter;
    List<OpenAi> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data=getArticlesData();
        adapter=new OpenAiAdapter((Context) this,data);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }

    private List<OpenAi> getArticlesData() {
        List<OpenAi> articles=new ArrayList<>();
        OpenAi article=new OpenAi(
                "Building an early warning system for LLM-aided biological threat creation",
                "Ziafat Majeed",
                "Mar 11, 2024",
                "This work is part of our ongoing research into aligning advanced AI systems, which is key to our mission. As we train our models to do increasingly complex tasks, making informed evaluations of the models’ outputs will become increasingly difficult for humans. This makes it harder to detect subtle problems in model outputs that could lead to negative consequences when these models are deployed. Therefore we want our ability to evaluate our models to increase as their capabilities increase.",
                R.drawable.a
        );
        articles.add(article);
        article=new OpenAi(
                "Weak-to-strong generalization",
                "Ammar Wahab",
                "FEB 21, 2024",
                "Our current approach to this problem is to empower humans to evaluate machine learning model outputs using assistance from other models. In this case, to evaluate book summaries we empower humans with individual chapter summaries written by our model, which saves them time when evaluating these summaries relative to reading the source text. Our progress on book summarization is the first large-scale empirical work on scaling alignment techniques.",
                R.drawable.b
        );
        articles.add(article);
        article=new OpenAi(
                " ",
                " Shahbaz Abbas",
                "FEB 21, 2024",
                "Contrastive models like CLIP have been shown to learn robust representations of images that capture both semantics and style. To leverage these representations for image generation, we propose a two-stage model: a prior that generates a CLIP image embedding given a text caption, and a decoder that generates an image conditioned on the image embedding. We show that explicitly generating image representations improves image diversity with minimal loss in photorealism and caption similarity. Our decoders conditioned on image representations can also produce variations of an image that preserve both its semantics and style, while varying the non-essential details absent from the image representation.",
                R.drawable.c
        );
        articles.add(article);
        article=new OpenAi(
                "Practices for Governing Agentic AI Systems",
                " Farhan Ali",
                "FEB 21, 2024",
                "Our decoders conditioned on image representations can also produce variations of an image that preserve both its semantics and style, while varying the non-essential details absent from the image representation. Moreover, the joint embedding space of CLIP enables language-guided image manipulations in a zero-shot fashion. We use diffusion models for the decoder and experiment with both autoregressive and diffusion models for the prior, finding that the latter are computationally more efficient and produce higher-quality samples.",
                R.drawable.d
        );
        articles.add(article);
        article = new OpenAi(
                "Pioneering research on the path to AGI",
                " Naeem Ali",
                "FEB 10, 2024",
                "An embedding is a sequence of numbers that represents the concepts within content such as natural language or code. Embeddings make it easy for machine learning models and other algorithms to understand the relationships between content and to perform tasks like clustering or retrieval. They power applications like knowledge retrieval in both ChatGPT and the Assistants API, and many retrieval augmented generation (RAG) developer tools.",
                R.drawable.a
        );
        articles.add(article);

        return articles;
    }
}