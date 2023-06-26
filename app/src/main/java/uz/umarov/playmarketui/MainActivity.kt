package uz.umarov.playmarketui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import uz.umarov.playmarketui.Adapter.RvAdapter
import uz.umarov.playmarketui.Model.Program
import uz.umarov.playmarketui.Model.ProgramType
import uz.umarov.playmarketui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val programType = ArrayList<ProgramType>()

        val program = ArrayList<Program>()
        program.add(Program("EEE", ""))
        programType.add(ProgramType("EEE", program))

        binding.rv.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = RvAdapter(programType)
        }
    }
}