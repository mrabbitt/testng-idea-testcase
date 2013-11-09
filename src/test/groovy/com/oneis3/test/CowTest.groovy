/*
 * Copyright (c) 2013. Plusgrade L.P.  All Rights Reserved.
 */

package com.oneis3.test

import org.testng.annotations.BeforeMethod
import org.testng.annotations.DataProvider
import org.testng.annotations.Test

import static org.hamcrest.MatcherAssert.assertThat
import static org.hamcrest.Matchers.equalTo

/**
 * TODO Add documentation.
 */
class CowTest
{
    Cow cow

    @BeforeMethod
    void setUpCow()
    {
        cow = new Cow()
    }

    @Test(dataProvider = 'mooData')
    void testMoo(int input, String expectedOutput)
    {
        assertThat(cow.moo(input), equalTo(expectedOutput))
    }

    @DataProvider(name = 'mooData')
    Object[][] provideMooData()
    {
        return [
                [
                        0, '(silence)',
                        1, 'Mo',
                        2, 'Moo',
                        3, 'Mooo',
                        11, 'Mooooooooooo',
                ]
        ]
    }
}
