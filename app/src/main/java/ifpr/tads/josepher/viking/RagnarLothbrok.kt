package ifpr.tads.josepher.viking

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_floki.*

import kotlinx.android.synthetic.main.activity_ragnar_lothbrok.*

class RagnarLothbrok : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ragnar_lothbrok)

        paraaLagertha.setOnClickListener { bioDeLagertha() }
        paraaBjorn.setOnClickListener { bioDeBjorn() }
        paraFloki.setOnClickListener { bioDeFloki() }


        bioDeRagnar.text = "Ragnar Lodbrok ou Ragnar Calças Peludas (em dinamarquês: Regnar Lodbrog; em sueco: Ragnar Lodbrok; " +
                "em nórdico antigo: Ragnarr Loðbrók; LITERALMENTE Ragnar Calças Felpudas) foi um rei lendário da Dinamarca e da Suécia, " +
                "que teria reinado durante os séculos VIII e IX.\n" +
                "\n" +
                "Segundo a Saga de Ragnar Lodbrok, as \"calças felpudas\" (lodbrok) de Ragnar Lodbrok eram umas calças de pele de lobo, " +
                "fervidas em breu, confecionadas para ele enfrentar e matar a serpente monstruosa e muito venenosa" +
                " que guardava a princesa Tora Borgarhjort.\n" +
                "\n" +
                "Ragnar Lodbrok é apresentado pelo cronista dinamarquês Saxão Gramático, no século XIII, " +
                "como sendo jarl do rei Horik 1. da Dinamarca, embora tendo origem na dinastia sueca dos Inglingos. " +
                "Tanto Saxão quanto a saga islandesa Saga de Ragnar Lodbrok descrevem Ragnar como filho do igualmente lendário Sigurdo, " +
                "o Anel, um rei da Suécia que teria conquistado a Dinamarca. Todavia, " +
                "os cronistas não concordam com o local de residência principal de Ragnar, se a Suécia ou a Dinamarca."
    }
    private fun bioDeLagertha(){
        val intent = Intent(this,Lagertha::class.java)
        startActivity(intent)
    }
    private fun bioDeBjorn(){
        val intent = Intent(this,BjornIronside::class.java)
        startActivity(intent)
    }
    private fun bioDeFloki(){
        val intent = Intent(this,Floki::class.java)
        startActivity(intent)
    }

}
