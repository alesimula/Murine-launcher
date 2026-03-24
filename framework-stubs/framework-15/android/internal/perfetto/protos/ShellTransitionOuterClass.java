package android.internal.perfetto.protos;

public final class ShellTransitionOuterClass {
    public ShellTransitionOuterClass() {}

    public final class ShellHandlerMapping {
        public static final long ID = 1120986464257L;
        public static final long NAME = 1138166333442L;
        public ShellHandlerMapping(android.internal.perfetto.protos.ShellTransitionOuterClass p0) {}
    }

    public final class ShellHandlerMappings {
        public static final long MAPPING = 2246267895809L;
        public ShellHandlerMappings(android.internal.perfetto.protos.ShellTransitionOuterClass p0) {}
    }

    public final class ShellTransition {
        public static final long ID = 1120986464257L;
        public static final long CREATE_TIME_NS = 1112396529666L;
        public static final long SEND_TIME_NS = 1112396529667L;
        public static final long DISPATCH_TIME_NS = 1112396529668L;
        public static final long MERGE_TIME_NS = 1112396529669L;
        public static final long MERGE_REQUEST_TIME_NS = 1112396529670L;
        public static final long SHELL_ABORT_TIME_NS = 1112396529671L;
        public static final long WM_ABORT_TIME_NS = 1112396529672L;
        public static final long FINISH_TIME_NS = 1112396529673L;
        public static final long START_TRANSACTION_ID = 1116691496970L;
        public static final long FINISH_TRANSACTION_ID = 1116691496971L;
        public static final long HANDLER = 1120986464268L;
        public static final long TYPE = 1120986464269L;
        public static final long TARGETS = 2246267895822L;
        public static final long MERGE_TARGET = 1120986464271L;
        public static final long FLAGS = 1120986464272L;
        public static final long STARTING_WINDOW_REMOVE_TIME_NS = 1112396529681L;
        public ShellTransition(android.internal.perfetto.protos.ShellTransitionOuterClass p0) {}

        public final class Target {
            public static final long MODE = 1120986464257L;
            public static final long LAYER_ID = 1120986464258L;
            public static final long WINDOW_ID = 1120986464259L;
            public static final long FLAGS = 1120986464260L;
            public Target(android.internal.perfetto.protos.ShellTransitionOuterClass.ShellTransition p0) {}
        }
    }
}
