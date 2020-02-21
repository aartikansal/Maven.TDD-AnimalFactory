package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.Food;
import rocks.zipcodewilmington.animals.Mammal;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest
{
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    String givenName = "Cat1";
    Date givenBirthDate = new Date();
    Integer givenId = 10;

    // When (a cat is constructed)
    Cat cat1 = new Cat(givenName, givenBirthDate, givenId);

    @Test
    public void constructorTest()
    {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();
        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
       public void setNameTest()
        {
         String expectedName = "Tom";
         Cat cat = new Cat("Tom",new Date(),0);
         //cat.setName(expectedName);
         String actualName = cat.getName();
         System.out.println("Actual NAme is --> "+actualName);
         Assert.assertEquals(expectedName, actualName);
     }

    @Test
       public void speakTest()
    {
       String speak1 = cat1.speak();
        System.out.println("Speak is  --> "+speak1);
    }

    @Test
    public void setBirthDate()
    {
        Date expectedBirthDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        cat1.setBirthDate(givenBirthDate);
        Date actualBirthDate = cat1.getBirthDate();
        System.out.println("Actual actualBirthDate is --> "+actualBirthDate);

        String expectedDate = formatter.format(expectedBirthDate);
        String actualDate= formatter.format(actualBirthDate);

        //System.out.println("Actual expectedDate is --> "+expectedDate);
        //System.out.println("Actual actualDate is --> "+actualDate);
        Assert.assertEquals(expectedDate, actualDate);
    }

    @Test
    public void eatTest()
    {
        Food food1 = new Food();
        cat1.eat(food1);
        Integer mealsEaten = cat1.getNumberOfMealsEaten();
        System.out.println("Actual eatTest is --> "+mealsEaten);
    }

    @Test
    public void getIdTest()
    {
        Integer getID = cat1.getId();
        System.out.println("Actual getID is --> "+getID);
    }

    @Test
    public void classCatInstanceofParentClassMammalTest()
    {
        //instanceof is a binary operator used to test if an object is of a given type.
        // The result of the operation is either true or false.
        // It's also known as type comparison operator because it compares the instance with type.

        // we are checking if cat1 is an instance of Mammal parent class
        Boolean checkInstance = cat1 instanceof Mammal;
        System.out.println("Actual checkInstance is --> "+checkInstance);
        Assert.assertTrue(cat1 instanceof Mammal);

    }

    @Test
    public void classCatInstanceofInterfaceAnimalTest()
    {
        // Here we are checking if cat1 is an instance of interface Animal
        // cat1 extends super class Mammal and which in turn implements interface Animal

        Boolean checkInstance = cat1 instanceof Animal;
        System.out.println("Actual checkInstance is --> "+checkInstance);
        Assert.assertTrue(cat1 instanceof Animal);

    }

}


