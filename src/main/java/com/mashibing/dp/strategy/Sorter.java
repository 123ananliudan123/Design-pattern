package com.mashibing.dp.strategy;

public class Sorter<T> {
//public class Sorter<T> {
    // 原先对数组见简单的排序
    /*public void sort(int[] arr) {
        for(int i=0; i<arr.length - 1; i++) {
            int minPos = i;

            for(int j=i+1; j<arr.length; j++) {
                minPos = arr[j] < arr[minPos] ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }*/

    // 原先对Cat继续简单的排序
    /*public void sort(Cat[] arr) {
        for(int i=0; i<arr.length - 1; i++) {
            int minPos = i;

            for(int j=i+1; j<arr.length; j++) {
                minPos = arr[j].compareTo(arr[minPos]) == -1 ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }*/

    // 原先对Dog继续简单的排序
    /*public void sort(Dog[] arr) {
        for(int i=0; i<arr.length - 1; i++) {
            int minPos = i;

            for(int j=i+1; j<arr.length; j++) {
                minPos = arr[j].compareTo(arr[minPos]) == -1 ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }*/

    /**
     * 现在是一个类型对应写一个sort()方法，代码十分冗余，还不便利。
     * 为了解决这种情况：
     * 在sort()中传参的时候，传 (Object[] arr)，即数组的类型是Object类（所有类的父类！！！）
     * 但是现在出现一个问题：因为sort()方法用到了compareTo()方法，而Object类中没有compareTo()方法，无法进行排序。
     * 解决：让所有要用sort()方法进行排序的类去实现一个接口，这个接口中要有compareTo()方法，即Comparable接口。
     * 并在sort()方法中传参(Comparable[] arr) !!!!
     *
     * 如下，实现Comparable接口后，再次对Cat进行排序(Dog是同样的代码)
     */
    //public void sort(Object[] arr) {  // 不行
    /*public *//*static*//* void sort(Comparable[] arr) {
        for(int i=0; i<arr.length - 1; i++) {
            int minPos = i;

            for(int j=i+1; j<arr.length; j++) {
                minPos = arr[j].compareTo(arr[minPos]) == -1 ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }*/


    /**
     * 设计模式 comparator   (想灵活地修改Cat中比较的方法)
     *
     * 给Sort加泛型
     * (之前还涉及到static的用法)
     *
     */


    public void sort(T[] arr, Comparator<T> comparator) {
        for(int i=0; i<arr.length - 1; i++) {
            int minPos = i;

            for(int j=i+1; j<arr.length; j++) {
                minPos = comparator.compare(arr[j],arr[minPos])==-1 ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }

    //sort(int)
    /*void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }*/

    //sort(Cat)
    /* void swap(Cat[] arr, int i, int j) {
        Cat temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    } */

    //sort(Dog)
    /*void swap(Dog[] arr, int i, int j) {
        Dog temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }*/

    //sort(Cat)  —— 类Cat继承Comparable接口后
    /*static*/ /*void swap(Comparable[] arr, int i, int j) {
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }*/

    //sort(Dog)  —— 类Dog继承Comparable接口后  —— 同上面一样的
    /*void swap(Comparable[] arr, int i, int j) {
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }*/


    // Sort 加泛型T后
    void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
