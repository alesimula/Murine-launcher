package com.android.framework.protobuf;

abstract class BinaryWriter extends com.android.framework.protobuf.ByteOutput implements com.android.framework.protobuf.Writer {
    public static final int DEFAULT_CHUNK_SIZE = 4096;
    private final com.android.framework.protobuf.BufferAllocator alloc = null;
    private final int chunkSize = 0;
    final java.util.ArrayDeque<com.android.framework.protobuf.AllocatedBuffer> buffers = null;
    int totalDoneBytes;
    private static final int MAP_KEY_NUMBER = 1;
    private static final int MAP_VALUE_NUMBER = 2;
    public static com.android.framework.protobuf.BinaryWriter newHeapInstance(com.android.framework.protobuf.BufferAllocator p0) { return null; }
    public static com.android.framework.protobuf.BinaryWriter newHeapInstance(com.android.framework.protobuf.BufferAllocator p0, int p1) { return null; }
    public static com.android.framework.protobuf.BinaryWriter newDirectInstance(com.android.framework.protobuf.BufferAllocator p0) { return null; }
    public static com.android.framework.protobuf.BinaryWriter newDirectInstance(com.android.framework.protobuf.BufferAllocator p0, int p1) { return null; }
    static boolean isUnsafeHeapSupported() { return false; }
    static boolean isUnsafeDirectSupported() { return false; }
    static com.android.framework.protobuf.BinaryWriter newSafeHeapInstance(com.android.framework.protobuf.BufferAllocator p0, int p1) { return null; }
    static com.android.framework.protobuf.BinaryWriter newUnsafeHeapInstance(com.android.framework.protobuf.BufferAllocator p0, int p1) { return null; }
    static com.android.framework.protobuf.BinaryWriter newSafeDirectInstance(com.android.framework.protobuf.BufferAllocator p0, int p1) { return null; }
    static com.android.framework.protobuf.BinaryWriter newUnsafeDirectInstance(com.android.framework.protobuf.BufferAllocator p0, int p1) { return null; }
    private BinaryWriter(com.android.framework.protobuf.BufferAllocator p0, int p1) { super(); }
    public final com.android.framework.protobuf.Writer.FieldOrder fieldOrder() { return null; }
    public final java.util.Queue<com.android.framework.protobuf.AllocatedBuffer> complete() { return null; }
    public final void writeSFixed32(int p0, int p1) throws java.io.IOException {}
    public final void writeInt64(int p0, long p1) throws java.io.IOException {}
    public final void writeSFixed64(int p0, long p1) throws java.io.IOException {}
    public final void writeFloat(int p0, float p1) throws java.io.IOException {}
    public final void writeDouble(int p0, double p1) throws java.io.IOException {}
    public final void writeEnum(int p0, int p1) throws java.io.IOException {}
    public final void writeInt32List(int p0, java.util.List<java.lang.Integer> p1, boolean p2) throws java.io.IOException {}
    private final void writeInt32List_Internal(int p0, java.util.List<java.lang.Integer> p1, boolean p2) throws java.io.IOException {}
    private final void writeInt32List_Internal(int p0, com.android.framework.protobuf.IntArrayList p1, boolean p2) throws java.io.IOException {}
    public final void writeFixed32List(int p0, java.util.List<java.lang.Integer> p1, boolean p2) throws java.io.IOException {}
    private final void writeFixed32List_Internal(int p0, java.util.List<java.lang.Integer> p1, boolean p2) throws java.io.IOException {}
    private final void writeFixed32List_Internal(int p0, com.android.framework.protobuf.IntArrayList p1, boolean p2) throws java.io.IOException {}
    public final void writeInt64List(int p0, java.util.List<java.lang.Long> p1, boolean p2) throws java.io.IOException {}
    public final void writeUInt64List(int p0, java.util.List<java.lang.Long> p1, boolean p2) throws java.io.IOException {}
    private final void writeUInt64List_Internal(int p0, java.util.List<java.lang.Long> p1, boolean p2) throws java.io.IOException {}
    private final void writeUInt64List_Internal(int p0, com.android.framework.protobuf.LongArrayList p1, boolean p2) throws java.io.IOException {}
    public final void writeFixed64List(int p0, java.util.List<java.lang.Long> p1, boolean p2) throws java.io.IOException {}
    private final void writeFixed64List_Internal(int p0, java.util.List<java.lang.Long> p1, boolean p2) throws java.io.IOException {}
    private final void writeFixed64List_Internal(int p0, com.android.framework.protobuf.LongArrayList p1, boolean p2) throws java.io.IOException {}
    public final void writeFloatList(int p0, java.util.List<java.lang.Float> p1, boolean p2) throws java.io.IOException {}
    private final void writeFloatList_Internal(int p0, java.util.List<java.lang.Float> p1, boolean p2) throws java.io.IOException {}
    private final void writeFloatList_Internal(int p0, com.android.framework.protobuf.FloatArrayList p1, boolean p2) throws java.io.IOException {}
    public final void writeDoubleList(int p0, java.util.List<java.lang.Double> p1, boolean p2) throws java.io.IOException {}
    private final void writeDoubleList_Internal(int p0, java.util.List<java.lang.Double> p1, boolean p2) throws java.io.IOException {}
    private final void writeDoubleList_Internal(int p0, com.android.framework.protobuf.DoubleArrayList p1, boolean p2) throws java.io.IOException {}
    public final void writeEnumList(int p0, java.util.List<java.lang.Integer> p1, boolean p2) throws java.io.IOException {}
    public final void writeBoolList(int p0, java.util.List<java.lang.Boolean> p1, boolean p2) throws java.io.IOException {}
    private final void writeBoolList_Internal(int p0, java.util.List<java.lang.Boolean> p1, boolean p2) throws java.io.IOException {}
    private final void writeBoolList_Internal(int p0, com.android.framework.protobuf.BooleanArrayList p1, boolean p2) throws java.io.IOException {}
    public final void writeStringList(int p0, java.util.List<java.lang.String> p1) throws java.io.IOException {}
    private void writeLazyString(int p0, java.lang.Object p1) throws java.io.IOException {}
    public final void writeBytesList(int p0, java.util.List<com.android.framework.protobuf.ByteString> p1) throws java.io.IOException {}
    public final void writeUInt32List(int p0, java.util.List<java.lang.Integer> p1, boolean p2) throws java.io.IOException {}
    private final void writeUInt32List_Internal(int p0, java.util.List<java.lang.Integer> p1, boolean p2) throws java.io.IOException {}
    private final void writeUInt32List_Internal(int p0, com.android.framework.protobuf.IntArrayList p1, boolean p2) throws java.io.IOException {}
    public final void writeSFixed32List(int p0, java.util.List<java.lang.Integer> p1, boolean p2) throws java.io.IOException {}
    public final void writeSFixed64List(int p0, java.util.List<java.lang.Long> p1, boolean p2) throws java.io.IOException {}
    public final void writeSInt32List(int p0, java.util.List<java.lang.Integer> p1, boolean p2) throws java.io.IOException {}
    private final void writeSInt32List_Internal(int p0, java.util.List<java.lang.Integer> p1, boolean p2) throws java.io.IOException {}
    private final void writeSInt32List_Internal(int p0, com.android.framework.protobuf.IntArrayList p1, boolean p2) throws java.io.IOException {}
    public final void writeSInt64List(int p0, java.util.List<java.lang.Long> p1, boolean p2) throws java.io.IOException {}
    public <K extends java.lang.Object, V extends java.lang.Object> void writeMap(int p0, com.android.framework.protobuf.MapEntryLite.Metadata<K, V> p1, java.util.Map<K, V> p2) throws java.io.IOException {}
    static final void writeMapEntryField(com.android.framework.protobuf.Writer p0, int p1, com.android.framework.protobuf.WireFormat.FieldType p2, java.lang.Object p3) throws java.io.IOException {}
    private final void writeSInt64List_Internal(int p0, java.util.List<java.lang.Long> p1, boolean p2) throws java.io.IOException {}
    private final void writeSInt64List_Internal(int p0, com.android.framework.protobuf.LongArrayList p1, boolean p2) throws java.io.IOException {}
    public final void writeMessageList(int p0, java.util.List<?> p1) throws java.io.IOException {}
    public final void writeMessageList(int p0, java.util.List<?> p1, com.android.framework.protobuf.Schema p2) throws java.io.IOException {}
    public final void writeGroupList(int p0, java.util.List<?> p1) throws java.io.IOException {}
    public final void writeGroupList(int p0, java.util.List<?> p1, com.android.framework.protobuf.Schema p2) throws java.io.IOException {}
    public final void writeMessageSetItem(int p0, java.lang.Object p1) throws java.io.IOException {}
    final com.android.framework.protobuf.AllocatedBuffer newHeapBuffer() { return null; }
    final com.android.framework.protobuf.AllocatedBuffer newHeapBuffer(int p0) { return null; }
    final com.android.framework.protobuf.AllocatedBuffer newDirectBuffer() { return null; }
    final com.android.framework.protobuf.AllocatedBuffer newDirectBuffer(int p0) { return null; }
    public abstract int getTotalBytesWritten();
    abstract void requireSpace(int p0);
    abstract void finishCurrentBuffer();
    abstract void writeTag(int p0, int p1);
    abstract void writeVarint32(int p0);
    abstract void writeInt32(int p0);
    abstract void writeSInt32(int p0);
    abstract void writeFixed32(int p0);
    abstract void writeVarint64(long p0);
    abstract void writeSInt64(long p0);
    abstract void writeFixed64(long p0);
    abstract void writeBool(boolean p0);
    abstract void writeString(java.lang.String p0);
    private static byte computeUInt64SizeNoTag(long p0) { return 0; }

