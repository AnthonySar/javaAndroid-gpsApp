package com.opusidea.httpdemo;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface JsonPlaceHolderApi {
    // route pour récupération de la liste des posts
    @GET("posts")
    Call<List<Post>> getPosts();

    @GET("users/{id}/posts")
    Call<List<Post>> getPostsByUser(@Path("id") int userId);

}
