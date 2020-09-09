package com.lucassimoesmartins.mydeeplinkexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_second_screen.*


private const val SECOND_TEXT = "secondText"

class SecondScreenFragment : Fragment() {

    var secondText: String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            secondText = it.getString(SECOND_TEXT)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second_screen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUI()
    }

    private fun setUI() {
        activity?.title = "Second Screen"
        btn_second_screen.setOnClickListener {
            fragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_content, ThirdScreenFragment())
                ?.commit()
        }
    }
}