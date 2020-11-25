package com.bezkoder.spring.data.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Sharded;

@Document(collection = "tutorials")
@Sharded(shardKey = { "region", "title" })
public class Tutorial {
  @Id
  private String id;

  private String region;
  private String title;
  private String description;
  private boolean published;

  public Tutorial() {

  }

  public Tutorial(String region, String title, String description, boolean published) {
    this.region = region;
    this.title = title;
    this.description = description;
    this.published = published;
  }

  public String getId() {
    return id;
  }

  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean isPublished() {
    return published;
  }

  public void setPublished(boolean isPublished) {
    this.published = isPublished;
  }

  @Override
  public String toString() {
    return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
  }
}
