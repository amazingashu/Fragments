package com.acrony.fragments


import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class First_Fragment :Fragment()
{
    val TAG="FirstFragment"


    override fun onAttach(context: Context) {
        Log.d((TAG),"OnAttach Called")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d((TAG),"OnCreate Called")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d((TAG),"OnCreate View Called")

        return inflater!!.inflate((R.layout.first_fragment),container,false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d((TAG),"OnAcitvity Created Called")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.d((TAG),"OnStart Called")
        super.onStart()
    }

    override fun onResume() {
        Log.d((TAG),"OnResume Called")
        super.onResume()
    }

    override fun onPause() {
        Log.d((TAG),"OnPause Called")
        super.onPause()
    }

    override fun onStop() {
        Log.d((TAG),"OnStop Called")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d((TAG),"OnDestroy Called")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.d((TAG),"OnDetach Called")
        super.onDetach()
    }
}