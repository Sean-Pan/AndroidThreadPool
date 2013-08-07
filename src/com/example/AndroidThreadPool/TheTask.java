package com.example.AndroidThreadPool;

import android.util.Log;

import static java.lang.Thread.sleep;

/**
 * Created with IntelliJ IDEA.
 * User: farhan
 * Date: 2013-08-06
 * Time: 10:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class TheTask implements Runnable {

    String name;

    public TheTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            Log.d("Task Start", name);
            sleep(500);
            Log.d("Task End", name);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
