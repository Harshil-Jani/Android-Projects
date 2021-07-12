package com.example.coffeecafe

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.coffeecafe.databinding.ActivityMainBinding
import java.text.NumberFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calculateButton.setOnClickListener{calculateCost()}
    }
    fun calculateCost(){
        val stringInTextField = binding.plainTextInput.text.toString()
        val quantity = stringInTextField.toIntOrNull()
        if(quantity==null){
            binding.costResult.text = ""
            return
        }
        val selectedId = binding.sizeOptions.checkedRadioButtonId
        val price = when(selectedId){
            R.id.option_Large -> 12
            R.id.option_Medium -> 8
            else  -> 5
        }
        var cost = quantity * price
        val addTip = binding.roundUpSwitch.isChecked
        if(addTip){
            cost = cost + 1
        }
        NumberFormat.getCurrencyInstance(Locale.US)
 val formattedCost = NumberFormat.getCurrencyInstance(Locale.US).format(cost)
        binding.costResult.text = getString(R.string.cost, formattedCost)
    }
}