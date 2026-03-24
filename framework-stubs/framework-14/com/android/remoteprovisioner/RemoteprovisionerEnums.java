package com.android.remoteprovisioner;

public final class RemoteprovisionerEnums {
    public static final int REMOTE_KEY_PROVISIONING_STATUS_UNKNOWN = 0;
    public static final int KEYS_SUCCESSFULLY_PROVISIONED = 1;
    public static final int NO_PROVISIONING_NEEDED = 2;
    public static final int PROVISIONING_DISABLED = 3;
    public static final int INTERNAL_ERROR = 4;
    public static final int NO_NETWORK_CONNECTIVITY = 5;
    public static final int OUT_OF_ERROR_BUDGET = 6;
    public static final int INTERRUPTED = 7;
    public static final int GENERATE_KEYPAIR_FAILED = 10;
    public static final int GENERATE_CSR_FAILED = 11;
    public static final int GET_POOL_STATUS_FAILED = 12;
    public static final int INSERT_CHAIN_INTO_POOL_FAILED = 13;
    public static final int FETCH_GEEK_TIMED_OUT = 20;
    public static final int FETCH_GEEK_IO_EXCEPTION = 21;
    public static final int FETCH_GEEK_HTTP_ERROR = 22;
    public static final int SIGN_CERTS_TIMED_OUT = 30;
    public static final int SIGN_CERTS_IO_EXCEPTION = 31;
    public static final int SIGN_CERTS_HTTP_ERROR = 32;
    public static final int SIGN_CERTS_DEVICE_NOT_REGISTERED = 33;
    public RemoteprovisionerEnums() {}
}
