package dti.g25.pendu

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import dti.g25.pendu.Présentateur.Présentateur

var lettres = mutableListOf<Button>()




class MainActivity : AppCompatActivity(), View.OnClickListener {
    val présentateur = Présentateur(this)
    //var lettres = emptyArray<Button>()

    lateinit var tvScore: TextView
   lateinit var tvMots: TextView
    lateinit var imgPendu: ImageView

    lateinit var btnQ: Button
    lateinit var btnW: Button
    lateinit var btnR: Button
    lateinit var btnE: Button
    lateinit var btnT: Button
    lateinit var btnU: Button
    lateinit var btnI: Button
    lateinit var btnO: Button
    lateinit var btnP: Button
    lateinit var btnA: Button
    lateinit var btnS: Button
    lateinit var btnD: Button
    lateinit var btnF: Button
    lateinit var btnG: Button
    lateinit var btnH: Button
    lateinit var btnJ: Button
    lateinit var btnK: Button
    lateinit var btnL: Button
    lateinit var btnX: Button
    lateinit var btnC: Button
    lateinit var btnV: Button
    lateinit var btnB: Button
    lateinit var btnN: Button
    lateinit var btnY: Button
    lateinit var btnZ: Button
    lateinit var btnM: Button




    lateinit var btnReint: Button

    // Couleurs des boutons
    val COULEUR_NORMAL = 0
    val COULEUR_SÉLECTIONNÉ = 0xFFFF0000.toInt()







    @SuppressLint("DiscouragedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnReint = findViewById(R.id.btnReinit)
        tvScore = findViewById(R.id.tvScore)
        tvMots = findViewById(R.id.tvMots)
        btnQ = findViewById(R.id.btnQ)
        btnW = findViewById(R.id.btnW)
        btnE = findViewById(R.id.btnE)
        btnR = findViewById(R.id.btnR)
        btnT = findViewById(R.id.btnT)
        btnU = findViewById(R.id.btnU)
        btnI = findViewById(R.id.btnI)
        btnO = findViewById(R.id.btnO)
        btnP = findViewById(R.id.btnP)
        btnA = findViewById(R.id.btnA)
        btnS = findViewById(R.id.btnS)
        btnD = findViewById(R.id.btnD)
        btnF = findViewById(R.id.btnF)
        btnG = findViewById(R.id.btnG)
        btnH = findViewById(R.id.btnH)
        btnJ = findViewById(R.id.btnJ)
        btnK = findViewById(R.id.btnK)
        btnL = findViewById(R.id.btnL)
        btnX = findViewById(R.id.btnX)
        btnC = findViewById(R.id.btnC)
        btnV = findViewById(R.id.btnV)
        btnD = findViewById(R.id.btnD)
        btnN = findViewById(R.id.btnN)
        btnM = findViewById(R.id.btnM)
        btnB = findViewById(R.id.btnB)
        btnY = findViewById(R.id.btnY)
        btnZ = findViewById(R.id.btnZ)

        lettres = arrayListOf(btnQ,btnW,btnE,btnR,btnT,btnU,btnI,btnO,btnP,btnA,btnS,btnD,btnF,btnG,
        btnH,btnJ,btnK,btnL,btnX,btnC,btnV,btnD,btnN,btnM,btnY,btnZ)





        imgPendu = findViewById<ImageView>(R.id.imgPendu)

        imgPendu.setImageResource(R.drawable.image1)




        présentateur.démarrer()




        /**
         * Bouton Réiniatiliser

        */
        btnReint.setOnClickListener { présentateur.démarrer()
            for(btn:Button in lettres) {
                btn.isEnabled=true}}








    }






    override fun onClick(v: View) {


            if(v is Button) {
                println("la lettre selectionne est : " + v.text.toString())
                présentateur.sélectionnerLettre(v.text.toString().single())



                v.isEnabled=false

            }
            if (v==btnReint) {
                for(btn:Button in lettres) {
                    btn.isEnabled=true

                }
            }
















    }

    fun afficherÉtatLettre(état: String) {
        tvMots.text = état

    }


    fun afficherScore(score: Int) {
        tvScore.text = String.format("%01d",score)


    }


    fun RecommencerImage() {
        imgPendu.setImageResource(R.drawable.image1)



    }


    fun afficherHomme(nbErreur : Int) {
        when(nbErreur){
            1 -> imgPendu.setImageResource(R.drawable.image2)
            2 -> imgPendu.setImageResource(R.drawable.image3)
            3 -> imgPendu.setImageResource(R.drawable.image4)
            4 -> imgPendu.setImageResource(R.drawable.image5)
            5 -> imgPendu.setImageResource(R.drawable.image6)
            6 -> imgPendu.setImageResource(R.drawable.image7)

        }

    }




}
