package com.example.apirest.repository
import com.example.apirest.data.model.Post
import com.example.apirest.data.remote.RetrofitInstance

class PostRepository {

    suspend fun getPosts(): List<Post> {
        return RetrofitInstance.api.getPosts()
    }

    suspend fun getPost(id: Int) {
        return RetrofitInstance.api.getPost(id)
    }

    suspend fun putPost(id: Int, post: Post) {
        RetrofitInstance.api.putPost(id, post)
    }

    suspend fun deletePost(id: Int) {
        RetrofitInstance.api.deletePost(id)
    }

}