package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createCatTest()
    {
        // Given (cat data)
        String givenName = "Cat3";
        Date givenBirthDate = new Date();

        AnimalFactory factory1 = new AnimalFactory();
        Cat cat1 = factory1.createCat(givenName,givenBirthDate);
        // When (a cat is constructed)
        //Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat1.getName();
        Date retrievedBirthDate = cat1.getBirthDate();
        // Then (we expect the given data, to match the retrieved data)

        //System.out.println("retrievedName  is --> "+retrievedName);
        //System.out.println("retrievedBirthDate  is --> "+retrievedBirthDate);

        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);

    }

    @Test
    public void createDogTest()
    {
        // Given (cat data)
        String givenName = "Dog3";
        Date givenBirthDate = new Date();

        AnimalFactory factory1 = new AnimalFactory();
        Dog dog1 = factory1.createDog(givenName,givenBirthDate);

        // When (we retrieve data from the cat)
        String retrievedName = dog1.getName();
        Date retrievedBirthDate = dog1.getBirthDate();
        // Then (we expect the given data, to match the retrieved data)

        System.out.println("retrievedName  is --> "+retrievedName);
        System.out.println("retrievedBirthDate  is --> "+retrievedBirthDate);

        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);

    }
}
