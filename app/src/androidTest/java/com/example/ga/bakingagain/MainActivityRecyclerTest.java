package com.example.ga.bakingagain;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.IdlingResource;
import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.runner.AndroidJUnit4;


import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import android.support.test.rule.ActivityTestRule;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class MainActivityRecyclerTest {
    public static final String DISH_NAME = "Nutella Pie";
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);



    @Test
    public void clickOnRecycleView() {
        onView(withId(R.id.DishR)).perform(RecyclerViewActions
                .actionOnItemAtPosition(0, click()));
        /*onView(withId(R.id.recipeName)).check(matches(withText(DISH_NAME)));*/
    }


}
