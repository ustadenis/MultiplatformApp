package com.ssa.kotlin.multiplatformapp.presentation.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.ssa.kotlin.multiplatformapp.R
/*import interactor.NewsInteractor*/
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.koin.android.ext.android.inject
import timber.log.Timber

class MainActivity : AppCompatActivity() {

/*    private val adapter: NewsAdapter by lazy { NewsAdapter() }*/

/*    private val newsInteractor: NewsInteractor by inject()*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)

/*        recyclerView.adapter = adapter*/
        recyclerView.layoutManager = LinearLayoutManager(this)

/*        lifecycleScope.launch(Dispatchers.IO + CoroutineExceptionHandler { _, e ->
            Timber.e(e)
        }) {
            val news = newsInteractor.retrieveNews()
            withContext(Dispatchers.Main) {
                adapter.data = news
            }
        }*/
    }

}
