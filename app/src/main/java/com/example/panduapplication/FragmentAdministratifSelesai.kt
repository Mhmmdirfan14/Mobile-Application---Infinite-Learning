package com.example.panduapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 49a6c03 (final-project)
import androidx.fragment.app.Fragment


class FragmentAdministratifSelesai : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
<<<<<<< HEAD
=======
=======
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment


class FragmentAdministratifSelesai : Fragment(), View.OnClickListener {
>>>>>>> 9ab19c1 (final-project)
>>>>>>> 49a6c03 (final-project)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_administratif_selesai, container, false)
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tvAdministratif: TextView = view.findViewById(R.id.tvAdministratif)
        tvAdministratif.setOnClickListener(this)

        val btnBuatAdministratif: Button = view.findViewById(R.id.btn_buat)
        btnBuatAdministratif.setOnClickListener(this)

        val btnProsesAdministratif: Button = view.findViewById(R.id.btn_proses)
        btnProsesAdministratif.setOnClickListener(this)

        val btnTungguAdministratif: Button = view.findViewById(R.id.btn_selesai)
        btnTungguAdministratif.setOnClickListener(this)

        val tvPengaduan:TextView = view.findViewById(R.id.tvPengaduan)
        tvPengaduan.setOnClickListener(this)

        val tvDetailSelesai:TextView = view.findViewById(R.id.tvDetailSelesai)
        tvDetailSelesai.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        if(v?.id == R.id.tvAdministratif){
            val fragmentadministratif = FragmentAdministratif()
            val fragmentManager = parentFragmentManager
            fragmentManager.beginTransaction().apply {
                replace(R.id.container_fragment, fragmentadministratif, FragmentAdministratif::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }

        if(v?.id == R.id.btn_buat){
            val fragmentadministratif = FragmentAdministratif()
            val fragmentManager = parentFragmentManager
            fragmentManager.beginTransaction().apply {
                replace(R.id.container_fragment, fragmentadministratif, FragmentAdministratif::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }

        if(v?.id == R.id.btn_tunggu){
            val fragmentAdministratifTunggu= FragmentAdministratifTunggu()
            val fragmentManager = parentFragmentManager
            fragmentManager.beginTransaction().apply {
                replace(R.id.container_fragment, fragmentAdministratifTunggu, FragmentAdministratifTunggu::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }

        if(v?.id == R.id.btn_proses){
            val fragmentAdministratifProses= FragmentAdministratifProses()
            val fragmentManager = parentFragmentManager
            fragmentManager.beginTransaction().apply {
                replace(R.id.container_fragment, fragmentAdministratifProses, FragmentAdministratifProses::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }

        if(v?.id == R.id.tvPengaduan){
            val fragmentLayanan = FragmentLayanan()
            val fragmentManager = parentFragmentManager
            fragmentManager.beginTransaction().apply {
                replace(R.id.container_fragment, fragmentLayanan , FragmentLayanan::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }

        if(v?.id == R.id.tvDetailSelesai){
            val detailSelesaidministratif = DetailSelesaiAdministratif()
            val fragmentManager = parentFragmentManager
            fragmentManager.beginTransaction().apply {
                replace(R.id.container_fragment, detailSelesaidministratif, DetailSelesaiAdministratif::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }
    }
>>>>>>> 9ab19c1 (final-project)
>>>>>>> 49a6c03 (final-project)
}