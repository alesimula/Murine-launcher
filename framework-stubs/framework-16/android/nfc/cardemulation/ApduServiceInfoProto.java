package android.nfc.cardemulation;

public final class ApduServiceInfoProto {
    public static final long COMPONENT_NAME = 1146756268033L;
    public static final long DESCRIPTION = 1138166333442L;
    public static final long ON_HOST = 1133871366147L;
    public static final long OFF_HOST_NAME = 1138166333444L;
    public static final long STATIC_OFF_HOST_NAME = 1138166333445L;
    public static final long STATIC_AID_GROUPS = 2246267895814L;
    public static final long DYNAMIC_AID_GROUPS = 2246267895815L;
    public static final long SETTINGS_ACTIVITY_NAME = 1138166333448L;
    public static final long SHOULD_DEFAULT_TO_OBSERVE_MODE = 1133871366153L;
    public static final long AUTO_TRANSACT_MAPPING = 2246267895818L;
    public static final long AUTO_TRANSACT_PATTERNS = 2246267895819L;
    public ApduServiceInfoProto() {}

    public final class AutoTransactMapping {
        public static final long AID = 1138166333441L;
        public static final long SHOULD_AUTO_TRANSACT = 1133871366146L;
        public AutoTransactMapping(android.nfc.cardemulation.ApduServiceInfoProto p0) {}
    }

    public final class AutoTransactPattern {
        public static final long REGEXP_PATTERN = 1138166333441L;
        public static final long SHOULD_AUTO_TRANSACT = 1133871366146L;
        public AutoTransactPattern(android.nfc.cardemulation.ApduServiceInfoProto p0) {}
    }
}
