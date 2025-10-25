package com.ruben.multimedia.model;

/**
 * Modelo para representar un elemento multimedia (video o audio)
 * 
 * Esta clase encapsula la información de un elemento multimedia que puede
 * ser mostrado en la interfaz web de Ruben.play.
 * 
 * @author Ruben
 * @version 1.0
 */
public class MediaItem {
    /** Título del elemento multimedia */
    private String title;
    
    /** Descripción del contenido multimedia */
    private String description;
    
    /** URL del archivo multimedia */
    private String url;
    
    /** Tipo de multimedia (video, audio, etc.) */
    private String type;

    /**
     * Constructor para crear un nuevo elemento multimedia
     * 
     * @param title Título del elemento
     * @param description Descripción del contenido
     * @param url URL del archivo multimedia
     * @param type Tipo de multimedia (video, audio, etc.)
     */
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
