/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assetmanager;

/**
 *
 * @author howardcolin
 */
public class AssetManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CameraCard cameraCard = new CameraCard("A001");
        cameraCard.loadClipMetadata();
        System.out.println(cameraCard.cardID + " - " + cameraCard.cardStatus.cameraCardStatus);
           
        cameraCard.updateCardStatus(CardStatus.Status.BackupComplete);
        System.out.println(cameraCard.cardID + " - " + cameraCard.cardStatus.cameraCardStatus);

    }
    
}
