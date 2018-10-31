package com.example.jasminepatel.lab4.dummy

import android.util.Log
import java.util.ArrayList
import java.util.HashMap
import java.util.Random


/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object JPatDatastore {

    var idcounter = 0;
    /**
     * An array of sample (dummy) items.
     */
    var ITEMS: MutableList<CutePics> = ArrayList()

    /**
     * A map of sample (dummy) items, by ID.
     */
    var ITEM_MAP: MutableMap<String, CutePics> = HashMap()


    init {
        // Add some sample items.
        //for (i in 1..(INDEX - 1)) {
        //    addItem(enterCutePicInfo(i))
        //}
    }

    private fun addItem(item: CutePics) {
        ITEMS.add(item)
        ITEM_MAP.put(item.counter, item)
    }

    private fun enterCutePicInfo(position: Int): CutePics {
        var C = CutePics(getColor(), getShape(), getLen(), getWit() , idcounter.toString())
        idcounter = idcounter + 1
        return C
    }

    fun newCP(color: String, shape: String, height: String, width: String) {
        addItem(CutePics(color, shape, height, width, idcounter.toString()))
        idcounter += 1;


    }
    fun editCP(color: String, shape: String, height: String, width: String, count: String) {
        var item = CutePics(color, shape, height, width, count)
        //var i = Integer.parseInt(id) - 1
        //Log.d("Intsare", Integer.parseInt(count).toString());
        var i = Integer.parseInt(count)
        ITEMS.set(i, item)
        ITEM_MAP.put(item.counter.toString(), item)

    }
    fun deleteCP(color: String, shape: String, height: String, width: String, count: String) {
        var i = Integer.parseInt(count)
        ITEMS.removeAt(i)
        var max = ITEMS.size
        while (i < max) {
            ITEMS[i].counter = i.toString()
            i++
        }
        idcounter -= 1
    }


    /*
    private fun makeDetails(position: Int): String {

        val builder = StringBuilder()
        builder.append("Details about Item: ").append(position)

        return builder.toString()
    }
    */


    /**
     * A dummy item representing a piece of content.
     */
    data class CutePics(var color: String, var shape: String, var width: String, var length: String, val counterin: String) {
        override fun toString(): String = shape
        var co = color
        var wi = width
        var le = length
        var counter = counterin



    }


    fun getColor(): String
    {
        val list = listOf("blue  ", "red    ", "teal  ", "pink  ", "orange", "green ", "purple")
        val p = Random().nextInt(6)

        return list.get(p)

    }

    fun getShape(): String
    {
        val list = listOf("circle", "triang", "square", "star  ", "heart ", "oval  ", "line  ")
        val p = Random().nextInt(6)

        return list.get(p)

    }
    fun getLen(): String
    {
        val list = listOf("1     ", "2     ", "3     ", "4     ", "6     ", "7     ", "8     ")
        val p = Random().nextInt(6)

        return list.get(p)

    }
    fun getWit(): String
    {
        val list = listOf("10    ", "20    ", "30    ", "40    ", "50    ", "60    ", "70    ")
        val p = Random().nextInt(6)

        return list.get(p)

    }

}
