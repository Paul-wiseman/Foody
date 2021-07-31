package com.wiseman.paul.foody.util

import androidx.recyclerview.widget.DiffUtil
import com.wiseman.paul.foody.models.Result

class FoodRecipeDiffUtil(
    private val oldResult: List<Result>,
    private val newResult: List<Result>
): DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return oldResult.size
    }

    override fun getNewListSize(): Int {
        return newResult.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
       return oldResult[oldItemPosition] === newResult[newItemPosition]
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldResult[oldItemPosition] == newResult[newItemPosition]
    }
}