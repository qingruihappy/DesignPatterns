package com.DesignPatterns.am.state;

public class PersonB {
    /**
     * 这个人有一个闹表，靠它的时间变化（状态修改）来决定何时做什么（改变行为）
     */
    private int hour;

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public PersonB() {
        // 在构造器里初始化状态，从早晨起床开始
        this.state = new GetUp();
    }

    /**
     * 人（环境类）的个行为
     *
     * 状态模式允许通过改变一个对象的内部状态，来改变对象的行为，就像修改了对象的类一样！
     */
    public void doSth() {
        // 传入的是PersonB的对象
        state.doSth(this);
        // 每次都从头开始搜索状态类
        this.state = new GetUp();
    }
}