package com.jogesh.movies;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
public class Review {
    @Id
    private ObjectId id;
    private String body;

    public Review(){}
    public Review(String body){
        this.body = body;
    }
}
