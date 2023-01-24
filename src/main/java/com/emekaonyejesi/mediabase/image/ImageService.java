package com.emekaonyejesi.mediabase.image;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImageService {
    private final ImageRepository imageRepository;
    @Autowired
    public ImageService(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    public void createImage(Images image){
        imageRepository.save(image);
    }

    public List<Images> getAllImages() {
       return imageRepository.findAll();
    }

    public Optional<Images> getImage(Long imageId ) {
         boolean exists = imageRepository.existsById(imageId);
        if (!exists){
            throw new IllegalStateException("Image with" + imageId + "does not exist in the database");
//
        }
        return imageRepository.findById(imageId);
    }

    public void softDelete(Long imageId) {
        boolean exists = imageRepository.existsById(imageId);
        if (!exists){
            throw new IllegalStateException("Image with" + imageId + "does not exist in the database");
        }
        Optional<Images> image;
        image = imageRepository.findById(imageId);
        image.setIsDeleted(true);


    }
}
