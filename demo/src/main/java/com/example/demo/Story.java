package com.example.demo;

import com.querydsl.core.annotations.QueryEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@QueryEntity
@Document
public class Story {
    @Id
    private String id;
    private String text;

    @Field("user")
    private User user;

    public Story() { }

    public Story(String text) {
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(final String text) {
        this.text = text;
    }

    public User getUSer() {
        return user;
    }

    public void setUser(final User user) {
        this.user = user;
    }

}
