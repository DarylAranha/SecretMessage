package com.mdev.secretmessage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class SecondEncryptFragmen : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_second_encrypt, container, false)
        val args = SecondEncryptFragmenArgs.fromBundle(requireArguments())
        val secondMessage = args.secondMessage
        val secondEncryptedView = view.findViewById<TextView>(R.id.second_encrypted_message)
        secondEncryptedView.text = secondMessage.reversed()

        return view
    }
}