package android.util;

public final class JsonReader implements java.io.Closeable {
    public JsonReader(java.io.Reader p0) {}
    public void setLenient(boolean p0) {}
    public boolean isLenient() { return false; }
    public void beginArray() throws java.io.IOException {}
    public void endArray() throws java.io.IOException {}
    public void beginObject() throws java.io.IOException {}
    public void endObject() throws java.io.IOException {}
    public boolean hasNext() throws java.io.IOException { return false; }
    public android.util.JsonToken peek() throws java.io.IOException { return null; }
    public java.lang.String nextName() throws java.io.IOException { return null; }
    public java.lang.String nextString() throws java.io.IOException { return null; }
    public boolean nextBoolean() throws java.io.IOException { return false; }
    public void nextNull() throws java.io.IOException {}
    public double nextDouble() throws java.io.IOException { return 0.0; }
    public long nextLong() throws java.io.IOException { return 0L; }
    public int nextInt() throws java.io.IOException { return 0; }
    public void close() throws java.io.IOException {}
    public void skipValue() throws java.io.IOException {}
    public java.lang.String toString() { return null; }
}
