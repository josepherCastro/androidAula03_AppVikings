package ifpr.tads.josepher.viking

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bjorn_ironside.*

class BjornIronside : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bjorn_ironside)

        paraAthelstan.setOnClickListener { biodeAthrlstan() }
        paraFloki.setOnClickListener { biodeFloki() }
        paraLagertha.setOnClickListener { biodeLagertha() }
        paraRagnar.setOnClickListener { biodeRagnar() }

        bioDeBjorn.text = "Björn Ironside ( nórdico antigo : Bjǫrn Járnsíða , islandês : Björn Járnsíða , " +
                "sueco : Björn Järnsida, dinamarquesa : Bjørn Jernside ; Medieval Latina : Bier costae ferreae ) " +
                "foi um histórico sueco chefe viking que também figura em fontes tardias como um filho de Ragnar Lodbrok " +
                "e um lendário rei da Suécia . Ele viveu no século 9, sendo datado de forma segura entre 855 e 858. " +
                "Björn Ironside é dito ter sido o primeiro governante da dinastia sueca Munsö. No início do século 18, " +
                "um carrinho de mão, na ilha de Munsó foi reivindicado por antiquários ser" +
                " Björn Järnsidas hög ou de Björn Ironside carrinho de mão."

    }
    private fun biodeAthrlstan(){
        val intent = Intent(this,Athelstan::class.java)
        startActivity(intent)
    }
    private fun biodeFloki(){
        val intent = Intent(this,Floki::class.java)
        startActivity(intent)
    }
    private  fun biodeLagertha(){
        val intent = Intent(this,Lagertha::class.java)
        startActivity(intent)
    }
    private  fun biodeRagnar(){
        val intent = Intent(this, RagnarLothbrok::class.java)
        startActivity(intent)
    }
}
