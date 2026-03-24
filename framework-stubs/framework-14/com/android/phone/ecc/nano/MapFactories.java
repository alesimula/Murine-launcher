package com.android.phone.ecc.nano;

public final class MapFactories {
    static void setMapFactory(com.android.phone.ecc.nano.MapFactories.MapFactory p0) {}
    public static com.android.phone.ecc.nano.MapFactories.MapFactory getMapFactory() { return null; }

    private static class DefaultMapFactory implements com.android.phone.ecc.nano.MapFactories.MapFactory {
        public <K extends java.lang.Object, V extends java.lang.Object> java.util.Map<K, V> forMap(java.util.Map<K, V> p0) { return null; }
    }

    public static interface MapFactory {
        public <K extends java.lang.Object, V extends java.lang.Object> java.util.Map<K, V> forMap(java.util.Map<K, V> p0);
    }
}
