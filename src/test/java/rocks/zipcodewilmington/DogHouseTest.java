package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void addDogTest()
    {
        //String expectedName = "Tommy";
        Dog dog1 = new Dog("Tommy",new Date(),0);
        DogHouse dogHouse1 = new DogHouse();
        dogHouse1.add(dog1);
        //Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void removeIdTest(){

        Dog dog1 = new Dog("Tommy",new Date(),0);
        DogHouse dogHouse1 = new DogHouse();
        dogHouse1.add(dog1);
        dogHouse1.remove(10);

        //Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void removeDogTest()
    {
        Dog dog1 = new Dog("Tommy",new Date(),0);
        DogHouse dogHouse1 = new DogHouse();
        dogHouse1.add(dog1);
        //System.out.println("Actual NAme is --> "+catHouse1.toString());
        dogHouse1.remove(dog1);
        //Assert.assertEquals(expectedName, actualName);

    }

    @Test
    public void getDogByIdTest()
    {
        // Given (cat data)
        String givenName = "Tommy2";
        Date givenBirthDate = new Date();
        Integer givenId = 30;
        Dog dog1 = new Dog(givenName, givenBirthDate, givenId);
        // adding cat to catHouse
        DogHouse dogHouse1 = new DogHouse();
        dogHouse1.add(dog1);

        Dog dog2 = dogHouse1.getDogById(30);

        String retrievedName = dog2.getName();
        Date retrievedBirthDate = dog2.getBirthDate();
        Integer retrievedId = dog2.getId();
        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
       // Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);


    }

    @Test
    public void getNumberOfDogsTest()
    {
        String givenName = "Puffy";
        Date givenBirthDate = new Date();
        Integer givenId = 30;
        Dog dog1 = new Dog(givenName, givenBirthDate, givenId);
        // adding cat to catHouse
        DogHouse dogHouse1 = new DogHouse();
        dogHouse1.add(dog1);

        Integer noOfDogs= dogHouse1.getNumberOfDogs();
        System.out.println("No of dogs is --> "+noOfDogs);

    }
}
