package Modèle



class Jeu(val mots:MutableList<String> ) {
    var pointage = 0
    var nbErreur = 0

    var lettreDejaDevine : Char = 'a'
    var ListeLettreDejaDevine = mutableListOf<Char>()

    init {
        this.mots.addAll(mutableListOf("Fruits", "Voiture", "Police"))
        //val randomizedList = mots.shuffled()
        this.pointage
        this.nbErreur
    }

    var HasardMot = mots.shuffled()


    fun verifiieTableau() : List<String> {
        if (mots.isEmpty()) {
            throw IllegalArgumentException("Le tableau ne contient de mots")
        }
        return mots

    }

    fun essayerUneLettre(devinelettre : Char){

        for ( lettre in HasardMot.iterator()) {
            if (devinelettre.lowercase().equals(lettre.lowercase())|| devinelettre.uppercase().equals(lettre.uppercase())) {
                pointage++
                lettreDejaDevine = devinelettre
                ListeLettreDejaDevine.add(lettreDejaDevine)

        }else if (devinelettre.equals(lettreDejaDevine)) {
                println("Vous avez deja devine cettre lettre")
        }
        else
            nbErreur++

        }

    }

    fun estRéussi() : Boolean  {
        if (ListeLettreDejaDevine.joinToString("") == HasardMot.joinToString("")) {
            return true


    }

    fun réinitialiser() {
        pointage=0
        nbErreur=0
        HasardMot = mots.shuffled()
    }

    fun étatLettres()  {

        //val uppercaseCh = ListeLettreDejaDevine.toUpperCase()

    }



    }








}