    private static final class SafeDirectWriter extends com.android.framework.protobuf.BinaryWriter {
        private java.nio.ByteBuffer buffer;
        private int limitMinusOne;
        private int pos;
        SafeDirectWriter(com.android.framework.protobuf.BufferAllocator p0, int p1) { super(null, 0); }
        private void nextBuffer() {}
        private void nextBuffer(int p0) {}
        private void nextBuffer(com.android.framework.protobuf.AllocatedBuffer p0) {}
        public int getTotalBytesWritten() { return 0; }
        private int bytesWrittenToCurrentBuffer() { return 0; }
        private int spaceLeft() { return 0; }
        void finishCurrentBuffer() {}
        public void writeUInt32(int p0, int p1) {}
        public void writeInt32(int p0, int p1) {}
        public void writeSInt32(int p0, int p1) {}
        public void writeFixed32(int p0, int p1) {}
        public void writeUInt64(int p0, long p1) {}
        public void writeSInt64(int p0, long p1) {}
        public void writeFixed64(int p0, long p1) {}
        public void writeBool(int p0, boolean p1) {}
        public void writeString(int p0, java.lang.String p1) {}
        public void writeBytes(int p0, com.android.framework.protobuf.ByteString p1) {}
        public void writeMessage(int p0, java.lang.Object p1) throws java.io.IOException {}
        public void writeMessage(int p0, java.lang.Object p1, com.android.framework.protobuf.Schema p2) throws java.io.IOException {}
        public void writeGroup(int p0, java.lang.Object p1) throws java.io.IOException {}
        public void writeGroup(int p0, java.lang.Object p1, com.android.framework.protobuf.Schema p2) throws java.io.IOException {}
        public void writeStartGroup(int p0) {}
        public void writeEndGroup(int p0) {}
        void writeInt32(int p0) {}
        void writeSInt32(int p0) {}
        void writeSInt64(long p0) {}
        void writeBool(boolean p0) {}
        void writeTag(int p0, int p1) {}
        void writeVarint32(int p0) {}
        private void writeVarint32OneByte(int p0) {}
        private void writeVarint32TwoBytes(int p0) {}
        private void writeVarint32ThreeBytes(int p0) {}
        private void writeVarint32FourBytes(int p0) {}
        private void writeVarint32FiveBytes(int p0) {}
        void writeVarint64(long p0) {}
        private void writeVarint64OneByte(long p0) {}
        private void writeVarint64TwoBytes(long p0) {}
        private void writeVarint64ThreeBytes(long p0) {}
        private void writeVarint64FourBytes(long p0) {}
        private void writeVarint64FiveBytes(long p0) {}
        private void writeVarint64SixBytes(long p0) {}
        private void writeVarint64SevenBytes(long p0) {}
        private void writeVarint64EightBytes(long p0) {}
        private void writeVarint64EightBytesWithSign(long p0) {}
        private void writeVarint64NineBytes(long p0) {}
        private void writeVarint64TenBytes(long p0) {}
        void writeFixed32(int p0) {}
        void writeFixed64(long p0) {}
        void writeString(java.lang.String p0) {}
        public void write(byte p0) {}
        public void write(byte[] p0, int p1, int p2) {}
        public void writeLazy(byte[] p0, int p1, int p2) {}
        public void write(java.nio.ByteBuffer p0) {}
        public void writeLazy(java.nio.ByteBuffer p0) {}
        void requireSpace(int p0) {}
    }

