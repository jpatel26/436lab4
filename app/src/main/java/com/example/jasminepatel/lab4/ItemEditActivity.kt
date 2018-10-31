package com.example.jasminepatel.lab4

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v4.app.NavUtils
import android.text.Editable
import android.text.TextWatcher
import android.view.MenuItem
import android.widget.Toast
import com.example.jasminepatel.lab4.dummy.JPatDatastore
import kotlinx.android.synthetic.main.activity_item_detail.*
import kotlinx.android.synthetic.main.activity_item_list.*
import kotlinx.android.synthetic.main.item_add.*
import kotlinx.android.synthetic.main.item_edit.*

/**
 * An activity representing a single Item detail screen. This
 * activity is only used on narrow width devices. On tablet-size devices,
 * item details are presented side-by-side with a list of items
 * in a [ItemListActivity].
 */
class ItemEditActivity : AppCompatActivity() {

    var newColor = ""
    var newShape = ""
    var newHeight = ""
    var newWidth = ""
    private var item: JPatDatastore.CutePics? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_detail)
        button5.setOnClickListener{
            //JPatDatastore.newCP(newColor, newShape, newHeight, newWidth)
            Toast.makeText(this, "Saving", Toast.LENGTH_SHORT).show()
            NavUtils.navigateUpTo(this, Intent(this, ItemListActivity::class.java))
        }


    }



}
