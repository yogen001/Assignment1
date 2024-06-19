import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStringUtilTest {

    @Test
    void getStrTest() {
        MyStringUtil assignment1 = new MyStringUtil("Hello");
        assertEquals("Hello", assignment1.getStr());

    }


    @Test
    void sizeTest() {
        MyStringUtil assignment1 = new MyStringUtil("Hello");
        assertEquals(5, assignment1.size());
        assignment1.setStr("four win, three loss");
        assertEquals(20, assignment1.size());
        assignment1.setStr("");
        assertEquals(0, assignment1.size());
        assignment1.setStr(" ");
        assertEquals(1, assignment1.size());
    }

    @Test
    void toUpperCaseTest() {
        MyStringUtil assignment = new MyStringUtil("not wrong");
        assertEquals("NOT WRONG", assignment.toUpperCase());
        assertEquals("THE BEES ARE HERE", assignment.toUpperCase("the bees are here"));
        MyStringUtil assignment1 = new MyStringUtil("");
        assertEquals("", assignment1.toUpperCase());
        assignment1.setStr(" ALREADY IN CAPS ");
        assertEquals(" ALREADY IN CAPS ", assignment1.toUpperCase());
        assignment1.setStr("!@#123abcXYZ");
        assertEquals("!@#123ABCXYZ", assignment1.toUpperCase());
        assertEquals("WHAT'S 17 MORE YEARS?", assignment1.toUpperCase("What's 17 more years?"));
        assertEquals("Y0U 5H0LD N0T B3 4BL3 T0 R34D TH!5",assignment1.toUpperCase("y0u 5h0ld n0t b3 4bl3 t0 r34d th!5"));
    }

    @Test
    void reverseTest() {
        MyStringUtil assignment = new MyStringUtil("peekaboo");
        assertEquals("oobakeep", assignment.reverse());
        assertEquals("eurt si em tuoba yas yeht gnihtyrevE", assignment.reverse("Everything they say about me is true"));
        assignment.setStr("Malayalam");
        assertEquals("malayalaM", assignment.reverse());
        assignment.setStr("");
        assertEquals("", assignment.reverse());
        assertEquals(".rehtona eb syawla ,nac erehT", assignment.reverse("There can, always be another."));
        assertEquals("ZYXcba321#@!", assignment.reverse("!@#123abcXYZ"));
        assignment.setStr("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce aliquet posuere lacus.");
        assertEquals(".sucal ereusop teuqila ecsuF .tile gnicsipida rutetcesnoc ,tema tis rolod muspi meroL", assignment.reverse());

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
        assignment.setStr("!tattarrattat!");
        assertTrue(assignment.isPalindrome());
        assignment.setStr(" Mr. Owl ate my metal worm");
        assertTrue(assignment.isPalindrome());
        assertTrue(assignment.isPalindrome("Red roses run no risk, sir, on Nurse’s order."));
        assertFalse(assignment.isPalindrome("He lived as a devil"));
        assignment.setStr("Нажал кабан на баклажан");
        assertTrue(assignment.isPalindrome());
        assignment.setStr("""
                Dammit I’m mad.
                Evil is a deed as I live.
                God, am I reviled? I rise, my bed on a sun, I melt.
                To be not one man emanating is sad. I piss.
                Alas, it is so late. Who stops to help?
                Man, it is hot. I’m in it. I tell.
                I am not a devil. I level “Mad Dog”.
                Ah, say burning is, as a deified gulp,
                In my halo of a mired rum tin.
                I erase many men. Oh, to be man, a sin.
                Is evil in a clam? In a trap?
                No. It is open. On it I was stuck.
                Rats peed on hope. Elsewhere dips a web.
                Be still if I fill its ebb.
                Ew, a spider… eh?
                We sleep. Oh no!
                Deep, stark cuts saw it in one position.
                Part animal, can I live? Sin is a name.
                Both, one… my names are in it.
                Murder? I’m a fool.
                A hymn I plug, deified as a sign in ruby ash.
                A Goddam level I lived at.
                On mail let it in. I’m it.
                Oh, sit in ample hot spots. Oh wet!
                A loss it is alas (sip). I’d assign it a name.
                Name not one bottle minus an ode by me:
                “Sir, I deliver. I’m a dog”
                Evil is a deed as I live.
                Dammit I’m mad.""");
        assertTrue(assignment.isPalindrome());

    }

    @Test
    void getMaxCharTest() {
        MyStringUtil testObj = new MyStringUtil("there is a house");
        assertEquals('u', testObj.getMaxChar());
        testObj.setStr("");
        assertEquals(' ', testObj.getMaxChar());
        testObj.setStr("the quick brown fox jumps over the lazy dog");
        assertEquals('z', testObj.getMaxChar());
        testObj.setStr(null);
        assertEquals(' ', testObj.getMaxChar());
        testObj.setStr("Zebra");
        assertEquals('Z', testObj.getMaxChar());
        testObj.setStr("Oh word!");
        assertEquals('w', testObj.getMaxChar());
        testObj.setStr("@#$%^&*");
        assertEquals('^', testObj.getMaxChar());
        testObj.setStr("0987654321");
        assertEquals('9', testObj.getMaxChar());

    }

    @Test
    void reverseEachWord() {
        MyStringUtil testObj = new MyStringUtil("The Battle of Villers-Bocage");
        assertEquals("ehT elttaB fo egacoB-srelliV", testObj.reverseEachWord());
        testObj.setStr(" i like mangoes ");
        assertEquals("i ekil seognam", testObj.reverseEachWord());
        testObj.setStr("");
        assertEquals("", testObj.reverseEachWord());
        testObj.setStr(" ");
        assertEquals("", testObj.reverseEachWord());
        testObj.setStr("The platypus danced under the disco ball, oblivious to the peanut butter tornado approaching.");
        assertEquals("ehT supytalp decnad rednu eht ocsid ,llab suoivilbo ot eht tunaep rettub odanrot .gnihcaorppa", testObj.reverseEachWord());
        testObj.setStr(null);
        assertNull(testObj.reverseEachWord());
        testObj.setStr("I'm so old, I remember when emojis were called 'hieroglyphics'.");
        assertEquals("m'I os ,dlo I rebmemer nehw sijome erew dellac .'scihpylgoreih'", testObj.reverseEachWord());
    }

    @Test
    void subTest() {
        MyStringUtil testObj = new MyStringUtil("The 22nd Armoured Brigade group ");
        assertEquals("The 22nd Armoured Brigade group", testObj.sub(0, testObj.str.length() - 1));
        assertEquals("invalid indexing", testObj.sub(0, 790809));
        assertEquals("invalid indexing", testObj.sub(-1, -1));
        assertEquals("invalid indexing", testObj.sub(-12, 8908));
        assertEquals("invalid indexing", testObj.sub(-13, 7));
        assertEquals("invalid indexing", testObj.sub(1, -1));
        assertEquals("invalid indexing", testObj.sub(10, 7));
        assertEquals("invalid indexing", testObj.sub(110, 7));
        assertEquals("The 2", testObj.sub(0, 5));
        assertEquals("ed Brigade", testObj.sub(15, 25));
        testObj.setStr(null);
        assertEquals("string is null", testObj.sub(110, 7));
        assertEquals("string is null", testObj.sub(-1, -1));
        assertEquals("string is null", testObj.sub(-12, 8908));
        assertEquals("string is null", testObj.sub(1, -1));
        assertEquals("string is null", testObj.sub(10, 7));
        testObj.setStr("I once saw a conspiracy theorist argue with a lamppost. The lamppost won.");
        assertEquals("invalid indexing", testObj.sub(0, 790809));
        assertEquals("invalid indexing", testObj.sub(-1, -1));
        assertEquals("invalid indexing", testObj.sub(-15, 188));
        assertEquals("", testObj.sub(7, 7));
        assertEquals("invalid indexing", testObj.sub(1, -1));
        assertEquals(" a cons", testObj.sub(10, 17));
        assertEquals("invalid indexing", testObj.sub(110, 7));
        assertEquals("I onc", testObj.sub(0, 5));
        assertEquals("nspiracy t", testObj.sub(15, 25));
        assertEquals("nspiracy theorist argue with a lamppost. The lamppost won.", testObj.sub(15, testObj.size()));

    }

    @Test
    void countEachWordLengthTest() {

        MyStringUtil testObj = new MyStringUtil("The Beatles have international sales of over 1 billion units ");
        assertArrayEquals(new int[]{3, 7, 4, 13, 5, 2, 4, 1, 7, 5}, testObj.countEachWordLength());
        testObj.setStr("");
        assertArrayEquals(new int[]{-1}, testObj.countEachWordLength());
        testObj.setStr("                                                                                   ");
        assertArrayEquals(new int[]{-1}, testObj.countEachWordLength());
        testObj.setStr(" 1234 123 1234567 ");
        assertArrayEquals(new int[]{4, 3, 7}, testObj.countEachWordLength());
        testObj.setStr("The platypus danced under the disco ball, oblivious to the peanut butter tornado approaching.");
        assertArrayEquals(new int[]{3, 8, 6, 5, 3, 5, 4, 9, 2, 3, 6, 6, 7, 11}, testObj.countEachWordLength());
        testObj.setStr(null);
        assertArrayEquals(new int[]{-1}, testObj.countEachWordLength());
        testObj.setStr("Why do flamingos stand on one leg? It's a mystery of nature.");
        assertArrayEquals(new int[]{3, 2, 9, 5, 2, 3, 3, 2, 1, 1, 7, 2, 6}, testObj.countEachWordLength());

    }

    @Test
    void prefixTest() {
        MyStringUtil testObj = new MyStringUtil("man");
        assertEquals("Superman", testObj.prefix("Super"));
        assertEquals("man", testObj.prefix(""));
        assertEquals(" man", testObj.prefix(" "));
        assertEquals("Spider-man", testObj.prefix("Spider-"));
        testObj.setStr(null);
        assertEquals(" " + null, testObj.prefix(" "));
        testObj.setStr("");
        assertEquals("", testObj.prefix(""));
        testObj.setStr("123");
        assertEquals("abc123", testObj.prefix("abc"));
        testObj.setStr(" ");
        assertEquals("a ", testObj.prefix("a"));
        testObj.setStr("!@#$");
        assertEquals("XYZ!@#$", testObj.prefix("XYZ"));

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
        assertEquals(null, testObj.reverseCase());
        testObj.setStr("");
        assertEquals("", testObj.suffix(""));
        testObj.setStr("123");
        assertEquals("123abc", testObj.suffix("abc"));
        testObj.setStr(" ");
        assertEquals(" a", testObj.suffix("a"));
        testObj.setStr("!@#$");
        assertEquals("!@#$XYZ", testObj.suffix("XYZ"));
    }

    @Test
    void reverseCase() {
        MyStringUtil testObj = new MyStringUtil("!@#123abcXYZ");
        assertEquals("!@#123ABCxyz", testObj.reverseCase());
        testObj.setStr("ThE bIg fAt CaT");
        assertEquals("tHe BiG FaT cAt", testObj.reverseCase());
        testObj.setStr("");
        assertEquals("", testObj.reverseCase());
        testObj.setStr(" ");
        assertEquals(" ", testObj.reverseCase());
        testObj.setStr("this sentence is going to be in uppercase");
        assertEquals("THIS SENTENCE IS GOING TO BE IN UPPERCASE", testObj.reverseCase());
        testObj.setStr("THIS SENTENCE IS GOING TO BE IN LOWERCASE");
        assertEquals("this sentence is going to be in lowercase", testObj.reverseCase());
        testObj.setStr(null);
        assertEquals(null, testObj.reverseCase());
        testObj.setStr(" Fin learnt malyalam while working part-time as a saippuakivikauppias");
        assertEquals("saippuakivikauppias", testObj.findLargestPalindrome());
        testObj.setStr("the pentagon has misplaced 7449447 dollars ");
        assertEquals("7449447", testObj.findLargestPalindrome());

    }

    @Test
    void findLargestPalindrome() {
        //Madam Anna saw Bob and Otto race a civic kayak
        MyStringUtil testObj = new MyStringUtil("Madam Anna saw Bob and Otto race a civic kayak while speaking Malayalam");
        assertEquals("Malayalam", testObj.altFindLargestPalindrome());
        testObj.setStr("");
        assertEquals("", testObj.findLargestPalindrome());
        testObj.setStr(" ");
        assertEquals("", testObj.findLargestPalindrome());
        testObj.setStr(null);
        assertEquals("", testObj.findLargestPalindrome());
        testObj.setStr("Evil is a name of a foeman, as I live.");
        assertEquals("a", testObj.findLargestPalindrome());
        testObj.setStr("EvilisanameofafoemanasIlive.");
        assertEquals("EvilisanameofafoemanasIlive.", testObj.findLargestPalindrome());
        testObj.setStr("Mom and anna set out in their Honda civic to get some saippuakivikauppias");
        assertEquals("saippuakivikauppias",testObj.findLargestPalindrome());

    }
}