    private static final class SafeHeapWriter extends com.android.framework.protobuf.BinaryWriter {
        private com.android.framework.protobuf.AllocatedBuffer allocatedBuffer;
        private byte[] buffer;
        private int offset;
        private int limit;
        private int offsetMinusOne;
        private int limitMinusOne;
        private int pos;
        SafeHeapWriter(com.android.framework.protobuf.BufferAllocator p0, int p1) { super(null, 0); }
        void finishCurrentBuffer() {}
        private void nextBuffer() {}
        private void nextBuffer(int p0) {}
        private void nextBuffer(com.android.framework.protobuf.AllocatedBuffer p0) {}
        public int getTotalBytesWritten() { return 0; }
        int bytesWrittenToCurrentBuffer() { return 0; }
        int spaceLeft() { return 0; }
        public void writeUInt32(int p0, int p1) throws java.io.IOException {}
        public void writeInt32(int p0, int p1) throws java.io.IOException {}
        public void writeSInt32(int p0, int p1) throws java.io.IOException {}
        public void writeFixed32(int p0, int p1) throws java.io.IOException {}
        public void writeUInt64(int p0, long p1) throws java.io.IOException {}
        public void writeSInt64(int p0, long p1) throws java.io.IOException {}
        public void writeFixed64(int p0, long p1) throws java.io.IOException {}
        public void writeBool(int p0, boolean p1) throws java.io.IOException {}
        public void writeString(int p0, java.lang.String p1) throws java.io.IOException {}
        public void writeBytes(int p0, com.android.framework.protobuf.ByteString p1) throws java.io.IOException {}
        public void writeMessage(int p0, java.lang.Object p1) throws java.io.IOException {}
        public void writeMessage(int p0, java.lang.Object p1, com.android.framework.protobuf.Schema p2) throws java.io.IOException {}
        public void writeGroup(int p0, java.lang.Object p1) throws java.io.IOException {}
        public void writeGroup(int p0, java.lang.Object p1, com.android.framework.protobuf.Schema p2) throws java.io.IOException {}
        public void writeStartGroup(int p0) {}
        public void writeEndGroup(int p0) {}
        void writeInt32(int p0) {}
        void writeSInt32(int p0) {}
        void writeSInt64(long p0) {}
        void writeBool(boolean p0) {}
        void writeTag(int p0, int p1) {}
        void writeVarint32(int p0) {}
        private void writeVarint32OneByte(int p0) {}
        private void writeVarint32TwoBytes(int p0) {}
        private void writeVarint32ThreeBytes(int p0) {}
        private void writeVarint32FourBytes(int p0) {}
        private void writeVarint32FiveBytes(int p0) {}
        void writeVarint64(long p0) {}
        private void writeVarint64OneByte(long p0) {}
        private void writeVarint64TwoBytes(long p0) {}
        private void writeVarint64ThreeBytes(long p0) {}
        private void writeVarint64FourBytes(long p0) {}
        private void writeVarint64FiveBytes(long p0) {}
        private void writeVarint64SixBytes(long p0) {}
        private void writeVarint64SevenBytes(long p0) {}
        private void writeVarint64EightBytes(long p0) {}
        private void writeVarint64NineBytes(long p0) {}
        private void writeVarint64TenBytes(long p0) {}
        void writeFixed32(int p0) {}
        void writeFixed64(long p0) {}
        void writeString(java.lang.String p0) {}
        public void write(byte p0) {}
        public void write(byte[] p0, int p1, int p2) {}
        public void writeLazy(byte[] p0, int p1, int p2) {}
        public void write(java.nio.ByteBuffer p0) {}
        public void writeLazy(java.nio.ByteBuffer p0) {}
        void requireSpace(int p0) {}
    }

