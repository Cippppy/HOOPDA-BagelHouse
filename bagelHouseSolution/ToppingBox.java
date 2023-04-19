package bagelHouseSolution;

import javafx.scene.control.CheckBox;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;

public class ToppingBox extends VBox {

	// The following constants are used to indicate
	// the cost of toppings.
	public final double CREAM_CHEESE = 0.50;
	public final double BUTTER = 0.25;
	public final double PEACH_JELLY = 0.75;
	public final double BLUEBERRY_JAM = 0.75;

	// Check boxes for the available toppings.
	private CheckBox cbxCreamCheese;  // Cream cheese
	private CheckBox cbxButter;       // Butter
	private CheckBox cbxPeachJelly;   // Peach jelly
	private CheckBox cbxBlueberryJam; // Blueberry jam

	/**
	 * Constructor
	 */
	public ToppingBox() {
		
		// Create the check boxes.
		cbxCreamCheese =  new CheckBox("Cream cheese");
		cbxButter =       new CheckBox("Butter");
		cbxPeachJelly =   new CheckBox("Peach jelly");
		cbxBlueberryJam = new CheckBox("Blueberry jam");

		// Make a VBox to hold the checkboxes.
		VBox vbox = new VBox(10);  // with 10 pixel spacing
		vbox.setStyle("-fx-background-color: #fff5e6;");
		this.setStyle("-fx-background-color: #fff5e6;"); // so outer VBox same color
		vbox.getChildren().add(cbxCreamCheese);
		vbox.getChildren().add(cbxButter);
		vbox.getChildren().add(cbxPeachJelly);
		vbox.getChildren().add(cbxBlueberryJam);

		// Make a TitledPane to hold the VBox of checkboxes
		TitledPane tp = new TitledPane("Toppings", vbox);
		tp.setCollapsible(false);
		this.getChildren().add(tp); // add the titled pane to this VBox

	}

	/**
	 *  The getToppingCost method returns the cost of
	 *  the selected toppings.
	 */
	public double getToppingCost()
	{
		// The following variable will hold the cost
		// of the selected topping.
		double toppingCost = 0.0;

		// Determine which of the toppings are selected.
		// More than one may be selected.
		if (cbxCreamCheese.isSelected())
			toppingCost += CREAM_CHEESE;
		if (cbxButter.isSelected())
			toppingCost += BUTTER;
		if (cbxPeachJelly.isSelected())
			toppingCost += PEACH_JELLY;
		if (cbxBlueberryJam.isSelected())
			toppingCost += BLUEBERRY_JAM;

		// Return the topping cost.
		return toppingCost;
	}
}