package application;

import java.util.HashMap;
import java.util.Map;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage; 
         
public class CarPayCalc extends Application {
	private Button registerButton = null;
	
	private ChoiceBox<String> creditScoreChoiceBox = null;
	
	private GridPane gridPane = null;
	private Map<String,String> creditPrompts = null;
	private Text averageLabel = null;
	private Text creditscoreLabel = null;
	private Text detailsLabel = null;
	private Text downPaymentLabel = null;
	private Text downPaymentTipLabel = null;
	private Text interestLabel = null;
	private Text interestPaidLabel = null;
	private Text interestPaidNumberLabel = null;
	private Text interestTipLabel = null;
	private Text monthlyPaymentLabel = null;
	private Text monthlyPaymentNumberLabel = null;
	private Text monthlyPaymentTipLabel = null;
	private Text monthsLabel = null;
	private Text monthstipLabel = null;
	private Text nameLabel = null;
	private Text priceLabel = null;
	private Text priceTipLabel = null;
	private Text totalpaidLabel = null;
	private Text totalPaidNumberLabel = null;
	private Text totalPaidTipLabel = null;
	
	private TextField downPaymentText = null;
	private TextField interestText = null;
	private TextField monthsText = null;
	private TextField priceText = null;

	private void initGridPane() {
		//---------------------------------------------------
		// visual aspect of gridPane
		//---------------------------------------------------
		 
		//Label for name 
		 nameLabel = new Text("Car Payment Calculator"); 
		
		 //Label for Payment details 
		 detailsLabel = new Text("Payment details"); 
		    
		 //Label for credit score
		 creditscoreLabel = new Text("What's your credit score?"); 
		
		 
		//Choice box for credit score
		 creditPrompts = new HashMap<String, String>();
		 creditPrompts.put("Super prime (781-850)", "Based on your score, the average rate is 3.68% (new)\n or 4.34% (used).");
		 creditPrompts.put("Prime (661-780)", "Based on your score, the average rate is 4.56% (new)\n or 5.97% (used).");
		 creditPrompts.put("Nonprime (601-660)", "Based on your score, the average rate is 7.52% (new)\n or 10.34% (used).");
		 creditPrompts.put("Subprime (501-600)", "Based on your score, the average rate is 11.89% (new)\n or 16.14% (used).");
		 creditPrompts.put("Deep subprime (300-500)", "Based on your score, the average rate is 14.41% (new)\n or 19.98% (used). Consider buying an inexpensive\n used car and refinancing in 6-12 months.");

		 creditScoreChoiceBox = new ChoiceBox<String>();
		 creditScoreChoiceBox.setValue("Super prime (781-850)");
		 
		 for (String k : creditPrompts.keySet()) {
			 creditScoreChoiceBox.getItems().add(k);
		 }

		 //Choice box listener
		 ChangeListener<String> creditListener = new ChangeListener<String>() {
			 @Override
			 public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				 averageLabel.setText(creditPrompts.get(newValue));
			 }
		 };

		 creditScoreChoiceBox.getSelectionModel().selectedItemProperty().addListener(creditListener);

		 //Label for average rate
		 averageLabel = new Text("Based on your score, the average rate is 3.68% (new)\n or 4.34% (used).");
		
		 //Label and text field for Car price ($)
		 priceLabel = new Text("Car Price ($)"); 
		 
		 priceText = new TextField("20000");  
		 
		 priceTipLabel = new Text("After negotiations"); 
		
		 //Label and text field for Trade-in / down payment ($)
		 downPaymentLabel = new Text("Trade-in / Down payment ($)");
		 downPaymentText = new TextField("4000");
		 downPaymentTipLabel = new Text("Your trade-in can be all or part of a down payment"); 
		      
		 //Label and text field for Interest rate ($)
		 interestLabel = new Text("Interest rate ($)"); 
		 interestText = new TextField("4.5");
		 interestTipLabel = new Text("A higher credit score means lower interest rates"); 
		
		 //Label and text field for Number of months
		 monthsLabel = new Text("Number of months"); 
		 monthsText = new TextField("36");
		 monthstipLabel = new Text("Suggested max: 36 months for used cars, 60 for new"); 
		
		 //Payment detail labels
		 monthlyPaymentLabel = new Text("Monthly payment");
		 monthlyPaymentNumberLabel = new Text("475.95");
		 monthlyPaymentTipLabel = new Text("(Before taxes & fees)");
		      
		 totalpaidLabel = new Text("Total amount paid");
		 totalPaidNumberLabel = new Text("17134.23");
		 totalPaidTipLabel = new Text("(Over the life of the loan)");
		
		 interestPaidLabel = new Text("Total interest paid");
		 interestPaidNumberLabel = new Text("1134.23");
		
		 //Label for register 
		 registerButton = new Button("See your car's value");  
		      
		 //Creating a Grid Pane 
		 gridPane = new GridPane();    
		
		 //Setting size for the pane 
		 gridPane.setMinSize(500, 500); 
		
		 //Setting the padding    
		 gridPane.setPadding(new Insets(10, 10, 10, 10));  
		
		 //Setting the vertical and horizontal gaps between the columns 
		 gridPane.setVgap(5); 
		
		 gridPane.setHgap(5);       
		
		 //Setting the Grid alignment 
		 gridPane.setAlignment(Pos.CENTER); 
		
		 //Arranging all the nodes in the grid 
		 gridPane.add(nameLabel, 0, 0); 
		
