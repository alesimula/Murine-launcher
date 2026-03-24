package com.android.framework.protobuf;

public class MapEntryLite<K extends java.lang.Object, V extends java.lang.Object> {
    private static final int KEY_FIELD_NUMBER = 1;
    private static final int VALUE_FIELD_NUMBER = 2;
    private final com.android.framework.protobuf.MapEntryLite.Metadata<K, V> metadata = null;
    private final K key = null;
    private final V value = null;
    private MapEntryLite(com.android.framework.protobuf.WireFormat.FieldType p0, K p1, com.android.framework.protobuf.WireFormat.FieldType p2, V p3) {}
    private MapEntryLite(com.android.framework.protobuf.MapEntryLite.Metadata<K, V> p0, K p1, V p2) {}
    public K getKey() { return null; }
    public V getValue() { return null; }
    public static <K extends java.lang.Object, V extends java.lang.Object> com.android.framework.protobuf.MapEntryLite<K, V> newDefaultInstance(com.android.framework.protobuf.WireFormat.FieldType p0, K p1, com.android.framework.protobuf.WireFormat.FieldType p2, V p3) { return null; }
    static <K extends java.lang.Object, V extends java.lang.Object> void writeTo(com.android.framework.protobuf.CodedOutputStream p0, com.android.framework.protobuf.MapEntryLite.Metadata<K, V> p1, K p2, V p3) throws java.io.IOException {}
    static <K extends java.lang.Object, V extends java.lang.Object> int computeSerializedSize(com.android.framework.protobuf.MapEntryLite.Metadata<K, V> p0, K p1, V p2) { return 0; }
    static <T extends java.lang.Object> T parseField(com.android.framework.protobuf.CodedInputStream p0, com.android.framework.protobuf.ExtensionRegistryLite p1, com.android.framework.protobuf.WireFormat.FieldType p2, T p3) throws java.io.IOException { return null; }
    public void serializeTo(com.android.framework.protobuf.CodedOutputStream p0, int p1, K p2, V p3) throws java.io.IOException {}
    public int computeMessageSize(int p0, K p1, V p2) { return 0; }
    public java.util.Map.Entry<K, V> parseEntry(com.android.framework.protobuf.ByteString p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws java.io.IOException { return null; }
    static <K extends java.lang.Object, V extends java.lang.Object> java.util.Map.Entry<K, V> parseEntry(com.android.framework.protobuf.CodedInputStream p0, com.android.framework.protobuf.MapEntryLite.Metadata<K, V> p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException { return null; }
    public void parseInto(com.android.framework.protobuf.MapFieldLite<K, V> p0, com.android.framework.protobuf.CodedInputStream p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException {}
    com.android.framework.protobuf.MapEntryLite.Metadata<K, V> getMetadata() { return null; }

    static class Metadata<K extends java.lang.Object, V extends java.lang.Object> {
        public final com.android.framework.protobuf.WireFormat.FieldType keyType = null;
        public final K defaultKey = null;
        public final com.android.framework.protobuf.WireFormat.FieldType valueType = null;
        public final V defaultValue = null;
        public Metadata(com.android.framework.protobuf.WireFormat.FieldType p0, K p1, com.android.framework.protobuf.WireFormat.FieldType p2, V p3) {}
    }
}
