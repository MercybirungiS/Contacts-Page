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
            Contacts("Faith Kirabo","0755463963","faithkirabo@gmail.com","https://images.unsplash.com/photo-1593085512500-5d55148d6f0d?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8Y2FydG9vbnxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&w=1000&q=80"),
            Contacts("Kisakye Hesed","0755463963","hesedkisakye@gmail.com","https://bit.ly/3xRHwGu") ,
            Contacts("Mercy Nimzy","0759046393","mercynimzy@gmail.com","https://unsplash.com/photos/HSFv96gTTlE"),
            Contacts("Alli Worthington","0795463963","alliworthington@gmail.com","https://bit.ly/3qmCEq9"),
            Contacts("Yvonne Katama","0790463963","katamayvonne@gmail.com","https://bit.ly/3xRHwGu"),
            Contacts("Wato Taco","07890449083","watotacho@gmail.com","https://bit.ly/3xRHwGu"),
            Contacts("Wato Woto","09000063963","wotowata@gmail.com","https://unsplash.com/photos/HSFv96gTTlE"),
            Contacts("Carol Kyolaba","0759008963","carolkyolaba@gmail.com","https://bit.ly/3xRHwGu"),
            Contacts("Solome Namirimu","0759987763963","solomenamirimu@gmail.com","https://bit.ly/3xRHwGu"),
            Contacts("Leah Nabukeera","07877463963","leahnabukeera@gmail.com","https://bit.ly/3qmCEq9"),
            Contacts("Sophie Atim","0750864443","sophieatim@gmail.com","https://bit.ly/3xRHwGu"),
            Contacts("Shanies Ankunda","0709463963","shaniesankunda@gmail.com","https://bit.ly/3qmCEq9"),
            Contacts("Mark Kirunda","0782463963","markkirunda@gmail.com","https://bit.ly/3qmCEq9"),
            Contacts("Edmund Jonathan","0790763963","edmundmutumba@gmail.com","https://bit.ly/3qmCEq9"),
            Contacts("Sam Kiza","0770463963","samkiza@gmail.com","https://bit.ly/3qmCEq9"),
            Contacts("John Sejom","0709463963","sejomjohn@gmail.com","https://bit.ly/3qmCEq9")

        )
        var contactsAdapter=ContactsAdapter(contactslist,baseContext)
        rvContacts.layoutManager=LinearLayoutManager(baseContext)
        rvContacts.adapter=contactsAdapter
    }
}