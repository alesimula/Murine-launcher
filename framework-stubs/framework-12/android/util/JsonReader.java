package android.util;

public final class JsonReader implements java.io.Closeable {
    private static final java.lang.String TRUE = "true";
    private static final java.lang.String FALSE = "false";
    private final com.android.internal.util.StringPool stringPool = null;
    private final java.io.Reader in = null;
    private boolean lenient;
    private final char[] buffer = null;
    private int pos;
    private int limit;
    private int bufferStartLine;
    private int bufferStartColumn;
    private final java.util.List<android.util.JsonScope> stack = null;
    private android.util.JsonToken token;
    private java.lang.String name;
    private java.lang.String value;
    private int valuePos;
    private int valueLength;
    private boolean skipping;
    public JsonReader(java.io.Reader p0) {}
    public void setLenient(boolean p0) {}
    public boolean isLenient() { return false; }
    public void beginArray() throws java.io.IOException {}
    public void endArray() throws java.io.IOException {}
    public void beginObject() throws java.io.IOException {}
    public void endObject() throws java.io.IOException {}
    private void expect(android.util.JsonToken p0) throws java.io.IOException {}
    public boolean hasNext() throws java.io.IOException { return false; }
    public android.util.JsonToken peek() throws java.io.IOException { return null; }
    private android.util.JsonToken advance() throws java.io.IOException { return null; }
    public java.lang.String nextName() throws java.io.IOException { return null; }
    public java.lang.String nextString() throws java.io.IOException { return null; }
    public boolean nextBoolean() throws java.io.IOException { return false; }
    public void nextNull() throws java.io.IOException {}
    public double nextDouble() throws java.io.IOException { return 0.0; }
    public long nextLong() throws java.io.IOException { return 0L; }
    public int nextInt() throws java.io.IOException { return 0; }
    public void close() throws java.io.IOException {}
    public void skipValue() throws java.io.IOException {}
    private android.util.JsonScope peekStack() { return null; }
    private android.util.JsonScope pop() { return null; }
    private void push(android.util.JsonScope p0) {}
    private void replaceTop(android.util.JsonScope p0) {}
    private android.util.JsonToken nextInArray(boolean p0) throws java.io.IOException { return null; }
    private android.util.JsonToken nextInObject(boolean p0) throws java.io.IOException { return null; }
    private android.util.JsonToken objectValue() throws java.io.IOException { return null; }
    private android.util.JsonToken nextValue() throws java.io.IOException { return null; }
    private boolean fillBuffer(int p0) throws java.io.IOException { return false; }
    private int getLineNumber() { return 0; }
    private int getColumnNumber() { return 0; }
    private int nextNonWhitespace() throws java.io.IOException { return 0; }
    private void checkLenient() throws java.io.IOException {}
    private void skipToEndOfLine() throws java.io.IOException {}
    private boolean skipTo(java.lang.String p0) throws java.io.IOException { return false; }
    private java.lang.String nextString(char p0) throws java.io.IOException { return null; }
    private java.lang.String nextLiteral(boolean p0) throws java.io.IOException { return null; }
    public java.lang.String toString() { return null; }
    private char readEscapeCharacter() throws java.io.IOException { return 0; }
    private android.util.JsonToken readLiteral() throws java.io.IOException { return null; }
    private android.util.JsonToken decodeLiteral() throws java.io.IOException { return null; }
    private android.util.JsonToken decodeNumber(char[] p0, int p1, int p2) { return null; }
    private java.io.IOException syntaxError(java.lang.String p0) throws java.io.IOException { return null; }
    private java.lang.CharSequence getSnippet() { return null; }
}
