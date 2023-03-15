package com.emekaonyejesi.mediabase.image;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/images")
public class ImageController {
    private final ImageService imageService;
    @Autowired
    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }
    @PostMapping
    public void createImages(@RequestBody Images image){
        imageService.createImage(image);
    }
    @GetMapping
    public List<Images> getImages(){
       return imageService.getAllImages();
    }
    @GetMapping(path = "{imageId}")
    public Optional<Images> getImage(@PathVariable("imageId") Long imageId){
        return imageService.getImage(imageId);
    }
    @PutMapping(path = {"imageId"})
    public Optional<Images> softDelete(@PathVariable("imageId") Long imageId){
        imageService.softDelete(imageId);
        return null;
    }

}
