package android.internal.perfetto.protos;

public final class TestEventOuterClass {
    public TestEventOuterClass() {}

    public final class TestEvent {
        public static final long STR = 1138166333441L;
        public static final long SEQ_VALUE = 1155346202626L;
        public static final long COUNTER = 1116691496963L;
        public static final long IS_LAST = 1133871366148L;
        public static final long PAYLOAD = 1146756268037L;
        public TestEvent(android.internal.perfetto.protos.TestEventOuterClass p0) {}

        public final class TestPayload {
            public static final long STR = 2237677961217L;
            public static final long NESTED = 2246267895810L;
            public static final long SINGLE_STRING = 1138166333444L;
            public static final long SINGLE_INT = 1120986464261L;
            public static final long REPEATED_INTS = 2220498092038L;
            public static final long REMAINING_NESTING_DEPTH = 1155346202627L;
            public static final long DEBUG_ANNOTATIONS = 2246267895815L;
            public TestPayload(android.internal.perfetto.protos.TestEventOuterClass.TestEvent p0) {}
        }
    }
}
