package com.android.internal.util;

@java.lang.Deprecated
public class JournaledFile {
    java.io.File mReal;
    java.io.File mTemp;
    boolean mWriting;
    public JournaledFile(java.io.File p0, java.io.File p1) {}
    public java.io.File chooseForRead() { return null; }
    public java.io.File chooseForWrite() { return null; }
    public void commit() {}
    public void rollback() {}
}
