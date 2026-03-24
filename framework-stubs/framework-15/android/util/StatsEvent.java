package android.util;

public final class StatsEvent {
    StatsEvent() {}
    @android.annotation.NonNull
    public static android.util.StatsEvent.Builder newBuilder() { return null; }

    public static final class Builder {
        Builder() {}
        @android.annotation.NonNull
        public android.util.StatsEvent.Builder addBooleanAnnotation(byte p0, boolean p1) { return null; }
        @android.annotation.NonNull
        public android.util.StatsEvent.Builder addIntAnnotation(byte p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.util.StatsEvent build() { return null; }
        @android.annotation.NonNull
        public android.util.StatsEvent.Builder setAtomId(int p0) { return null; }
        @android.annotation.NonNull
        public android.util.StatsEvent.Builder usePooledBuffer() { return null; }
        @android.annotation.NonNull
        public android.util.StatsEvent.Builder writeAttributionChain(int[] p0, java.lang.String[] p1) { return null; }
        @android.annotation.NonNull
        public android.util.StatsEvent.Builder writeBoolean(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.util.StatsEvent.Builder writeBooleanArray(boolean[] p0) { return null; }
        @android.annotation.NonNull
        public android.util.StatsEvent.Builder writeByteArray(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.util.StatsEvent.Builder writeFloat(float p0) { return null; }
        @android.annotation.NonNull
        public android.util.StatsEvent.Builder writeFloatArray(float[] p0) { return null; }
        @android.annotation.NonNull
        public android.util.StatsEvent.Builder writeInt(int p0) { return null; }
        @android.annotation.NonNull
        public android.util.StatsEvent.Builder writeIntArray(int[] p0) { return null; }
        @android.annotation.NonNull
        public android.util.StatsEvent.Builder writeKeyValuePairs(android.util.SparseIntArray p0, android.util.SparseLongArray p1, android.util.SparseArray<java.lang.String> p2, android.util.SparseArray<java.lang.Float> p3) { return null; }
        @android.annotation.NonNull
        public android.util.StatsEvent.Builder writeLong(long p0) { return null; }
        @android.annotation.NonNull
        public android.util.StatsEvent.Builder writeLongArray(long[] p0) { return null; }
        @android.annotation.NonNull
        public android.util.StatsEvent.Builder writeString(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.util.StatsEvent.Builder writeStringArray(java.lang.String[] p0) { return null; }
    }
}
