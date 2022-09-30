package com.example.owl

import android.app.Application
import coil.ImageLoader
import coil.ImageLoaderFactory
import coil.compose.AsyncImage
import com.example.owl.ui.utils.UnsplashSizingInterceptor

@Suppress("unused")
class OwlApplication : Application(), ImageLoaderFactory {

    /**
     * Create the singleton [ImageLoader].
     * This is used by [AsyncImage] to load images in the app.
     */
    override fun newImageLoader(): ImageLoader {
        return ImageLoader.Builder(this)
            .components {
                add(UnsplashSizingInterceptor)
            }
            .respectCacheHeaders(false)
            .build()
    }
}
