package com.android.framework.protobuf;

final class UnsafeUtil {
    static final long BYTE_ARRAY_BASE_OFFSET = Long.valueOf(0L);
    static final boolean IS_BIG_ENDIAN = Boolean.valueOf(false);
    static boolean hasUnsafeArrayOperations() { return false; }
    static boolean hasUnsafeByteBufferOperations() { return false; }
    static <T extends java.lang.Object> T allocateInstance(java.lang.Class<T> p0) { return null; }
    static long objectFieldOffset(java.lang.reflect.Field p0) { return 0L; }
    static byte getByte(java.lang.Object p0, long p1) { return 0; }
    static void putByte(java.lang.Object p0, long p1, byte p2) {}
    static int getInt(java.lang.Object p0, long p1) { return 0; }
    static void putInt(java.lang.Object p0, long p1, int p2) {}
    static long getLong(java.lang.Object p0, long p1) { return 0L; }
    static void putLong(java.lang.Object p0, long p1, long p2) {}
    static boolean getBoolean(java.lang.Object p0, long p1) { return false; }
    static void putBoolean(java.lang.Object p0, long p1, boolean p2) {}
    static float getFloat(java.lang.Object p0, long p1) { return 0.0f; }
    static void putFloat(java.lang.Object p0, long p1, float p2) {}
    static double getDouble(java.lang.Object p0, long p1) { return 0.0; }
    static void putDouble(java.lang.Object p0, long p1, double p2) {}
    static java.lang.Object getObject(java.lang.Object p0, long p1) { return null; }
    static void putObject(java.lang.Object p0, long p1, java.lang.Object p2) {}
    static byte getByte(byte[] p0, long p1) { return 0; }
    static void putByte(byte[] p0, long p1, byte p2) {}
    static int getInt(int[] p0, long p1) { return 0; }
    static void putInt(int[] p0, long p1, int p2) {}
    static long getLong(long[] p0, long p1) { return 0L; }
    static void putLong(long[] p0, long p1, long p2) {}
    static boolean getBoolean(boolean[] p0, long p1) { return false; }
    static void putBoolean(boolean[] p0, long p1, boolean p2) {}
    static float getFloat(float[] p0, long p1) { return 0.0f; }
    static void putFloat(float[] p0, long p1, float p2) {}
    static double getDouble(double[] p0, long p1) { return 0.0; }
    static void putDouble(double[] p0, long p1, double p2) {}
    static java.lang.Object getObject(java.lang.Object[] p0, long p1) { return null; }
    static void putObject(java.lang.Object[] p0, long p1, java.lang.Object p2) {}
    static void copyMemory(byte[] p0, long p1, long p2, long p3) {}
    static void copyMemory(long p0, byte[] p1, long p2, long p3) {}
    static void copyMemory(byte[] p0, long p1, byte[] p2, long p3, long p4) {}
    static byte getByte(long p0) { return 0; }
    static void putByte(long p0, byte p1) {}
    static int getInt(long p0) { return 0; }
    static void putInt(long p0, int p1) {}
    static long getLong(long p0) { return 0L; }
    static void putLong(long p0, long p1) {}
    static long addressOffset(java.nio.ByteBuffer p0) { return 0L; }
    static java.lang.Object getStaticObject(java.lang.reflect.Field p0) { return null; }
    static sun.misc.Unsafe getUnsafe() { return null; }
    static int mismatch(byte[] p0, int p1, byte[] p2, int p3, int p4) { return 0; }

    private static final class JvmMemoryAccessor extends com.android.framework.protobuf.UnsafeUtil.MemoryAccessor {
        JvmMemoryAccessor(sun.misc.Unsafe p0) { super(null); }
        public byte getByte(long p0) { return 0; }
        public void putByte(long p0, byte p1) {}
        public int getInt(long p0) { return 0; }
        public void putInt(long p0, int p1) {}
        public long getLong(long p0) { return 0L; }
        public void putLong(long p0, long p1) {}
        public byte getByte(java.lang.Object p0, long p1) { return 0; }
        public void putByte(java.lang.Object p0, long p1, byte p2) {}
        public boolean getBoolean(java.lang.Object p0, long p1) { return false; }
        public void putBoolean(java.lang.Object p0, long p1, boolean p2) {}
        public float getFloat(java.lang.Object p0, long p1) { return 0.0f; }
        public void putFloat(java.lang.Object p0, long p1, float p2) {}
        public double getDouble(java.lang.Object p0, long p1) { return 0.0; }
        public void putDouble(java.lang.Object p0, long p1, double p2) {}
        public void copyMemory(long p0, byte[] p1, long p2, long p3) {}
        public void copyMemory(byte[] p0, long p1, long p2, long p3) {}
        public java.lang.Object getStaticObject(java.lang.reflect.Field p0) { return null; }
    }

    private static abstract class MemoryAccessor {
        MemoryAccessor(sun.misc.Unsafe p0) {}
        public final long objectFieldOffset(java.lang.reflect.Field p0) { return 0L; }
        public abstract byte getByte(java.lang.Object p0, long p1);
        public abstract void putByte(java.lang.Object p0, long p1, byte p2);
        public final int getInt(java.lang.Object p0, long p1) { return 0; }
        public final void putInt(java.lang.Object p0, long p1, int p2) {}
        public final long getLong(java.lang.Object p0, long p1) { return 0L; }
        public final void putLong(java.lang.Object p0, long p1, long p2) {}
        public abstract boolean getBoolean(java.lang.Object p0, long p1);
        public abstract void putBoolean(java.lang.Object p0, long p1, boolean p2);
        public abstract float getFloat(java.lang.Object p0, long p1);
        public abstract void putFloat(java.lang.Object p0, long p1, float p2);
        public abstract double getDouble(java.lang.Object p0, long p1);
        public abstract void putDouble(java.lang.Object p0, long p1, double p2);
        public final java.lang.Object getObject(java.lang.Object p0, long p1) { return null; }
        public final void putObject(java.lang.Object p0, long p1, java.lang.Object p2) {}
        public final int arrayBaseOffset(java.lang.Class<?> p0) { return 0; }
        public final int arrayIndexScale(java.lang.Class<?> p0) { return 0; }
        public abstract byte getByte(long p0);
        public abstract void putByte(long p0, byte p1);
        public abstract int getInt(long p0);
        public abstract void putInt(long p0, int p1);
        public abstract long getLong(long p0);
        public abstract void putLong(long p0, long p1);
        public abstract java.lang.Object getStaticObject(java.lang.reflect.Field p0);
        public abstract void copyMemory(long p0, byte[] p1, long p2, long p3);
        public abstract void copyMemory(byte[] p0, long p1, long p2, long p3);
    }
}
