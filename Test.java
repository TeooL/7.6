import java.util.ArrayList;
public class Test {
    public static void main(String[] args) {
        Algorithms a = new Algorithms();
        String[] testcase1 = new String[]{"zebra", "alpha"};
        String[] testcase2 = new String[]{"four", "two", "ace"};
        String[] testcase3 = new String[]{"bye", "hello", "cat", "eon"};
        a.stringSelectionSort(testcase1);
        a.stringSelectionSort(testcase2);
        a.stringSelectionSort(testcase3);

        String[] testcase4 = new String[]{"zebra", "alpha"};
        String[] testcase5 = new String[]{"four", "two", "ace"};
        String[] testcase6 = new String[]{"bye", "hello", "cat", "eon"};
        a.stringInsertionSort(testcase4);
        a.stringInsertionSort(testcase5);
        a.stringInsertionSort(testcase6);

        ArrayList<String> testcase7 = a.createTestCase(new String[]{"zebra","alpha"});
        ArrayList<String> testcase8 = a.createTestCase(new String[]{"xylophone","basement", "guitar"});
        ArrayList<String> testcase9 = a.createTestCase(new String[]{"ghost","dog","five"});
        a.arraylistStringSelectionSort(testcase7);
        a.arraylistStringSelectionSort(testcase8);
        a.arraylistStringSelectionSort(testcase9);

        ArrayList<String> testcase10 = a.createTestCase(new String[]{"zebra","alpha"});
        ArrayList<String> testcase11 = a.createTestCase(new String[]{"xylophone","basement", "guitar"});
        ArrayList<String> testcase12 = a.createTestCase(new String[]{"ghost","dog","five"});
        a.arraylistStringInsertionSort(testcase10);
        a.arraylistStringInsertionSort(testcase11);
        a.arraylistStringInsertionSort(testcase12);

        ArrayList<Integer> testcase13 = a.createTestCase(new int[]{1,0,-1});
        ArrayList<Integer> testcase14 = a.createTestCase(new int[]{-1,4,1});
        ArrayList<Integer> testcase15 = a.createTestCase(new int[]{5,4,1,2});
        a.arraylistIntegerSelectionSort(testcase13);
        a.arraylistIntegerSelectionSort(testcase14);
        a.arraylistIntegerSelectionSort(testcase15);

        ArrayList<Integer> testcase16 = a.createTestCase(new int[]{1,0,-1});
        ArrayList<Integer> testcase17 = a.createTestCase(new int[]{-1,4,1});
        ArrayList<Integer> testcase18 = a.createTestCase(new int[]{5,4,1,2});
        a.arraylistIntegerInsertionSort(testcase16);
        a.arraylistIntegerInsertionSort(testcase17);
        a.arraylistIntegerInsertionSort(testcase18);

    }
}

