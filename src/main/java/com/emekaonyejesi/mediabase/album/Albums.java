package com.emekaonyejesi.mediabase.album;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table
public class Albums {
    @Id
    @SequenceGenerator(
            name = "album_sequence",
            sequenceName = "album_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "album_sequence"
    )
    Long id;
    private String name;
    private String year;
    private String location;
    private String notes;

    public Albums(){
    }

    public Albums(String name  ,String year, String location, String notes){
        this.name = name;
        this.year = year;
        this.location = location;
        this.notes = notes;
    }

    public Albums(Long id, String name  ,String year, String location, String notes){
        this.id = id;
        this.name = name;
        this.year = year;
        this.location = location;
        this.notes = notes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
