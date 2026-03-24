package com.android.internal.telephony.protobuf.nano;

public final class MapFactories {
    static void setMapFactory(com.android.internal.telephony.protobuf.nano.MapFactories.MapFactory p0) {}
    public static com.android.internal.telephony.protobuf.nano.MapFactories.MapFactory getMapFactory() { return null; }

    private static class DefaultMapFactory implements com.android.internal.telephony.protobuf.nano.MapFactories.MapFactory {
        public <K extends java.lang.Object, V extends java.lang.Object> java.util.Map<K, V> forMap(java.util.Map<K, V> p0) { return null; }
    }

    public static interface MapFactory {
        public <K extends java.lang.Object, V extends java.lang.Object> java.util.Map<K, V> forMap(java.util.Map<K, V> p0);
    }
}
