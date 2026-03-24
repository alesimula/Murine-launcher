package android.hardware.radio.sim;

public @interface PersoSubstate {
    public static final int UNKNOWN = 0;
    public static final int IN_PROGRESS = 1;
    public static final int READY = 2;
    public static final int SIM_NETWORK = 3;
    public static final int SIM_NETWORK_SUBSET = 4;
    public static final int SIM_CORPORATE = 5;
    public static final int SIM_SERVICE_PROVIDER = 6;
    public static final int SIM_SIM = 7;
    public static final int SIM_NETWORK_PUK = 8;
    public static final int SIM_NETWORK_SUBSET_PUK = 9;
    public static final int SIM_CORPORATE_PUK = 10;
    public static final int SIM_SERVICE_PROVIDER_PUK = 11;
    public static final int SIM_SIM_PUK = 12;
    public static final int RUIM_NETWORK1 = 13;
    public static final int RUIM_NETWORK2 = 14;
    public static final int RUIM_HRPD = 15;
    public static final int RUIM_CORPORATE = 16;
    public static final int RUIM_SERVICE_PROVIDER = 17;
    public static final int RUIM_RUIM = 18;
    public static final int RUIM_NETWORK1_PUK = 19;
    public static final int RUIM_NETWORK2_PUK = 20;
    public static final int RUIM_HRPD_PUK = 21;
    public static final int RUIM_CORPORATE_PUK = 22;
    public static final int RUIM_SERVICE_PROVIDER_PUK = 23;
    public static final int RUIM_RUIM_PUK = 24;
    public static final int SIM_SPN = 25;
    public static final int SIM_SPN_PUK = 26;
    public static final int SIM_SP_EHPLMN = 27;
    public static final int SIM_SP_EHPLMN_PUK = 28;
    public static final int SIM_ICCID = 29;
    public static final int SIM_ICCID_PUK = 30;
    public static final int SIM_IMPI = 31;
    public static final int SIM_IMPI_PUK = 32;
    public static final int SIM_NS_SP = 33;
    public static final int SIM_NS_SP_PUK = 34;
}
