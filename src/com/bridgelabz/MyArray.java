package com.bridgelabz;

public class MyArray {
    private int[] data;
    private int size;

    public MyArray() {
        data = new int[5];
        size = 0;
    }

    public void add(int element) {
        if (size == data.length) resize();
        data[size++] = element;
    }

    public int get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        return data[index];
    }

    public int size() {
        return size;
    }

    private void resize() {
        int[] newData = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) newData[i] = data[i];
        data = newData;
    }

    public static void main(String[] args) {
        MyArray arr = new MyArray();
        for (int i = 0; i < 10; i++) arr.add(i * 10);
        for (int i = 0; i < arr.size(); i++) System.out.print(arr.get(i) + " ");
    }
}
