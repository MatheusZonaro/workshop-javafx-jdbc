package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

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
		System.out.println("C");
	}
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}

}
