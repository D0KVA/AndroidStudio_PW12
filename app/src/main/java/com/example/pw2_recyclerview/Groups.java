package com.example.pw2_recyclerview;

public class Groups {
    private String groupName;
    private int imageResId;
    private String description;

    public Groups(String groupName, int imageResId, String description) {
        this.groupName = groupName;
        this.imageResId = imageResId;
        this.description = description;
    }

    public String getGroupName() {
        return groupName;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getDescription() {
        return description;
    }
}