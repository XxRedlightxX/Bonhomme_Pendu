package dti.g25.pendu.Présentateur

import dti.g25.pendu.MainActivity
import dti.g25.pendu.Modèle.Jeu

class Présentateur(var vue: MainActivity) {


    val myList = mutableListOf("Fruits", "Voiture", "Police")

    private var jeu = Jeu(myList)
    val arrayname = arrayOf("")

    fun sélectionnerLettre(lettre : Char) {
        jeu.essayerUneLettre(lettre)
        jeu.estRéussi()
        


    }

    fun démarrer() {
        jeu.étatLettres()
        jeu.réinitialiser()
        vue.



    }



}