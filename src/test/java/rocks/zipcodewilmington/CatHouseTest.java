package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void addTest()
    {
        //String expectedName = "Tom";
        Cat cat1 = new Cat("Tom",new Date(),0);
        CatHouse catHouse1 = new CatHouse();
        catHouse1.add(cat1);
        //Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void removeIdTest(){
        //String expectedName = "Tom";
        Cat cat1 = new Cat("Tom",new Date(),10);
        CatHouse catHouse1 = new CatHouse();
        catHouse1.add(cat1);
        catHouse1.remove(10);

        //Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void removeCatTest()
    {
        //String expectedName = "Tom";
        Cat cat1 = new Cat("Tom",new Date(),10);
        CatHouse catHouse1 = new CatHouse();
        catHouse1.add(cat1);
        //System.out.println("Actual NAme is --> "+catHouse1.toString());
        catHouse1.remove(cat1);
        //Assert.assertEquals(expectedName, actualName);

    }

    @Test
    public void getCatByIdTest()
    {
        // Given (cat data)
        String givenName = "Puffy";
        Date givenBirthDate = new Date();
        Integer givenId = 30;
        Cat cat1 = new Cat(givenName, givenBirthDate, givenId);
        // adding cat to catHouse
        CatHouse catHouse1 = new CatHouse();
        catHouse1.add(cat1);

        Cat cat2 = catHouse1.getCatById(30);

        String retrievedName = cat2.getName();
        Date retrievedBirthDate = cat2.getBirthDate();
        Integer retrievedId = cat2.getId();
        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
//        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);


    }

    @Test
    public void getNumberOfCatsTest()
    {
        String givenName = "Puffy";
        Date givenBirthDate = new Date();
        Integer givenId = 30;
        Cat cat1 = new Cat(givenName, givenBirthDate, givenId);
        // adding cat to catHouse
        CatHouse catHouse1 = new CatHouse();
        catHouse1.add(cat1);

        Integer noOfCats= catHouse1.getNumberOfCats();
        System.out.println("No of cats is --> "+noOfCats);

    }


}