    private static final class UnsafeDirectWriter extends com.android.framework.protobuf.BinaryWriter {
        private java.nio.ByteBuffer buffer;
        private long bufferOffset;
        private long limitMinusOne;
        private long pos;
        UnsafeDirectWriter(com.android.framework.protobuf.BufferAllocator p0, int p1) { super(null, 0); }
        private static boolean isSupported() { return false; }
        private void nextBuffer() {}
        private void nextBuffer(int p0) {}
        private void nextBuffer(com.android.framework.protobuf.AllocatedBuffer p0) {}
        public int getTotalBytesWritten() { return 0; }
        private int bytesWrittenToCurrentBuffer() { return 0; }
        private int spaceLeft() { return 0; }
        void finishCurrentBuffer() {}
        private int bufferPos() { return 0; }
        public void writeUInt32(int p0, int p1) {}
        public void writeInt32(int p0, int p1) {}
        public void writeSInt32(int p0, int p1) {}
        public void writeFixed32(int p0, int p1) {}
        public void writeUInt64(int p0, long p1) {}
        public void writeSInt64(int p0, long p1) {}
        public void writeFixed64(int p0, long p1) {}
        public void writeBool(int p0, boolean p1) {}
        public void writeString(int p0, java.lang.String p1) {}
        public void writeBytes(int p0, com.android.framework.protobuf.ByteString p1) {}
        public void writeMessage(int p0, java.lang.Object p1) throws java.io.IOException {}
        public void writeMessage(int p0, java.lang.Object p1, com.android.framework.protobuf.Schema p2) throws java.io.IOException {}
        public void writeGroup(int p0, java.lang.Object p1) throws java.io.IOException {}
        public void writeGroup(int p0, java.lang.Object p1, com.android.framework.protobuf.Schema p2) throws java.io.IOException {}
        public void writeStartGroup(int p0) {}
        public void writeEndGroup(int p0) {}
        void writeInt32(int p0) {}
        void writeSInt32(int p0) {}
        void writeSInt64(long p0) {}
        void writeBool(boolean p0) {}
        void writeTag(int p0, int p1) {}
        void writeVarint32(int p0) {}
        private void writeVarint32OneByte(int p0) {}
        private void writeVarint32TwoBytes(int p0) {}
        private void writeVarint32ThreeBytes(int p0) {}
        private void writeVarint32FourBytes(int p0) {}
        private void writeVarint32FiveBytes(int p0) {}
        void writeVarint64(long p0) {}
        private void writeVarint64OneByte(long p0) {}
        private void writeVarint64TwoBytes(long p0) {}
        private void writeVarint64ThreeBytes(long p0) {}
        private void writeVarint64FourBytes(long p0) {}
        private void writeVarint64FiveBytes(long p0) {}
        private void writeVarint64SixBytes(long p0) {}
        private void writeVarint64SevenBytes(long p0) {}
        private void writeVarint64EightBytes(long p0) {}
        private void writeVarint64NineBytes(long p0) {}
        private void writeVarint64TenBytes(long p0) {}
        void writeFixed32(int p0) {}
        void writeFixed64(long p0) {}
        void writeString(java.lang.String p0) {}
        public void write(byte p0) {}
        public void write(byte[] p0, int p1, int p2) {}
        public void writeLazy(byte[] p0, int p1, int p2) {}
        public void write(java.nio.ByteBuffer p0) {}
        public void writeLazy(java.nio.ByteBuffer p0) {}
        void requireSpace(int p0) {}
    }

