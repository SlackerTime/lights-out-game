package local.apps;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class LightGame {

	private final String title = "Lights";
	
	private static JFrame frame;
	
	private JMenuBar menuBar;
	
	private JMenu fileMenu;
	private JMenuItem newAccount;
	private JMenuItem login;
	private JMenuItem logout;
	private JMenuItem exit;
	
	private JMenu optionsMenu;
	private JMenu gameMenu;
	
	private JPanel mainPanel;
	
	public LightGame(){
		
		//initialize JFrame
		frame = new JFrame();
		frame.setTitle(title);
		frame.setSize(640, 480);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setResizable(false);
	}
	
	public void layoutGUI(){
		
		//initialize JMenu
		menuBar = new JMenuBar();
		
		fileMenu = new JMenu("File");
		newAccount = new JMenuItem("Create Account");
		login = new JMenuItem("Log In");
		logout = new JMenuItem("Log Out");
		exit = new JMenuItem("Exit");
		fileMenu.add(newAccount);
		fileMenu.add(login);
		fileMenu.add(logout);
		fileMenu.addSeparator();
		fileMenu.add(exit);
		menuBar.add(fileMenu);
		
		
		optionsMenu = new JMenu("Options");
		menuBar.add(optionsMenu);
		
		gameMenu = new JMenu("Game");
		menuBar.add(gameMenu);
		
		
		frame.add(menuBar, BorderLayout.NORTH);
		
		
		//initialize JPanel
		mainPanel = new JPanel();
		mainPanel.setBackground(new Color(100, 100, 100));
		frame.add(mainPanel);
	}
	
	public static void main(String [] args){
		LightGame game = new LightGame();
		game.layoutGUI();
		
		frame.setVisible(true);
	}
}
