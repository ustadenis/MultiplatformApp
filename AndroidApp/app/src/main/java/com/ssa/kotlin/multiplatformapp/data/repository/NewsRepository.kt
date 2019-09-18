package com.ssa.kotlin.multiplatformapp.data.repository

/*
import com.ssa.kotlin.multiplatformapp.data.api.NewsApi
import com.ssa.kotlin.multiplatformapp.data.api.mappers.NewsMapper
import kotlinx.coroutines.runBlocking
import models.News
import repository.INewsRepository

class NewsRepository(
    private val newsApi: NewsApi,
    private val newsMapper: NewsMapper
) : INewsRepository {

    override fun retrieveNews(): List<News> {
        return runBlocking {
            newsApi.getNewsAsync().await().articles?.map { newsMapper.map(it) } ?: emptyList()
        }
    }

}*/
