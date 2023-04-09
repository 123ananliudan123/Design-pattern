package com.mashibing.dp.strategy;

//public class Dog {
//public class Dog implements Comparable{
public class Dog implements Comparable<Dog> {

    int food;

    public Dog(int food) {
        this.food = food;
    }

    @Override
    // 不带泛型
    //public int compareTo(Object o) {
    // 带泛型
    public int compareTo(Dog d) {
        //Dog d = (Dog)o; // 也不用强制转换了
        if(this.food < d.food) return -1;
        else if(this.food > d.food) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }

}
