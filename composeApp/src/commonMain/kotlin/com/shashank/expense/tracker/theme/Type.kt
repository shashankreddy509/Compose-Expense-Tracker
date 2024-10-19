package com.shashank.expense.tracker.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import expensetracker.composeapp.generated.resources.Res
import expensetracker.composeapp.generated.resources.actor
import expensetracker.composeapp.generated.resources.adamina
import org.jetbrains.compose.resources.Font


@Composable
fun bodyFontFamily() = FontFamily(
    Font(Res.font.actor, weight = FontWeight.Light),
)

@Composable
fun displayFontFamily() = FontFamily(
    Font(Res.font.adamina, weight = FontWeight.Light),
)

// Default Material 3 typography values
val baseline = Typography()

@Composable
fun AppTypography() = Typography().run {
    copy(
        displayLarge = baseline.displayLarge.copy(fontFamily = displayFontFamily()),
        displayMedium = baseline.displayMedium.copy(fontFamily = displayFontFamily()),
        displaySmall = baseline.displaySmall.copy(fontFamily = displayFontFamily()),
        headlineLarge = baseline.headlineLarge.copy(fontFamily = displayFontFamily()),
        headlineMedium = baseline.headlineMedium.copy(fontFamily = displayFontFamily()),
        headlineSmall = baseline.headlineSmall.copy(fontFamily = displayFontFamily()),
        titleLarge = baseline.titleLarge.copy(fontFamily = displayFontFamily()),
        titleMedium = baseline.titleMedium.copy(fontFamily = displayFontFamily()),
        titleSmall = baseline.titleSmall.copy(fontFamily = displayFontFamily()),
        bodyLarge = baseline.bodyLarge.copy(fontFamily = bodyFontFamily()),
        bodyMedium = baseline.bodyMedium.copy(fontFamily = bodyFontFamily()),
        bodySmall = baseline.bodySmall.copy(fontFamily = bodyFontFamily()),
        labelLarge = baseline.labelLarge.copy(fontFamily = bodyFontFamily()),
        labelMedium = baseline.labelMedium.copy(fontFamily = bodyFontFamily()),
        labelSmall = baseline.labelSmall.copy(fontFamily = bodyFontFamily()),
    )
}

