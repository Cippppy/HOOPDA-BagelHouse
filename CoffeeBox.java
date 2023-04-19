package bagelHouseSolution;

import javafx.scene.control.RadioButton;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;

public class CoffeeBox extends VBox {

	// The following constants are used to indicate
	// the cost of coffee.
	public final double NO_COFFEE = 0.0;
	public final double REGULAR_COFFEE = 1.25;
	public final double DECAF_COFFEE = 1.25;
	public final double CAPPUCCINO = 2.00;  

	// Radio buttons for the available coffees.
	private RadioButton rdoNone;          // No coffee
	private RadioButton rdoRegular;       // Regular coffee
	private RadioButton rdoDecaf;         // Decaf
	private RadioButton rdoCappuccino;    // Cappuccino

	// The following variable will reference a
	// ToggleGroup object to group the radio buttons.
	private ToggleGroup tg; 

	/**
	 *  Constructor
	 */
	public CoffeeBox() {
		// Create group for the radio buttons.
		tg = new ToggleGroup();

		// Create the radio buttons.
		rdoNone = new RadioButton("None");
		rdoRegular = new RadioButton("Regular coffee");
		rdoDecaf = new RadioButton("Decaf coffee");
		rdoCappuccino = new RadioButton("Cappuccino");

		rdoNone.setToggleGroup(tg);
		rdoRegular.setToggleGroup(tg);
		rdoDecaf.setToggleGroup(tg);
		rdoCappuccino.setToggleGroup(tg);
		rdoRegular.setSelected(true);

		// Make a VBox to hold the radio buttons.
		VBox vbox = new VBox(10);  // with 10 pixel spacing
		vbox.setStyle("-fx-background-color: BlanchedAlmond;");
		this.setStyle("-fx-background-color: BlanchedAlmond;");  // so outer VBox same color
		vbox.getChildren().add(rdoNone);
		vbox.getChildren().add(rdoRegular);
		vbox.getChildren().add(rdoDecaf);
		vbox.getChildren().add(rdoCappuccino);
		
		// Make a TitledPane to hold the VBox of radio buttons
		TitledPane tp = new TitledPane("Coffee", vbox);
		tp.setCollapsible(false);
		this.getChildren().add(tp); // add the titled pane to this VBox

	}

	/**
	 *  The getCoffeeCost method returns the cost of
	 *  the selected coffee.
	 */
	public double getCoffeeCost()
	{
		// The following variable will hold the cost
		// of the selected coffee.
		double coffeeCost = 0.0;

		// Determine which coffee is selected.
		if (rdoNone.isSelected())
			coffeeCost = NO_COFFEE;
		else if (rdoRegular.isSelected())
			coffeeCost = REGULAR_COFFEE;
		else if (rdoDecaf.isSelected())
			coffeeCost = DECAF_COFFEE;
		else if (rdoCappuccino.isSelected())
			coffeeCost = CAPPUCCINO;

		// Return the coffee cost.
		return coffeeCost;
	}
}