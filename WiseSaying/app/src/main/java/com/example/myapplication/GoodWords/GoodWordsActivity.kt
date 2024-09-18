package com.example.myapplication.GoodWords

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.viewbinding.ViewBinding
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityGoodWordsBinding

class GoodWordsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGoodWordsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_good_words)

        val sentenceList = mutableListOf<String>()
        sentenceList.add("검정화면에 대충 흰 글씨 쓰면 명언같다")
        sentenceList.add("아 돌아가기 개 귀찮네")
        sentenceList.add("아 공부하기 싫다")
        sentenceList.add("뭐요")
        sentenceList.add("군대 가야 하네 시부레")
        sentenceList.add("허허")
        sentenceList.add("아 돈이 없네 돈이")
        sentenceList.add("자고 싶다")

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.showAllSentenceBtn.setOnClickListener {
            val intent = Intent(this, SentenceActivity::class.java)
            startActivity(intent)
        }

        binding.goodWordTextArea.setText(sentenceList.random())
    }
}