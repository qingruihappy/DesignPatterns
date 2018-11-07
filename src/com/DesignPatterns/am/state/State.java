package com.DesignPatterns.am.state;

public abstract class State {
	      /**
	       * 抽象状态（接口）角色，封装了和环境类(Person类）的对象的状态（闹表时间的变化）相关的行为
	       */
	      public abstract void doSth(PersonB personB);
}
