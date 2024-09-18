package com.example.myapplication.GoodWords

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.R
import com.example.myapplication.listView.ListViewAdapter

class SentenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sentence)

        val sentenceList = mutableListOf<String>()
        sentenceList.add("검정화면에 대충 흰 글씨 쓰면 명언같다")
        sentenceList.add("아 돌아가기 개 귀찮네")
        sentenceList.add("아 공부하기 싫다")
        sentenceList.add("뭐요")
        sentenceList.add("군대 가야 하네 시부레")
        sentenceList.add("허허")
        sentenceList.add("아 돈이 없네 돈이")
        sentenceList.add("자고 싶다")

        val sentenceAdapter = GoodWordsAdapter(sentenceList)
        val listview = findViewById<ListView>(R.id.sentenceListView)

        listview.adapter = sentenceAdapter
    }
}