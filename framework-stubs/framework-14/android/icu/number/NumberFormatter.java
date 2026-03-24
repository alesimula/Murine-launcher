package android.icu.number;

public final class NumberFormatter {
    NumberFormatter() {}
    public static android.icu.number.UnlocalizedNumberFormatter with() { return null; }
    public static android.icu.number.LocalizedNumberFormatter withLocale(java.util.Locale p0) { return null; }
    public static android.icu.number.LocalizedNumberFormatter withLocale(android.icu.util.ULocale p0) { return null; }

    public static enum TrailingZeroDisplay {
        AUTO,
        HIDE_IF_WHOLE;
        private TrailingZeroDisplay() {}
    }

    public static enum UnitWidth {
        NARROW,
        SHORT,
        FULL_NAME,
        ISO_CODE,
        FORMAL,
        VARIANT,
        HIDDEN;
        private UnitWidth() {}
    }

    public static enum RoundingPriority {
        RELAXED,
        STRICT;
        private RoundingPriority() {}
    }

    public static enum SignDisplay {
        AUTO,
        ALWAYS,
        NEVER,
        ACCOUNTING,
        ACCOUNTING_ALWAYS,
        EXCEPT_ZERO,
        ACCOUNTING_EXCEPT_ZERO,
        NEGATIVE,
        ACCOUNTING_NEGATIVE;
        private SignDisplay() {}
    }

    public static enum GroupingStrategy {
        OFF,
        MIN2,
        AUTO,
        ON_ALIGNED,
        THOUSANDS;
        private GroupingStrategy() {}
    }

    public static enum DecimalSeparatorDisplay {
        AUTO,
        ALWAYS;
        private DecimalSeparatorDisplay() {}
    }
}
