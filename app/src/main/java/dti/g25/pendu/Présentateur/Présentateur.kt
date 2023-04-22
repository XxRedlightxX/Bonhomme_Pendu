package dti.g25.pendu.Présentateur

import android.widget.TextView
import dti.g25.pendu.MainActivity

import dti.g25.pendu.Modèle.Jeu
import dti.g25.pendu.R



class Présentateur(var vue: MainActivity) {


    val myList = mutableListOf("FRUIT", "POLICE", "CAMION")
    var cards= arrayOf(R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,R.drawable.image5)
    private lateinit var myTextView: TextView
     var jeu = Jeu(myList)

    init {
        jeu.réinitialiser()
    }

    /**
     * Prend en parametre la lettre et verifie si la lettre correpond au mot
     */

    fun sélectionnerLettre(lettre : Char) {
        //val Lettres = String(jeu.étatLettres())
        jeu.essayerUneLettre(lettre)
        vue.afficherÉtatLettre(jeu.étatLettres().joinToString(""))
        vue.afficherScore(jeu.NbrScore())
        //vue.afficherPendu(jeu.nbErreur)
        vue.afficherHomme(jeu.nbErreur)
        /*if (jeu.essayerUneLettre(lettre)) {

            vue.afficherÉtatLettre(jeu.étatLettres().joinToString(""))
            vue.afficherScore(jeu.NbrePoints())





            if(jeu.estRéussi()) {
                vue.afficherScore(jeu.NbrePoints())
                vue.afficherScore(jeu.NbrePoints())

                jeu.estRéussi()
                vue.afficherÉtatLettre(Lettres)
            } else {
                vue.afficherScore(jeu.NbrePoints())
                jeu.étatLettres().joinToString()
                vue.afficherPendu(jeu.nbErreur)






            }*/







    }

    /**
     * Reinitailise le jeu
     */

    fun démarrer() {

        jeu.réinitialiser()
        vue.afficherÉtatLettre(jeu.étatLettres().joinToString(""))
        vue.afficherScore(0)
        //vue.afficherPendu(0)
        vue.RecommencerImage()




    }

    fun afficherImage(nbErreur : Int){

            when(jeu.nbErreur){
                0 -> vue.imgPendu.setImageResource(R.drawable.image1)
                1 -> vue.imgPendu.setImageResource(R.drawable.image2)
                2 -> vue.imgPendu.setImageResource(R.drawable.image3)
                3 -> vue.imgPendu.setImageResource(R.drawable.image4)
                4 -> vue.imgPendu.setImageResource(R.drawable.image5)

            }
        }




}