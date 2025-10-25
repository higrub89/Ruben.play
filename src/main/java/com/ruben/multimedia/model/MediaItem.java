package com.ruben.multimedia.model;

/**
 * Modelo para representar un elemento multimedia (video o audio)
 */
public class MediaItem {
    private String title;
    private String description;
    private String url;
    private String type;

    public MediaItem(String title, String description, String url, String type) {
        this.title = title;
        this.description = description;
        this.url = url;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
