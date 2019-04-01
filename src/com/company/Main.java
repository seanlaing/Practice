package com.company;

public class Main {
    public Object[] mainSet= new Object[100];
    //create a set without using predefined methods
    // add elements
    // remove elements
    // check if elements are inside
    //To check if the set was empty
    int size;
    public Main(){
        size =0;
    }
    public boolean isSetEmpty(){
        return size==0?true:false;
    }
    public int getCount(){
        return size;
    }
    public void addElement(Object o) {
        mainSet[size] = o;
        size++;
    }


    public static void main(String[] args)
    {
        Main m = new Main();
        System.out.println(m.getCount());
        System.out.println(m.mainSet[0]);
       // System.out.println("Hello World!");
    }

    public boolean contains(Object o) {
        for (int i=0; i<size ; i++){
            if (mainSet[i].equals(o)){
                return true;
            }
        }
        return false;
    }

    public void removeElement(Object o) {
        int changePtr=0;
        for (int i=0; i<size ; i++){
            if (mainSet[i]==o){
                mainSet[i]=null;
                changePtr=i;
            }
        }
        for (int j=changePtr; j<size ; j++){
           // System.out.println("j " + j + " changePtr" + changePtr + "size " +size);
                mainSet[j]=mainSet[j+1];
        }
        size--;
    }

}
