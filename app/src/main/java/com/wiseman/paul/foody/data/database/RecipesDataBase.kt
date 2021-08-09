package com.wiseman.paul.foody.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.wiseman.paul.foody.data.database.entities.FavoritesEntity
import com.wiseman.paul.foody.data.database.entities.FoodJokeEntity
import com.wiseman.paul.foody.data.database.entities.RecipesEntity

@Database(
    entities = [RecipesEntity::class, FavoritesEntity::class, FoodJokeEntity::class ],
    version = 1,
    exportSchema = false
)
@TypeConverters(RecipesTypeConverter::class)
abstract class RecipesDataBase : RoomDatabase() {
    abstract fun recipesDao(): RecipesDao
}