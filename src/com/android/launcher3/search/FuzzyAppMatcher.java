package com.android.launcher3.search;

import java.text.Normalizer;
import java.util.Locale;
import java.util.regex.Pattern;

/** Scores app titles for a single query. Lower scores are better; -1 means no match. */
public final class FuzzyAppMatcher {
    private static final Pattern MARKS = Pattern.compile("\\p{M}+");
    private static final Pattern SPACES = Pattern.compile("[\\p{Z}\\s]+");
    private final String mQuery;
    private final int[] mQueryPoints;

    public FuzzyAppMatcher(String query) {
        mQuery = normalize(query);
        mQueryPoints = mQuery.codePoints().toArray();
    }

    public int score(String title) {
        String target = normalize(title);
        if (mQuery.isEmpty() || target.isEmpty()) return -1;
        if (target.equals(mQuery)) return 0;
        if (target.startsWith(mQuery)) return 100;

        int index = target.indexOf(mQuery);
        if (index >= 0) {
            // Prefer matches at word boundaries over matches inside a word.
            for (int start = index; start >= 0; start = target.indexOf(mQuery, start + 1)) {
                if (!Character.isLetterOrDigit(target.codePointBefore(start))) return 200;
            }
            return 300;
        }

        int[] points = target.codePoints().toArray();
        // Ordered subsequences support abbreviations such as "gmp" for "Google Maps".
        // Require at least two characters, and prefer compact matches.
        if (mQueryPoints.length >= 2) {
            int bestSpan = Integer.MAX_VALUE;
            for (int start = 0; start < points.length; start++) {
                if (points[start] != mQueryPoints[0]) continue;
                int matched = 1;
                int end = start + 1;
                while (end < points.length && matched < mQueryPoints.length) {
                    if (points[end] == mQueryPoints[matched]) matched++;
                    end++;
                }
                if (matched == mQueryPoints.length) bestSpan = Math.min(bestSpan, end - start);
            }
            if (bestSpan != Integer.MAX_VALUE) {
                return 400 + Math.min(99, bestSpan - mQueryPoints.length);
            }
        }

        // Short queries need precise matching; longer queries tolerate one or two typos.
        int maxEdits = mQueryPoints.length < 4 ? 0 : mQueryPoints.length < 8 ? 1 : 2;
        if (maxEdits == 0) return -1;
        int edits = prefixDistance(points, 0, maxEdits);
        for (int start = 1; start < points.length; start++) {
            if (!Character.isLetterOrDigit(points[start - 1])
                    && Character.isLetterOrDigit(points[start])) {
                edits = Math.min(edits, prefixDistance(points, start, maxEdits));
            }
        }
        return edits <= maxEdits ? 500 + edits : -1;
    }

    private static String normalize(String value) {
        String decomposed = Normalizer.normalize(value, Normalizer.Form.NFD);
        return SPACES.matcher(MARKS.matcher(decomposed).replaceAll("")
                .toLowerCase(Locale.ROOT)).replaceAll(" ").trim();
    }

    /** Damerau-Levenshtein distance to a prefix, including adjacent transpositions. */
    private int prefixDistance(int[] target, int start, int maxEdits) {
        int length = Math.min(target.length - start, mQueryPoints.length + maxEdits);
        if (length < mQueryPoints.length - maxEdits) return maxEdits + 1;
        int[] previousPrevious = new int[length + 1];
        int[] previous = new int[length + 1];
        int[] current = new int[length + 1];
        for (int j = 0; j <= length; j++) previous[j] = j;
        for (int i = 1; i <= mQueryPoints.length; i++) {
            current[0] = i;
            for (int j = 1; j <= length; j++) {
                int cost = mQueryPoints[i - 1] == target[start + j - 1] ? 0 : 1;
                current[j] = Math.min(previous[j] + 1,
                        Math.min(current[j - 1] + 1, previous[j - 1] + cost));
                if (i > 1 && j > 1 && mQueryPoints[i - 1] == target[start + j - 2]
                        && mQueryPoints[i - 2] == target[start + j - 1]) {
                    current[j] = Math.min(current[j], previousPrevious[j - 2] + 1);
                }
            }
            int[] spare = previousPrevious;
            previousPrevious = previous;
            previous = current;
            current = spare;
        }
        int best = maxEdits + 1;
        for (int j = Math.max(1, mQueryPoints.length - maxEdits); j <= length; j++) {
            best = Math.min(best, previous[j]);
        }
        return best;
    }
}
