package edu.itsco.miagendaapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import edu.itsco.miagendaapp.R
import edu.itsco.miagendaapp.modelos.Contacto

class ContactosAdapters(private val ListaContactos: ArrayList<Contacto>):
RecyclerView.Adapter<ContactosAdapters.ViewHolder>()
{
    class ViewHolder(view:View):RecyclerView.ViewHolder(view){
        val lbNombre: TextView
        val lbTelefono: TextView
        init{
            lbNombre=view.findViewById(R.id.lb_nombre)
            lbTelefono=view.findViewById(R.id.lb_telefono)
        }
    }


    override fun onCreateViewHolder(        parent: ViewGroup,        viewType: Int    ): ContactosAdapters.ViewHolder {
      val view=LayoutInflater.from(parent.context).inflate(R.layout.contacto_item,parent,false)
       return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactosAdapters.ViewHolder, position: Int) {
        holder.lbNombre.text=ListaContactos[position].nombre
        holder.lbTelefono.text=ListaContactos[position].telefono
    }

    override fun getItemCount(): Int {
      return ListaContactos.size
    }

    fun addContacto(contacto:Contacto){
       ListaContactos.add(contacto)
        notifyDataSetChanged()


    }
}
