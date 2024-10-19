package com.shashank.expense.tracker

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import com.shashank.expense.tracker.presentation.screen.splash.SplashScreen
import com.shashank.expense.tracker.theme.AppTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    AppTheme {
        Navigator(SplashScreen()) {
            SlideTransition(it)
        }
    }
}