package com.android.framework.protobuf;

@com.android.framework.protobuf.CheckReturnValue
interface MapFieldSchema {
    public java.util.Map<?, ?> forMutableMapData(java.lang.Object p0);
    public java.util.Map<?, ?> forMapData(java.lang.Object p0);
    public boolean isImmutable(java.lang.Object p0);
    public java.lang.Object toImmutable(java.lang.Object p0);
    public java.lang.Object newMapField(java.lang.Object p0);
    public com.android.framework.protobuf.MapEntryLite.Metadata<?, ?> forMapMetadata(java.lang.Object p0);
    @com.android.framework.protobuf.CanIgnoreReturnValue
    public java.lang.Object mergeFrom(java.lang.Object p0, java.lang.Object p1);
    public int getSerializedSize(int p0, java.lang.Object p1, java.lang.Object p2);
}
