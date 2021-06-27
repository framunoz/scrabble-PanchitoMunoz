package cl.uchile.dcc.scrabble.model.ast.hidden_ast.hidden_operations.operations;

import static org.junit.jupiter.api.Assertions.*;

import cl.uchile.dcc.scrabble.model.ast.hidden_ast.hidden_types.HType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class HiddenAndTest extends BaseHiddenOperationTest {

    @BeforeEach
    protected void setUp() {
        super.setUp();
    }

    @RepeatedTest(20)
    void testTestToString() {
        String templateString = (
            "And(\n"
                + "  %s and\n"
                + "  %s\n"
                + ")"
        );
        for (HType hType1 : hTypeList2) {
            for (HType hType2 : hTypeList2) {
                String expected = String.format(templateString,
                    hType1.asString(0), hType2.asString(0));
                assertEquals(expected, new HiddenAnd(hType1, hType2).toString(),
                    "Method toString does not works." + messageSeed);
            }
        }
    }

    @RepeatedTest(20)
    void testCalculate() {
        // And with String
        for (HType hType : hTypeList2) {
            assertNull(new HiddenAnd(hiddenString1, hType).calculate(),
                "Method and does not works with string type." + messageSeed);
        }
        // And with bool
        for (HType hType : hLogicalList) {
            HType expected1 = trueHiddenBool.and(hType);
            HType expected2 = falseHiddenBool.and(hType);
            assertEquals(expected1, new HiddenAnd(trueHiddenBool, hType).calculate(),
                "Method and does not works with bool type." + messageSeed);
            assertEquals(expected2, new HiddenAnd(falseHiddenBool, hType).calculate(),
                "Method and does not works with bool type." + messageSeed);
        }
        for (HType hType : hLogicalCList) {
            assertNull(new HiddenAnd(trueHiddenBool, hType).calculate(),
                "Method and does not works with bool type." + messageSeed);
            assertNull(new HiddenAnd(falseHiddenBool, hType).calculate(),
                "Method and does not works with bool type." + messageSeed);
        }
        // And with float
        for (HType hType : hTypeList2) {
            assertNull(new HiddenAnd(hiddenFloat1, hType).calculate(),
                "Method and does not works with float type." + messageSeed);
        }
        // And with int
        for (HType hType : hTypeList2) {
            assertNull(new HiddenAnd(hiddenInt1, hType).calculate(),
                "Method and does not works with int type." + messageSeed);
        }
        // And with binary
        for (HType hType : hLogicalList) {
            HType expected = hiddenBinary1.and(hType);
            assertEquals(expected, new HiddenAnd(hiddenBinary1, hType).calculate(),
                "Method and does not works with binary type." + messageSeed);
        }
        for (HType hType : hLogicalCList) {
            assertNull(new HiddenAnd(hiddenBinary1, hType).calculate(),
                "Method and does not works with binary type." + messageSeed);
        }
    }

    @RepeatedTest(20)
    void testTestEquals() {
        HiddenAnd hiddenAnd = new HiddenAnd(hiddenBinary1, trueHiddenBool);
        HiddenAnd equalsHiddenAnd = new HiddenAnd(hiddenBinary1, trueHiddenBool);
        HiddenAnd differentHiddenAnd = new HiddenAnd(hiddenBinary1, falseHiddenBool);
        HiddenSub otherNode = new HiddenSub(hiddenFloat1, hiddenFloat2);
        assertEquals(hiddenAnd, hiddenAnd,
            "Method equals does not works." + messageSeed);
        assertEquals(equalsHiddenAnd, hiddenAnd,
            "Method equals does not works." + messageSeed);
        assertNotEquals(differentHiddenAnd, hiddenAnd,
            "Method equals does not works." + messageSeed);
        assertNotEquals(otherNode, hiddenAnd,
            "Method equals does not works." + messageSeed);
        assertNotEquals(hiddenAnd, hiddenBinary1,
            "Method equals does not works." + messageSeed);
    }

    @RepeatedTest(20)
    void testTestHashCode() {
        HiddenAnd hiddenAnd = new HiddenAnd(hiddenBinary1, trueHiddenBool);
        HiddenAnd equalsHiddenAnd = new HiddenAnd(hiddenBinary1, trueHiddenBool);
        HiddenAnd differentHiddenAnd = new HiddenAnd(hiddenBinary1, falseHiddenBool);
        HiddenSub otherNode = new HiddenSub(hiddenFloat1, hiddenFloat2);
        assertEquals(equalsHiddenAnd.hashCode(), hiddenAnd.hashCode(),
            "Method hashCode does not works." + messageSeed);
        assertNotEquals(differentHiddenAnd.hashCode(), hiddenAnd.hashCode(),
            "Method hashCode does not works." + messageSeed);
        assertNotEquals(otherNode.hashCode(), hiddenAnd.hashCode(),
            "Method hashCode does not works." + messageSeed);
        assertNotEquals(hiddenString1.hashCode(), hiddenAnd.hashCode(),
            "Method hashCode does not works." + messageSeed);
    }
}