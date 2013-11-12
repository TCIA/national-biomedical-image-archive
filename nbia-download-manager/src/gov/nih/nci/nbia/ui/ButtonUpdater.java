package gov.nih.nci.nbia.ui;

import javax.swing.JButton;
import javax.swing.JLabel;

import gov.nih.nci.nbia.util.ThreadPoolListener;

/**
 * @author lethai
 *
 */
public class ButtonUpdater implements ThreadPoolListener {

    /* (non-Javadoc)
     * @see gov.nih.nci.nbia.util.ThreadPoolListener#update()
     */
    private JButton  pauseButton, resumeButton; 
    private JLabel errorLabel;  // lrt - added errorLabel
    public ButtonUpdater(JButton pauseButton, JButton resumeButton, JLabel errorLabel){
        this.pauseButton = pauseButton;
        this.resumeButton = resumeButton;
	// lrt added errorLabel to record final status
	this. errorLabel = errorLabel;
    }
    public void update() {
        // TODO Auto-generated method stub
        //disable pause/resume buttons
        this.pauseButton.setEnabled(false);
        this.resumeButton.setEnabled(false);
	this.errorLabel.setText("Downloads Complete");  // lrt - let user know that we are done with all downloads and retries
	this.errorLabel.setVisible(true);
    }
}