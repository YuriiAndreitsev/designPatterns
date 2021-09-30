package com.ua.behavioural.visitor;

public class XmlElement extends Element {

    public XmlElement(String uuid) {
        super(uuid);
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}