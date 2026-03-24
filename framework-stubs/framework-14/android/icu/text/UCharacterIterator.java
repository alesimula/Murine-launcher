package android.icu.text;

public abstract class UCharacterIterator implements java.lang.Cloneable {
    public static final int DONE = -1;
    protected UCharacterIterator() {}
    public static final android.icu.text.UCharacterIterator getInstance(android.icu.text.Replaceable p0) { return null; }
    public static final android.icu.text.UCharacterIterator getInstance(java.lang.String p0) { return null; }
    public static final android.icu.text.UCharacterIterator getInstance(char[] p0) { return null; }
    public static final android.icu.text.UCharacterIterator getInstance(char[] p0, int p1, int p2) { return null; }
    public static final android.icu.text.UCharacterIterator getInstance(java.lang.StringBuffer p0) { return null; }
    public static final android.icu.text.UCharacterIterator getInstance(java.text.CharacterIterator p0) { return null; }
    public java.text.CharacterIterator getCharacterIterator() { return null; }
    public abstract int current();
    public int currentCodePoint() { return 0; }
    public abstract int getLength();
    public abstract int getIndex();
    public abstract int next();
    public int nextCodePoint() { return 0; }
    public abstract int previous();
    public int previousCodePoint() { return 0; }
    public abstract void setIndex(int p0);
    public void setToLimit() {}
    public void setToStart() {}
    public abstract int getText(char[] p0, int p1);
    public final int getText(char[] p0) { return 0; }
    public java.lang.String getText() { return null; }
    public int moveIndex(int p0) { return 0; }
    public int moveCodePointIndex(int p0) { return 0; }
    public java.lang.Object clone() throws java.lang.CloneNotSupportedException { return null; }
}
