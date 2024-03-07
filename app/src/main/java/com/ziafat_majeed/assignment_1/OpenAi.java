package com.ziafat_majeed.assignment_1;

public class OpenAi {
    String title;
    String author;
    String date;
    String description;
    int image;

    public OpenAi() {
    }

    public OpenAi(String title, String author, String date, String description, int image) {
        this.title = title;
        this.author = author;
        this.date = date;
        this.description = description;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
