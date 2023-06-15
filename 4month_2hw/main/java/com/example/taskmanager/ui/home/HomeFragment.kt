package com.example.taskmanager.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.fragment.findNavController
import com.example.taskmanager.R
import com.example.taskmanager.databinding.FragmentHomeBinding
import com.example.taskmanager.ui.home.adapter.TaskAdapter
import com.example.taskmanager.ui.model.Task
import com.example.taskmanager.ui.task.TaskFragment

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private val adapter=TaskAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.fab.setOnClickListener {
            findNavController().navigate(R.id.taskFragment)
        }
        setFragmentResultListener(TaskFragment.TASK_REQUEST) { requestKey, bundle ->
            val data=bundle.getSerializable(TaskFragment.TASK_KEY) as Task
            Log.e("tag", "View Created!$data")
            adapter.setTask(data)
        }
        binding.recycler.adapter=adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}