/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assetmanager;
import java.util.Date;

/**
 *
 * @author howardcolin
 */
public class CameraCard {
    String cardID;
    private Date shootingDate;
    private int totalSize;
    CardStatus cardStatus = new CardStatus();
    private ClipMetadata clipMetadata = new ClipMetadata();

    CameraCard(String ID) {
        cardID = ID;
    }

    public void updateCardStatus(CardStatus.Status newStatus) {
        this.cardStatus.cameraCardStatus = newStatus;
    }

    public int loadClipMetadata(){
        try {
            clipMetadata.loadRecords(this.cardID);
        }
        catch (RuntimeException e) {
            return -1;
        }
        return 0;
    }

    public int save() {
        return 0;
    }
}