package ifpr.tads.josepher.viking

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lagertha.*
import kotlinx.android.synthetic.main.activity_ragnar_lothbrok.*

class Lagertha : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lagertha)

        paraBjorn.setOnClickListener { bioDeBjorn() }
        paraRagnar.setOnClickListener { bioDeRagnar() }

        bioDeLagertha.text = "Lagertha foi, de acordo com as lendas locais, uma skjaldmö " +
                "(\"donzela do escudo\") viquingue que viveu no território da atual Noruega, " +
                "esposa do célebre guerreiro viquingue Ragnar Calças Peludas. Sua história, " +
                "tal como registrada pelo cronista Saxão Gramático, no livro Feitos dos Danos, " +
                "século XII, pode refletir diversos contos sobre Þorgerðr Hölgabrúðr, uma divindade nórdica.\n" +
                "\n" +
                "Seu nome, registrado por Saxão no latim como Lathgertha, provavelmente é uma latinização do nórdico antigo" +
                " Hlaðgerðr (Hladgerd). Costuma ser mencionada com frequência nas fontes de língua inglesa como Lagertha, " +
                "embora também tenham sido registradas as formas Ladgertha e Ladgerda, entre outras."
    }
    private fun bioDeBjorn(){
        val intent =Intent(this,BjornIronside::class.java)
        startActivity(intent)
    }
    private  fun bioDeRagnar(){
        val intent = Intent(this,RagnarLothbrok::class.java)
        startActivity(intent)
    }
}
