package com.android.internal.location.altitude;

public final class GeoidHeightMap {
    public GeoidHeightMap() {}
    public static com.android.internal.location.altitude.nano.MapParamsProto getParams(android.content.Context p0) throws java.io.IOException { return null; }
    public static com.android.internal.location.altitude.nano.MapParamsProto getParams() { return null; }
    public double[] readGeoidHeights(com.android.internal.location.altitude.nano.MapParamsProto p0, android.content.Context p1, long[] p2) throws java.io.IOException { return null; }
    public double[] readGeoidHeights(com.android.internal.location.altitude.nano.MapParamsProto p0, long[] p1) { return null; }

    private static interface TileFunction {
        public com.android.internal.location.altitude.nano.S2TileProto getTile(long p0);
    }
}
