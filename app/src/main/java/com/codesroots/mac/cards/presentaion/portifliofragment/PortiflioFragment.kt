package com.codesroots.mac.cards.presentaion.portifliofragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.codesroots.mac.cards.DataLayer.helper.PreferenceHelper
import com.codesroots.mac.cards.DataLayer.usecases.checkUserLogin
import com.codesroots.mac.cards.R
import com.codesroots.mac.cards.presentaion.MainActivity
import com.codesroots.mac.cards.presentaion.login.LoginActivity
import com.codesroots.mac.cards.presentaion.menufragmen.ContactFragment
import com.codesroots.mac.cards.presentaion.menufragmen.Partners
import com.codesroots.mac.cards.presentaion.menufragmen.TermsFragment
import kotlinx.android.synthetic.main.menu_fragment.view.*

class PortiflioFragment : Fragment() {

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?,  savedInstanceState: Bundle? ): View? {

        val view= inflater.inflate(R.layout.portiflio_fragment, container, false)



        return view
    }

}
