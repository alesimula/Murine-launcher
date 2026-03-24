package com.android.framework.protobuf;

abstract class ListFieldSchema {
    abstract <L extends java.lang.Object> java.util.List<L> mutableListAt(java.lang.Object p0, long p1);
    abstract void makeImmutableListAt(java.lang.Object p0, long p1);
    abstract <L extends java.lang.Object> void mergeListsAt(java.lang.Object p0, java.lang.Object p1, long p2);
    static com.android.framework.protobuf.ListFieldSchema full() { return null; }
    static com.android.framework.protobuf.ListFieldSchema lite() { return null; }

    private static final class ListFieldSchemaFull extends com.android.framework.protobuf.ListFieldSchema {
        <L extends java.lang.Object> java.util.List<L> mutableListAt(java.lang.Object p0, long p1) { return null; }
        void makeImmutableListAt(java.lang.Object p0, long p1) {}
        <E extends java.lang.Object> void mergeListsAt(java.lang.Object p0, java.lang.Object p1, long p2) {}
        static <E extends java.lang.Object> java.util.List<E> getList(java.lang.Object p0, long p1) { return null; }
    }

    private static final class ListFieldSchemaLite extends com.android.framework.protobuf.ListFieldSchema {
        <L extends java.lang.Object> java.util.List<L> mutableListAt(java.lang.Object p0, long p1) { return null; }
        void makeImmutableListAt(java.lang.Object p0, long p1) {}
        <E extends java.lang.Object> void mergeListsAt(java.lang.Object p0, java.lang.Object p1, long p2) {}
        static <E extends java.lang.Object> com.android.framework.protobuf.Internal.ProtobufList<E> getProtobufList(java.lang.Object p0, long p1) { return null; }
    }
}
