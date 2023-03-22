import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DictionaryUsingHashingUsingQuadraticProbingTest {
    @Test
    public void insert_Test() {
        DictionaryUsingHashingUsingQuadraticProbing dictionary = new DictionaryUsingHashingUsingQuadraticProbing();
        dictionary.insert(1, "one");
        dictionary.insert(2, "two");
        dictionary.insert(3, "three");

        assertEquals("one", dictionary.get(1));
        assertEquals(3, dictionary.getSize());
    }

    @Test
    public void delete_Test() {
        DictionaryUsingHashingUsingQuadraticProbing dictionary = new DictionaryUsingHashingUsingQuadraticProbing();
        dictionary.insert(1, "one");
        dictionary.insert(2, "two");
        dictionary.insert(3, "three");

        assertEquals("This Item was deleted", dictionary.delete(1));
        assertEquals(null, dictionary.get(1));
        assertEquals(2, dictionary.getSize());
    }

    @Test
    public void get_Test() {
        DictionaryUsingHashingUsingQuadraticProbing dictionary = new DictionaryUsingHashingUsingQuadraticProbing();
        dictionary.insert(1, "one");
        dictionary.insert(2, "two");
        dictionary.insert(3, "three");

        assertEquals("one", dictionary.get(1));
        assertEquals("two", dictionary.get(2));
        assertEquals("three", dictionary.get(3));
        assertEquals(null, dictionary.get(4));
    }

    @Test
    public void getSize_Test() {
        DictionaryUsingHashingUsingQuadraticProbing dictionary = new DictionaryUsingHashingUsingQuadraticProbing();
        dictionary.insert(1, "one");
        dictionary.insert(2, "two");
        dictionary.insert(3, "three");

        assertEquals(3, dictionary.getSize());
    }

    @Test
    public void getHashIndex_Test() {
        DictionaryUsingHashingUsingQuadraticProbing dictionary = new DictionaryUsingHashingUsingQuadraticProbing();
        assertEquals(1, dictionary.getHashIndex(1));
        assertEquals(2, dictionary.getHashIndex(2));
        assertEquals(3, dictionary.getHashIndex(3));
    }

}
