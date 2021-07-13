package com.example.monstarlab.movie;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "Favorites")
public class Favorite {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    @Column(name="movie_id")
    private Long movieId;
    @Column(name="date_added", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date dateAdded;
    @Column(name="user_id")
    private int userId;

    public Favorite() {
    }

    public Favorite(Long movieId, Date dateAdded, int userId) {
        this.movieId = movieId;
        this.dateAdded = dateAdded;
        this.userId = userId;
    }

    public Favorite(Long id, Long movieId, Date dateAdded, int userId) {
        this.id = id;
        this.movieId = movieId;
        this.dateAdded = dateAdded;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Favorites{" +
                "id=" + id +
                ", movieId=" + movieId +
                ", dateAdded=" + dateAdded +
                ", userId=" + userId +
                '}';
    }
}
