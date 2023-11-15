package com.bespoke.bakes.controller;

import com.bespoke.bakes.domain.Image;
import com.bespoke.bakes.domain.dto.ImageDTO;
import com.bespoke.bakes.domain.enums.ImageType;
import com.bespoke.bakes.domain.request.CreateImageRequest;
import com.bespoke.bakes.service.ImageService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/image")
public class ImageController {

    private final ImageService imageService;

    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Image createImage(@RequestBody CreateImageRequest createImageRequest) {
        return imageService.createImage(createImageRequest);
    }

    @GetMapping
    public Iterable<Image> getImages() {
        return imageService.getAllImages();
    }

    @GetMapping("/{id}")
    public Image getImageById(@PathVariable("id") Long id) {
        return imageService.findImageById(id);
    }

    @GetMapping("/type/{imageType}/id/{id}")
    public ImageDTO getImageByTypeAndId(@PathVariable("imageType") ImageType imageType,
                                        @PathVariable("id") Long id) {
        return imageService.findImageByTypeAndId(imageType, id);
    }
}
