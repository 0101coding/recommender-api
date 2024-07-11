package io.datajek.springbootdemo.recommender_api;

import java.util.Arrays;
import java.util.List;


public class Movie {
    int id;
    String name;
    double rating;
  
    public Movie() {
    }
  
    public Movie(int id, String name, double rating) {
      super();
      this.id = id;
      this.name = name;
      this.rating = rating;
    }
  
    public int getId() {
      return id;
    }
  
    public String getName() {
      return name;
    }
  
    public double getRating() {
      return rating;
    }


    public List<Movie> getAllMovies() {
    return Arrays.asList(new Movie(1, "Ice Age", 7.5),   
                            new Movie(2, "Happy Feet", 6.4), 
                            new Movie(3, "Shark Tales", 6.0) );
    }
  
    @Override
    public String toString() {
      return "Movie [id=" + id + ", name=" + name + ", rating=" + rating + "]";
    }
  }
