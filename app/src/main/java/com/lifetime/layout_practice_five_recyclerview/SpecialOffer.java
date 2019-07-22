package com.lifetime.layout_practice_five_recyclerview;

public class SpecialOffer {
    private int img;
    private String food_name;
    private String food_description;
    private String price;
    private String old_price;

    public SpecialOffer(int img, String food_name, String food_description, String price, String old_price) {
        this.img = img;
        this.food_name = food_name;
        this.food_description = food_description;
        this.price = price;
        this.old_price = old_price;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public String getFood_description() {
        return food_description;
    }

    public void setFood_description(String food_description) {
        this.food_description = food_description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOld_price() {
        return old_price;
    }

    public void setOld_price(String old_price) {
        this.old_price = old_price;
    }
}
