package com.example.taskmanager.ui.home

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.taskmanager.R
import com.example.taskmanager.databinding.FragmentHomeBinding
import com.example.taskmanager.ui.App
import com.example.taskmanager.ui.home.adapter.TaskAdapter
import com.example.taskmanager.ui.model.Task

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private val adapter = TaskAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val list = App.db.taskDao().getAll()
        adapter.setTasks(list)
        binding.fab.setOnClickListener {
            findNavController().navigate(R.id.taskFragment)
        }
        adapter.setOnItemClickListener(object : TaskAdapter.OnItemClickListener {
            override fun onItemClick(task: Task) {
                showDeleteConfirmationDialog(task)
            }
        })
        binding.recycler.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    private fun showDeleteConfirmationDialog(task: Task) {
        val dialogBuilder = AlertDialog.Builder(requireContext())
        dialogBuilder.setTitle("Подтверждение удаления")
        dialogBuilder.setMessage("Вы уверены, что хотите удалить эту задачу?")
        dialogBuilder.setPositiveButton("Удалить") { dialog, which ->
            // Удалите задачу из базы данных
            App.db.taskDao().delete(task)

            // Обновите список задач в адаптере
            adapter.removeTask(task)

            // Уведомьте адаптер об изменении данных
            adapter.notifyDataSetChanged()

            Toast.makeText(requireContext(), "Задача удалена", Toast.LENGTH_SHORT).show()
        }
        dialogBuilder.setNegativeButton("Отмена") { dialog, which ->
            dialog.dismiss()
        }
        dialogBuilder.create().show()
    }

}