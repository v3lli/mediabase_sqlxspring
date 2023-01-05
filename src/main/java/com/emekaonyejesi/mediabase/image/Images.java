package com.emekaonyejesi.mediabase.image;


import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name="images")
public class Images {
    @Id
    @SequenceGenerator(
            name = "image_sequence",
            sequenceName = "image_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "image_sequence"
    )

    private Long id;
    private String name;
    private String url;
    private String year;
    private Integer  album_id;
    @Lob
    private ArrayList<String> tags;
    private String location;
    private String notes;

    public Images(){
    }
    public Images( String name, String year ,String url , Integer album_id, String location , String notes){
        this.name = name;
        this.year = year;
        this.url = url;
        this.album_id = album_id;
        this.location = location;
        this.notes = notes;
    }

    public Images( Long id, String name, String year ,String url, Integer album_id, String location , String notes){
        this.id = id;
        this.name = name;
        this.url = url;
        this.year = year;
        this.album_id = album_id;
        this.location = location;
        this.notes = notes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(Integer album_id) {
        this.album_id = album_id;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

}
