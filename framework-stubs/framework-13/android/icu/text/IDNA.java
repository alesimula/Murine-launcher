package android.icu.text;

public abstract class IDNA {
    public static final int CHECK_BIDI = 4;
    public static final int CHECK_CONTEXTJ = 8;
    public static final int CHECK_CONTEXTO = 64;
    public static final int DEFAULT = 0;
    public static final int NONTRANSITIONAL_TO_ASCII = 16;
    public static final int NONTRANSITIONAL_TO_UNICODE = 32;
    public static final int USE_STD3_RULES = 2;
    IDNA() {}
    public static android.icu.text.IDNA getUTS46Instance(int p0) { return null; }
    public abstract java.lang.StringBuilder labelToASCII(java.lang.CharSequence p0, java.lang.StringBuilder p1, android.icu.text.IDNA.Info p2);
    public abstract java.lang.StringBuilder labelToUnicode(java.lang.CharSequence p0, java.lang.StringBuilder p1, android.icu.text.IDNA.Info p2);
    public abstract java.lang.StringBuilder nameToASCII(java.lang.CharSequence p0, java.lang.StringBuilder p1, android.icu.text.IDNA.Info p2);
    public abstract java.lang.StringBuilder nameToUnicode(java.lang.CharSequence p0, java.lang.StringBuilder p1, android.icu.text.IDNA.Info p2);

    public static enum Error {
        EMPTY_LABEL,
        LABEL_TOO_LONG,
        DOMAIN_NAME_TOO_LONG,
        LEADING_HYPHEN,
        TRAILING_HYPHEN,
        HYPHEN_3_4,
        LEADING_COMBINING_MARK,
        DISALLOWED,
        PUNYCODE,
        LABEL_HAS_DOT,
        INVALID_ACE_LABEL,
        BIDI,
        CONTEXTJ,
        CONTEXTO_PUNCTUATION,
        CONTEXTO_DIGITS;
        private Error() {}
    }

    public static final class Info {
        public Info() {}
        public boolean hasErrors() { return false; }
        public java.util.Set<android.icu.text.IDNA.Error> getErrors() { return null; }
        public boolean isTransitionalDifferent() { return false; }
    }
}
