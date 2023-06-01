package chp4;

import old.examples.initializationBlocks.Body;

import java.util.Iterator;

class AttributedBody extends Body implements Attributed {

    private AttributedImpl attrImpl = new AttributedImpl();

    public AttributedBody() {
        super();
    }

    public AttributedBody(String name, Body orbits) {
        super(name, orbits);
    }

    // Forward all Attributed methods to the attrImpl objects

    @Override
    public void add(Attr newAttr) {
        attrImpl.add(newAttr);
    }

    @Override
    public Attr find(String attrName) {
        return attrImpl.find(attrName);
    }

    @Override
    public Attr remove(String attrName) {
        return attrImpl.remove(attrName);
    }

    @Override
    public Iterator<Attr> attrs() {
        return attrImpl.attrs();
    }

}
