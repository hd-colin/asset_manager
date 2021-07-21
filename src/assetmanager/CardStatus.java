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
public class CardStatus {
    public enum Status {
        BackupPending,
        BackupComplete,
        EditorialMediaCreated,
        SoundSyncComplete,
        LTOComplete,
        ClearanceApproval
    }
    public Status cameraCardStatus;

    CardStatus(){
        cameraCardStatus = Status.BackupPending;
    }
}
