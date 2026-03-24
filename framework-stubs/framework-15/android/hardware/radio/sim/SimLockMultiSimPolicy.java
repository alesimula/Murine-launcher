package android.hardware.radio.sim;

public @interface SimLockMultiSimPolicy {
    public static final int NO_MULTISIM_POLICY = 0;
    public static final int ONE_VALID_SIM_MUST_BE_PRESENT = 1;
    public static final int APPLY_TO_ALL_SLOTS = 2;
    public static final int APPLY_TO_ONLY_SLOT_1 = 3;
    public static final int VALID_SIM_MUST_PRESENT_ON_SLOT_1 = 4;
    public static final int ACTIVE_SERVICE_ON_SLOT_1_TO_UNBLOCK_OTHER_SLOTS = 5;
    public static final int ACTIVE_SERVICE_ON_ANY_SLOT_TO_UNBLOCK_OTHER_SLOTS = 6;
    public static final int ALL_SIMS_MUST_BE_VALID = 7;
    public static final int SLOT_POLICY_OTHER = 8;

    public static interface $ {
        public static java.lang.String toString(int p0) { return null; }
        public static java.lang.String arrayToString(java.lang.Object p0) { return null; }
    }
}
