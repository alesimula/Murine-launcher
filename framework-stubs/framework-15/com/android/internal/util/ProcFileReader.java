package com.android.internal.util;

public class ProcFileReader implements java.io.Closeable {
    public ProcFileReader(java.io.InputStream p0) throws java.io.IOException {}
    public ProcFileReader(java.io.InputStream p0, int p1) throws java.io.IOException {}
    public boolean hasMoreData() { return false; }
    public void finishLine() throws java.io.IOException {}
    public java.lang.String nextString() throws java.io.IOException { return null; }
    public long nextLong() throws java.io.IOException { return 0L; }
    public long nextLong(boolean p0) throws java.io.IOException { return 0L; }
    public long nextOptionalLong(long p0) throws java.io.IOException { return 0L; }
    public int nextInt() throws java.io.IOException { return 0; }
    public void nextIgnored() throws java.io.IOException {}
    public void rewind() throws java.io.IOException {}
    public void close() throws java.io.IOException {}
}
