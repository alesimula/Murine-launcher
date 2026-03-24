package android.companion;

public final class Telecom {
    public static final int UNKNOWN_CONTROL = 0;
    public static final int ACCEPT = 1;
    public static final int REJECT = 2;
    public static final int SILENCE = 3;
    public static final int MUTE = 4;
    public static final int UNMUTE = 5;
    public static final int END = 6;
    public static final int PUT_ON_HOLD = 7;
    public static final int TAKE_OFF_HOLD = 8;
    public static final long CALLS = 2246267895809L;
    public static final long REQUESTS = 2246267895810L;
    public static final long FACILITATORS = 2246267895811L;
    public Telecom() {}

    public final class Call {
        public static final int UNKNOWN_STATUS = 0;
        public static final int RINGING = 1;
        public static final int ONGOING = 2;
        public static final int ON_HOLD = 3;
        public static final int RINGING_SILENCED = 4;
        public static final int AUDIO_PROCESSING = 5;
        public static final int RINGING_SIMULATED = 6;
        public static final int DISCONNECTED = 7;
        public static final int DIALING = 8;
        public static final int UNKNOWN_DIRECTION = 0;
        public static final int INCOMING = 1;
        public static final int OUTGOING = 2;
        public static final long ID = 1138166333441L;
        public static final long ORIGIN = 1146756268034L;
        public static final long STATUS = 1159641169923L;
        public static final long CONTROLS = 2259152797700L;
        public static final long DIRECTION = 1159641169925L;
        public Call(android.companion.Telecom p0) {}

        public final class Origin {
            public static final long CALLER_ID = 1138166333441L;
            public static final long APP_ICON = 1151051235330L;
            public static final long FACILITATOR = 1146756268035L;
            public Origin(android.companion.Telecom.Call p0) {}
        }
    }

    public final class CallFacilitator {
        public static final long NAME = 1138166333441L;
        public static final long IDENTIFIER = 1138166333442L;
        public static final long EXTENDED_IDENTIFIER = 1138166333443L;
        public CallFacilitator(android.companion.Telecom p0) {}
    }

    public final class Request {
        public static final long CREATE_ACTION = 1146756268033L;
        public static final long CONTROL_ACTION = 1146756268034L;
        public Request(android.companion.Telecom p0) {}

        public final class ControlAction {
            public static final long ID = 1138166333441L;
            public static final long CONTROL = 1159641169922L;
            public ControlAction(android.companion.Telecom.Request p0) {}
        }

        public final class CreateAction {
            public static final long ID = 1138166333441L;
            public static final long ADDRESS = 1138166333442L;
            public static final long FACILITATOR = 1146756268035L;
            public CreateAction(android.companion.Telecom.Request p0) {}
        }
    }
}
