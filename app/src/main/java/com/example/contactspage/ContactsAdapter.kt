package com.example.contactspage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactsAdapter(var contactslist:List<Contacts>):RecyclerView.Adapter<ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
      var itemView=LayoutInflater.from(parent.context)
          .inflate(R.layout.contacts_lists_item,parent,false)
        return ContactsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
      var contact=contactslist.get(position)
        holder.tvName.text=contact.name
        holder.tvPhoneNumber.text=contact.phoneNumber
        holder.tvEmail.text=contact.email

    }

    override fun getItemCount(): Int {
        return contactslist.size

    }
}

class ContactsViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvPhoneNumber=itemView.findViewById<TextView>(R.id.tvContact)
    var tvEmail=itemView.findViewById<TextView>(R.id.tvEmail)
}