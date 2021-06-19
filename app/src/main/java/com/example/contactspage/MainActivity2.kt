package com.example.contactspage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        displayContacts()
    }
    fun displayContacts(){
        var rvContacts=findViewById<RecyclerView>(R.id.rvContacts)
        var contactslist= listOf(
            Contacts("Faith Kirabo","0755463963","faithkirabo@gmail.com"),
            Contacts("Kisakye Hesed","0755463963","hesedkisakye@gmail.com") ,
            Contacts("Mercy Nimzy","0759046393","mercynimzy@gmail.com"),
            Contacts("Alli Worthington","0795463963","alliworthington@gmail.com"),
            Contacts("Yvonne Katama","0790463963","katamayvonne@gmail.com"),
            Contacts("Wato Taco","07890449083","watotacho@gmail.com"),
            Contacts("Wato Woto","09000063963","wotowata@gmail.com"),
            Contacts("Carol Kyolaba","0759008963","carolkyolaba@gmail.com"),
            Contacts("Solome Namirimu","0759987763963","solomenamirimu@gmail.com"),
            Contacts("Leah Nabukeera","07877463963","leahnabukeera@gmail.com"),
            Contacts("Sophie Atim","0750864443","sophieatim@gmail.com"),
            Contacts("Shanies Ankunda","0709463963","shaniesankunda@gmail.com"),
            Contacts("Mark Kirunda","0782463963","markkirunda@gmail.com"),
            Contacts("Edmund Jonathan","0790763963","edmundmutumba@gmail.com"),
            Contacts("Sam Kiza","0770463963","samkiza@gmail.com"),
            Contacts("John Sejom","0709463963","sejomjohn@gmail.com")

        )
        var contactsAdapter=ContactsAdapter(contactslist)
        rvContacts.layoutManager=LinearLayoutManager(baseContext)
        rvContacts.adapter=contactsAdapter
    }
}