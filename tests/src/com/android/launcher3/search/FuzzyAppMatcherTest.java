package com.android.launcher3.search;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Locale;

public class FuzzyAppMatcherTest {
    @Test
    public void ranksExactPrefixWordAndSubstringMatches() {
        FuzzyAppMatcher matcher = new FuzzyAppMatcher("map");
        assertTrue(matcher.score("Map") < matcher.score("Maps"));
        assertTrue(matcher.score("Maps") < matcher.score("Google Maps"));
        assertTrue(matcher.score("Google Maps") < matcher.score("Citymapper"));
        assertTrue(matcher.score("Citymapper") < matcher.score("My Amazing Planner"));
    }

    @Test
    public void matchesAbbreviationsAndPrefersCompactMatches() {
        FuzzyAppMatcher matcher = new FuzzyAppMatcher("gmp");
        assertTrue(matcher.score("Google Maps") >= 0);
        assertTrue(matcher.score("GMaps") < matcher.score("Google Maps"));
        assertEquals(-1, matcher.score("Maps Google"));
    }

    @Test
    public void findsFDroidWithShortQueryAcrossHyphen() {
        FuzzyAppMatcher matcher = new FuzzyAppMatcher("fd");
        assertTrue(matcher.score("F-droid") >= 0);
        assertTrue(matcher.score("F-Droid") >= 0);
        assertTrue(new FuzzyAppMatcher("FD").score("F-Droid") >= 0);
        assertEquals(-1, matcher.score("Firefox"));
        assertEquals(-1, matcher.score("Dolphin"));
    }

    @Test
    public void toleratesMissingExtraReplacedAndTransposedCharacters() {
        assertTrue(new FuzzyAppMatcher("chome").score("Chrome") >= 0);
        assertTrue(new FuzzyAppMatcher("chrrome").score("Chrome") >= 0);
        assertTrue(new FuzzyAppMatcher("chrpme").score("Chrome") >= 0);
        assertTrue(new FuzzyAppMatcher("chorme").score("Chrome") >= 0);
        assertTrue(new FuzzyAppMatcher("calemdaz").score("Calendar") >= 0);
        assertTrue(new FuzzyAppMatcher("mops").score("Google Maps") >= 0);
        assertEquals(-1, new FuzzyAppMatcher("mpss").score("Maps"));
        assertTrue(new FuzzyAppMatcher("chorme").score("Chrome Beta") >= 0);
    }

    @Test
    public void rejectsEmptyUnrelatedAndOverlyShortTypoQueries() {
        assertEquals(-1, new FuzzyAppMatcher("").score("Chrome"));
        assertEquals(-1, new FuzzyAppMatcher(" \t ").score("Chrome"));
        assertEquals(-1, new FuzzyAppMatcher("chrome").score(""));
        assertEquals(-1, new FuzzyAppMatcher("xyz").score("Chrome"));
        assertEquals(-1, new FuzzyAppMatcher("czt").score("Cat"));
        assertEquals(-1, new FuzzyAppMatcher("calculator").score("Cat"));
    }

    @Test
    public void normalizesCaseAccentsAndWhitespace() {
        assertEquals(0, new FuzzyAppMatcher("  CAFE\tMAPS ").score("Café Maps"));
        assertEquals(0, new FuzzyAppMatcher("café").score("CAFE\u0301"));
        assertTrue(new FuzzyAppMatcher("地图").score("百度地图") >= 0);
        assertTrue(new FuzzyAppMatcher("😀m").score("😀 Maps") >= 0);
    }

    @Test
    public void caseFoldingDoesNotDependOnDeviceLocale() {
        Locale original = Locale.getDefault();
        try {
            Locale.setDefault(Locale.forLanguageTag("tr-TR"));
            assertEquals(0, new FuzzyAppMatcher("FILES").score("Files"));
        } finally {
            Locale.setDefault(original);
        }
    }
}
