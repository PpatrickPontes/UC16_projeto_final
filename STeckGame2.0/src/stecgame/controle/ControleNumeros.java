/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stecgame.controle;

import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Sosciopata
 */
public class ControleNumeros extends PlainDocument {
   @Override
    public void insertString(int offset, String str, javax.swing.text.AttributeSet attr)
    throws BadLocationException{
      super.insertString(offset, str.replaceAll("[^0-9]", ""), attr);
    }
    public void replace(int offset, String str, javax.swing.text.AttributeSet attr)
    throws BadLocationException{
      super.insertString(offset, str.replaceAll("[^0-9]", ""), attr);
    } 
}
