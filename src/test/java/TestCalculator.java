import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {
    // 1. Cas valide on entre 1 et 1 on attend 2 en sortie
    @Test
    public void test1plus1()
    {
        // Arrange = Organiser
        int arg1 = 1;
        int arg2 = 1;
        int expectedResult = 2;

        //Act = Agir
        int returnedResult = Calculator.add(arg1,arg2);

        //Assert = Vérifier
        Assert.assertEquals(expectedResult, returnedResult);
    }
    // 2. Cas invalide hors classe d'équivalence integer par valeur sup
    //on tente de faire une somme qui dépasse 32 bit (rappel : 1111 + 1 = 10000 donc si on est limité à 4 bit
    // 1111 + 1 = 0000 donc on passe de MAX à MIN en ajoutant 1
    //on attend un message d'erreur type exception en sortie
    @Test (expected = IndexOutOfBoundsException.class)
    public void testMax()
    {
        // Arrange = Organiser
        int arg1 = Integer.MAX_VALUE;
        int arg2 = 1;

        //Act = Agir
        int returnedResult = Calculator.add(arg1,arg2);

        //Assert = Vérifier
        //On attend l'exception
    }
    // 3. Cas invalide hors classe d'équivalence integer par valeur min
    //on tente de faire une somme qui dépasse 32 bit
    //on attend un message d'erreur type exception en sortie
    @Test (expected = IndexOutOfBoundsException.class)
    public void testMin()
    {
        // Arrange = Organiser
        int arg1 = Integer.MIN_VALUE;
        int arg2 = -1;

        //Act = Agir
        int returnedResult = Calculator.add(arg1,arg2);

        //Assert = Vérifier
        //On attend l'exception
    }

}
