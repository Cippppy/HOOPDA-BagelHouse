package bagelHouseSolution;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;


import javafx.geometry.Pos;


public class CostPane extends HBox {

	private Label labSub, labTax, labTotal;
	private Button calcButton, exitButton;
	private VBox labels;
	private VBox values;	
	
	public CostPane() {
		this.setStyle("-fx-background-color: #773d22;");
		this.setAlignment(Pos.CENTER);
	}

}