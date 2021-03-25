package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class MainViewController implements Initializable{

	@FXML
	private MenuItem menuItemSeller;
	
	@FXML
	private MenuItem menuItemDepartment;
	
	@FXML
	private MenuItem menuItemAbout;
	
	@FXML
	public void onMenuItemSellerAction() {
		System.out.println("A");
	}
	
	@FXML
	public void onMenuItemDepartmentAction() {
		System.out.println("B");
	}
	
	@FXML
	public void onMenuItemAboutAction() {

		loadView("/gui/About.fxml");
	
	}
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
	
	// Chamar uma nova tela
	private synchronized void loadView(String absoluteName) {
	
		try {
			
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			VBox newVBox = loader.load();
			
			
			Scene mainScene = Main.getMainScene();
			VBox mainVBOx =(VBox) ((ScrollPane) mainScene.getRoot()).getContent(); //getRoot pega o primeiro elemento da view principal, que é a mainsviewxml, que é scrollpane
			
			Node mainMenu = mainVBOx.getChildren().get(0); //Pegando o primeiro filho do mainVBox, na posição 0 , primeiro
			mainVBOx.getChildren().clear();// limpo tudo
			mainVBOx.getChildren().add(mainMenu); // adiciono o mainmenu
			mainVBOx.getChildren().addAll(newVBox.getChildren()); // pego tudo da primeira scena
			
			
		} catch (IOException e) {

			Alerts.showAlert("Erro Inesperado", null, e.getMessage(), AlertType.ERROR);
		
		}

		
	}

}
