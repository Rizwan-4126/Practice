package org.d3if0027.praasessment


import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import org.d3if0027.praasessment.databinding.ActivityMainBinding
import org.d3if0027.praasessment.databinding.FragmentIndexBinding


class IndexFragment : Fragment() {
    private lateinit var binding: ActivityMainBinding

        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
            val binding = DataBindingUtil.inflate<FragmentIndexBinding>(inflater, R.layout.fragment_index, container, false)
            setHasOptionsMenu(true)

            binding.btPersegipanjang.setOnClickListener {
                v: View ->
                v.findNavController().navigate(R.id.action_indexFragment2_to_persegiFragment)
            }
            binding.btSegitiga.setOnClickListener {
                    v: View ->
                v.findNavController().navigate(R.id.action_indexFragment2_to_segitigaFragment)
            }
            return binding.root


        }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, view!!.findNavController()) || super.onOptionsItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.list_item, menu)
    }
}
