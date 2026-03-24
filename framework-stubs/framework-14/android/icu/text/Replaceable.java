package android.icu.text;

public interface Replaceable {
    public int length();
    public char charAt(int p0);
    public int char32At(int p0);
    public void getChars(int p0, int p1, char[] p2, int p3);
    public void replace(int p0, int p1, java.lang.String p2);
    public void replace(int p0, int p1, char[] p2, int p3, int p4);
    public void copy(int p0, int p1, int p2);
    public boolean hasMetaData();
}
