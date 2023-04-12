package dti.g25.pendu.Présentateur

import android.widget.TextView
import dti.g25.pendu.MainActivity

import dti.g25.pendu.Modèle.Jeu
import dti.g25.pendu.R



class Présentateur(var vue: MainActivity) {


    val myList = mutableListOf("fruits", "police", "camion")
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
        vue.afficherScore(jeu.NbrePoints())
        vue.afficherPendu(jeu.nbErreur)

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
        vue.afficherPendu(0)
        vue.RecommencerImage()




    }




}