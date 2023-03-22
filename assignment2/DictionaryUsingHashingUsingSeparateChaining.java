class DictionaryUsingHashingUsingSeparateChaining {
    private HashNode[] buckets;
    private int size;
    private int numOfBuckets;

    public DictionaryUsingHashingUsingSeparateChaining(int capacity) {
        this.numOfBuckets = capacity;
        buckets = new HashNode[capacity];
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    int getBucketIndex(Integer key) {
        return key % numOfBuckets;
    }

    public void insert(Integer key, String value) {
        if (key == null || value == null) {
            throw new IllegalArgumentException("Key or value cannot be null");
        }
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        size++;
        head = buckets[bucketIndex];
        HashNode newNode = new HashNode(key, value);
        newNode.next = head;
        buckets[bucketIndex] = newNode;
    }

    public String get(Integer key) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public String delete(Integer key) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        HashNode prev = null;
        while (head != null) {
            if (head.key.equals(key)) {
                break;
            }
            prev = head;
            head = head.next;
        }
        if (head == null) {
            return null;
        }
        size--;
        if (prev != null) {
            prev.next = head.next;
        } else {
            buckets[bucketIndex] = head.next;
        }
        return head.value;
    }

    public static void main(String[] args) {
        DictionaryUsingHashingUsingSeparateChaining aDict = new DictionaryUsingHashingUsingSeparateChaining(10);
        aDict.insert(1, "One");
        aDict.insert(2, "Two");
        aDict.insert(3, "Three");
        aDict.insert(11, "Four");
        aDict.insert(12, "Five");
        aDict.insert(13, "Six");
        aDict.insert(21, "Seven");
        aDict.insert(22, "Eight");
        aDict.insert(23, "Nine");
        aDict.insert(31, "Ten");
        aDict.insert(32, "Eleven");
        aDict.insert(33, "Twelve");
        aDict.insert(41, "Thirteen");
        aDict.insert(3, "Fourteen");
        System.out.println(aDict.getSize());
        System.out.println(aDict.get(23));
        System.out.println(aDict.delete(3));
        System.out.println(aDict.getSize());
    }
}