package dti.g25.pendu.Modèle

import org.junit.Assert.*
import org.junit.Test

class Jeu3Test {
    val myList = mutableListOf("Fruits", "Voiture", "Police")

    var jeu = Jeu(myList)

    @Test
    fun `test étant donné que le jeu nest pas reussi et que le mot nest pas trouvé` () {

        jeu.réinitialiser()
        assertEquals(false,jeu.estRéussi())


    }
}