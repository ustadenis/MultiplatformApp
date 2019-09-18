package com.ssa.kotlin.multiplatformapp.data.api

import com.ssa.kotlin.multiplatformapp.data.api.models.NewsResponse
import kotlinx.coroutines.Deferred
import retrofit2.http.GET

class NewsApi(
    private val newsApi: INewsApi
) : INewsApi by newsApi

interface INewsApi {
    @GET("everything?q=bitcoin&from=2019-08-10&sortBy=publishedAt&apiKey=d2cb4413e0024edeabe6c45d7844c291")
    fun getNewsAsync(): Deferred<NewsResponse>
}