// Adapted from Lawnchair (https://github.com/LawnchairLauncher/lawnchair), Copyright (C) 2024 Lawnchair, Apache 2.0
package app.murinelauncher.widget.smartspace.glance

import android.app.PendingIntent
import android.content.res.Resources
import android.view.View

private val pendingIntentTagId =
    Resources.getSystem().getIdentifier("pending_intent_tag", "id", "android")

/** The click PendingIntent RemoteViews stores on a view. */
internal val View?.pendingIntent get() = this?.getTag(pendingIntentTagId) as? PendingIntent
