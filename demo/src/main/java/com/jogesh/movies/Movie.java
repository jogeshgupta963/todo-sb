package com.jogesh.movies;

import java.util.List;


import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
@Document(collection = "movies")

public class Movie {


  @Id
  private ObjectId id;
  
  private String imdbId;
  private String title;
  private String releasedDate;
  private String trailerDate;
  private String poster;
  private List<String> genres ;
  private List<String> backdrops ;
  @DocumentReference
  private List<Review> reviewIds;

  public Movie(){}
  public Movie( String imdbId,String title,String releasedDate,String trailerDate,String poster ){
    this.imdbId = imdbId;
    this.title = title;
    this.releasedDate = releasedDate;
    this.trailerDate = trailerDate;
    this.poster = poster;
  }

}
