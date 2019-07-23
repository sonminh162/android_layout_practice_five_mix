package com.lifetime.layout_practice_five_recyclerview;

public class VpObject {
    private int icon;
    private String name;
    private String description;
    private String content;

    public VpObject(int icon, String name, String description, String content) {
        this.icon = icon;
        this.name = name;
        this.description = description;
        this.content = content;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
