package org.d3if0027.praasessment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.fragment_persegi.*
import org.d3if0027.praasessment.databinding.FragmentIndexBinding
import org.d3if0027.praasessment.databinding.FragmentPersegiBinding


class PersegiFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentPersegiBinding>(inflater, R.layout.fragment_persegi, container, false)
        binding.btHtgPersegi.setOnClickListener {
            val panjang = binding.etPanjang.text.toString().toInt()
            val lebar = binding.etLebar.text.toString().toInt()

            val luas = panjang*lebar
            val keliling = 2*panjang*lebar

            hasilluas_persegi.text =  luas.toString()
            hasilkeliling_persegi.text = keliling.toString()
        }


        return binding.root


    }


}
