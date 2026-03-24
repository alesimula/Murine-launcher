package com.android.internal.location.altitude;

public final class GeoidMap {
    public GeoidMap() {}
    @android.annotation.NonNull
    public static com.android.internal.location.altitude.nano.MapParamsProto getGeoidHeightParams(android.content.Context p0) throws java.io.IOException { return null; }
    @android.annotation.NonNull
    public static com.android.internal.location.altitude.nano.MapParamsProto getExpirationDistanceParams(android.content.Context p0) throws java.io.IOException { return null; }
    @android.annotation.Nullable
    public static com.android.internal.location.altitude.nano.MapParamsProto getGeoidHeightParams() { return null; }
    @android.annotation.NonNull
    public double[] readGeoidHeights(com.android.internal.location.altitude.nano.MapParamsProto p0, android.content.Context p1, long[] p2) throws java.io.IOException { return null; }
    @android.annotation.NonNull
    public double[] readExpirationDistances(com.android.internal.location.altitude.nano.MapParamsProto p0, android.content.Context p1, long[] p2) throws java.io.IOException { return null; }
    @android.annotation.Nullable
    public double[] readGeoidHeights(com.android.internal.location.altitude.nano.MapParamsProto p0, long[] p1) { return null; }

    private static interface TileFunction {
        @android.annotation.Nullable
        public com.android.internal.location.altitude.nano.S2TileProto getTile(long p0);
    }
}
