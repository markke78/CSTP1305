import java.util.Stack;

class Record {
    int firstIndex;
    int lastIndex;

    public Record(int a, int b) {
        firstIndex = a;
        lastIndex = b;
    }
}

class RecursionDemo {
    static void countDownIte(int num) {
        while (num >= 1) {
            System.out.println(num);
            num--;
        }
    }

    public static void countDownRec(int num) {
        if (num == 0) {
            System.out.println(num);
            return;
        } else {
            countDownRec(num - 1);
        }
    }

    public static int sumOfIne(int n) {
        int sum = 0;
        for (int i = 0; i <= n; ++i) {
            sum += i;
        }
        return sum;
    }

    public static int sumOfRec(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumOfRec(n - 1);
        }
    }

    public static void displayArrayFromFirst_ite(int[] array, int firstIndex, int lastIndex) {

        while (firstIndex < lastIndex) {
            System.out.println(array[firstIndex]);
            firstIndex++;
        }
    }

    public static void displayArrayFromFirst_rec(int[] array, int firstIndex, int lastIndex) {
        if (firstIndex <= lastIndex) {
            System.out.println(array[firstIndex]);
            displayArrayFromFirst_rec(array, firstIndex + 1, lastIndex);
        }
    }

    static void displayArrayFromFirst_r2(int[] array, int firstIndex, int lastIndex) {
        if (firstIndex <= lastIndex) {
            displayArrayFromFirst_r2(array, firstIndex, lastIndex - 1);
            System.out.println(array[lastIndex]);
        }
    }

    static void displayArrayFromLast_r(int[] array, int firstIndex, int lastIndex) {
        if (firstIndex <= lastIndex) {
            System.out.println(array[lastIndex]);
            displayArrayFromLast_r(array, firstIndex, lastIndex - 1);
        }
    }

    public static void displayArrayFromLast_r2(int[] array, int firstIndex, int lastIndex) {
        if (firstIndex <= lastIndex) {
            displayArrayFromLast_r2(array, firstIndex + 1, lastIndex);
            System.out.println(array[firstIndex]);
        }

    }

    static void displayArrayFromMiddle_i(int[] array, int firstIndex, int lastIndex) {
        Stack<Record> aStack = new Stack<Record>();
        aStack.add(new Record(firstIndex, lastIndex));

        while (!aStack.empty()) {
            Record topRecord = aStack.pop();
            int first = topRecord.firstIndex;
            int last = topRecord.lastIndex;
            if (first <= last) {
                int mid = (first + last) / 2;
                System.out.println(array[mid]);
                aStack.push(new Record(mid + 1, last));
                aStack.push(new Record(first, mid - 1));
            }
        }
    }

    static void displayArrayFromMiddle_r(int[] array, int firstIndex, int lastIndex) {
        if (firstIndex <= lastIndex) {
            int mid = (firstIndex + lastIndex) / 2;
            System.out.println(array[mid]);
            displayArrayFromMiddle_r(array, firstIndex, mid - 1);
            displayArrayFromMiddle_r(array, mid + 1, lastIndex);
        }
    }

    public static void main(String[] args) {
        // countDownIte(10);
        // countDownRec(10);
        // System.out.println(sumOfIne(10));
        // System.out.println(sumOfRec(10));
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };
        // displayArrayFromFirst_rec(array, 2, 7);
        // displayArrayFromLast_r(array, 2, 7);
        displayArrayFromMiddle_i(array, 0, 7);
        // displayArrayFromMiddle_r(array, 0, 7);
    }
}