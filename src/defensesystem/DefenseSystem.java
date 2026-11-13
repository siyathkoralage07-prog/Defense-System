/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package defensesystem;

/**
 *
 * @author user
 */
public class DefenseSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainController mainController = new MainController();
        
        Helicopter helicopter = new Helicopter();
        Tank tank = new Tank();
        Submarine submarine = new Submarine();
        
        helicopter.setMainController(mainController);
        tank.setMainController(mainController);
        submarine.setMainController(mainController);
        
        mainController.addDefenseObserver(helicopter);
        mainController.addDefenseObserver(tank);
        mainController.addDefenseObserver(submarine);
        
        mainController.setVisible(true);
        helicopter.setVisible(true);
        tank.setVisible(true);
        submarine.setVisible(true);
    }
    
}
