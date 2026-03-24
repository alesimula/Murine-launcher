package com.android.server;

public interface PowerAllowlistInternal {
    public void registerTempAllowlistChangeListener(com.android.server.PowerAllowlistInternal.TempAllowlistChangeListener p0);
    public void unregisterTempAllowlistChangeListener(com.android.server.PowerAllowlistInternal.TempAllowlistChangeListener p0);

    public static interface TempAllowlistChangeListener {
        public void onAppAdded(int p0);
        public void onAppRemoved(int p0);
    }
}
