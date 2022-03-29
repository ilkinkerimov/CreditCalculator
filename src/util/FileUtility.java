package util;

import java.io.*;

public class FileUtility {

    public static void WriteObjectToFile(Object serObj, String path) {

        try {

            FileOutputStream fileOut = new FileOutputStream(path);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.close();


        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static Object readFileDeserialize(String name) throws Exception {
        Object obj = null;

        FileInputStream fi = new FileInputStream(name);
        try (ObjectInputStream in = new ObjectInputStream(fi)) {
            obj = in.readObject();
        } finally {
            return obj;
        }
    }
}
