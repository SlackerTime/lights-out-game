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
	private JMenuItem editAccount;
	private JMenuItem login;
	private JMenuItem logout;
	private JMenuItem exit;
	
	private JMenu optionsMenu;
	private JMenuItem changeTheme;
	private JMenuItem cheats;
	
	private JMenu gameMenu;
	private JMenuItem startGame;
	private JMenuItem endGame;
	private JMenuItem viewRecord;
	
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
		
		//initialize File Menu
		fileMenu = new JMenu("File");
		newAccount = new JMenuItem("Create Account");
		editAccount = new JMenuItem("Edit Account");
		login = new JMenuItem("Log In");
		logout = new JMenuItem("Log Out");
		exit = new JMenuItem("Exit");
		fileMenu.add(newAccount);
		fileMenu.add(editAccount);
		fileMenu.addSeparator();
		fileMenu.add(login);
		fileMenu.add(logout);
		fileMenu.addSeparator();
		fileMenu.add(exit);
		menuBar.add(fileMenu);
		
		//File Menu Settings
		logout.setEnabled(false);
		editAccount.setEnabled(false);
		
		//initialize Options menu
		optionsMenu = new JMenu("Options");
		changeTheme = new JMenuItem("Theme");
		cheats = new JMenuItem("Cheats");
		optionsMenu.add(changeTheme);
		optionsMenu.add(cheats);
		menuBar.add(optionsMenu);
		
		//Options Menu Settings
		changeTheme.setEnabled(false);
		cheats.setEnabled(false);
		
		//initialize Game menu
		gameMenu = new JMenu("Game");
		startGame = new JMenuItem("New Game");
		endGame = new JMenuItem("End Game");
		viewRecord = new JMenuItem("View Record");
		gameMenu.add(startGame);
		gameMenu.add(endGame);
		gameMenu.addSeparator();
		gameMenu.add(viewRecord);
		menuBar.add(gameMenu);
		
		//Game Menu Settings
		startGame.setEnabled(false);
		endGame.setEnabled(false);
		viewRecord.setEnabled(false);
		
		//Add Menu Bar to Frame
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
