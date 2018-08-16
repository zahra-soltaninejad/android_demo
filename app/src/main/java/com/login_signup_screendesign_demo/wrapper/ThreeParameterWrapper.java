package com.login_signup_screendesign_demo.wrapper;

public class ThreeParameterWrapper<T,V,E> {

    private T t;
    private V v;
    private E e;

    public ThreeParameterWrapper(T t, V v, E e) {
        this.t = t;
        this.v = v;
        this.e = e;
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

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }
}
