package com.ironhack.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TDDTest {
    @Test
    void oddArray_positiveEven_array() {
        assertArrayEquals(new int[]{1, 3, 5}, TDD.oddArray(5));
        assertArrayEquals(new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17}, TDD.oddArray(17));
        assertArrayEquals(new int[]{1}, TDD.oddArray(1));
    }

    @Test
    void oddArray_positiveOdd_array() {
        assertArrayEquals(new int[]{1, 3, 5}, TDD.oddArray(6));
        assertArrayEquals(new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17}, TDD.oddArray(18));
        assertArrayEquals(new int[]{1}, TDD.oddArray(2));
    }

    @Test
    void oddArray_zero_emptyArray() {
        assertArrayEquals(new int[]{}, TDD.oddArray(0));
    }

    @Test
    void oddArray_negativeValue_emptyArray() {
        assertArrayEquals(new int[]{}, TDD.oddArray(-3));
        assertArrayEquals(new int[]{}, TDD.oddArray(-17));
    }

    @Test
    void findIfContainsKeywords_stringWithKeywordAsWord_true() {
        assertEquals(true, TDD.findIfContainsKeywords("Don't break my heart"));
        assertEquals(true, TDD.findIfContainsKeywords("Don't return break my heart"));
        assertEquals(true, TDD.findIfContainsKeywords("for"));
    }

    @Test
    void findIfContainsKeywords_stringWithKeywordAsPartOfWord_false() {
        assertEquals(false, TDD.findIfContainsKeywords("Don't breakmy heart"));
        assertEquals(false, TDD.findIfContainsKeywords("Don't returnbreak my heart"));
    }

    @Test
    void findIfContainsKeywords_emptyString_false() {
        assertEquals(false, TDD.findIfContainsKeywords(""));
    }

    @Test
    void findIfContainsKeywords_spaceString_false() {
        assertEquals(false, TDD.findIfContainsKeywords(" "));
    }

    @Test
    void findIfContainsKeywords_moreThanOneSpacesBetweenWords_true() {
        assertEquals(true, TDD.findIfContainsKeywords("  Don't    break my heart"));
    }

}