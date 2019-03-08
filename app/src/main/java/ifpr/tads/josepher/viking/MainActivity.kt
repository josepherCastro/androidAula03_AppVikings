package ifpr.tads.josepher.viking
import android.content.Intent
import android.content.res.Resources
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        athelstan.setOnClickListener{bioDeAthelstan()}
        bjornIronside.setOnClickListener{bioDeBjornIronside()}
        floki.setOnClickListener{bioDeFloki()}
        lagertha.setOnClickListener{bioDeLagertha()}
        ragnarLothbrok.setOnClickListener{bioDeRagnarLothbrok()}
        rollo.setOnClickListener{bioDeRollo()}
    }

    private fun bioDeRollo() {
        val intent = Intent(this,Rollo::class.java)
        startActivity(intent)
    }

    private fun bioDeLagertha() {
        val intent = Intent(this,Lagertha::class.java)
        startActivity(intent)
    }

    private fun bioDeFloki() {
        val intent = Intent(this,Floki::class.java)
        startActivity(intent)
    }

    private fun bioDeRagnarLothbrok() {
        val intent = Intent(this,RagnarLothbrok::class.java)
        startActivity(intent)
    }

    private fun bioDeBjornIronside(){
        val intent = Intent(this,BjornIronside::class.java)
        startActivity(intent)
    }

    private fun bioDeAthelstan() {
        val intent = Intent(this,Athelstan::class.java)
        startActivity(intent)
    }
}

