package dti.g25.pendu

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import dti.g25.pendu.Présentateur.Présentateur

var lettres = emptyArray<Button>()

@SuppressLint("StaticFieldLeak")
lateinit var tvScore: TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    val présentateur = Présentateur( this )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    tvScore = findViewById( R.id.tvScore )

    override fun onClick(v : View) {


    }

    private  fun afficherÉtatLettres(état : String) {
        présentateur.démarrer()



    }

    private fun afficherScore(score : Int) {
        présentateur.

    }
}
