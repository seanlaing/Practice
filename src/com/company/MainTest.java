package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main mZero;
    Main mOne;
    Main mTwo;
    Main mMany;
    Object o1;
    Object o2,o3,o4,o5,o6;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        mZero = new Main();
        mOne = new Main();
        mTwo = new Main();
        mMany = new Main();
        o1 = "Hello";
        o2 = "Hello1";
        o3 = "Hello2";
        o4 = "Hello3";
        o5 = "Hello4";
        o6 = "Hello5";
        mOne.addElement(o1);
        mTwo.addElement(o1);
        mTwo.addElement(o2);
        mMany.addElement(o1);
        mMany.addElement(o2);
        mMany.addElement(o3);
        mMany.addElement(o4);
        mMany.addElement(o5);
        mMany.addElement(o6);

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }


    @Test
    void checkSetEmpty() {
        assertTrue(mZero.isSetEmpty());
        assertFalse(mOne.isSetEmpty());
        assertFalse(mTwo.isSetEmpty());
    }
    @Test
    void checkGetCount(){
        assertEquals(0, mZero.getCount());
      //  assertNotEquals(1, mOne.getCount());
    }

    @Test
    void checkAddElement() {
        assertTrue(mZero.isSetEmpty());
        mZero.addElement(o2);
        assertFalse(mZero.isSetEmpty());
        assertNotEquals(0, mZero.getCount());
        assertEquals(1,mZero.getCount());
    }
    @Test
    void checkContainsElement(){
        mZero.addElement("anything");
        assertTrue(mZero.contains("anything"));
    }
    @Test
    void checkRemoveElement(){

        assertEquals("Hello", mMany.mainSet[0]);
        int beforeSize = mOne.getCount();
        assertTrue(mOne.contains("Hello"));
        mOne.removeElement("Hello");
        assertTrue(beforeSize>mOne.getCount());
        assertEquals(beforeSize-1, mOne.getCount());
        assertFalse(mOne.contains("Hello"));
        assertEquals(6,mMany.getCount());
        mMany.removeElement("Hello4");
        assertFalse(mMany.contains("Hello4"));
        assertEquals(5,mMany.getCount());
        assertEquals("Hello", mMany.mainSet[0]);
        //assertTrue()
    }

}