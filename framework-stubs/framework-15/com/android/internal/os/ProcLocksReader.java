package com.android.internal.os;

public class ProcLocksReader {
    public ProcLocksReader() {}
    public ProcLocksReader(java.lang.String p0) {}
    public void handleBlockingFileLocks(com.android.internal.os.ProcLocksReader.ProcLocksReaderCallback p0) throws java.io.IOException {}

    public static interface ProcLocksReaderCallback {
        public void onBlockingFileLock(android.util.IntArray p0);
    }
}
