package th.co.toei.exprogressbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import th.co.toei.exprogressbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.gaugeVolume.drawGauge(40, "#F5F5F5", "#F0B36B", "#FF9A1F")
    }
}