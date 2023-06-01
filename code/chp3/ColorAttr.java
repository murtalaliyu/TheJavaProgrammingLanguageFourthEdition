package chp3;

import chp4.Attributed;

class ColorAttr extends Attributed.Attr {

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

    @Override
    public boolean equals(Object colorAttr) {
        ColorAttr newColorAttr = (ColorAttr) colorAttr;
        return (this.getName() != null && this.getName().equals(newColorAttr.getName()))
                && (this.getValue() != null && this.getValue().equals(newColorAttr.getValue()))
                && (this.myColor != null && this.myColor.equals(newColorAttr.myColor));
    }

    @Override
    public int hashCode() {
        int result = 1;
        int prime = 77;
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getValue() == null) ? 0 : getValue().hashCode());
        result = prime * result + ((getColor() == null) ? 0 : getColor().hashCode());
        return result;
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

    public static void main(String[] args) {
        ColorAttr white = new ColorAttr("White", 0xFFFF);
        ColorAttr black = new ColorAttr("Black", 0x0000);

        System.out.println("White equals Black: " + white.equals(black));
        System.out.println("White equals White: " + white.equals(white));
        System.out.println("Black equals Black: " + black.equals(black));
        System.out.println("White Hash: " + white.hashCode());
        System.out.println("Black Hash: " + black.hashCode());
    }

}

class ScreenColor {
    public ScreenColor(Object value) {}
}
