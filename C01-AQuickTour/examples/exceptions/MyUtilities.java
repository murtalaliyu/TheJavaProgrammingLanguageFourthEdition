package examples.exceptions;

import exercises._1_16.BadDataSetException;

import java.io.FileInputStream;
import java.io.IOException;

class MyUtilities {

    public double[] getDataSet(String setName) throws BadDataSetException {
        String file = setName + ".dset";
        FileInputStream in = null;

        try {
            in = new FileInputStream(file);
            return readDataSet(in);
        } catch (IOException e) {
            throw new BadDataSetException(setName, e);
        } finally {
            try {
                if (in != null) in.close();
            } catch (IOException e) {
                // ignore: we either read the data OK
                //          or we're throwing BadDataSetException
            }
        }
    }

    public double[] readDataSet(FileInputStream in) { return new double[]{}; }

}
