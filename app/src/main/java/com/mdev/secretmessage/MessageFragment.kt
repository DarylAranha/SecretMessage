package com.mdev.secretmessage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class MessageFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_message, container, false)
        val nextButton = view.findViewById<Button>(R.id.next)
        val messageView = view.findViewById<EditText>(R.id.message)
        val secondMessageView = view.findViewById<EditText>(R.id.secondMessage)

        nextButton.setOnClickListener {
            val message = messageView.text.toString()
            val secondMessage = secondMessageView.text.toString()

            val action = MessageFragmentDirections.actionMessageFragmentToEncryptFragment(message, secondMessage)
            view.findNavController().navigate(action)
            // view.findNavController().navigate(R.id.action_messageFragment_to_encryptFragment)
        }

        return view
    }
}