package defensesystem;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author user
 */
public interface DefenseObserver {
    void updateAreaClear(boolean isCleared);
    void updatePosition(int strengthValue);
    void receiveMessage(String message);
    
    String getUnitName();
    int getSoldierCount();
    int getAmmoCount();
    int getFuelOrEnergyAmount();
}
