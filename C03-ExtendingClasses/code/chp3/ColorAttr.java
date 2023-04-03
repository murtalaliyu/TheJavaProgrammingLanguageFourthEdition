class ColorAttr extends Attr {

    private ScreenColor myColor;    // the decoded color

    public ColorAttr(String name, Object value) {
        super(name, value);
        decodeColor();
    }

    public ColorAttr(String name) { this(name, "transparent"); }

    public ColorAttr(String name, ScreenColor value) {
        super(name, value.toString());
        myColor = value;
    }

    public Object setValue(Object newValue) {
        // do the superclass's setValue work first
        Object retval = super.setValue(newValue);
        decodeColor();
        return retval;
    }

    @Override
    public void hi(int[] arr) {}

    /** Set value to ScreenColor, not description */
    public ScreenColor setValue(ScreenColor newValue) {
        // do the superclass's setValue work first
        super.setValue(newValue.toString());
        ScreenColor oldValue = myColor;
        myColor = newValue;
        return oldValue;
    }

    /** Return decoded ScreenColor object */
    public ScreenColor getColor() {
        return myColor;
    }

    /** set ScreenColor from description in getValue */
    protected void decodeColor() {
        if (getValue() == null) myColor = null;
        else myColor = new ScreenColor(getValue());
    }

}

class ScreenColor {
    public ScreenColor(Object value) {}
}
