package android.icu.text;

public final class MessagePattern implements java.lang.Cloneable, android.icu.util.Freezable<android.icu.text.MessagePattern> {
    public static final int ARG_NAME_NOT_NUMBER = -1;
    public static final int ARG_NAME_NOT_VALID = -2;
    public static final double NO_NUMERIC_VALUE = -123456789.0;
    public MessagePattern() {}
    public MessagePattern(android.icu.text.MessagePattern.ApostropheMode p0) {}
    public MessagePattern(java.lang.String p0) {}
    public android.icu.text.MessagePattern parse(java.lang.String p0) { return null; }
    public android.icu.text.MessagePattern parseChoiceStyle(java.lang.String p0) { return null; }
    public android.icu.text.MessagePattern parsePluralStyle(java.lang.String p0) { return null; }
    public android.icu.text.MessagePattern parseSelectStyle(java.lang.String p0) { return null; }
    public void clear() {}
    public void clearPatternAndSetApostropheMode(android.icu.text.MessagePattern.ApostropheMode p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public android.icu.text.MessagePattern.ApostropheMode getApostropheMode() { return null; }
    public java.lang.String getPatternString() { return null; }
    public boolean hasNamedArguments() { return false; }
    public boolean hasNumberedArguments() { return false; }
    public java.lang.String toString() { return null; }
    public static int validateArgumentName(java.lang.String p0) { return 0; }
    public java.lang.String autoQuoteApostropheDeep() { return null; }
    public int countParts() { return 0; }
    public android.icu.text.MessagePattern.Part getPart(int p0) { return null; }
    public android.icu.text.MessagePattern.Part.Type getPartType(int p0) { return null; }
    public int getPatternIndex(int p0) { return 0; }
    public java.lang.String getSubstring(android.icu.text.MessagePattern.Part p0) { return null; }
    public boolean partSubstringMatches(android.icu.text.MessagePattern.Part p0, java.lang.String p1) { return false; }
    public double getNumericValue(android.icu.text.MessagePattern.Part p0) { return 0.0; }
    public double getPluralOffset(int p0) { return 0.0; }
    public int getLimitPartIndex(int p0) { return 0; }
    public java.lang.Object clone() { return null; }
    public android.icu.text.MessagePattern cloneAsThawed() { return null; }
    public android.icu.text.MessagePattern freeze() { return null; }
    public boolean isFrozen() { return false; }

    public static enum ApostropheMode {
        DOUBLE_OPTIONAL,
        DOUBLE_REQUIRED;
        private ApostropheMode() {}
    }

    public static enum ArgType {
        NONE,
        SIMPLE,
        CHOICE,
        PLURAL,
        SELECT,
        SELECTORDINAL;
        private ArgType() {}
        public boolean hasPluralStyle() { return false; }
    }

    public static final class Part {
        private Part() {}
        public android.icu.text.MessagePattern.Part.Type getType() { return null; }
        public int getIndex() { return 0; }
        public int getLength() { return 0; }
        public int getLimit() { return 0; }
        public int getValue() { return 0; }
        public android.icu.text.MessagePattern.ArgType getArgType() { return null; }
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }

        public static enum Type {
            MSG_START,
            MSG_LIMIT,
            SKIP_SYNTAX,
            INSERT_CHAR,
            REPLACE_NUMBER,
            ARG_START,
            ARG_LIMIT,
            ARG_NUMBER,
            ARG_NAME,
            ARG_TYPE,
            ARG_STYLE,
            ARG_SELECTOR,
            ARG_INT,
            ARG_DOUBLE;
            private Type() {}
            public boolean hasNumericValue() { return false; }
        }
    }
}
