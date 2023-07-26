package com.bespoke.bakes.controller;

import com.bespoke.bakes.domain.Image;
import com.bespoke.bakes.service.ImageService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/image")
public class ImageController {

    private final ImageService imageService;

    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Image createBundle(@RequestBody Image image) {
        return imageService.createImage(image);
    }

    @GetMapping
    public Iterable<Image> getImages() {
        return imageService.getAllImages();
    }

    @GetMapping("/{id}")
    public Image getImageById(@PathVariable("id") Long id) {
        return imageService.findImageById(id);
    }
}
