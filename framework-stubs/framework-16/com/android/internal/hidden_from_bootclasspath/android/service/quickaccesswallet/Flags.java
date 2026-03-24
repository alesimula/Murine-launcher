package com.android.internal.hidden_from_bootclasspath.android.service.quickaccesswallet;

public final class Flags {
    public static final java.lang.String FLAG_LAUNCH_SELECTED_CARD_FROM_QS_TILE = "android.service.quickaccesswallet.launch_selected_card_from_qs_tile";
    public static final java.lang.String FLAG_LAUNCH_WALLET_OPTION_ON_POWER_DOUBLE_TAP = "android.service.quickaccesswallet.launch_wallet_option_on_power_double_tap";
    public static final java.lang.String FLAG_LAUNCH_WALLET_VIA_SYSUI_CALLBACKS = "android.service.quickaccesswallet.launch_wallet_via_sysui_callbacks";
    public Flags() {}
    public static boolean launchSelectedCardFromQsTile() { return false; }
    public static boolean launchWalletOptionOnPowerDoubleTap() { return false; }
    public static boolean launchWalletViaSysuiCallbacks() { return false; }
}
