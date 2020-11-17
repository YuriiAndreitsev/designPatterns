package com.ua.structural.decorator;

abstract class AbstractDecorator extends Component {

    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void doJob() {
        if (component != null) {
            component.doJob();
        }
    }
}

class ConcreteDecoratorA extends AbstractDecorator{

    @Override
    public void doJob() {
        super.doJob();
        System.out.println("with additional resposibilities");
    }
}

class ConcreteDecoratorB extends AbstractDecorator{

    @Override
    public void doJob() {
        super.doJob();
        System.out.println("explicity from decorator B");
    }
}
