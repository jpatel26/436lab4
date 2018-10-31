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

/**
 * An activity representing a single Item detail screen. This
 * activity is only used on narrow width devices. On tablet-size devices,
 * item details are presented side-by-side with a list of items
 * in a [ItemListActivity].
 */
class ItemAddActivity : AppCompatActivity() {

    var newColor = ""
    var newShape = ""
    var newHeight = ""
    var newWidth = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_add)
        editText3.addTextChangedListener(object: TextWatcher {
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                newColor = s.toString();
            }

            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }
        })

        editText4.addTextChangedListener(object: TextWatcher {
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                newShape = s.toString();
            }

            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }
        })

        editText5.addTextChangedListener(object: TextWatcher {
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                newHeight = s.toString();
            }

            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }
        })
        editText6.addTextChangedListener(object: TextWatcher {
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                newWidth = s.toString();
            }

            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }
        })
        button5.setOnClickListener{
            JPatDatastore.newCP(newColor, newShape, newHeight, newWidth)
            Toast.makeText(this, "Saving", Toast.LENGTH_SHORT).show()
            NavUtils.navigateUpTo(this, Intent(this, ItemListActivity::class.java))
        }

        button4.setOnClickListener{
            Toast.makeText(this, "Canceling", Toast.LENGTH_SHORT).show()
            NavUtils.navigateUpTo(this, Intent(this, ItemListActivity::class.java))

        }



    }



}
