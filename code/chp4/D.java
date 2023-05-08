package chp4;

interface D extends X, C {
    /**
     * This results in a compile-time error because
     * the value of "val" is ambiguous (from X and C).
     * Inside D you would have to explicitly use X.val
     * or C.val
     */
    //  int ambiguousVariable = val;
}
