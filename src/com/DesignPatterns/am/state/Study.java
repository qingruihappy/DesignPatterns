package com.DesignPatterns.am.state;

public class Study extends State {
    @Override
    public void doSth(PersonB personB) {
        // 如此，再也不需要向下传递状态了！
        System.out.println(personB.getHour() + "点，正学习呢！");
    }
}
