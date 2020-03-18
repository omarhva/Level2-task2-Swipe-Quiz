package com.example.swipequiz

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.item_quiz.view.*

/**
 * @author Omar Mulla Ibrahim
 * Student Nr 500766035
 */

lateinit var context: Context

class QuizAdapter(private val quiz: List<Quiz>) :
    RecyclerView.Adapter<QuizAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(quiz: Quiz) {
            itemView.tvQuiz.text = quiz.qustion
            itemView.tvQuiz.setOnClickListener {
                Snackbar.make(
                    itemView,
                    context.resources.getString(R.string.answere, quiz.answer.toString()),
                    Snackbar.LENGTH_SHORT
                ).show()
            }
        }
    }

    /**
     * Creates and returns a ViewHolder object, inflating a standard layout called simple_list_item_1.
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_quiz, parent, false)

        )
    }

    /**
     * Returns the size of the list
     */
    override fun getItemCount(): Int {
        return quiz.size
    }

    /**
     * Called by RecyclerView to display the data at the specified position.
     */
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(quiz[position])
    }
}
