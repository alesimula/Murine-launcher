package android.text;

public class AutoText {
    private static final int TRIE_C = 0;
    private static final int TRIE_OFF = 1;
    private static final int TRIE_CHILD = 2;
    private static final int TRIE_NEXT = 3;
    private static final int TRIE_SIZEOF = 4;
    private static final char TRIE_NULL = (char)0xffff;
    private static final int TRIE_ROOT = 0;
    private static final int INCREMENT = 1024;
    private static final int DEFAULT = 14337;
    private static final int RIGHT = 9300;
    private static android.text.AutoText sInstance;
    private static java.lang.Object sLock;
    private char[] mTrie;
    private char mTrieUsed;
    private java.lang.String mText;
    private java.util.Locale mLocale;
    private int mSize;
    private AutoText(android.content.res.Resources p0) {}
    private static android.text.AutoText getInstance(android.view.View p0) { return null; }
    public static java.lang.String get(java.lang.CharSequence p0, int p1, int p2, android.view.View p3) { return null; }
    public static int getSize(android.view.View p0) { return 0; }
    private int getSize() { return 0; }
    private java.lang.String lookup(java.lang.CharSequence p0, int p1, int p2) { return null; }
    private void init(android.content.res.Resources p0) {}
    private void add(java.lang.String p0, char p1) {}
    private char newTrieNode() { return 0; }
}
