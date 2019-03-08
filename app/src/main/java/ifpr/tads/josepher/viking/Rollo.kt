package ifpr.tads.josepher.viking

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_rollo.*

class Rollo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rollo)

        bioDeRollo.text = "Rolão, Rolo ou Rolfo (em nórdico antigo: Hrólfr; " +
                "em norueguês: Rolf; em latim: Rollon; em latim: Rollo/Rolphus; " +
                "860-932), melhor conhecido com Rolão, o Caminhante e Rolão, o Andarilho " +
                "(em nórdico antigo: Göngu-Hrólfr; em norueguês: Gange-Rolf; em sueco: Gångerolf)" +
                " e às vezes Rolão, filho de Ragnualdo (em nórdico antigo: Hrólfr Rögnvaldsson), " +
                "foi um líder viquingue, fundador e primeiro governante do Ducado da Normandia no período de 911 a 927. " +
                "Existem controvérsias entre os historiadores quanto à posição de Rolão no feudo da Normandia - " +
                "se era a de um duque ou equivalente à de um conde carolíngio. Era o tataravô de Guilherme, o Conquistador, " +
                "o primeiro rei normando da Inglaterra."
    }
}
