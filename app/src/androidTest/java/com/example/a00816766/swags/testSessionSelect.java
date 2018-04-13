package com.example.a00816766.swags;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class testSessionSelect {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void ensureTextChangesWork() throws InterruptedException {

        onView(withId(R.id.graphsButton)).perform(click());
        onView(withId(R.id.checkBoxAngle)).perform(click());
        Thread.sleep(1000);
        onView(withId(R.id.checkBoxAngle)).perform(click());
        Thread.sleep(1000);
        onView(withId(R.id.sessionButton)).perform(click());
        Thread.sleep(1000);
        onView(withId(R.id.checkBoxSessionOne)).perform(click());
        onView(withId(R.id.finishButton)).perform(click());
        Thread.sleep(1000);
        onView(withId(R.id.checkBoxAngle)).perform(click());
        Thread.sleep(1000);
        onView(withId(R.id.checkBoxAngle)).perform(click());
        Thread.sleep(1000);

    }
}