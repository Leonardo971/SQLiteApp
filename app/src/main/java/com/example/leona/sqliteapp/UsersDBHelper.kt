package com.example.leona.sqliteapp

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class UsersDBHelper(context: Context): SQLiteOpenHelper(context,DATABASE_NAME,null,DATABASE_VERSION) {

    companion object {
        val DATABASE_VERSION=1
        val DATABASE_NAME="Usuario.db"


        private val SQL_CREATE_ENRTRIES="Create table Usuario("+
                "idUsuario text PRIMARY KEY,"+
                "nomUsuario text" +
                "edadUsuario text)"

        private val SQL_DELETE_ENTRIES ="DROP TABLE IF EXISTS Usuario"
    }

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(SQL_CREATE_ENRTRIES)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL(SQL_DELETE_ENTRIES)
        onCreate(db)
    }
}