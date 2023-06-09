package com.danilkinkin.buckwheat.widget.minimal

import android.content.Context
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.glance.GlanceId
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.SizeMode
import androidx.glance.appwidget.provideContent
import androidx.glance.state.GlanceStateDefinition
import androidx.glance.state.PreferencesGlanceStateDefinition

class MinimalWidget : GlanceAppWidget() {

    override val stateDefinition: GlanceStateDefinition<*> = PreferencesGlanceStateDefinition

    companion object {
        val smallMode = DpSize(120.dp, 100.dp)
        val mediumMode = DpSize(180.dp, 100.dp)
        val largeMode = DpSize(320.dp, 100.dp)
    }

    override val sizeMode: SizeMode = SizeMode.Responsive(
        setOf(smallMode, mediumMode, largeMode)
    )

    override suspend fun provideGlance(context: Context, id: GlanceId) {
        provideContent {
            WidgetContent()
        }
    }
}

