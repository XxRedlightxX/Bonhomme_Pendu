package dti.g25.pendu.Modèle

import android.widget.TextView
import dti.g25.pendu.R


class Jeu(val listeDeMots:MutableList<String> ) {
    var LettreEssayées = mutableListOf<Char>()
    var MotÀDeviner: String = ""

    var pointage = 0
    var nbErreur = 0

    init {
        if(listeDeMots.isEmpty())
            throw IllegalArgumentException("La liste est vide")
    }

    init {
        this.listeDeMots.addAll(mutableListOf("fruits"))
        //val randomizedList = mots.shuffled()
        if (listeDeMots.isEmpty()) {
            throw IllegalArgumentException("La liste de mots est vide")
        }
        MotÀDeviner = listeDeMots.random()
        this.pointage
        this.nbErreur
    }

    /**
     * Compare chacoun des lettres du mot à deviner par une boucle et condition
     */


    fun essayerUneLettre(lettre: Char): Boolean {
        var ListeMotADeviner = MotÀDeviner.toCharArray()
        var lettreMAj = lettre.uppercaseChar()
        var succès = false
        if (!LettreEssayées.contains(lettreMAj)) {

            //LettreEssayées.add(lettreMAj)


            if (ListeMotADeviner.contains(lettreMAj)) {
                //pointage++
                LettreEssayées.add(lettreMAj)
                //nbErreur++
                succès = true


            } else   {
                succès = false
                LettreEssayées.add(lettreMAj)
                //pointage++

            }
            if(succès) {
                pointage++
            } else if(!succès) {
                nbErreur++
            }


            }
            return succès

        }
        /**
         * Verifie si l'utilisateur a réussi ou non la partie
         */

        fun estRéussi(): Boolean {
            var retour = false
            var MotÀDevine = MotÀDeviner.toCharArray()
            if (MotÀDevine.size == pointage) {
                retour = true

            }
            return retour
        }

        /**
         * Reinitailise la partie
         */

        fun réinitialiser() {
            pointage = 0
            nbErreur = 0
            MotÀDeviner = listeDeMots.random()
            LettreEssayées.clear()
        }

        /**
         *
         */

        fun étatLettres(): CharArray {
            var i: Int = 0
            var StatutMot: CharArray = CharArray(MotÀDeviner.length - 1) { '*' }
            //var solution = MotÀDeviner.toCharArray()
            val arrayMotADeviner: Array<String> = MotÀDeviner.map { it.toString() }.toTypedArray()
            for (lettresDevines: Char in LettreEssayées) {
                i = 0
                for (lettresMotADeviner: String in arrayMotADeviner) {
                    if (lettresMotADeviner.single().lowercase()
                            .equals((lettresDevines.lowercase()))
                    ) {
                        StatutMot.set(i, lettresDevines)
                    }
                    i++
                }
            }


            return StatutMot
        }

        fun NbrScore(): Int {
            var Score = 0
            Score = pointage - nbErreur
            return Score

        }






}








