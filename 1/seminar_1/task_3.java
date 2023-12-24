//Задание №3
//Дан массив nums = [3,2,2,3] и число val = 3.
//Если в массиве есть числа, равные заданному, нужно перенести
//эти элементы в конец массива.
//Таким образом, первые несколько (или все) элементов массива
//должны быть отличны от заданного, а остальные - равны ему.
package seminar_1;

import java.util.Arrays;

public class task_3 {
    public static void main(String[] args) {
        int[] nums = {3,4,6,2,3,8,3,5,3,2,2,3};
        int val = 3;
        int size = nums.length - 1;
        for (int i = size; i >= 0; i--) {
            if (nums[i] != val) {
                for (int j = i; j >= 0; j--) {
                    if (nums[j] == val) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }
        for (int j = 0; j < nums.length; j++) {
            System.out.println(nums[j]);
        }
        System.out.println();
        int[] array = sort(nums, val);

        System.out.println(Arrays.toString(array));
    }

    public static int[] sort(int[] array, int val) {
        int[] sortArt = new int [array.length];
        int countVal = array.length - 1;
        int countNum = 0;
        for (int i = 0; i < sortArt.length; i++) {
            if (array[i] == val) {
                sortArt[countVal] = val;
                countVal --;
            } else {
                sortArt[countNum] = array[i];
                countNum++;
            }
        } return sortArt;
    }
}

