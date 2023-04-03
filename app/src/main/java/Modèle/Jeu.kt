package Modèle



class Jeu(val listeDeMots:MutableList<String> ) {
    private var LettreEssayées = CharArray(26)
    private var MotÀDeviner : String=""

    var pointage = 0
    var nbErreur = 0



    init {
        this.listeDeMots.addAll(mutableListOf("Fruits", "Voiture", "Police"))
        //val randomizedList = mots.shuffled()
        if (listeDeMots.isEmpty()) {
            throw IllegalArgumentException("La liste de mots est vide")
        }
        MotÀDeviner = listeDeMots.random()
        this.pointage
        this.nbErreur
    }







    fun essayerUneLettre(lettre : Char) : Boolean {
        val charArray = MotÀDeviner.toCharArray()
        lettre.uppercaseChar()
        for (ic in charArray) {
            if (charArray.contains(lettre)) {
                pointage++
                LettreEssayées.plus(lettre)
                return true

            } else if (LettreEssayées.contains(lettre)) {
                nbErreur++
                LettreEssayées.plus(lettre)
                return false
            } else {
                nbErreur++

                return false
            }


        }
        return true
    }

        fun estRéussi() : Boolean {
            var convertedString = String(LettreEssayées)
            if (MotÀDeviner.contains(convertedString)) {
                return true
            }
            return false

        }





            fun réinitialiser() {
                pointage = 0
                nbErreur = 0
                MotÀDeviner = listeDeMots.random()
            }

            fun étatLettres() :CharArray {
                val charArray = MotÀDeviner.toCharArray()

                for (ic in charArray) {
                    if (charArray.contains(ic)) {
                        charArray.plus(ic)
                    }
                }


            return charArray



                        //val uppercaseCh = ListeLettreDejaDevine.toUpperCase()

            }





    }