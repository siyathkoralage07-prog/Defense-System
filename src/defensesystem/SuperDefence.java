/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defensesystem;

import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author user
 */
public abstract class SuperDefence extends javax.swing.JFrame implements DefenseObserver{
    
    private MainController mainController;
    
    public void setMainController(MainController mainController){
        this.mainController = mainController;
    }
    
    protected void setAreaLabel(JLabel label, boolean isCleared){
        if(isCleared){
            label.setText("Area Cleared");
        }else{
            label.setText("Area Not Cleared");
        }
    }
    
    protected void showIncomingMessage(JTextArea textArea, String message){
        String oldText = textArea.getText();
        textArea.setText(oldText + message + "\n");
    }
    
    protected void sendToMainController(String unitName, String text) {
        if (mainController != null && !text.equals("")) {
            mainController.receiveUnitMessage(unitName + " : " + text);
        }
    }
}
