package com.mashibing.dp.strategy;

import java.util.Arrays;

/**
 * writing tests first!
 * extreme programming
 */
public class Main {
    public static void main(String[] args) {
        // 三种类型：int 、 Cat 、 Dog
        //int[] a = {9, 2, 3, 5, 7, 1, 4};
        Cat[] a = {new Cat(3, 3), new Cat(5, 5), new Cat(1, 1)};
        //Dog[] a = {new Dog(3), new Dog(5), new Dog(1)};

        // 对int进行排序
        //Sorter sorter = new Sorter();
        // 对Cat进行排序
        // 不带泛型
        //Sorter sorter = new Sorter();
        // 带泛型
        Sorter<Cat> sorter = new Sorter<>();
        // 对Dog进行排序
        //Sorter sorter = new Sorter();
        //Sorter<Dog> sorter = new Sorter<>();



        //调用比较方法sort()
        //sorter.sort(a);

        // 使用comparator后：

        // 对Dog的比较
        //sorter.sort(a,new DogComparator());
        // 就是说，不仅要传入比较的对象，还要传入对应该对象的比较策略  —— 策略模式

        // 对Cat的比较
        //sorter.sort(a,new CatWeightComparator());
        //System.out.println("按体重进行排序(升序)"+Arrays.toString(a));

        // Lambda表达式 —— 上面 按体重进行排序 可以通过这种方式，因为里面就一个方法
        // 函数式接口
        sorter.sort(a, (o1, o2)->{
            if(o1.weight < o2.weight) return -1;
            else if (o1.weight>o2.weight) return 1;
            else return 0;
        });
        System.out.println("按体重进行排序(升序)"+Arrays.toString(a));

        sorter.sort(a,new CatHeightComparator());
        System.out.println("按身高进行排序(降序)"+Arrays.toString(a));


        //System.out.println(Arrays.toString(a));
        //System.out.println(a.getClass());

        //System.out.println("对类型"+a.getClass()+"的排序："+"\n" + Arrays.toString(a));
    }
}
