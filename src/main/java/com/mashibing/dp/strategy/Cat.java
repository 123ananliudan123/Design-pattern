package com.mashibing.dp.strategy;

//public class Cat {
//public class Cat implements Comparable {
public class Cat implements Comparable<Cat> {
    int weight, height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    // 猫进行比较大小

    /**
     * 要想实现对类型Cat的排序：
     * （这是自己去实现的思路。
     *  其实，现实中我们去实现某一个类的排序的话，只需要让这个类去实现Comparable<T>接口，然后重写其中的compareTo(T o)方法即可）
     * 1）需要在Cat的类型定义中定义对应排序的方法（根据哪个属性进行排序的），如这里的compareTo(Cat c)；
     * 2）然后在排序算法对应的类Sorter中的方法sort(Cat[] arr)中对应写针对Cat类的排序；
     * 3）最后进行调用即可。
     * @param
     * @return
     */
    @Override
    //public int compareTo(Object o) {
    public int compareTo(Cat c) {
        //强制类型转换后才能进行比较 (用了泛型后就不需要强制转换了)
        //Cat c = (Cat)o;
        if(this.weight < c.weight) return -1;
        else if(this.weight > c.weight) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
