package com.login_signup_screendesign_demo.wrapper;


public class TwoParameterWrapper<T,V> {

    private T t;
    private V v;

    public TwoParameterWrapper(T t, V v) {
        this.t = t;
        this.v = v;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }
}
