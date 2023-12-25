/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uber;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import static java.lang.System.out;

/**
 *
 * @author Tamim
 */
public class AppendableObjectOutputStream extends ObjectOutputStream {

    public AppendableObjectOutputStream(FileOutputStream fos) throws IOException {
        super(out);
    }
    @Override
    protected void writeStreamHeader() throws IOException {}
    
}
