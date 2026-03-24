package com.android.framework.protobuf.nano;

public final class MapFactories {
    private static volatile com.android.framework.protobuf.nano.MapFactories.MapFactory mapFactory;
    static void setMapFactory(com.android.framework.protobuf.nano.MapFactories.MapFactory p0) {}
    public static com.android.framework.protobuf.nano.MapFactories.MapFactory getMapFactory() { return null; }
    private MapFactories() {}

    public static interface MapFactory {
        public <K extends java.lang.Object, V extends java.lang.Object> java.util.Map<K, V> forMap(java.util.Map<K, V> p0);
    }

    private static class DefaultMapFactory implements com.android.framework.protobuf.nano.MapFactories.MapFactory {
        private DefaultMapFactory() {}
        public <K extends java.lang.Object, V extends java.lang.Object> java.util.Map<K, V> forMap(java.util.Map<K, V> p0) { return null; }
    }
}
