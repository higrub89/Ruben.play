package com.ruben.multimedia.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Tests para el controlador de multimedia
 */
@SpringBootTest
@AutoConfigureMockMvc
class MultimediaControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testIndexPage() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"))
                .andExpect(model().attributeExists("videos"))
                .andExpect(model().attributeExists("pageTitle"));
    }

    @Test
    void testVideosPage() throws Exception {
        mockMvc.perform(get("/videos"))
                .andExpect(status().isOk())
                .andExpect(view().name("videos"))
                .andExpect(model().attributeExists("videos"))
                .andExpect(model().attributeExists("pageTitle"));
    }
}
