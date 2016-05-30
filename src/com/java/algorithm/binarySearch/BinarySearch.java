package com.java.algorithm.binarySearch;

/**
 * 二分查找算法
 */
public class BinarySearch {
    public static void main(String[] args) {
        int srcArray[] = {3, 5, 11, 17, 21, 23, 28, 30, 32, 50, 64, 78, 81, 95, 101};
        //递归实现二分查找
        System.out.println("index = " + binSearch(srcArray, 0, srcArray.length - 1, 81));
        //非递归实现二分查找
        System.out.println("index = " + binSearch(srcArray, 81));
    }

    /**
     * 递归实现
     *
     * @param srcArray
     * @param start
     * @param end
     * @param key
     * @return
     */
    private static int binSearch(int[] srcArray, int start, int end, int key) {
        int mid = (end - start) / 2 + start;
        if (srcArray[mid] == key) {
            return mid;
        }

        if (start >= end) {
            return -1;
        } else if (key > srcArray[mid]) {
            return binSearch(srcArray, mid + 1, end, key);
        } else if (key < srcArray[mid]) {
            return binSearch(srcArray, 0, mid - 1, key);
        }
        return -1;
    }

    /**
     * 非递归实现
     *
     * @param srcArray
     * @param key
     * @return
     */

    private static int binSearch(int[] srcArray, int key) {

        int mid = srcArray.length / 2;
        if (key == srcArray[mid]) {
            return mid;
        }
        int start = 0;
        int end = srcArray.length - 1;

        while (start <= end) {
            mid = (end - start) / 2 + start;
            if (key == srcArray[mid]) {
                return mid;
            } else if (key > srcArray[mid]) {
                start = mid + 1;
            } else if (key < srcArray[mid]) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
