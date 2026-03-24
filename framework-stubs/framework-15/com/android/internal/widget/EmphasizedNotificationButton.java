package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public class EmphasizedNotificationButton extends android.widget.Button {
    public EmphasizedNotificationButton(android.content.Context p0) { super((android.content.Context)null); }
    public EmphasizedNotificationButton(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public EmphasizedNotificationButton(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public EmphasizedNotificationButton(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    @android.view.RemotableViewMethod
    public void setRippleColor(android.content.res.ColorStateList p0) {}
    @android.view.RemotableViewMethod
    public void setButtonBackground(android.content.res.ColorStateList p0) {}
    @android.view.RemotableViewMethod(asyncImpl="setImageIconAsync")
    public void setImageIcon(android.graphics.drawable.Icon p0) {}
    @android.view.RemotableViewMethod
    public java.lang.Runnable setImageIconAsync(android.graphics.drawable.Icon p0) { return null; }
    @android.view.RemotableViewMethod(asyncImpl="glueIconAsync")
    public void glueIcon(android.graphics.drawable.Icon p0) {}
    @android.view.RemotableViewMethod
    public java.lang.Runnable glueIconAsync(android.graphics.drawable.Icon p0) { return null; }
    @android.view.RemotableViewMethod(asyncImpl="glueLabelAsync")
    public void glueLabel(java.lang.CharSequence p0) {}
    @android.view.RemotableViewMethod
    public java.lang.Runnable glueLabelAsync(java.lang.CharSequence p0) { return null; }
    public void onRtlPropertiesChanged(int p0) {}
    @android.view.RemotableViewMethod
    public void setIsPriority(boolean p0) {}
    public boolean isPriority() { return false; }

    private static class CenterBesideImageSpan extends android.text.style.MetricAffectingSpan {
        CenterBesideImageSpan(int p0) { super(); }
        public void updateMeasureState(android.text.TextPaint p0) {}
        public void updateDrawState(android.text.TextPaint p0) {}
    }

    private static class SpacerSpan extends android.text.style.ReplacementSpan {
        SpacerSpan(int p0) { super(); }
        public int getSize(android.graphics.Paint p0, java.lang.CharSequence p1, int p2, int p3, android.graphics.Paint.FontMetricsInt p4) { return 0; }
        public void draw(android.graphics.Canvas p0, java.lang.CharSequence p1, int p2, int p3, float p4, int p5, int p6, int p7, android.graphics.Paint p8) {}
    }
}
