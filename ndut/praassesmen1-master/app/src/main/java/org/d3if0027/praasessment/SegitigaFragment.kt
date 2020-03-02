package org.d3if0027.praasessment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.fragment_persegi.*
import kotlinx.android.synthetic.main.fragment_segitiga.*
import org.d3if0027.praasessment.databinding.FragmentPersegiBinding
import org.d3if0027.praasessment.databinding.FragmentSegitigaBinding

class SegitigaFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentSegitigaBinding>(inflater, R.layout.fragment_segitiga, container, false)
        binding.btHitungSegitiga.setOnClickListener {
            val alas = binding.etAlas.text.toString().toInt()
            val tinggi = binding.etTinggi.text.toString().toInt()

            val luas = alas*tinggi
            val keliling = 1/2*alas*tinggi

            hasilluas_segitiga.text =  luas.toString()
            hasilkeliling_segitiga.text = keliling.toString()
        }


        return binding.root
    }


}
