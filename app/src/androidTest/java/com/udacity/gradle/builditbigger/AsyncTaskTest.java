package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.test.AndroidTestCase;
import android.test.InstrumentationTestCase;
import android.util.Pair;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Created by hania on 12.04.16.
 */
public class AsyncTaskTest extends AndroidTestCase {

    public AsyncTaskTest(){super();}

//    private static boolean called;
//
//    protected void setUp() throws Exception {
//        super.setUp();
//        called = false;
//    }
//
//    protected void tearDown() throws Exception {
//        super.tearDown();
//    }

    public void testString() throws Throwable{
        final Context context = getContext();
//
//        final CountDownLatch signal = new CountDownLatch(1);
//
//        runTestOnUiThread(new Runnable() {
//            @Override
//            public void run() {
//                new EndpointsAsyncTask(){
//                    @Override
//                    protected void onPostExecute(String result) {
//                        super.onPostExecute(result);
//                       // assertFalse(result == "");
//                        signal.countDown();
//                    }
//                }.execute(new Pair<Context, String>(getInstrumentation().getContext() , ""));
//            }
//        });
//
//        signal.await(10, TimeUnit.SECONDS);
//        assertTrue(called);

        EndpointsAsyncTask task = new EndpointsAsyncTask();
        String x = task.execute(new Pair<Context, String>(context, "")).get(30, TimeUnit.SECONDS);
        assertFalse(x == "");
    }
}
