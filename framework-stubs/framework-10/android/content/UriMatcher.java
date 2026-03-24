package android.content;

public class UriMatcher {
    public static final int NO_MATCH = -1;
    private static final int EXACT = 0;
    private static final int NUMBER = 1;
    private static final int TEXT = 2;
    private int mCode;
    private final int mWhich = 0;
    @android.annotation.UnsupportedAppUsage
    private final java.lang.String mText = null;
    @android.annotation.UnsupportedAppUsage
    private java.util.ArrayList<android.content.UriMatcher> mChildren;
    public UriMatcher(int p0) {}
    private UriMatcher(int p0, java.lang.String p1) {}
    public void addURI(java.lang.String p0, java.lang.String p1, int p2) {}
    private static android.content.UriMatcher createChild(java.lang.String p0) { return null; }
    public int match(android.net.Uri p0) { return 0; }
}
