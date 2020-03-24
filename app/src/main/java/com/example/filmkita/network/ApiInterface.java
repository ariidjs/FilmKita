package com.example.filmkita.network;





import com.example.filmkita.model.Movie;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiInterface {
    @POST(Constant.MOVIE_PATH + "/now_playing")
    Call<Movie> nowPlaying(
            @Query("page") int page);

    @GET(Constant.MOVIE_PATH + "/{movie_id}/similar")
    Call<Movie> similarMovies(
            @Query("page") int page);
}
