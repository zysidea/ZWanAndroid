package com.zysidea.zwanandroid

import com.zysidea.zwanandroid.model.response.ArticleResponse
import com.zysidea.zwanandroid.model.response.Response
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("https://www.wanandroid.com/article/list/{page}/json")
    fun fetchArticle(@Path("page") page: String): Observable<Response<ArticleResponse>>
}