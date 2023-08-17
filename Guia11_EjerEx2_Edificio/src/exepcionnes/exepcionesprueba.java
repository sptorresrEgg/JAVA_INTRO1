/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepcionnes;

/**
 *
 * @author sptorresr
 */
public class exepcionesprueba extends Exception {

    /**
     * Creates a new instance of <code>exepcionesprueba</code> without detail
     * message.
     */
    public exepcionesprueba() {
    }

    /**
     * Constructs an instance of <code>exepcionesprueba</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public exepcionesprueba(String msg) {
        super(msg);
    }
}
