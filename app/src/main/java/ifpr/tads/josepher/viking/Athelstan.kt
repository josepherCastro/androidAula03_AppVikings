package ifpr.tads.josepher.viking

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_athelstan.*
import kotlinx.android.synthetic.main.activity_ragnar_lothbrok.*

class Athelstan : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_athelstan)

        bioDeAthrlstan.text ="Etelstano (Æþelstan ou Æðelstān, significando \"pedra nobre\" em inglês antigo) " +
                "(c. 893/895 – 27 de outubro de 939) foi o rei dos anglo-saxões de 924 até 927, " +
                "quando conquistou todo o território inglês, passando a reinar como rei dos ingleses até sua morte. " +
                "Era filho do rei Eduardo, o Velho, e sua primeira esposa Ecgvina. " +
                "Historiadores modernos o consideram como o primeiro Rei da Inglaterra e um dos maiores reis anglo-saxões da História. " +
                "Ele nunca se casou e acabou sendo sucedido por seu irmão Edmundo I."
    }
}
