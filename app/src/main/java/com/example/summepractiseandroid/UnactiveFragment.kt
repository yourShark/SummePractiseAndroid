package com.example.summepractiseandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.google.android.material.snackbar.Snackbar

class UnactiveFragment : Fragment(R.layout.fragment_unactive) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = arguments?.getString(ARG_TEXT)

        if(text != null){
            if(text.isNotEmpty()){
                Snackbar.make(view,text,Snackbar.LENGTH_LONG).show()
            }
        }

    }
    companion object{
        private const val ARG_TEXT = "amaizing"

        fun createBundle(text:String): Bundle{
            val bundle = Bundle()
            bundle.putString(
                ARG_TEXT, text
            )
            return bundle
        }
    }
}