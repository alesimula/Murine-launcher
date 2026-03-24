package com.android.internal.widget.remotecompose.player;

public class RemoteComposePlayer extends android.widget.FrameLayout {
    public RemoteComposePlayer(android.content.Context p0) { super((android.content.Context)null); }
    public RemoteComposePlayer(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public RemoteComposePlayer(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public void setDebug(int p0) {}
    public void setDocument(com.android.internal.widget.remotecompose.player.RemoteComposeDocument p0) {}
    public void addClickListener(com.android.internal.widget.remotecompose.player.RemoteComposePlayer.ClickCallbacks p0) {}
    public void setTheme(int p0) {}

    public static interface ClickCallbacks {
        public void click(int p0, java.lang.String p1);
    }
}
