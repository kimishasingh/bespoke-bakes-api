package com.bespoke.bakes.service;

import com.bespoke.bakes.domain.Image;
import com.bespoke.bakes.domain.dto.ImageDTO;
import com.bespoke.bakes.domain.enums.ImageType;
import com.bespoke.bakes.domain.request.CreateImageRequest;
import com.bespoke.bakes.mapper.ImageMapper;
import com.bespoke.bakes.repository.ImageRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Optional;

@Service
public class ImageService {

    private final ImageRepository imageRepository;

    public ImageService(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    public Image createImage(CreateImageRequest createImageRequest) {
        Image image = ImageMapper.toImage(createImageRequest);
        return imageRepository.save(image);
    }

    public Iterable<Image> getAllImages() {
        return imageRepository.findAll();
    }

    public Image findImageById(Long id) {
        Optional<Image> image = imageRepository.findById(id);
        return image.orElse(null);
    }

    public ImageDTO findImageByTypeAndId(ImageType imageType, Long id) {
        List<Image> images = imageRepository.findByImageTypeAndMatchingId(imageType.getDescription(), id);
        if (!CollectionUtils.isEmpty(images)) {
            return ImageMapper.toImageDTO(images.get(0));
        }
        return null;
    }
}
