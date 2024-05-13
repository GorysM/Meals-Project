package com.example.mealscwk2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val db = Room.databaseBuilder(this, AppDatabase::class.java,
            "mydatabase").build()
        val userDao = db.userDao()


        runBlocking {
            launch {

        val user = User(1, "John", "Smith")
        val user2 = User(2, "Helen", "Jones")
        val user3 = User(3, "Mary", "Popkins")
        userDao.insertUsers(user, user2, user3)
        val users: List<User> = userDao.getAll()
                for (u in users) {
                    print(" ${u.firstName} ${u.lastName}\n")
                }
        }
}
//        var URL = "www.themealdb.com/api/json/v1/1/lookup.php?i=52772"


        }
    }
