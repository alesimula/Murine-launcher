package android.icu.number;

public abstract class NumberRangeFormatter {
    private NumberRangeFormatter() {}
    public static android.icu.number.UnlocalizedNumberRangeFormatter with() { return null; }
    public static android.icu.number.LocalizedNumberRangeFormatter withLocale(java.util.Locale p0) { return null; }
    public static android.icu.number.LocalizedNumberRangeFormatter withLocale(android.icu.util.ULocale p0) { return null; }

    public static enum RangeCollapse {
        AUTO,
        NONE,
        UNIT,
        ALL;
        private RangeCollapse() {}
    }

    public static enum RangeIdentityFallback {
        SINGLE_VALUE,
        APPROXIMATELY_OR_SINGLE_VALUE,
        APPROXIMATELY,
        RANGE;
        private RangeIdentityFallback() {}
    }

    public static enum RangeIdentityResult {
        EQUAL_BEFORE_ROUNDING,
        EQUAL_AFTER_ROUNDING,
        NOT_EQUAL;
        private RangeIdentityResult() {}
    }
}
