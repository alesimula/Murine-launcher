package com.android.internal.notification;

public class SystemNotificationChannels {
    public static java.lang.String VIRTUAL_KEYBOARD;
    public static java.lang.String PHYSICAL_KEYBOARD;
    public static java.lang.String SECURITY;
    public static java.lang.String CAR_MODE;
    public static java.lang.String ACCOUNT;
    public static java.lang.String DEVELOPER;
    public static java.lang.String UPDATES;
    public static java.lang.String NETWORK_STATUS;
    public static java.lang.String NETWORK_ALERTS;
    public static java.lang.String NETWORK_AVAILABLE;
    public static java.lang.String VPN;
    @java.lang.Deprecated
    public static java.lang.String DEVICE_ADMIN_DEPRECATED;
    public static java.lang.String DEVICE_ADMIN;
    public static java.lang.String ALERTS;
    public static java.lang.String RETAIL_MODE;
    public static java.lang.String USB;
    public static java.lang.String FOREGROUND_SERVICE;
    public static java.lang.String HEAVY_WEIGHT_APP;
    public static java.lang.String SYSTEM_CHANGES;
    public static java.lang.String DO_NOT_DISTURB;
    public static void createAll(android.content.Context p0) {}
    public static void removeDeprecated(android.content.Context p0) {}
    public static void createAccountChannelForPackage(java.lang.String p0, int p1, android.content.Context p2) {}
    private static android.app.NotificationChannel newAccountChannel(android.content.Context p0) { return null; }
    private SystemNotificationChannels() {}
}
