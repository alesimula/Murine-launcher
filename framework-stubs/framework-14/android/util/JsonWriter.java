package android.util;

public final class JsonWriter implements java.io.Closeable {
    public JsonWriter(java.io.Writer p0) {}
    public void setIndent(java.lang.String p0) {}
    public void setLenient(boolean p0) {}
    public boolean isLenient() { return false; }
    public android.util.JsonWriter beginArray() throws java.io.IOException { return null; }
    public android.util.JsonWriter endArray() throws java.io.IOException { return null; }
    public android.util.JsonWriter beginObject() throws java.io.IOException { return null; }
    public android.util.JsonWriter endObject() throws java.io.IOException { return null; }
    public android.util.JsonWriter name(java.lang.String p0) throws java.io.IOException { return null; }
    public android.util.JsonWriter value(java.lang.String p0) throws java.io.IOException { return null; }
    public android.util.JsonWriter nullValue() throws java.io.IOException { return null; }
    public android.util.JsonWriter value(boolean p0) throws java.io.IOException { return null; }
    public android.util.JsonWriter value(double p0) throws java.io.IOException { return null; }
    public android.util.JsonWriter value(long p0) throws java.io.IOException { return null; }
    public android.util.JsonWriter value(java.lang.Number p0) throws java.io.IOException { return null; }
    public void flush() throws java.io.IOException {}
    public void close() throws java.io.IOException {}
}
