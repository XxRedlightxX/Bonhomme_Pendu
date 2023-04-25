package dti.g25.pendu.Modèle

import android.widget.TextView
import dti.g25.pendu.R


class Jeu(val listeDeMots:MutableList<String> ) {
    var lettreEssayées = mutableListOf<Char>()
    var motÀDeviner: String = ""

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
        motÀDeviner = listeDeMots.random()
        this.pointage
        this.nbErreur
    }

    /**
     * Compare chacoun des lettres du mot à deviner par une boucle et condition
     */


    fun essayerUneLettre(lettre: Char): Boolean {
        var ListeMotADeviner = motÀDeviner.toCharArray()
        var lettreMAj = lettre.uppercaseChar()
        var succès = false
        if (!lettreEssayées.contains(lettreMAj)) {

            //LettreEssayées.add(lettreMAj)


            if (ListeMotADeviner.contains(lettreMAj)) {
                pointage++
                lettreEssayées.add(lettreMAj)
                //nbErreur++
                succès = true


            }
            else  {
                    succès = false
                    nbErreur++
                    lettreEssayées.add(lettreMAj)


            }



            }
            return succès

        }
        /**
         * Verifie si l'utilisateur a réussi ou non la partie
         */

        fun estRéussi(): Boolean {
            for(lettreÀDeviner in motÀDeviner) {
                if(!lettreEssayées.contains(lettreÀDeviner)) {
                    return false
                }
            }
            return true


        }

        /**
         * Reinitailise la partie
         */

        fun réinitialiser() {
            pointage = 0
            nbErreur = 0
            motÀDeviner = listeDeMots.random()
            lettreEssayées.clear()
        }

        /**
         * Iniatilise un tableau vide  va remplir en fonction des lettre devines
         */

        fun étatLettres(): CharArray {
            var i: Int = 0
            var StatutMot: CharArray = CharArray(motÀDeviner.length ) { '*' }
            //var solution = MotÀDeviner.toCharArray()
            val arrayMotADeviner: Array<String> = motÀDeviner.map { it.toString() }.toTypedArray()
            for (lettresDevines: Char in lettreEssayées) {
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








}








