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
    lateinit var images: Array<Int>
    var currentImageIndex = 0
    // Couleurs des boutons
    val COULEUR_NORMAL = 0
    val COULEUR_SÉLECTIONNÉ = 0xFFFF0000.toInt()




    /*lateinit var btnReint: Button
    var imageIds = arrayOf(
        R.drawable.Tete,
        R.drawable.Corps,
        R.drawable.Bras,
        R.drawable.Mort
    )*/


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




        images = arrayOf(
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3, R.drawable.image4, R.drawable.image5)




        /**
         * Tests

        */
        btnReint.setOnClickListener { présentateur.démarrer()
            for(btn:Button in lettres) {
                btn.isEnabled=true}}



       /* btnReint.setOnClickListener {// présentateur.démarrer()
        println( "tessssst le mot adeviner : " +présentateur.jeu.MotÀDeviner)
            //println( "tessssst lettre essayées : " +présentateur.jeu.LettreEssayées.joinToString())
            présentateur.jeu.essayerUneLettre('f')
            présentateur.jeu.essayerUneLettre('r')
            présentateur.jeu.essayerUneLettre('u')
            présentateur.jeu.essayerUneLettre('i')
            présentateur.jeu.essayerUneLettre('t')
            //présentateur.jeu.essayerUneLettre('')
            //présentateur.sélectionnerLettre('u')
            //présentateur.sélectionnerLettre('i')
            //présentateur.sélectionnerLettre('t')
            //présentateur.sélectionnerLettre('s')
            println( "tessssst lettre essayées : " +présentateur.jeu.LettreEssayées.joinToString())
            println( "tessssst letat de la lettre : " +présentateur.jeu.étatLettres().joinToString())
            //println( "tessssst letat de la lettre : " +présentateur.éta)
            println( "tesss" +
                    "3sst si le jeu est reussi  : " +présentateur.jeu.estRéussi())
        }
        */








    }




    //tvScore = findViewById( R.id.tvScore )



    override fun onClick(v: View) {
      /*  if (v == imgPendu) {
            currentImageIndex = (currentImageIndex + 1) % images.size
            imgPendu.setImageResource(images[currentImageIndex])
        }*/

            if(v is Button) {
                println("la lettre selectionne est : " + v.text.toString())
                présentateur.sélectionnerLettre(v.text.toString().single())
                println( "tessssst lettre essayées : " +présentateur.jeu.LettreEssayées.joinToString())
                //println( "tessssst lettre essayées : " +présentateur.jeu.LettreEssayées.joinToString())
                //println( "tessssst letat de la lettre : " +présentateur.jeu.étatLettres().joinToString())
                println( "Nbre Erreurs : " +présentateur.jeu.nbErreur)
                println( "Nbre Pointage : " +présentateur.jeu.pointage)
                println( "test si le jeu est reussi : " +présentateur.jeu.estRéussi())
                v.isEnabled=false

            }
            if (v==btnReint) {
                for(btn:Button in lettres) {
                    btn.isEnabled=true

                }
            }













        //btn.setOnClickListener( MonListener() )


    }

    fun afficherÉtatLettre(état: String) {
        tvMots.text = état

    }


    fun afficherScore(score: Int) {
        tvScore.text = String.format("%01d",score)


    }

    fun afficherPendu(Erreur:Int) {
        currentImageIndex = (currentImageIndex + 1) % images.size
        imgPendu.setImageResource(images[currentImageIndex])




    }
    fun RecommencerImage() {
        imgPendu.setImageResource(R.drawable.image1)



    }
}