		 gridPane.add(creditscoreLabel, 0, 2);
		 gridPane.add(creditScoreChoiceBox, 0, 3);  
		 gridPane.add(averageLabel, 0, 4);
		 gridPane.add(priceLabel, 0, 6); 
		 gridPane.add(priceText, 0, 7);  
		 gridPane.add(priceTipLabel, 0, 8);
		 gridPane.add(downPaymentLabel, 0, 10); 
		 gridPane.add(downPaymentText, 0, 11); 
		 gridPane.add(downPaymentTipLabel, 0, 12);
		 gridPane.add(interestLabel, 0, 14); 
		 gridPane.add(interestText, 0, 15); 
		 gridPane.add(interestTipLabel, 0, 16); 
		 gridPane.add(monthsLabel, 0, 18); 
		 gridPane.add(monthsText, 0, 19);
		 gridPane.add(monthstipLabel, 0, 20);
		
		 gridPane.add(detailsLabel, 1, 1);
		 gridPane.add(monthlyPaymentLabel, 1, 3);    
		 gridPane.add(monthlyPaymentNumberLabel, 1, 4);
		 gridPane.add(monthlyPaymentTipLabel, 1, 5);
		 gridPane.add(totalpaidLabel, 1, 7);   
		 gridPane.add(totalPaidNumberLabel, 1, 8);
		 gridPane.add(totalPaidTipLabel, 1, 9);
		 gridPane.add(interestPaidLabel, 1, 11);  
		 gridPane.add(interestPaidNumberLabel, 1, 12);
		 gridPane.add(registerButton, 1, 17);      
		
		 //Styling nodes   
		 registerButton.setStyle(
		         "-fx-background-color: green; -fx-text-fill: white;"); 
		
		 nameLabel.setStyle("-fx-font: normal bold 15px 'serif' "); 
		 detailsLabel.setStyle("-fx-font: normal bold 15px 'serif' "); 
		 creditscoreLabel.setStyle("-fx-font: normal bold 15px 'serif' "); 
		 priceLabel.setStyle("-fx-font: normal bold 15px 'serif' "); 
		 downPaymentLabel.setStyle("-fx-font: normal bold 15px 'serif' ");  
		 interestLabel.setStyle("-fx-font: normal bold 15px 'serif' "); 
		 monthsLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
		 monthlyPaymentLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
		 totalpaidLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
		 interestPaidLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
		
		 //Setting the back ground color 
		 gridPane.setStyle("-fx-background-color: WHITE;");
		
		//---------------------------------------------------
		// event handling of gridPane
		//---------------------------------------------------
		EventHandler<KeyEvent> calcEventHandler = new EventHandler<KeyEvent>() { 
			@Override 
			public void handle(KeyEvent e) {
				calc();
			} 
		};
		priceText.addEventHandler(KeyEvent.KEY_RELEASED, calcEventHandler);   
		downPaymentText.addEventHandler(KeyEvent.KEY_RELEASED, calcEventHandler);   
		interestText.addEventHandler(KeyEvent.KEY_RELEASED, calcEventHandler);
		monthsText.addEventHandler(KeyEvent.KEY_RELEASED, calcEventHandler);
	}
	
	@Override 
	public void start(Stage stage) {  
		//Creating a scene object
		 this.initGridPane();
		 Scene scene = new Scene(gridPane); 
		
		 //Setting title to the Stage 
		 stage.setTitle("Car Payment Calculator"); 
		
		 //Adding scene to the stage 
		 stage.setScene(scene);  
		
		 //Displaying the contents of the stage 
		 stage.show(); 
	}
	
	private void calc() {
		try {
			
			double carPrice = 0.0;
			double downPayment = 0.0;
			double p = 0.0;
			double interestRate = 0.0;
			double r = 0.0; //Monthly Interest Rate
			int n = 0;
			
			//Car price field
			String tmp = priceText.getText().trim();
			if (tmp.length() > 0) {
				carPrice = Double.parseDouble(priceText.getText());
			}
			
			//Trade-in/down payment field
			tmp = downPaymentText.getText().trim();
			if (tmp.length() > 0) {
				downPayment = Double.parseDouble(downPaymentText.getText());
			}
			
			//Interest rate field
			tmp = interestText.getText().trim();
			if (tmp.length() > 0) {
				interestRate = Double.parseDouble(interestText.getText());
			}
			
			//Number of months field
			tmp = monthsText.getText().trim();
			if (tmp.length() > 0) {
				n = Integer.parseInt(monthsText.getText());
			}
			
			p = carPrice - downPayment; //Principle value
			r = interestRate/1200; //Monthly Interest Rate
			
			//Calculation formulas
			if (n>0) {
				double monthlyPayment = p*((r*Math.pow(1+r, n))/(Math.pow(1+r, n)-1));
				double totalAmountPaid = n*p*((r*Math.pow(1+r, n))/(Math.pow(1+r, n)-1));
				double totalInterestPaid = n*p*((r*Math.pow(1+r, n))/(Math.pow(1+r, n)-1))-p;
				
				monthlyPaymentNumberLabel.setText(String.format("$%10.2f", monthlyPayment));
				totalPaidNumberLabel.setText(String.format("$%10.2f", totalAmountPaid));
				interestPaidNumberLabel.setText(String.format("$%10.2f", totalInterestPaid));
			}
		}
		catch(NullPointerException e) {
			return;
		}
		catch(NumberFormatException e) {
			return;
		}
	}
	
	public static void main(String args[]){ 
	 launch(args); 
	}
}
