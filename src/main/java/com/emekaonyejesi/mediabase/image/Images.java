package com.emekaonyejesi.mediabase.image;


import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table
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
    private String year;
    private String album_id;
    @Lob
    private ArrayList<String> tags;
    private String location;
    private String notes;

    public Images(){
    }
    public Images( String name, String year ,String album_id, String location , String notes){
        this.name = name;
        this.year = year;
        this.album_id = album_id;
        this.location = location;
        this.notes = notes;
    }

    public Images( Long id, String name, String year ,String album_id, String location , String notes){
        this.id = id;
        this.name = name;
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

    public String getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(String album_id) {
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
