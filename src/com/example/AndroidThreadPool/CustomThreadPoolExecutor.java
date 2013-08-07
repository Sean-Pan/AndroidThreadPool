package com.example.AndroidThreadPool;

import android.util.Log;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: farhan
 * Date: 2013-08-06
 * Time: 10:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class CustomThreadPoolExecutor extends ThreadPoolExecutor{

    public CustomThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
    }

    @Override
    protected void beforeExecute(Thread t, Runnable r) {
        super.beforeExecute(t, r);    //To change body of overridden methods use File | Settings | File Templates.
        Log.d("Pool", "Before execute : " + ((TheTask)r).name );
    }

    @Override
    protected void afterExecute(Runnable r, Throwable t) {
        super.afterExecute(r, t);    //To change body of overridden methods use File | Settings | File Templates.
        Log.d("Pool", "After execute : " + ((TheTask) r).name);
    }

    @Override
    public void execute(Runnable command) {
        super.execute(command);    //To change body of overridden methods use File | Settings | File Templates.
    }
}
