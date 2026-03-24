package android.icu.number;

public final class NumberFormatter {
    private NumberFormatter() {}
    public static android.icu.number.UnlocalizedNumberFormatter with() { return null; }
    public static android.icu.number.LocalizedNumberFormatter withLocale(java.util.Locale p0) { return null; }
    public static android.icu.number.LocalizedNumberFormatter withLocale(android.icu.util.ULocale p0) { return null; }

    public static enum DecimalSeparatorDisplay {
        AUTO,
        ALWAYS;
        private DecimalSeparatorDisplay() {}
    }

    public static enum GroupingStrategy {
        OFF,
        MIN2,
        AUTO,
        ON_ALIGNED,
        THOUSANDS;
        private GroupingStrategy() {}
    }

    public static enum SignDisplay {
        AUTO,
        ALWAYS,
        NEVER,
        ACCOUNTING,
        ACCOUNTING_ALWAYS,
        EXCEPT_ZERO,
        ACCOUNTING_EXCEPT_ZERO;
        private SignDisplay() {}
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
}
