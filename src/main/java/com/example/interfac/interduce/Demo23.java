package com.example.interfac.interduce;

/**
 * 挑战2-3：实现一个接口，它包含的方法并不要求接口实现类返回值，或者代表调用者执行若干操作
 */


public interface Demo23 {

    public void operate1();
    public void operate2();

}


/**
 * 书中提到：一个提供空实现的实现类叫stub桩。 然后通过stub的子类实现想要实现的方法。这是一种写法。 分成三层了。接口-实现接口的空实现类-实现类的子类
 */
