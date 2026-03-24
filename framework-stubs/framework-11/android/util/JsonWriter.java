package android.util;

public final class JsonWriter implements java.io.Closeable {
    private final java.io.Writer out = null;
    private final java.util.List<android.util.JsonScope> stack = null;
    private java.lang.String indent;
    private java.lang.String separator;
    private boolean lenient;
    public JsonWriter(java.io.Writer p0) {}
    public void setIndent(java.lang.String p0) {}
    public void setLenient(boolean p0) {}
    public boolean isLenient() { return false; }
    public android.util.JsonWriter beginArray() throws java.io.IOException { return null; }
    public android.util.JsonWriter endArray() throws java.io.IOException { return null; }
    public android.util.JsonWriter beginObject() throws java.io.IOException { return null; }
    public android.util.JsonWriter endObject() throws java.io.IOException { return null; }
    private android.util.JsonWriter open(android.util.JsonScope p0, java.lang.String p1) throws java.io.IOException { return null; }
    private android.util.JsonWriter close(android.util.JsonScope p0, android.util.JsonScope p1, java.lang.String p2) throws java.io.IOException { return null; }
    private android.util.JsonScope peek() { return null; }
    private void replaceTop(android.util.JsonScope p0) {}
    public android.util.JsonWriter name(java.lang.String p0) throws java.io.IOException { return null; }
    public android.util.JsonWriter value(java.lang.String p0) throws java.io.IOException { return null; }
    public android.util.JsonWriter nullValue() throws java.io.IOException { return null; }
    public android.util.JsonWriter value(boolean p0) throws java.io.IOException { return null; }
    public android.util.JsonWriter value(double p0) throws java.io.IOException { return null; }
    public android.util.JsonWriter value(long p0) throws java.io.IOException { return null; }
    public android.util.JsonWriter value(java.lang.Number p0) throws java.io.IOException { return null; }
    public void flush() throws java.io.IOException {}
    public void close() throws java.io.IOException {}
    private void string(java.lang.String p0) throws java.io.IOException {}
    private void newline() throws java.io.IOException {}
    private void beforeName() throws java.io.IOException {}
    private void beforeValue(boolean p0) throws java.io.IOException {}
}
