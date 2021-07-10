package com.okom.contactapp.db

import android.content.Context
import android.content.SyncContext
import android.os.strictmode.InstanceCountViolation
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlin.contracts.Returns

@Database(entities = [UserEntity::class] ,version = 1)
abstract class RoomDbApp:RoomDatabase(){

    abstract fun userDao():UserDao?

    companion object {
        private var INSTANCE: RoomDbApp? = null

        fun getAppDatabase(context: Context): RoomDbApp? {

            if(INSTANCE == null) {

                INSTANCE = Room.databaseBuilder<RoomDbApp>(
                    context.applicationContext,RoomDbApp::class.java, "AppDB")
                    .allowMainThreadQueries()
                    .build()

            }
            return INSTANCE


        }
    }
}