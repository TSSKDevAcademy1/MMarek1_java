package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        if(args.length != 2) {
            System.err.println("Usage java " + FileCopy.class.getCanonicalName() + " <source> <dest>");
            System.exit(-1);
        }
        long time=System.currentTimeMillis();
        InputStream is = new BufferedInputStream(new FileInputStream(args[0]));
        OutputStream os =new BufferedOutputStream(new FileOutputStream(args[1]));
        
        int b;
        while((b = is.read()) != -1) {
            os.write(b);
        }
         
        is.close();
        os.close();
        System.out.println((System.currentTimeMillis()-time)/1000);
    }
}
