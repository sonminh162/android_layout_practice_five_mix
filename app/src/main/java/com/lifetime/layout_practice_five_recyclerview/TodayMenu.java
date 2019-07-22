package com.lifetime.layout_practice_five_recyclerview;

public class TodayMenu {
    private int img;
    private String event_name;
    private String event_description;
    private String content;

    public TodayMenu(){
    }

    public TodayMenu(int img, String event_name, String event_description, String content) {
        this.img = img;
        this.event_name = event_name;
        this.event_description = event_description;
        this.content = content;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public String getEvent_description() {
        return event_description;
    }

    public void setEvent_description(String event_description) {
        this.event_description = event_description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
