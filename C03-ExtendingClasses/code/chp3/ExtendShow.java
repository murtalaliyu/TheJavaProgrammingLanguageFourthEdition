package chp3;

class ExtendShow extends SuperShow {

    public String str = "ExtendStr";

    public void show() {
        System.out.println("Extend.show: " + str);
    }

    public static void main(String[] args) {
        ExtendShow ext = new ExtendShow();
        SuperShow sup = ext;

        sup.show(); // Extend.show: ExtendShow
        ext.show(); // Extend.show: ExtendShow

        System.out.println("sup.str = " + sup.str); // sup.str = SuperStr
        System.out.println("ext.str = " + ext.str); // ext.str = ExtendStr
    }

}
