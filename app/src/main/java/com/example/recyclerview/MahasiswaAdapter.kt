package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MahasiswaAdapter(private val mahasiswaList: List<ItemViewModel>) :
    RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder>() {

    class MahasiswaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // Inisialisasi elemen UI dari layout item
        val textViewNIM = itemView.findViewById<TextView>(R.id.textviewnim)
        val textViewNama = itemView.findViewById<TextView>(R.id.textviewnama)
        val buttonDetail = itemView.findViewById<Button>(R.id.buttondetail)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MahasiswaViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.card_view_design, parent, false)
        return MahasiswaViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MahasiswaViewHolder, position: Int) {
        val mahasiswa = mahasiswaList[position]

        // Atur data pada elemen UI
        holder.textViewNIM.text = mahasiswa.nim
        holder.textViewNama.text = mahasiswa.nama

        // Atur tindakan saat tombol "Detail" diklik
        holder.buttonDetail.setOnClickListener {
            // Tambahkan kode untuk mengarahkan ke halaman lain (contoh: Intent)
            // Di sini Anda dapat mengambil data NIM atau tindakan lain yang sesuai.
        }
    }

    override fun getItemCount(): Int {
        return mahasiswaList.size
    }
}
