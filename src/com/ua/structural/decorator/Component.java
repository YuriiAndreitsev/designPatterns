package com.ua.structural.decorator;

abstract class Component {
    public abstract void doJob();
}

class ConcreteComponenet extends Component{
    @Override
    public void doJob() {
        System.out.println("Concrete component. Closed for modification");
    }
}
