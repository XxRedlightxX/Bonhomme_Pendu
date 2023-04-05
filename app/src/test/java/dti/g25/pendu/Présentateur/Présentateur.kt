package dti.g25.pendu.Présentateur

import dti.g25.pendu.MainActivity
import dti.g25.pendu.Modèle.Jeu

class Présentateur(var vue: MainActivity) {

    val listeDeMots:MutableList<String>

    private var jeu = Jeu( arrayname : String)
    val arrayname = arrayOf("")

    fun sélectionnerLettre(lettre : Char) {
        jeu.essayerUneLettre(lettre)
        jeu.estRéussi()
        jeu.étatLettres()


    }

    fun démarrer() {
        jeu.étatLettres()
        jeu.réinitialiser()
        jeu.étatLettres()


    }



}