package android.util;

public class KeyValueListParser {
    public KeyValueListParser(char p0) {}
    public void setString(java.lang.String p0) throws java.lang.IllegalArgumentException {}
    public int getInt(java.lang.String p0, int p1) { return 0; }
    public long getLong(java.lang.String p0, long p1) { return 0L; }
    public float getFloat(java.lang.String p0, float p1) { return 0.0f; }
    public java.lang.String getString(java.lang.String p0, java.lang.String p1) { return null; }
    public boolean getBoolean(java.lang.String p0, boolean p1) { return false; }
    public int[] getIntArray(java.lang.String p0, int[] p1) { return null; }
    public int size() { return 0; }
    public java.lang.String keyAt(int p0) { return null; }
    public long getDurationMillis(java.lang.String p0, long p1) { return 0L; }

    public static class FloatValue {
        public FloatValue(java.lang.String p0, float p1) {}
        public void parse(android.util.KeyValueListParser p0) {}
        public java.lang.String getKey() { return null; }
        public float getDefaultValue() { return 0.0f; }
        public float getValue() { return 0.0f; }
        public void setValue(float p0) {}
        public void dump(java.io.PrintWriter p0, java.lang.String p1) {}
        public void dumpProto(android.util.proto.ProtoOutputStream p0, long p1) {}
    }

    public static class IntValue {
        public IntValue(java.lang.String p0, int p1) {}
        public void parse(android.util.KeyValueListParser p0) {}
        public java.lang.String getKey() { return null; }
        public int getDefaultValue() { return 0; }
        public int getValue() { return 0; }
        public void setValue(int p0) {}
        public void dump(java.io.PrintWriter p0, java.lang.String p1) {}
        public void dumpProto(android.util.proto.ProtoOutputStream p0, long p1) {}
    }

    public static class LongValue {
        public LongValue(java.lang.String p0, long p1) {}
        public void parse(android.util.KeyValueListParser p0) {}
        public java.lang.String getKey() { return null; }
        public long getDefaultValue() { return 0L; }
        public long getValue() { return 0L; }
        public void setValue(long p0) {}
        public void dump(java.io.PrintWriter p0, java.lang.String p1) {}
        public void dumpProto(android.util.proto.ProtoOutputStream p0, long p1) {}
    }

    public static class StringValue {
        public StringValue(java.lang.String p0, java.lang.String p1) {}
        public void parse(android.util.KeyValueListParser p0) {}
        public java.lang.String getKey() { return null; }
        public java.lang.String getDefaultValue() { return null; }
        public java.lang.String getValue() { return null; }
        public void setValue(java.lang.String p0) {}
        public void dump(java.io.PrintWriter p0, java.lang.String p1) {}
        public void dumpProto(android.util.proto.ProtoOutputStream p0, long p1) {}
    }
}
