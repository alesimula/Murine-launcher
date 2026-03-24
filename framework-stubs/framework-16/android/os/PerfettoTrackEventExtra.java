package android.os;

public final class PerfettoTrackEventExtra {
    public static android.os.PerfettoTrackEventExtra.Builder builder(boolean p0) { return null; }
    public long getPtr() { return 0L; }
    public void addPerfettoPointer(android.os.PerfettoTrackEventExtra.PerfettoPointer p0) {}
    public void addPerfettoPointer(android.os.PerfettoTrackEventExtra.FieldContainer p0, android.os.PerfettoTrackEventExtra.PerfettoPointer p1) {}
    public void reset() {}

    private static final class ArgBool implements android.os.PerfettoTrackEventExtra.PerfettoPointer {
        ArgBool(java.lang.String p0) {}
        public long getPtr() { return 0L; }
        public java.lang.String getName() { return null; }
        public void setValue(boolean p0) {}
    }

    private static final class ArgDouble implements android.os.PerfettoTrackEventExtra.PerfettoPointer {
        ArgDouble(java.lang.String p0) {}
        public long getPtr() { return 0L; }
        public java.lang.String getName() { return null; }
        public void setValue(double p0) {}
    }

    private static final class ArgInt64 implements android.os.PerfettoTrackEventExtra.PerfettoPointer {
        ArgInt64(java.lang.String p0) {}
        public long getPtr() { return 0L; }
        public java.lang.String getName() { return null; }
        public void setValue(long p0) {}
    }

    private static final class ArgString implements android.os.PerfettoTrackEventExtra.PerfettoPointer {
        ArgString(java.lang.String p0) {}
        public long getPtr() { return 0L; }
        public java.lang.String getName() { return null; }
        public void setValue(java.lang.String p0) {}
    }

    public static final class Builder {
        public Builder(android.os.PerfettoTrackEventExtra p0, boolean p1) {}
        public void emit() {}
        public android.os.PerfettoTrackEventExtra.Builder init(int p0, android.os.PerfettoTrace.Category p1) { return null; }
        public android.os.PerfettoTrackEventExtra.Builder setEventName(java.lang.String p0) { return null; }
        public android.os.PerfettoTrackEventExtra.Builder addArg(java.lang.String p0, long p1) { return null; }
        public android.os.PerfettoTrackEventExtra.Builder addArg(java.lang.String p0, boolean p1) { return null; }
        public android.os.PerfettoTrackEventExtra.Builder addArg(java.lang.String p0, double p1) { return null; }
        public android.os.PerfettoTrackEventExtra.Builder addArg(java.lang.String p0, java.lang.String p1) { return null; }
        public android.os.PerfettoTrackEventExtra.Builder setFlow(long p0) { return null; }
        public android.os.PerfettoTrackEventExtra.Builder setTerminatingFlow(long p0) { return null; }
        public android.os.PerfettoTrackEventExtra.Builder usingNamedTrack(long p0, java.lang.String p1) { return null; }
        public android.os.PerfettoTrackEventExtra.Builder usingProcessNamedTrack(java.lang.String p0) { return null; }
        public android.os.PerfettoTrackEventExtra.Builder usingThreadNamedTrack(long p0, java.lang.String p1) { return null; }
        public android.os.PerfettoTrackEventExtra.Builder usingCounterTrack(long p0, java.lang.String p1) { return null; }
        public android.os.PerfettoTrackEventExtra.Builder usingProcessCounterTrack(java.lang.String p0) { return null; }
        public android.os.PerfettoTrackEventExtra.Builder usingThreadCounterTrack(long p0, java.lang.String p1) { return null; }
        public android.os.PerfettoTrackEventExtra.Builder setCounter(long p0) { return null; }
        public android.os.PerfettoTrackEventExtra.Builder setCounter(double p0) { return null; }
        public android.os.PerfettoTrackEventExtra.Builder addField(long p0, long p1) { return null; }
        public android.os.PerfettoTrackEventExtra.Builder addField(long p0, double p1) { return null; }
        public android.os.PerfettoTrackEventExtra.Builder addField(long p0, java.lang.String p1) { return null; }
        public android.os.PerfettoTrackEventExtra.Builder beginProto() { return null; }
        public android.os.PerfettoTrackEventExtra.Builder endProto() { return null; }
        public android.os.PerfettoTrackEventExtra.Builder beginNested(long p0) { return null; }
        public android.os.PerfettoTrackEventExtra.Builder endNested() { return null; }
    }

    private static final class CounterDouble implements android.os.PerfettoTrackEventExtra.PerfettoPointer {
        CounterDouble() {}
        public long getPtr() { return 0L; }
        public void setValue(double p0) {}
    }

    private static final class CounterInt64 implements android.os.PerfettoTrackEventExtra.PerfettoPointer {
        CounterInt64() {}
        public long getPtr() { return 0L; }
        public void setValue(long p0) {}
    }

    private static final class CounterTrack implements android.os.PerfettoTrackEventExtra.PerfettoPointer {
        CounterTrack(java.lang.String p0, long p1) {}
        public long getPtr() { return 0L; }
        public java.lang.String getName() { return null; }
    }

    public static interface FieldContainer {
        public void addField(android.os.PerfettoTrackEventExtra.PerfettoPointer p0);
    }

    private static final class FieldDouble implements android.os.PerfettoTrackEventExtra.PerfettoPointer {
        FieldDouble() {}
        public long getPtr() { return 0L; }
        public void setValue(long p0, double p1) {}
    }

    private static final class FieldInt64 implements android.os.PerfettoTrackEventExtra.PerfettoPointer {
        FieldInt64() {}
        public long getPtr() { return 0L; }
        public void setValue(long p0, long p1) {}
    }

    private static final class FieldNested implements android.os.PerfettoTrackEventExtra.PerfettoPointer, android.os.PerfettoTrackEventExtra.FieldContainer {
        FieldNested() {}
        public long getPtr() { return 0L; }
        public void addField(android.os.PerfettoTrackEventExtra.PerfettoPointer p0) {}
        public void setId(long p0) {}
    }

    private static final class FieldString implements android.os.PerfettoTrackEventExtra.PerfettoPointer {
        FieldString() {}
        public long getPtr() { return 0L; }
        public void setValue(long p0, java.lang.String p1) {}
    }

    private static final class Flow implements android.os.PerfettoTrackEventExtra.PerfettoPointer {
        Flow() {}
        public void setProcessFlow(long p0) {}
        public void setProcessTerminatingFlow(long p0) {}
        public long getPtr() { return 0L; }
    }

    private static class NamedTrack implements android.os.PerfettoTrackEventExtra.PerfettoPointer {
        NamedTrack(java.lang.String p0, long p1) {}
        public long getPtr() { return 0L; }
        public java.lang.String getName() { return null; }
    }

    public static interface PerfettoPointer {
        public long getPtr();
    }

    private static final class Pool<T extends java.lang.Object> {
        Pool(int p0) {}
        public void reset() {}
        public T get(java.util.function.Supplier<T> p0) { return null; }
    }

    private static final class Proto implements android.os.PerfettoTrackEventExtra.PerfettoPointer, android.os.PerfettoTrackEventExtra.FieldContainer {
        Proto() {}
        public long getPtr() { return 0L; }
        public void addField(android.os.PerfettoTrackEventExtra.PerfettoPointer p0) {}
        public void clearFields() {}
    }

    private static final class RingBuffer<T extends java.lang.Object> {
        RingBuffer(int p0) {}
        public void put(int p0, T p1) {}
        public T get(int p0) { return null; }
    }
}
