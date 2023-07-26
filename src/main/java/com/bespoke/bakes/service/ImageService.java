package com.bespoke.bakes.service;

import com.bespoke.bakes.domain.Image;
import com.bespoke.bakes.repository.ImageRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ImageService {

    private final ImageRepository imageRepository;

    public ImageService(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    public Image createImage(Image image) {
        return imageRepository.save(image);
    }

    public Iterable<Image> getAllImages() {
        return imageRepository.findAll();
    }

    public Image findImageById(Long id) {
        Optional<Image> image = imageRepository.findById(id);
        return image.orElse(null);
    }
}
