/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assetmanager;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author howardcolin
 */
public class CameraCardTest {
    
    public CameraCardTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of updateCardStatus method, of class CameraCard.
     */
    @Test
    public void testUpdateCardStatus() {
        System.out.println("updateCardStatus");
        CardStatus.Status newStatus = CardStatus.Status.BackupPending;
        CameraCard instance = new CameraCard("A001");
        instance.updateCardStatus(newStatus);
        assertEquals(newStatus, instance.cardStatus.cameraCardStatus);
    }

    /**
     * Test of loadClipMetadata method, of class CameraCard.
     */
    @Test
    public void testLoadClipMetadata() {
        System.out.println("loadClipMetadata");
        CameraCard instance = new CameraCard("A001");
        int expResult = 0;
        int result = instance.loadClipMetadata();
        assertEquals(expResult, result);
    }    
}
