【装饰者模式】
是指在不改变原有对象的基础之上，将功能附加到对象上，提供了比继承更有弹性的替代方案（扩展原有对象的功能），属于结构型模式。
装饰者在代码程序中适用于以下场景：
1、用于扩展一个类的功能或给一个类添加附加职责。
2、动态的给一个对象添加功能，这些功能可以再动态的撤销。
【优点】
1、装饰者是继承的有力补充，比继承灵活，不改变原有对象的情况下动态地给一个对象扩展功能，即插即用。
2、通过使用不同装饰类以及这些装饰类的排列组合，可以实现不同效果。
3、装饰者完全遵守开闭原则。
【缺点】
1、会出现更多的代码，更多的类，增加程序复杂性。
2、动态装饰时，多层装饰时会更复杂。
【装饰者模式和适配器模式对比】
装饰者和适配器模式都是包装模式（WrapperPattern），装饰者也是一种特殊的代理模式。        
[形式] 装饰者模式是一种非常特别的适配器模式； 适配器模式没有层级关系，装饰器模式有层级关系。
[定义] 装饰者和被装饰者都实现同一个接口，主要目的是为了扩展之后依旧保留OOP关系； 适配器和被适配者没有必然的联系，通常是采用继承或代理的形式进行包装。
[关系] 装饰者模式满足is-a的关系； 适配器模式满足has-a的关系
[功能] 装饰者模式注重覆盖、扩展； 适配器模式注重兼容、转换
[设计] 装饰者模式前置考虑； 适配器模式 后置考虑

【观察者模式】
定义了对象之间的一对多依赖，让多个观察者对象同时监听一个主体对象，当主体对象发生变化时，它的所有依赖者（观察者）都会收到通知并更新，属于行为型模式。观察者模式有时也叫做发布订阅模式。观察者模式主要用于在关联行为之间建立一套触发机制的场景。
【JDK实现】
1、被观察者继承 Observable，需要被观察的方法后写上 setChanged(); notifyObservers(Object);
2、观察者继承 Observer 接口，实现update()方法。
3、测试时需要被观察者需要@一下观察者，即使用.addObserver()方法。
【Lisenter监听器】
1、增加监听时，使用Map存储要触发的事件类型及回调方法
2、触发时，从Map中获取，并使用反射机制调用回调方法
【Guava API】
1、导入包
<dependency>
     <groupId>com.google.guava</groupId> 
     <artifactId>guava</artifactId> 
     <version>20.0</version> 
</dependency> 
2、创建侦听事件GuavaEvent，在方法上使用注解
public class GuavaEvent { 
     @Subscribe 
     public void subscribe(String str){ 
           //业务逻辑 
          System.out.println("执行 subscribe 方法,传入的参数是:" + str); 
     }
}
3、测试类
public static void main(String[] args) { 
       EventBus eventbus = new EventBus();
       GuavaEvent guavaEvent = new GuavaEvent(); 
       eventbus.register(guavaEvent); 
       eventbus.post("Tom");
}

【优点】
1、观察者和被观察者之间建立了一个抽象的耦合。
2、观察者模式支持广播通信。
【缺点】
1、观察者之间有过多的细节依赖、提高时间消耗及程序的复杂度。
2、使用要得当，要避免循环调用。
