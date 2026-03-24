package android.icu.text;

public class MessageFormat extends android.icu.text.UFormat {
    public MessageFormat(java.lang.String p0) { super(); }
    public MessageFormat(java.lang.String p0, java.util.Locale p1) { super(); }
    public MessageFormat(java.lang.String p0, android.icu.util.ULocale p1) { super(); }
    public void setLocale(java.util.Locale p0) {}
    public void setLocale(android.icu.util.ULocale p0) {}
    public java.util.Locale getLocale() { return null; }
    public android.icu.util.ULocale getULocale() { return null; }
    public void applyPattern(java.lang.String p0) {}
    public void applyPattern(java.lang.String p0, android.icu.text.MessagePattern.ApostropheMode p1) {}
    public android.icu.text.MessagePattern.ApostropheMode getApostropheMode() { return null; }
    public java.lang.String toPattern() { return null; }
    public void setFormatsByArgumentIndex(java.text.Format[] p0) {}
    public void setFormatsByArgumentName(java.util.Map<java.lang.String, java.text.Format> p0) {}
    public void setFormats(java.text.Format[] p0) {}
    public void setFormatByArgumentIndex(int p0, java.text.Format p1) {}
    public void setFormatByArgumentName(java.lang.String p0, java.text.Format p1) {}
    public void setFormat(int p0, java.text.Format p1) {}
    public java.text.Format[] getFormatsByArgumentIndex() { return null; }
    public java.text.Format[] getFormats() { return null; }
    public java.util.Set<java.lang.String> getArgumentNames() { return null; }
    public java.text.Format getFormatByArgumentName(java.lang.String p0) { return null; }
    public final java.lang.StringBuffer format(java.lang.Object[] p0, java.lang.StringBuffer p1, java.text.FieldPosition p2) { return null; }
    public final java.lang.StringBuffer format(java.util.Map<java.lang.String, java.lang.Object> p0, java.lang.StringBuffer p1, java.text.FieldPosition p2) { return null; }
    public static java.lang.String format(java.lang.String p0, java.lang.Object... p1) { return null; }
    public static java.lang.String format(java.lang.String p0, java.util.Map<java.lang.String, java.lang.Object> p1) { return null; }
    public boolean usesNamedArguments() { return false; }
    public final java.lang.StringBuffer format(java.lang.Object p0, java.lang.StringBuffer p1, java.text.FieldPosition p2) { return null; }
    public java.text.AttributedCharacterIterator formatToCharacterIterator(java.lang.Object p0) { return null; }
    public java.lang.Object[] parse(java.lang.String p0, java.text.ParsePosition p1) { return null; }
    public java.util.Map<java.lang.String, java.lang.Object> parseToMap(java.lang.String p0, java.text.ParsePosition p1) { return null; }
    public java.lang.Object[] parse(java.lang.String p0) throws java.text.ParseException { return null; }
    public java.util.Map<java.lang.String, java.lang.Object> parseToMap(java.lang.String p0) throws java.text.ParseException { return null; }
    public java.lang.Object parseObject(java.lang.String p0, java.text.ParsePosition p1) { return null; }
    public java.lang.Object clone() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public static java.lang.String autoQuoteApostrophe(java.lang.String p0) { return null; }

    public static class Field extends java.text.Format.Field {
        public static final android.icu.text.MessageFormat.Field ARGUMENT = null;
        protected Field(java.lang.String p0) { super(null); }
        protected java.lang.Object readResolve() throws java.io.InvalidObjectException { return null; }
    }
}
