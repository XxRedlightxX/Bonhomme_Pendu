package dti.g25.pendu.Modèle

import android.widget.TextView
import dti.g25.pendu.R


class Jeu(val listeDeMots:MutableList<String> ) {
    var LettreEssayées = mutableListOf<Char>()
    var MotÀDeviner: String = ""
     lateinit var image: TextView
    //image = findViewById<ImageView>(R.id.image)

    var pointage = 0
    var nbErreur = 0
    var cards= arrayOf(
        R.drawable.image1,
        R.drawable.image2,
        R.drawable.image3,
        R.drawable.image4,
        R.drawable.image5)


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
        val ListeMotADeviner = MotÀDeviner.toCharArray()
        lettre.uppercaseChar()


        for (ic in ListeMotADeviner) {
            if (ListeMotADeviner.contains(lettre) && !LettreEssayées.contains(lettre)) {
                pointage++
                LettreEssayées.add(lettre)
                return true

            } else if (LettreEssayées.contains(lettre)) {
                nbErreur++
                /*val photo = when (nbErreur) {
                    1 -> R.drawable.image1
                    2 -> R.drawable.image2
                    3 -> R.drawable.image3
                    4 -> R.drawable.image4
                    3 -> R.drawable.image5
                    else -> {}

                }*/






                LettreEssayées.add(lettre)

                return false
            } else {
                nbErreur++
                LettreEssayées.add(lettre)


                return false
            }
            LettreEssayées



        }
        return false
    }
    /**
     * Verifie si l'utilisateur a réussi ou non la partie
     */

    fun estRéussi(): Boolean {
        var StatutMots: CharArray = CharArray(MotÀDeviner.length - 1)
        val arrayMotADeviner: Array<String> = MotÀDeviner.map { it.toString() }.toTypedArray()
        var SolutionMotDeviner = arrayMotADeviner.toString()
        var LettreEssayerString = StatutMots.toString()
        if (SolutionMotDeviner ==LettreEssayerString) {
            return true
        }
        return false

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
                if (lettresMotADeviner.single().lowercase().equals((lettresDevines.lowercase()))) {
                    StatutMot.set(i, lettresDevines)
                }
                i++
            }
        }


        return StatutMot
    }

    fun NbrePoints() : Int {
        return pointage -nbErreur
    }




}






