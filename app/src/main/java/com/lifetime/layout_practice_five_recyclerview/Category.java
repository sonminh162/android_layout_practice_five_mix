package com.lifetime.layout_practice_five_recyclerview;

public class Category {
    int img;
    String text;

    public Category(int img, String text) {
        this.img = img;
        this.text = text;
    }

    public Category() {
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
