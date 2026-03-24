package android.internal.perfetto.protos;

public final class Protolog {
    public Protolog() {}

    public final class ProtoLogMessage {
        public static final long MESSAGE_ID = 1125281431553L;
        public static final long STR_PARAM_IIDS = 2254857830402L;
        public static final long SINT64_PARAMS = 2276332666883L;
        public static final long DOUBLE_PARAMS = 2203318222852L;
        public static final long BOOLEAN_PARAMS = 2220498092037L;
        public static final long STACKTRACE_IID = 1155346202630L;
        public ProtoLogMessage(android.internal.perfetto.protos.Protolog p0) {}
    }

    public final class ProtoLogViewerConfig {
        public static final long MESSAGES = 2246267895809L;
        public static final long GROUPS = 2246267895810L;
        public ProtoLogViewerConfig(android.internal.perfetto.protos.Protolog p0) {}

        public final class Group {
            public static final long ID = 1155346202625L;
            public static final long NAME = 1138166333442L;
            public static final long TAG = 1138166333443L;
            public Group(android.internal.perfetto.protos.Protolog.ProtoLogViewerConfig p0) {}
        }

        public final class MessageData {
            public static final long MESSAGE_ID = 1125281431553L;
            public static final long MESSAGE = 1138166333442L;
            public static final long LEVEL = 1159641169923L;
            public static final long GROUP_ID = 1155346202628L;
            public MessageData(android.internal.perfetto.protos.Protolog.ProtoLogViewerConfig p0) {}
        }
    }
}
