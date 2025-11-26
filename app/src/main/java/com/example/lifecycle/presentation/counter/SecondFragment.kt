package com.example.lifecycle.presentation.counter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.lifecycle.R
import com.example.lifecycle.databinding.FragmentSecondBinding
import com.example.lifecycle.presentation.ViewModelFactory

class SecondFragment : Fragment() {
    private val viewModel by activityViewModels<MainViewModel>{
        ViewModelFactory()
    }
    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.counter.observe(viewLifecycleOwner) { count ->
            binding.textviewCounter.text = count.toString()
        }

        binding.fabAdd.setOnClickListener {
            viewModel.incrementCounter()
        }

        binding.buttonPrevious.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}