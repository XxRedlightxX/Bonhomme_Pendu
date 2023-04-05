package dti.g25.pendu

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import dti.g25.pendu.Présentateur.Présentateur

var lettres = emptyArray<Button>()




class MainActivity : AppCompatActivity(), View.OnClickListener {
    val présentateur = Présentateur(this)
    lateinit var tvScore: TextView
    lateinit var tvMots: TextView
    var btnReint= findViewById( R.id.btnReinit ) as Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvScore = findViewById( R.id.tvScore )
        btnReint.setOnClickListener { présentateur.démarrer() }
        présentateur.démarrer()

    }
    //tvScore = findViewById( R.id.tvScore )

    override fun onClick(v : View) {


    }

    private  fun afficherÉtatLettres(état : String) {
        tvMots.text = String.format("%.1f", état )




    }

    private fun afficherScore(score : Int) {
        tvScore.text = String.format("%.1f", score )

    }
}
