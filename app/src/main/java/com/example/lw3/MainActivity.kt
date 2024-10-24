package com.example.lw3

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.lw3.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    val binding
        get() = _binding?: throw IllegalStateException("No binding!")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnShow.setOnClickListener(View.OnClickListener {
            var text : String = "Выбор:"
            if (binding.cbOldCar.isChecked){
                text += " Раритетные машины;"
            }
            if (binding.cbNewCar.isChecked){
                text += " Новые машины;"
            }
            if (binding.cbBensCar.isChecked){
                text += " Бензиновые ввто;"
            }
            if (binding.cbDiselCar.isChecked){
                text += " Дизельные авто;"
            }
            if (binding.cbElectricCar.isChecked){
                text += " Электрические авто;"
            }
            if (binding.cbNearbyCar.isChecked){
                text += " Авто рядом;"
            }
            binding.tvChoose.setText(text)
        })
    }
}