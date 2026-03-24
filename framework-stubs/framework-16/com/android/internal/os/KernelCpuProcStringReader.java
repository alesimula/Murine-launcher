package com.android.internal.os;

public class KernelCpuProcStringReader {
    static com.android.internal.os.KernelCpuProcStringReader getFreqTimeReaderInstance() { return null; }
    static com.android.internal.os.KernelCpuProcStringReader getActiveTimeReaderInstance() { return null; }
    static com.android.internal.os.KernelCpuProcStringReader getClusterTimeReaderInstance() { return null; }
    static com.android.internal.os.KernelCpuProcStringReader getUserSysTimeReaderInstance() { return null; }
    public KernelCpuProcStringReader(java.lang.String p0) {}
    public KernelCpuProcStringReader(java.lang.String p0, com.android.internal.os.Clock p1) {}
    public com.android.internal.os.KernelCpuProcStringReader.ProcFileIterator open() { return null; }
    public com.android.internal.os.KernelCpuProcStringReader.ProcFileIterator open(boolean p0) { return null; }
    public static int asLongs(java.nio.CharBuffer p0, long[] p1) { return 0; }

    public class ProcFileIterator implements java.lang.AutoCloseable {
        public ProcFileIterator(com.android.internal.os.KernelCpuProcStringReader p0, int p1) {}
        public boolean hasNextLine() { return false; }
        public java.nio.CharBuffer nextLine() { return null; }
        public int size() { return 0; }
        public void close() {}
    }
}
