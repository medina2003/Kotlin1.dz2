package com.example.hw2kotlin1

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.URLUtil
import android.widget.Toast
import androidx.core.net.toUri
import com.bumptech.glide.Glide
import com.example.hw2kotlin1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var listURI: ArrayList<Uri> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        shit()

        binding.btnGo.setOnClickListener {

            val url = Uri.parse(binding.etText.text.toString())

            if (URLUtil.isValidUrl(url.toString())) {

                Glide.with(this)
                    .load(url)
                    .into(binding.ivImage)
                listURI.add(Uri.parse(binding.etText.text.toString()))
                Toast.makeText(this, getString(R.string.success), Toast.LENGTH_SHORT).show()

            } else {

                Toast.makeText(this, getString(R.string.valid_url), Toast.LENGTH_SHORT).show()

            }
        }

        binding.btnRandom.setOnClickListener {

            val random = (0 until listURI.size).random()

            Glide.with(this)
                .load(listURI[random])
                .into(binding.ivImage)

        }
    }

    fun shit() {
        listURI.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTpRfgPYpG--9llYLocQGJHlEpz4VZ_zDVjeQ&usqp=CAU".toUri())
        listURI.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTtg5xOasjdPnipI-PAglg1U2Ss8D2hm9fwGQ&usqp=CAU".toUri())
        listURI.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS_JJcSX7vtKiIhY1tVl080JJS__X9bUKLZ_Q&usqp=CAU".toUri())
        listURI.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTpRfgPYpG--9llYLocQGJHlEpz4VZ_zDVjeQ&usqp=CAU".toUri())
        listURI.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTtg5xOasjdPnipI-PAglg1U2Ss8D2hm9fwGQ&usqp=CAU".toUri())
        listURI.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS_JJcSX7vtKiIhY1tVl080JJS__X9bUKLZ_Q&usqp=CAU".toUri())
        listURI.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTpRfgPYpG--9llYLocQGJHlEpz4VZ_zDVjeQ&usqp=CAU".toUri())
        listURI.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS_JJcSX7vtKiIhY1tVl080JJS__X9bUKLZ_Q&usqp=CAU".toUri())
        listURI.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTtg5xOasjdPnipI-PAglg1U2Ss8D2hm9fwGQ&usqp=CAU".toUri())



    }
}