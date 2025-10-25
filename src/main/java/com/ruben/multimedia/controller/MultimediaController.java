package com.ruben.multimedia.controller;

import com.ruben.multimedia.model.MediaItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Controlador para la página de multimedia
 */
@Controller
public class MultimediaController {

    @GetMapping("/")
    public String index(Model model) {
        List<MediaItem> videos = getSampleVideos();
        model.addAttribute("videos", videos);
        model.addAttribute("pageTitle", "Ruben.play - Página de Multimedia");
        return "index";
    }

    @GetMapping("/videos")
    public String videos(Model model) {
        List<MediaItem> videos = getSampleVideos();
        model.addAttribute("videos", videos);
        model.addAttribute("pageTitle", "Videos - Ruben.play");
        return "videos";
    }

    /**
     * Obtiene una lista de videos de ejemplo
     */
    private List<MediaItem> getSampleVideos() {
        List<MediaItem> videos = new ArrayList<>();
        
        videos.add(new MediaItem(
            "Video de ejemplo 1",
            "Este es un video de demostración",
            "https://www.w3schools.com/html/mov_bbb.mp4",
            "video"
        ));
        
        videos.add(new MediaItem(
            "Video de ejemplo 2",
            "Otro video de demostración",
            "https://www.w3schools.com/html/movie.mp4",
            "video"
        ));
        
        return videos;
    }
}
