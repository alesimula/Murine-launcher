package android.view.inputmethod;

public final class InputMethodEditorTraceProto {
    public InputMethodEditorTraceProto() {}

    public final class InputMethodEditorProto {
        public static final long ELAPSED_REALTIME_NANOS = 1125281431553L;
        public static final long CLIENT_SIDE_DUMP = 1146756268034L;
        public InputMethodEditorProto(android.view.inputmethod.InputMethodEditorTraceProto p0) {}

        public final class ClientSideProto {
            public static final long INPUT_METHOD_MANAGER = 1146756268033L;
            public static final long VIEW_ROOT_IMPL = 1146756268034L;
            public static final long INSETS_CONTROLLER = 1146756268035L;
            public static final long INSETS_SOURCE_CONSUMER = 1146756268036L;
            public static final long IME_INSETS_SOURCE_CONSUMER = 1146756268037L;
            public static final long EDITOR_INFO = 1146756268038L;
            public static final long IME_FOCUS_CONTROLLER = 1146756268039L;
            public ClientSideProto(android.view.inputmethod.InputMethodEditorTraceProto.InputMethodEditorProto p0) {}
        }
    }

    public final class InputMethodEditorTraceFileProto {
        public static final int INVALID = 0;
        public static final int MAGIC_NUMBER_L = 1413827913;
        public static final int MAGIC_NUMBER_H = 1162035538;
        public static final long MAGIC_NUMBER = 1125281431553L;
        public static final long ENTRY = 2246267895810L;
        public InputMethodEditorTraceFileProto(android.view.inputmethod.InputMethodEditorTraceProto p0) {}
    }
}
