package com.android.framework.protobuf;

abstract class ListFieldSchema {
    private static final com.android.framework.protobuf.ListFieldSchema FULL_INSTANCE = null;
    private static final com.android.framework.protobuf.ListFieldSchema LITE_INSTANCE = null;
    private ListFieldSchema() {}
    abstract <L extends java.lang.Object> java.util.List<L> mutableListAt(java.lang.Object p0, long p1);
    abstract void makeImmutableListAt(java.lang.Object p0, long p1);
    abstract <L extends java.lang.Object> void mergeListsAt(java.lang.Object p0, java.lang.Object p1, long p2);
    static com.android.framework.protobuf.ListFieldSchema full() { return null; }
    static com.android.framework.protobuf.ListFieldSchema lite() { return null; }

    private static final class ListFieldSchemaFull extends com.android.framework.protobuf.ListFieldSchema {
        private static final java.lang.Class<?> UNMODIFIABLE_LIST_CLASS = null;
        private ListFieldSchemaFull() { super(); }
        <L extends java.lang.Object> java.util.List<L> mutableListAt(java.lang.Object p0, long p1) { return null; }
        void makeImmutableListAt(java.lang.Object p0, long p1) {}
        private static <L extends java.lang.Object> java.util.List<L> mutableListAt(java.lang.Object p0, long p1, int p2) { return null; }
        <E extends java.lang.Object> void mergeListsAt(java.lang.Object p0, java.lang.Object p1, long p2) {}
        static <E extends java.lang.Object> java.util.List<E> getList(java.lang.Object p0, long p1) { return null; }
    }

    private static final class ListFieldSchemaLite extends com.android.framework.protobuf.ListFieldSchema {
        private ListFieldSchemaLite() { super(); }
        <L extends java.lang.Object> java.util.List<L> mutableListAt(java.lang.Object p0, long p1) { return null; }
        void makeImmutableListAt(java.lang.Object p0, long p1) {}
        <E extends java.lang.Object> void mergeListsAt(java.lang.Object p0, java.lang.Object p1, long p2) {}
        static <E extends java.lang.Object> com.android.framework.protobuf.Internal.ProtobufList<E> getProtobufList(java.lang.Object p0, long p1) { return null; }
    }
}
