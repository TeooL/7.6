import java.util.ArrayList;
public class Algorithms {
    public void stringSelectionSort(String[] arr){
        int length = arr.length;
        for (int i = 0; i < arr.length - 1;i++){
            int min = i;
            for (int j = i + 1; j < length;j++){
                if (arr[min].compareTo(arr[j]) > 0) min = j;
            }
            String temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for (String s : arr){
            System.out.print(s + " ");
        }
        System.out.println();
    }
    public void stringInsertionSort(String[] arr){
        int length = arr.length;
        for (int i = 1;i<length;i++){
            String temp = arr[i];
            int index = i - 1;
            while (index >= 0 && arr[index].compareTo(temp) > 0){
                arr[index + 1] = arr[index];
                index = index - 1;
            }
            arr[index+1] = temp;
        }
        for (String s: arr){
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public void arraylistStringSelectionSort(ArrayList<String> arr){
        int length = arr.size();
        for (int i = 0; i < arr.size() - 1;i++){
            int min = i;
            for (int j = i + 1; j < length;j++){
                if (arr.get(min).compareTo(arr.get(j)) > 0) min = j;
            }
            String temp = arr.get(min);
            arr.set(min,arr.get(i));
            arr.set(i, temp);
        }
        for (String s : arr){
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public void arraylistStringInsertionSort(ArrayList<String> arr){
        int length = arr.size();
        for (int i = 1;i<length;i++){
            String temp = arr.get(i);
            int index = i - 1;
            while (index >= 0 && arr.get(index).compareTo(temp) > 0){
                arr.set(index + 1,arr.get(index));
                index = index - 1;
            }
            arr.set(index+1,temp);
        }
        for (String s: arr){
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public void arraylistIntegerSelectionSort(ArrayList<Integer> arr){
        int length = arr.size();
        for (int i = 0; i < arr.size() - 1;i++){
            int min = i;
            for (int j = i + 1; j < length;j++){
                if (arr.get(min) > arr.get(j)) min = j;
            }
            int temp = arr.get(min);
            arr.set(min,arr.get(i));
            arr.set(i, temp);
        }
        for (int s : arr){
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public void arraylistIntegerInsertionSort(ArrayList<Integer> arr){
        int length = arr.size();
        for (int i = 1;i<length;i++){
            int temp = arr.get(i);
            int index = i - 1;
            while (index >= 0 && arr.get(index) > temp){
                arr.set(index + 1,arr.get(index));
                index = index - 1;
            }
            arr.set(index+1,temp);
        }
        for (int s: arr){
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public ArrayList<Integer> createTestCase(int[] nums){
        ArrayList<Integer> newNum = new ArrayList<Integer>();
        for (int i: nums){
            newNum.add(i);
        }
        return newNum;
    }
    public ArrayList<String> createTestCase(String[] words) {
        ArrayList<String> newNum = new ArrayList<String>();
        for (String i : words) {
            newNum.add(i);
        }
        return newNum;
    }
}



