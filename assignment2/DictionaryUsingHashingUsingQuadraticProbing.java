class DictionaryUsingHashingUsingQuadraticProbing {
    class Item {
        public String value;
        public Integer key;

        Item() {
            value = null;
            key = null;
        }
    }

    Item[] arr;
    private int size;
    final int TABLE_SIZE = 23;

    DictionaryUsingHashingUsingQuadraticProbing() {
        arr = new Item[23];
        for (int i = 0; i < TABLE_SIZE; i++) {
            arr[i] = new Item();
        }
    }

    public int getSize() {
        return size;
    }

    int getHashIndex(Integer key) {
        int hashIndex = key % TABLE_SIZE;
        return hashIndex;
    }

    public void insert(Integer key, String value) {
        int i = 0;
        int hashIndex = getHashIndex(key);

        while (arr[hashIndex].key != null) {
            hashIndex += i * i;
            i++;
            hashIndex %= TABLE_SIZE;
        }
        size++;
        arr[hashIndex].key = key;
        arr[hashIndex].value = value;
    }

    public String get(Integer key) {
        int i = 0;
        int hashIndex = getHashIndex(key);

        while (arr[hashIndex].key != null) {
            if (arr[hashIndex].key == key) {
                return arr[hashIndex].value;
            }
            hashIndex += i * i;
            i++;
            hashIndex %= TABLE_SIZE;
        }
        return null;
    }

    public String delete(Integer key) {
        int i = 0;
        int hashIndex = getHashIndex(key);

        while (arr[hashIndex].key != null) {
            if (arr[hashIndex].key == key) {

                arr[hashIndex].key = null;
                arr[hashIndex].value = null;
                size--;

            }
            hashIndex += i * i;
            i++;
            hashIndex %= TABLE_SIZE;
        }
        return "This Item was deleted";
    }

    public static void main(String[] args) {
        DictionaryUsingHashingUsingQuadraticProbing aDict = new DictionaryUsingHashingUsingQuadraticProbing();
        aDict.insert(29, "some value1");// should be inserted at index 6
        aDict.insert(32, "some value2");// should be inserted at index 9
        System.out.println(aDict.get(32));
        aDict.insert(58, "some value3");// should be inserted at index 12
        aDict.insert(81, "some value4");// should be inserted at index 13
        aDict.insert(35, "some value5");// should be inserted at index 14
        aDict.insert(15, "some value6");// should be inserted at index 20
        System.out.println(aDict.getSize());
        System.out.println(aDict.get(15));
        aDict.delete(15);
        System.out.println(aDict.get(15));
        System.out.println(aDict.delete(15));
        System.out.println(aDict.getSize());
        // aDict.insert(12, "some value7");// should be inserted at index 22
    }
}