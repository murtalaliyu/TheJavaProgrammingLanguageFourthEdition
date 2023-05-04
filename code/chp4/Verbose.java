package chp4;

interface Verbose {

    int SILENT = 0;
    int TERSE = 1;
    int NORMAL = 2;
    int VERBOSE = 3;

    /**
     * The above can be passed as level, giving names to constant
     * values that represent specific meanings. Enums might be
     * better here but this is an example.
     * @param level
     */
    void setVerbosity(int level);
    int getVerbosity();

}
