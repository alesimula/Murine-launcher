package com.android.internal.util;

public interface IState {
    public static final boolean HANDLED = true;
    public static final boolean NOT_HANDLED = false;
    public void enter();
    public void exit();
    public boolean processMessage(android.os.Message p0);
    public java.lang.String getName();
}
