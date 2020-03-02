package org.d3if0027.courtcountermod5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.activity_main.*
import org.d3if0027.courtcountermod5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var pointA = 0
    private var pointB = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //NILAI A HERE
        binding.btPlus3A.setOnClickListener {
            pointA = pointA+3
            nilaiA.setText(pointA.toString())
        }

        binding.btPlus2A.setOnClickListener {
            pointA = pointA+2
            nilaiA.setText(pointA.toString())
        }

        binding.btFreethrowA.setOnClickListener {
            pointA = pointA+1
            nilaiA.setText(pointA.toString())
        }

        //NILAI B HERE
        binding.btPlus3B.setOnClickListener {
            pointB = pointB+3
            nilaiB.setText(pointB.toString())
        }

        binding.btPlus2B.setOnClickListener {
            pointB = pointB+2
            nilaiB.setText(pointB.toString())
        }

        binding.btFreethrowB.setOnClickListener {
            pointB = pointB+1
            nilaiB.setText(pointB.toString())
        }

        //BUTTON RESET
        binding.btReset.setOnClickListener {
            pointA=0
            pointB=0
            nilaiA.setText(pointA.toString())
            nilaiB.setText(pointB.toString())
        }



    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.about -> about()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun about(){
        val intent = Intent(this,AboutActivity::class.java)
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_item,menu)
        return super.onCreateOptionsMenu(menu)
    }
}
