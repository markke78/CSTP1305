import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DictionaryUsingHashingUsingSeparateChainingTest {
    @Test
    public void insert_Test() {
        DictionaryUsingHashingUsingSeparateChaining dictionary = new DictionaryUsingHashingUsingSeparateChaining(10);
        dictionary.insert(1, "one");
        dictionary.insert(2, "two");
        dictionary.insert(3, "three");
        dictionary.insert(13, "thirteen");
        assertEquals("one", dictionary.get(1));
        assertEquals("thirteen", dictionary.get(13));
        assertEquals(4, dictionary.getSize());
    }

    @Test
    public void delete_Test() {
        DictionaryUsingHashingUsingSeparateChaining dictionary = new DictionaryUsingHashingUsingSeparateChaining(10);
        dictionary.insert(1, "one");
        dictionary.insert(2, "two");
        dictionary.insert(3, "three");
        assertEquals("one", dictionary.delete(1));
        assertEquals(null, dictionary.get(1));
        assertEquals(2, dictionary.getSize());
    }

    @Test
    public void get_Test() {
        DictionaryUsingHashingUsingSeparateChaining dictionary = new DictionaryUsingHashingUsingSeparateChaining(10);
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
        DictionaryUsingHashingUsingSeparateChaining dictionary = new DictionaryUsingHashingUsingSeparateChaining(10);
        dictionary.insert(1, "one");
        dictionary.insert(2, "two");
        dictionary.insert(3, "three");
        assertEquals(3, dictionary.getSize());
    }

    @Test
    public void getBucketIndex_Test() {
        DictionaryUsingHashingUsingSeparateChaining dictionary = new DictionaryUsingHashingUsingSeparateChaining(10);
        assertEquals(1, dictionary.getBucketIndex(1));
        assertEquals(2, dictionary.getBucketIndex(2));
        assertEquals(3, dictionary.getBucketIndex(3));
    }

    @Test
    public void isEmpty_Test() {
        DictionaryUsingHashingUsingSeparateChaining dictionary = new DictionaryUsingHashingUsingSeparateChaining(10);
        assertEquals(true, dictionary.isEmpty());
        dictionary.insert(1, "one");
        assertEquals(false, dictionary.isEmpty());
    }
    
}
