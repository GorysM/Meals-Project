package com.example.mealscwk2

import androidx.room.*
//interface
@Dao
interface UserDAO {
    @Query("Select * from User")
    suspend fun getAll(): List<User>
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUsers(vararg user: User)
    @Insert
    suspend fun insertAll(vararg users: User)
}
