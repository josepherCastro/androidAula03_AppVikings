package ifpr.tads.josepher.viking

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_floki.*

class Floki : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_floki)

        bioDeFloki.text = "Hrafna-Flóki Vilgerðarson (transliterado para português como Flóki Vilgerdarson, " +
                "do islandês Flóki Vilgerðarson) foi o primeiro explorador norueguês que no século IX, navegou " +
                "deliberadamente para a Islândia. A história está documentada no manuscrito Landnámabók (Livro dos assentamentos), " +
                "quando Flóki ouviu boas notícias acerca de novas terras a oeste, então conhecidas como Garðarshólmi. " +
                "Flóki era filho de Vilgerd Karadatter (n. 904), uma filha de Horda-Kåre, do reino de Hordaland."
    }
}
