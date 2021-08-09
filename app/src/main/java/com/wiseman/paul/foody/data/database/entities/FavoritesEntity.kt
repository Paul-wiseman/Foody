package com.wiseman.paul.foody.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.wiseman.paul.foody.models.Result
import com.wiseman.paul.foody.util.Constants.Companion.FAVORITE_RECIPES_TABLE

@Entity(tableName = FAVORITE_RECIPES_TABLE)
class  FavoritesEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var result: Result
)