package com.android.framework.protobuf;

class IterableByteBufferInputStream extends java.io.InputStream {
    private java.util.Iterator<java.nio.ByteBuffer> iterator;
    private java.nio.ByteBuffer currentByteBuffer;
    private int dataSize;
    private int currentIndex;
    private int currentByteBufferPos;
    private boolean hasArray;
    private byte[] currentArray;
    private int currentArrayOffset;
    private long currentAddress;
    IterableByteBufferInputStream(java.lang.Iterable<java.nio.ByteBuffer> p0) { super(); }
    private boolean getNextByteBuffer() { return false; }
    private void updateCurrentByteBufferPos(int p0) {}
    public int read() throws java.io.IOException { return 0; }
    public int read(byte[] p0, int p1, int p2) throws java.io.IOException { return 0; }
}