    private static final class UnsafeHeapWriter extends com.android.framework.protobuf.BinaryWriter {
        private com.android.framework.protobuf.AllocatedBuffer allocatedBuffer;
        private byte[] buffer;
        private long offset;
        private long limit;
        private long offsetMinusOne;
        private long limitMinusOne;
        private long pos;
        UnsafeHeapWriter(com.android.framework.protobuf.BufferAllocator p0, int p1) { super(null, 0); }
        static boolean isSupported() { return false; }
        void finishCurrentBuffer() {}
        private int arrayPos() { return 0; }
        private void nextBuffer() {}
        private void nextBuffer(int p0) {}
        private void nextBuffer(com.android.framework.protobuf.AllocatedBuffer p0) {}
        public int getTotalBytesWritten() { return 0; }
        int bytesWrittenToCurrentBuffer() { return 0; }
        int spaceLeft() { return 0; }
        public void writeUInt32(int p0, int p1) {}
        public void writeInt32(int p0, int p1) {}
        public void writeSInt32(int p0, int p1) {}
        public void writeFixed32(int p0, int p1) {}
        public void writeUInt64(int p0, long p1) {}
        public void writeSInt64(int p0, long p1) {}
        public void writeFixed64(int p0, long p1) {}
        public void writeBool(int p0, boolean p1) {}
        public void writeString(int p0, java.lang.String p1) {}
        public void writeBytes(int p0, com.android.framework.protobuf.ByteString p1) {}
        public void writeMessage(int p0, java.lang.Object p1) throws java.io.IOException {}
        public void writeMessage(int p0, java.lang.Object p1, com.android.framework.protobuf.Schema p2) throws java.io.IOException {}
        public void writeGroup(int p0, java.lang.Object p1) throws java.io.IOException {}
        public void writeGroup(int p0, java.lang.Object p1, com.android.framework.protobuf.Schema p2) throws java.io.IOException {}
        public void writeStartGroup(int p0) {}
        public void writeEndGroup(int p0) {}
        void writeInt32(int p0) {}
        void writeSInt32(int p0) {}
        void writeSInt64(long p0) {}
        void writeBool(boolean p0) {}
        void writeTag(int p0, int p1) {}
        void writeVarint32(int p0) {}
        private void writeVarint32OneByte(int p0) {}
        private void writeVarint32TwoBytes(int p0) {}
        private void writeVarint32ThreeBytes(int p0) {}
        private void writeVarint32FourBytes(int p0) {}
        private void writeVarint32FiveBytes(int p0) {}
        void writeVarint64(long p0) {}
        private void writeVarint64OneByte(long p0) {}
        private void writeVarint64TwoBytes(long p0) {}
        private void writeVarint64ThreeBytes(long p0) {}
        private void writeVarint64FourBytes(long p0) {}
        private void writeVarint64FiveBytes(long p0) {}
        private void writeVarint64SixBytes(long p0) {}
        private void writeVarint64SevenBytes(long p0) {}
        private void writeVarint64EightBytes(long p0) {}
        private void writeVarint64NineBytes(long p0) {}
        private void writeVarint64TenBytes(long p0) {}
        void writeFixed32(int p0) {}
        void writeFixed64(long p0) {}
        void writeString(java.lang.String p0) {}
        public void write(byte p0) {}
        public void write(byte[] p0, int p1, int p2) {}
        public void writeLazy(byte[] p0, int p1, int p2) {}
        public void write(java.nio.ByteBuffer p0) {}
        public void writeLazy(java.nio.ByteBuffer p0) {}
        void requireSpace(int p0) {}
    }
}
