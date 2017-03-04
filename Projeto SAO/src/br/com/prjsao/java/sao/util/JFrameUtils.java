/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cidacastello.java.sao.util;

import java.awt.Component;
import javax.swing.JTextField;

/**
 *
 * @author Cida
 */
public class JFrameUtils {
    public static void cleanJTextFields(Component[] components) {  
        for (Component c : components) {  
	    if (c instanceof JTextField) {  
	        ((JTextField) c).setText("");  
	    }  
        } 
    }  
}
