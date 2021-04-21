package com.apoorva;

import java.io.*;

class Save implements Serializable {
    int i;
}

public class SerializationDemo {
    public static void main(String[] args) throws Exception {
        Save obj = new Save();
        obj.i = 4;

        File f = new File("SerialDemo.txt");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);

        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Save obj1 = (Save) ois.readObject();
    }
}
