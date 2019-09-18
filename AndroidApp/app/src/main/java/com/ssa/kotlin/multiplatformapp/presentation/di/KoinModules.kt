package com.ssa.kotlin.multiplatformapp.presentation.di

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.ssa.kotlin.multiplatformapp.data.api.INewsApi
import com.ssa.kotlin.multiplatformapp.data.api.NewsApi
/*import com.ssa.kotlin.multiplatformapp.data.api.mappers.NewsMapper
import com.ssa.kotlin.multiplatformapp.data.repository.NewsRepository
import interactor.NewsInteractor*/
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
/*import repository.INewsRepository*/
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import ssa.com.data.api.converter.UnitConverterFactory
import timber.log.Timber
import java.util.concurrent.TimeUnit

private val applicationModule = module {
    single { gson() }
    single { okHttp() }
    single { retrofit(get(), get()) }
    single { NewsApi(get()) }
}

private val apiModule = module {
    factory { get<Retrofit>().create(INewsApi::class.java) }
}

private val viewModelsModule = module {

}

private val interactorModule = module {
/*    factory { NewsInteractor(get()) }*/
}

private val repositoryModule = module {
/*    single { NewsRepository(get(), get()) as INewsRepository }*/
}

private val mapperModule = module {
/*    factory { NewsMapper() }*/
}

val modules = listOf(
    applicationModule,
    apiModule,
    viewModelsModule,
    interactorModule,
    repositoryModule,
    mapperModule
)

fun okHttp(): OkHttpClient {
    val logging = HttpLoggingInterceptor { Timber.d(it) }

    logging.level = HttpLoggingInterceptor.Level.BODY

    return OkHttpClient.Builder()
        .addInterceptor(logging)
        .connectTimeout(30, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .writeTimeout(30, TimeUnit.SECONDS)
        .build()
}

private fun gson() = GsonBuilder().setDateFormat("dd.MM.yyyy HH:mm").create()

fun retrofit(okHttpClient: OkHttpClient, gson: Gson)
        : Retrofit = Retrofit.Builder()
    .addCallAdapterFactory(CoroutineCallAdapterFactory())
    .addConverterFactory(UnitConverterFactory)
    .addConverterFactory(GsonConverterFactory.create(gson))
    .client(okHttpClient)
    .baseUrl(BASE_URL)
    .build()

const val BASE_URL = "https://newsapi.org/v2/"