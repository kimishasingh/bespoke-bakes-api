package com.bespoke.bakes.mapper;

import com.bespoke.bakes.domain.Image;
import com.bespoke.bakes.domain.dto.ImageDTO;
import com.bespoke.bakes.domain.enums.ImageType;
import com.bespoke.bakes.domain.request.CreateImageRequest;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.sql.SQLException;

@Component
public class ImageMapper {

    public static Image toImage(CreateImageRequest createImageRequest) {
        Image image = new Image();
        byte[] byteData = createImageRequest.getImage().getBytes();
        image.setImage(byteData);
        image.setMatchingId(createImageRequest.getMatchingId());
        image.setImageType(createImageRequest.getImageType().getDescription());
        return image;
    }

    public static ImageDTO toImageDTO(Image image) {
        ImageDTO imageDTO = new ImageDTO();
        imageDTO.setImage(new String(image.getImage(), StandardCharsets.UTF_8));
        imageDTO.setMatchingId(image.getMatchingId());
        imageDTO.setImageType(ImageType.valueOfImageType(image.getImageType()));
        return imageDTO;
    }
}
