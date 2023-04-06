package com.mdev.secretmessage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController

class EncryptFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_encrypt, container, false)
        val args = EncryptFragmentArgs.fromBundle(requireArguments())
        val message = args.message
        val secondMessage = args.secondMessage
        val encrypt = args.encrypt

        val nextEncryptButton = view.findViewById<Button>(R.id.nextEncrypt)
        nextEncryptButton.setOnClickListener {
            val action = EncryptFragmentDirections.actionEncryptFragmentToSecondEncryptFragmen(secondMessage)
            view.findNavController().navigate(action)
        }

        val encryptedView = view.findViewById<TextView>(R.id.encrypted_message)

        if (encrypt) {
            encryptedView.text = message.reversed()
        } else {
            encryptedView.text = message
        }


        return view
    }
}