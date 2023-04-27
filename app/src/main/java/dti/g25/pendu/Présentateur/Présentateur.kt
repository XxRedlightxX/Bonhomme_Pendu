package dti.g25.pendu.Présentateur

import android.widget.TextView
import dti.g25.pendu.MainActivity

import dti.g25.pendu.Modèle.Jeu
import dti.g25.pendu.R



class Présentateur(var vue: MainActivity) {


    val myList = mutableListOf("FRUIT", "POLICE", "CAMION", "STATUE", "OUVRIER","NAVIRE","BANQUIER","BANLANCOIRE","COUVERTURE","VOYAGE","ETE")

     var jeu = Jeu(myList)

    init {
        jeu.réinitialiser()
    }

    /**
     * Prend en parametre la lettre et verifie si la lettre correpond au mot
     */

    fun sélectionnerLettre(lettre : Char) {

        jeu.essayerUneLettre(lettre)
        vue.afficherÉtatLettre(jeu.étatLettres().joinToString(""))
        vue.afficherScore(jeu.pointage)
        vue.afficherHomme(jeu.nbErreur)
        if(jeu.estRéussi()==true) {
            vue.afficherÉtatLettre("Bravo votre mot était : " + jeu.motÀDeviner)

        }
        if(jeu.nbErreur>=6) {
            vue.afficherÉtatLettre("Vous avez perdu votre mot était : " + jeu.motÀDeviner)

        }









    }

    /**
     * Reinitailise le jeu
     */

    fun démarrer() {

        jeu.réinitialiser()
        vue.afficherÉtatLettre(jeu.étatLettres().joinToString(""))
        vue.afficherScore(0)

        vue.RecommencerImage()




    }






}