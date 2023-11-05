package com.bespoke.bakes.mapper;

import com.bespoke.bakes.domain.Image;
import com.bespoke.bakes.domain.request.CreateImageRequest;
import org.springframework.stereotype.Component;

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
}
