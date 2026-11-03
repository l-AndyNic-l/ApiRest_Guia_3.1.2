package com.example.apirest.data.remote
import com.example.apirest.data.model.Post
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PUT
import retrofit2.http.Path

interface ApiService {

    @GET("/posts")
    suspend fun getPosts(): List<Post>

    @GET("/posts/{id}")
    suspend fun getPost(@Path("id") id: Int)

    @PUT("/posts/{id}")
    suspend fun putPost(@Path("id") id: Int, @Body post: Post)

    @DELETE("/posts/{id}")
    suspend fun deletePost(@Path("id") id: Int)

}