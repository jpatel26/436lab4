package com.example.jasminepatel.lab4

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.NavUtils
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.jasminepatel.lab4.dummy.JPatDatastore
import kotlinx.android.synthetic.main.activity_item_detail.*
import kotlinx.android.synthetic.main.activity_item_detail.view.*
import kotlinx.android.synthetic.main.item_detail.view.*
import kotlinx.android.synthetic.main.item_list_content.view.*
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.item_add.*
import kotlinx.android.synthetic.main.item_detail.*
import android.text.SpannableStringBuilder
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.item_list.*


/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a [ItemListActivity]
 * in two-pane mode (on tablets) or a [ItemDetailActivity]
 * on handsets.
 */
class ItemDetailFragment : Fragment() {

    /**
     * The dummy content this fragment is presenting.
     */
    private var item: JPatDatastore.CutePics? = null
    var newColor = "1"
    var newShape = "2"
    var newHeight = "3"
    var newWidth = "4"
    var newIndex = "0"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            //NavUtils.navigateUpTo(this, Intent(this, ItemDetailActivity::class.java))
        /*
        button3.setOnClickListener{
            //Toast.makeText(this, "Canceling", Toast.LENGTH_SHORT).show()
            //NavUtils.navigateUpTo(this, Intent(this, ItemListActivity::class.java))

        }
        button6.setOnClickListener{
            //Toast.makeText(this, "Canceling", Toast.LENGTH_SHORT).show()
            //NavUtils.navigateUpTo(this, Intent(this, ItemListActivity::class.java))

        }
        */
        arguments?.let {
            if (it.containsKey(ARG_ITEM_ID)) {
                // Load the dummy content specified by the fragment
                // argument(s. In a real-world scenario, use a Loader
                // to load content from a content provider.
               // Log.d("mytag", it.getString(ARG_ITEM_ID) + " #")
                item = JPatDatastore.ITEM_MAP[it.getString(ARG_ITEM_ID)]
                activity?.toolbar_layout?.title = "More info"
//                activity?.toolbar_layout?. = item?.shape
//                activity?.toolbar_layout?.title = item?.length
//                activity?.toolbar_layout?.title = item?.width


            }
        }
    }
/*
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.item_detail, container, false)

        /*
        editText2.addTextChangedListener(object: TextWatcher {
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                item?.width = s.toString()
            }

            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }
        })
        */
        // Show the dummy content as text in a TextView.
        item?.let {
            val editable = SpannableStringBuilder(it.color)
            rootView.editText7.text = editable

        }
        item?.let {
            val editable1 = SpannableStringBuilder(it.shape)
            rootView.editText8.text = editable1
        }
        item?.let {
            val editable2 = SpannableStringBuilder(it.length)
            rootView.editText9.text = editable2
        }
        item?.let {
            //rootView.width2.text = it.width
            val editable3 = SpannableStringBuilder(it.width)
            rootView.editText2.text = editable3
        }

        return rootView
    }

*/

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var v = inflater.inflate(R.layout.item_detail, container, false)


        // Show the dummy content as text in a TextView.
        item?.let {
            val editable = SpannableStringBuilder(it.color)
            v.editText7.text = editable
            newColor = editable.toString()
            newIndex = it.counter

        }
        item?.let {
            val editable1 = SpannableStringBuilder(it.shape)
            v.editText8.text = editable1
            newShape = editable1.toString()
        }
        item?.let {
            val editable2 = SpannableStringBuilder(it.width)
            v.editText9.text = editable2
            newHeight = editable2.toString()
        }
        item?.let {
            //rootView.width2.text = it.width
            val editable3 = SpannableStringBuilder(it.length)
            v.editText2.text = editable3
            newWidth = editable3.toString()
        }

        val editColor = v.findViewById(R.id.editText7) as EditText
        editColor.addTextChangedListener(object: TextWatcher {
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                newColor = s.toString()
                //JPatDatastore.newCP(s.toString(), s.toString(), s.toString(), s.toString())
            }
            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
        })

        val editShape = v.findViewById(R.id.editText8) as EditText
        editShape.addTextChangedListener(object: TextWatcher {
            override fun onTextChanged(p: CharSequence?, start: Int, before: Int, count: Int) {
                newShape = p.toString()
                //JPatDatastore.newCP(s.toString(), s.toString(), s.toString(), s.toString())
            }
            override fun afterTextChanged(p: Editable?) {}
            override fun beforeTextChanged(p: CharSequence?, start: Int, count: Int, after: Int) {}
        })

        val editHeight = v.findViewById(R.id.editText9) as EditText
        editHeight.addTextChangedListener(object: TextWatcher {
            override fun onTextChanged(q: CharSequence?, start: Int, before: Int, count: Int) {
                newHeight = q.toString()
                //JPatDatastore.newCP(s.toString(), s.toString(), s.toString(), s.toString())
            }
            override fun afterTextChanged(q: Editable?) {}
            override fun beforeTextChanged(q: CharSequence?, start: Int, count: Int, after: Int) {}
        })

        val editWidth = v.findViewById(R.id.editText2) as EditText
        editWidth.addTextChangedListener(object: TextWatcher {
            override fun onTextChanged(r: CharSequence?, start: Int, before: Int, count: Int) {
                newWidth= r.toString()
                //JPatDatastore.newCP(s.toString(), s.toString(), s.toString(), s.toString())
            }
            override fun afterTextChanged(r: Editable?) {
            }
            override fun beforeTextChanged(r: CharSequence?, start: Int, count: Int, after: Int) {}
        })

        val saveButton = v.findViewById(R.id.button) as Button
        saveButton.setOnClickListener(View.OnClickListener {
            JPatDatastore.editCP(newColor, newShape, newHeight, newWidth, newIndex)
            Toast.makeText(this.context, "Saving", Toast.LENGTH_SHORT).show()
            //item_list.adapter?.notifyDataSetChanged()
            var intent = Intent(this.context, ItemListActivity::class.java)
            startActivityForResult(intent, 0)
        })

        val cancelButton = v.findViewById(R.id.button3) as Button
        cancelButton.setOnClickListener(View.OnClickListener {
            var intent = Intent(this.context, ItemListActivity::class.java)
            startActivityForResult(intent, 0)
        })

        val deleteButton = v.findViewById(R.id.button6) as Button
        deleteButton.setOnClickListener(View.OnClickListener {
            JPatDatastore.deleteCP(newColor, newShape, newHeight, newWidth, newIndex)
            var intent = Intent(this.context, ItemListActivity::class.java)
            startActivityForResult(intent, 0)
        })


        return v
    }


    companion object {
        /**
         * The fragment argument representing the item ID that this fragment
         * represents.
         */
        const val ARG_ITEM_ID = "item_id"
    }
}
