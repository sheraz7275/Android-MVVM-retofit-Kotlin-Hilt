package com.example.mastercode.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.mastercode.databinding.BlankFragmentBinding
import com.example.mastercode.domain.CountriesDataModel
import com.example.mastercode.repository.RepositoryCountry
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CountriesListFragment : Fragment() {

    private lateinit var binding:BlankFragmentBinding
   // private lateinit var viewModelFactory: ViewModelCountryFactory
   private val viewModel: ViewModelCountries by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding=BlankFragmentBinding.inflate(layoutInflater)

       /* we do not need view model Factory
        when we use hilt repo will inject automatically
        use below line of code without Hilt
                */

        //val repositoryCountry=RepositoryCountry()
        // viewModelFactory= ViewModelCountryFactory()



        //setting up recycler view adapter

        viewModel.countriesList.observe(viewLifecycleOwner, Observer {

            binding.recCountries.adapter= CountriesAdapter(it)

        })

        // Network call status

        viewModel.status.observe(viewLifecycleOwner, Observer {

            Toast.makeText(requireContext(),it,Toast.LENGTH_SHORT).show()

        })

        return binding.root



    }
}


