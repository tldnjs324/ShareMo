package com.cookandroid.sharemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView


class PostGloceryActivity : AppCompatActivity() {

    lateinit var post_nickname : TextView
    lateinit var post_dong : TextView
    lateinit var post_content : TextView
    lateinit var post_price : TextView
    lateinit var post_website : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post_glocery)

        //툴바 사용
        setSupportActionBar(findViewById(R.id.toolbar))
        val ab = supportActionBar!!
        ab.setDisplayShowTitleEnabled(false)
        ab.setDisplayHomeAsUpEnabled(true)

        post_nickname = findViewById(R.id.post_Nickname)
        post_content = findViewById(R.id.post_Content)
        post_dong = findViewById(R.id.post_Dong)
        post_price = findViewById(R.id.post_Price)
        post_website = findViewById(R.id.post_Website)



        var intent : Intent = getIntent()

        var post_uid : String? = intent.getStringExtra("UID")

        post_nickname.setText(intent.getStringExtra("NICKNAME"))
        post_content.setText(intent.getStringExtra("CONTENT"))
        post_dong.setText(intent.getStringExtra("DONG"))
        post_price.setText(intent.getStringExtra("PRICE"))
        post_website.setText(intent.getStringExtra("WEBSITE"))

    }

    //툴바 뒤로가기
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        when (id) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}