import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

// ActionListener for Counter class:
public class Counter implements ActionListener{
	// two JLabels:
	JLabel leftLabel;
	JLabel rightLabel;
  // two int variables:
	int leftCount;
	int rightCount;

	
  // Counter constructor:
	public Counter() {
		// JFrame set up:
    JFrame frame = new JFrame("Let's Count");
		frame.setLayout(new FlowLayout());
		frame.setSize(200,110);

    // Declare and initialize two JButtons:
    JButton left = new JButton("Left");
    JButton right = new JButton("Right");
    // Initialize two instance variables to 0:
    leftCount = 0;
		rightCount = 0;
    // ActionListener to buttons and add bottons to frame:
    left.addActionListener(this);
		right.addActionListener(this);
		frame.add(left);
		frame.add(right);

    // Initialize two Labels and add Labels to frame:
    leftLabel = new JLabel("Count: " + leftCount);
    rightLabel = new JLabel("Count: " + rightCount);
		frame.add(leftLabel);
		frame.add(rightLabel);

    // Declare & initialize reset button, add actionListener, add to frame
    JButton reset = new JButton("Reset");
		reset.addActionListener(this);
		frame.add(reset);

    // Set frame to be visible:
		frame.setVisible(true);
	}


  // actionPerformed method:  @ActionEvent parameter
	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand().equals("Left")) {
			leftCount++;
			leftLabel.setText("Count: " + leftCount);
		}
    else if(ae.getActionCommand().equals("Right")) {
			rightCount++;
		  rightLabel.setText("Count: " + rightCount);
		}
    else if(ae.getActionCommand().equals("Reset")) {
			leftCount=0;
			rightCount=0;
			leftLabel.setText("Count: " + leftCount);
			rightLabel.setText("Count: " + rightCount);
		}

	}

}


