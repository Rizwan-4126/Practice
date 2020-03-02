package org.d3ifcool.practice


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import org.d3ifcool.practice.databinding.ActivityMainBinding
import org.d3ifcool.practice.databinding.FragmentTesBinding

/**
 * A simple [Fragment] subclass.
 */
class TesFragment : Fragment() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentTesBinding>(
            inflater,
            R.layout.fragment_tes,
            container,
            false
        )
        setHasOptionsMenu(true)

        binding.btHitung.setOnClickListener { v: View ->
            v.findNavController().navigate(R.id.action_tesFragment_to_hitungFragment)
        }
        binding.btSaran.setOnClickListener { v: View ->
            v.findNavController().navigate(R.id.action_tesFragment_to_saranFragment)

        }
        return binding.root
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, view!!.findNavController()) || super.onOptionsItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_item, menu)
    }
}
