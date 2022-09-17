package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Comics
import com.example.models.Hero

interface Repository {
    val heroes: Map<Int, List<Hero>>
    val comics: Map<Int, List<Comics>>

    val comicsPage1: List<Comics>


    val page1: List<Hero>
    val page2: List<Hero>
    val page3: List<Hero>
    val page4: List<Hero>
    val page5: List<Hero>

    suspend fun getAllHeroes(page: Int = 1): ApiResponse
    suspend fun searchHeroes(name: String?): ApiResponse
    suspend fun getComics(page: Int = 1): ApiResponse
}