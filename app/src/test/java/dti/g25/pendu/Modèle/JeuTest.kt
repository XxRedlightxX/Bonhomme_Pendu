package dti.g25.pendu.Modèle

import dti.g25.pendu.Modèle.Jeu
import dti.g25.pendu.lettres
import org.junit.Assert.*
import org.junit.Test

class JeuTest {
    @Test
    fun `Étant que le tableau de mots est vide cela retourne rien` () {
        var liste = mutableListOf<String>()
        var messageSortie: String? = ""
        try{
            Jeu(liste)
        } catch (exc: java.lang.IllegalArgumentException){
            messageSortie = exc.message
        }
        assertEquals("La liste est vide",messageSortie)
    }


    @Test
    fun `Étant donné que la lettre c minuscule correspond à une des lettres du mot Chaise cela retourn true  `() {

        // Mise en place
        val lettre = 'c'
        val listeMots = mutableListOf<String>("CHAISE")

        // Action
        val cobaye = Jeu(listeMots)
        val sortie_observée = cobaye.essayerUneLettre(lettre)

        // Vérification
        assertEquals(true, sortie_observée)
        println(sortie_observée)



    }

    @Test
    fun `Étant donné que la lettre deviné est mauvaise cela retourne un tableau vide `() {

        val listeMots = mutableListOf<String>("RICHE")

        // Action
        val cobaye = Jeu(listeMots)
        val sortie_observée = cobaye.étatLettres().joinToString()
        //cobaye.essayerUneLettre('i')
        cobaye.essayerUneLettre('X')





        // Vérification
        assertEquals(cobaye.étatLettres().joinToString(", "), sortie_observée)



    }

    @Test
    fun `Étant donné que le score augmente ou décremente en fonction du choix de la bonne lettre`() {

        val listeMots = mutableListOf<String>("BRUH")

        // Action
        val cobaye = Jeu(listeMots)
        //val sortie_observée = cobaye.nbErreur
        //cobaye.essayerUneLettre('i')
        //cobaye.essayerUneLettre('M')
        cobaye.essayerUneLettre('H')
        //cobaye.essayerUneLettre('D')




        println(cobaye.nbErreur)
        println(cobaye.pointage)




        assertEquals(1,cobaye.nbErreur)
        assertEquals(1,cobaye.pointage)



    }

    @Test
    fun `Étant donné que le mot est deviné le resultat est true, dans le cas contraire faux`() {

        val listeMots = mutableListOf<String>("AMIGO")

        // Action
        val cobaye = Jeu(listeMots)
        val sortie_observée = cobaye.estRéussi()
        cobaye.essayerUneLettre('A')
        cobaye.essayerUneLettre('M')
        cobaye.essayerUneLettre('I')
        cobaye.essayerUneLettre('G')
        cobaye.essayerUneLettre('O')







        // Vérification
        assertEquals(false, sortie_observée)



    }








}