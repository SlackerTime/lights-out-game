package local.apps;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class LightGame {

	private final String title = "Lights On";
	
	private JFrame frame;
	
	private JToolBar toolBar;
	private JButton toolFileButton;
	private JButton toolOptionsButton;
	private JButton toolCheatsButton;
	
	private JPanel mainPanel;
	
	public LightGame(){
		
		//initialize JFrame
		frame = new JFrame();
		frame.setTitle(title);
		frame.setSize(640, 480);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setResizable(false);
		
		//initialize JToolBar
		toolBar = new JToolBar();
		toolBar.setSize(new Dimension(50, 50));
		toolFileButton = new JButton("   File   ");
		toolFileButton.setPreferredSize(new Dimension(25, 25));
		toolOptionsButton = new JButton("   Options   ");
		toolOptionsButton.setPreferredSize(new Dimension(25, 25));
		toolCheatsButton = new JButton("   Cheats   ");
		toolCheatsButton.setPreferredSize(new Dimension(25, 25));
		
		toolBar.add(toolFileButton);
		toolBar.add(toolOptionsButton);
		toolBar.add(toolCheatsButton);
		frame.add(toolBar, BorderLayout.NORTH);
		
		//initialize JPanel
		mainPanel = new JPanel();
		mainPanel.setBackground(new Color(100, 100, 100));
		frame.add(mainPanel);
		
		
		
		frame.setVisible(true);
	}
}
