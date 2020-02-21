package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    String givenName = "Dog1";
    Date givenBirthDate = new Date();
    Integer givenId = 20;

    // When (a dog is constructed)
    Dog dog1 = new Dog(givenName, givenBirthDate, givenId);

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void constructorTest()
    {
        // This method is to test new Dog - the first test case

        // Given (dog data)
        String givenName = "Dog2";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();
        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void speakTest()
    {
        String speak1 = dog1.speak();
        System.out.println("Speak is  --> "+speak1);
    }

    @Test
    public void eatTest()
    {
        Food food1 = new Food();
        dog1.eat(food1);
        Integer mealsEaten = dog1.getNumberOfMealsEaten();
        System.out.println("Actual eatTest is --> "+mealsEaten);
    }

    @Test
    public void getIdTest()
    {
        Integer getID = dog1.getId();
        System.out.println("Actual getID is --> "+getID);
    }

    @Test
    public void setBirthDate()
    {
        Date expectedBirthDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        dog1.setBirthDate(givenBirthDate);
        Date actualBirthDate = dog1.getBirthDate();
        System.out.println("Actual actualBirthDate is --> "+actualBirthDate);

        String expectedDate = formatter.format(expectedBirthDate);
        String actualDate= formatter.format(actualBirthDate);

        //System.out.println("Actual expectedDate is --> "+expectedDate);
        //System.out.println("Actual actualDate is --> "+actualDate);
        Assert.assertEquals(expectedDate, actualDate);
    }

    @Test
    public void classDogInstanceofParentClassMammalTest()
    {
        //instanceof is a binary operator used to test if an object is of a given type.
        // The result of the operation is either true or false.
        // It's also known as type comparison operator because it compares the instance with type.

        // we are checking if cat1 is an instance of Mammal parent class
        Boolean checkInstance = dog1 instanceof Mammal;
        System.out.println("dog is an instance of Mammal (True/False) --> "+checkInstance);
        Assert.assertTrue(dog1 instanceof Mammal);

    }

    @Test
    public void classDogInstanceofInterfaceAnimalTest()
    {
        // Here we are checking if cat1 is an instance of interface Animal
        // cat1 extends super class Mammal and which in turn implements interface Animal

        Boolean checkInstance = dog1 instanceof Animal;
        System.out.println("dog is an instance of Animal (True/False) --> "+checkInstance);
        Assert.assertTrue(dog1 instanceof Animal);

    }

}
