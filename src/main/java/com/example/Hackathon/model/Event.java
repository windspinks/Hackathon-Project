package com.example.Hackathon.model;
import javax.persistence.*;

@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue
    private int eventId;

    @Column
    private String description;

    @OneToOne
    private User about;

    @OneToOne
    private User createdBy;

    public Event() {
    }

    public Event(String description, User about, User createdBy) {
        this.description = description;
        this.about = about;
        this.createdBy = createdBy;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getAbout() {
        return about;
    }

    public void setAbout(User about) {
        this.about = about;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }
}