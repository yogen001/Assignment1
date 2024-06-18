import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStringUtilTest {

    @Test
    void getStrTest() {
        MyStringUtil assignment1 = new MyStringUtil("Hello");
        assertEquals("Hello",assignment1.getStr());

    }


    @Test
    void sizeTest() {
        MyStringUtil assignment1 = new MyStringUtil("Hello");
        assertEquals(5,assignment1.size());
        assignment1.setStr("four win, three loss");
        assertEquals(20,assignment1.size());
        assignment1.setStr("");
        assertEquals(0, assignment1.size());
        assignment1.setStr(" ");
        assertEquals(1, assignment1.size());
    }

    @Test
    void toUpperCaseTest() {
        MyStringUtil assignment = new MyStringUtil("not wrong");
        assertEquals("NOT WRONG",assignment.toUpperCase());
        assertEquals("THE BEES ARE HERE",assignment.toUpperCase("the bees are here"));
        MyStringUtil assignment1 = new MyStringUtil("");
        assertEquals("", assignment1.toUpperCase());
        assignment1.setStr(" ALREADY IN CAPS ");
        assertEquals(" ALREADY IN CAPS ", assignment1.toUpperCase());
        assignment1.setStr("!@#123abcXYZ");
        assertEquals("!@#123ABCXYZ",assignment1.toUpperCase());
    }

    @Test
    void reverseTest() {
        MyStringUtil assignment = new MyStringUtil("peekaboo");
        assertEquals("oobakeep",assignment.reverse());
        assertEquals("eurt si em tuoba yas yeht gnihtyrevE", assignment.reverse("Everything they say about me is true"));
        assignment.setStr("Malayalam");
        assertEquals("malayalaM", assignment.reverse());
        assignment.setStr("");
        assertEquals("",assignment.reverse());
    }

    @Test
    void isPalindromeTest() {
        MyStringUtil assignment = new MyStringUtil("NotApalindrome");
        assertFalse(assignment.isPalindrome());
        assignment.setStr("malayalam");
        assertTrue(assignment.isPalindrome());
        assignment.setStr(" ");
        assertTrue(assignment.isPalindrome());
        assignment.setStr("");
        assertTrue(assignment.isPalindrome());

    }

    @Test
    void getMaxCharTest() {
        MyStringUtil testObj = new MyStringUtil("there is a house");
        assertEquals('u', testObj.getMaxChar());
        testObj.setStr("");
        assertEquals(' ',testObj.getMaxChar());
        testObj.setStr("the quick brown fox jumps over the lazy dog");
        assertEquals('z', testObj.getMaxChar());
        testObj.setStr(null);
        assertEquals(' ',testObj.getMaxChar());
        testObj.setStr("Zebra");
        assertEquals('Z',testObj.getMaxChar());
    }

    @Test
    void reverseEachWord() {
        MyStringUtil testObj = new MyStringUtil("The Battle of Villers-Bocage");
        assertEquals("ehT elttaB fo egacoB-srelliV", testObj.reverseEachWord());
        testObj.setStr(" i like mangoes ");
        assertEquals("i ekil seognam", testObj.reverseEachWord());
        testObj.setStr("");
        assertEquals("",testObj.reverseEachWord());
        testObj.setStr(" ");
        assertEquals("",testObj.reverseEachWord());
        testObj.setStr("The platypus danced under the disco ball, oblivious to the peanut butter tornado approaching.");
        assertEquals("ehT supytalp decnad rednu eht ocsid ,llab suoivilbo ot eht tunaep rettub odanrot .gnihcaorppa", testObj.reverseEachWord());
        testObj.setStr(null);
        assertEquals(null,testObj.reverseEachWord());
    }

    @Test
    void subTest() {
        MyStringUtil testObj = new MyStringUtil("The 22nd Armoured Brigade group ");
        assertEquals("The 22nd Armoured Brigade group", testObj.sub(0,testObj.str.length()-1));
        assertEquals("invalid indexing", testObj.sub(0,790809));
        assertEquals("invalid indexing", testObj.sub(-1,-1));
        assertEquals("invalid indexing", testObj.sub(-12,8908));
        assertEquals("invalid indexing", testObj.sub(-13, 7));
        assertEquals("invalid indexing", testObj.sub(1,-1));
        assertEquals("invalid indexing", testObj.sub(10,7));
        assertEquals("invalid indexing", testObj.sub(110,7));
        assertEquals("The 2", testObj.sub(0,5));
        assertEquals("ed Brigade", testObj.sub(15,25));
        testObj.setStr(null);
        assertEquals("string is null",testObj.sub(110,7));
        assertEquals("string is null",testObj.sub(-1,-1));
        assertEquals("string is null",testObj.sub(-12,8908));
        assertEquals("string is null",testObj.sub(1,-1));
        assertEquals("string is null",testObj.sub(10,7));
    }

    @Test
    void countEachWordLengthTest() {

        MyStringUtil testObj = new MyStringUtil("The Beatles have international sales of over 1 billion units ");
        assertArrayEquals(new int[] { 3 ,7, 4, 13, 5, 2, 4 , 1, 7, 5  },testObj.countEachWordLength());
        testObj.setStr("");
        assertArrayEquals(new int[] {-1},testObj.countEachWordLength());
        testObj.setStr("                                                                                   ");
        assertArrayEquals(new int[] {-1},testObj.countEachWordLength());
        testObj.setStr(" 1234 123 1234567 ");
        assertArrayEquals(new int[] {4,3,7}, testObj.countEachWordLength());
        testObj.setStr("The platypus danced under the disco ball, oblivious to the peanut butter tornado approaching.");
        assertArrayEquals(new int[] {3 ,8 ,6 ,5 ,3 ,5 ,4 ,9 ,2 ,3 ,6 ,6 ,7 ,11 }, testObj.countEachWordLength());
        testObj.setStr(null);
        assertArrayEquals(new int[] {-1},testObj.countEachWordLength());

    }

    @Test
    void prefixTest() {
        MyStringUtil testObj = new MyStringUtil("man");
        assertEquals("Superman", testObj.prefix("Super"));
        assertEquals("man", testObj.prefix(""));
        assertEquals(" man", testObj.prefix(" "));
        assertEquals("Spider-man", testObj.prefix("Spider-"));
        testObj.setStr(null);
        assertEquals(null,testObj.reverseCase());
    }

    @Test
    void suffix() {
        MyStringUtil testObj = new MyStringUtil("Bat");
        assertEquals("Batman", testObj.suffix("man"));
        assertEquals("Batmobile", testObj.suffix("mobile"));
        assertEquals("Bat ", testObj.suffix(" "));
        assertEquals("Bat", testObj.suffix(""));
        assertEquals("Bat-cycle", testObj.suffix("-cycle"));
        testObj.setStr(null);
        assertEquals(null,testObj.reverseCase());
    }

    @Test
    void reverseCase() {
        MyStringUtil testObj = new MyStringUtil("!@#123abcXYZ");
        assertEquals("!@#123ABCxyz",testObj.reverseCase());
        testObj.setStr("ThE bIg fAt CaT");
        assertEquals("tHe BiG FaT cAt",testObj.reverseCase());
        testObj.setStr("");
        assertEquals("",testObj.reverseCase());
        testObj.setStr(" ");
        assertEquals(" ", testObj.reverseCase());
        testObj.setStr("this sentence is going to be in uppercase");
        assertEquals("THIS SENTENCE IS GOING TO BE IN UPPERCASE", testObj.reverseCase());
        testObj.setStr("THIS SENTENCE IS GOING TO BE IN LOWERCASE");
        assertEquals("this sentence is going to be in lowercase",testObj.reverseCase());
        testObj.setStr(null);
        assertEquals(null,testObj.reverseCase());

    }

    @Test
    void findLargestPalindrome() {
        //Madam Anna saw Bob and Otto race a civic kayak
        MyStringUtil testObj = new MyStringUtil("Madam Anna saw Bob and Otto race a civic kayak while speaking Malayalam");
        assertEquals("Malayalam",testObj.findLargestPalindrome());
        testObj.setStr("");
        assertEquals("",testObj.findLargestPalindrome());
        testObj.setStr(" ");
        assertEquals("",testObj.findLargestPalindrome());
        testObj.setStr(null);
        assertEquals("",testObj.findLargestPalindrome());

    }
}