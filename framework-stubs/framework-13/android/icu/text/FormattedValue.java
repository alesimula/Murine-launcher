package android.icu.text;

public interface FormattedValue extends java.lang.CharSequence {
    public java.lang.String toString();
    public <A extends java.lang.Appendable> A appendTo(A p0);
    public boolean nextPosition(android.icu.text.ConstrainedFieldPosition p0);
    public java.text.AttributedCharacterIterator toCharacterIterator();
}
