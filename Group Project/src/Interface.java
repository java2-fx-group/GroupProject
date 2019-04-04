	import javax.swing.text.html.CSS;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
	import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
	import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
	
	
public class Interface extends Application {

	double rate1 = 0;
    double rate2 = 1;
    Label creditScoreText = new Label("Please choose a credit score.");
    
    Text monthlyPaymentAmount = new Text("$0.00");
    Text totalPaymentAmount = new Text("$0.00");
    Text totalInterestAmount = new Text("$0.00");
    
    
	    @Override
	    public void start(Stage primaryStage) {
	        primaryStage.setTitle("Car Payment Calculator");
	        GridPane grid = new GridPane();
	        grid.setAlignment(Pos.TOP_LEFT);
	        //grid.setHgap(10);
	        //grid.setVgap(5);
	        grid.setPadding(new Insets(0, 0, 0, 0));
	        grid.getColumnConstraints().add(new ColumnConstraints(20)); 
	        grid.getColumnConstraints().add(new ColumnConstraints(300)); 
	        grid.getColumnConstraints().add(new ColumnConstraints(20));
	        grid.getColumnConstraints().add(new ColumnConstraints(260)); 
	        grid.getColumnConstraints().add(new ColumnConstraints(20));
	        grid.getRowConstraints().add(new RowConstraints(10));
	        grid.getRowConstraints().add(new RowConstraints(30));
	        //grid.setGridLinesVisible(true);
	        Rectangle rect = new Rectangle(620,10); 
	        Color c = Color.color(0, .5, .33);
	        rect.setFill(c);
	        grid.add(rect, 0, 0, 4, 1);
	        GridPane leftColumn = new GridPane();
	        leftColumn.setVgap(2);
	        leftColumn.setAlignment(Pos.TOP_LEFT);
	        leftColumn.getRowConstraints().add(new RowConstraints(10));
	        leftColumn.getRowConstraints().add(new RowConstraints(0));
	        leftColumn.getRowConstraints().add(new RowConstraints(25));
	        leftColumn.getRowConstraints().add(new RowConstraints(20));
	        leftColumn.getRowConstraints().add(new RowConstraints(0));
	        leftColumn.getRowConstraints().add(new RowConstraints(40));
	        leftColumn.getRowConstraints().add(new RowConstraints(20));
	        leftColumn.getRowConstraints().add(new RowConstraints(20));
	        leftColumn.getRowConstraints().add(new RowConstraints(20));
	        leftColumn.getRowConstraints().add(new RowConstraints(20));
	        leftColumn.getRowConstraints().add(new RowConstraints(20));
	        leftColumn.getRowConstraints().add(new RowConstraints(20));
	        leftColumn.getRowConstraints().add(new RowConstraints(20));
	        leftColumn.getRowConstraints().add(new RowConstraints(20));
	        leftColumn.getRowConstraints().add(new RowConstraints(20));
	        leftColumn.getRowConstraints().add(new RowConstraints(20));
	        leftColumn.getRowConstraints().add(new RowConstraints(20));
	        leftColumn.getRowConstraints().add(new RowConstraints(20));
	        leftColumn.getRowConstraints().add(new RowConstraints(20));
	        leftColumn.getRowConstraints().add(new RowConstraints(20));
	        leftColumn.getRowConstraints().add(new RowConstraints(20));
	        leftColumn.getRowConstraints().add(new RowConstraints(20));
	        leftColumn.getRowConstraints().add(new RowConstraints(20));
	        grid.add(leftColumn, 1, 4);
	        GridPane rightColumn = new GridPane();
	        rightColumn.setVgap(2);
	        rightColumn.setAlignment(Pos.TOP_LEFT);
	        rightColumn.getRowConstraints().add(new RowConstraints(0));
	        rightColumn.getRowConstraints().add(new RowConstraints(0));
	        rightColumn.getRowConstraints().add(new RowConstraints(50));
	        rightColumn.getRowConstraints().add(new RowConstraints(15));
	        rightColumn.getRowConstraints().add(new RowConstraints(15));
	        rightColumn.getRowConstraints().add(new RowConstraints(15));
	        rightColumn.getRowConstraints().add(new RowConstraints(15));
	        rightColumn.getRowConstraints().add(new RowConstraints(15));
	        rightColumn.getRowConstraints().add(new RowConstraints(15));
	        rightColumn.getRowConstraints().add(new RowConstraints(15));
	        rightColumn.getRowConstraints().add(new RowConstraints(15));
	        grid.add(rightColumn, 2, 4);
	        
	        Text scenetitle = new Text("Car payment calculator");
	        
	        scenetitle.setFont(Font.font("Tahoma", FontWeight.EXTRA_BOLD, 20));
	        grid.add(scenetitle, 1, 2, 2, 1);
	        
	        Rectangle rect2 = new Rectangle(560,1); 
	        rect2.setFill(Color.LIGHTGREY);
	        rect2.setLayoutY(50);
	        grid.add(rect2, 1, 3, 2, 1);

	        Text CreditScore = new Text("What's your credit score?");
	        CreditScore.setFont(Font.font("Tahoma", FontWeight.BOLD, 12));
	        leftColumn.add(CreditScore, 1, 2);
	        
	        Text paymentDetails = new Text("Payment Details");
        	paymentDetails.setFont(Font.font("Tahoma", FontWeight.EXTRA_BOLD, 16));
        	rightColumn.add(paymentDetails, 1, 2);
        	
        	Text monthlyPayment = new Text("Monthly Payment");
        	monthlyPayment.setFont(Font.font("Tahoma", FontWeight.BOLD, 12));
        	rightColumn.add(monthlyPayment, 1, 3);
        	
        	
        	monthlyPaymentAmount.setFont(Font.font("Tahoma", FontWeight.BOLD, 16));
        	monthlyPaymentAmount.setFill(Color.color(.09, .46, .78));
        	rightColumn.add(monthlyPaymentAmount, 1, 4);
        	
        	Text beforeTaxes = new Text("(Before taxes & fees)");
        	beforeTaxes.setFont(Font.font("Tahoma", 10));
        	beforeTaxes.setFill(Color.GRAY);
        	rightColumn.add(beforeTaxes, 1, 5);
        	
        	
        	
        	Text totalAmountPaidLabel = new Text("Total Amount Paid");
        	totalAmountPaidLabel.setFont(Font.font("Tahoma", FontWeight.BOLD, 12));
        	rightColumn.add(totalAmountPaidLabel, 1, 7);
        	
        	
        	totalPaymentAmount.setFont(Font.font("Tahoma", FontWeight.BOLD, 16));
        	totalPaymentAmount.setFill(Color.color(.09, .46, .78));
        	rightColumn.add(totalPaymentAmount, 1, 8);
        	
        	Text lifeOfLoan = new Text("(Over the life of the loan)");
        	lifeOfLoan.setFont(Font.font("Tahoma", 10));
        	lifeOfLoan.setFill(Color.GRAY);
        	rightColumn.add(lifeOfLoan, 1, 9);
        	
        	
        	Text totalInterestPaidLabel = new Text("Total Interest Paid");
        	totalInterestPaidLabel.setFont(Font.font("Tahoma", FontWeight.BOLD, 12));
        	rightColumn.add(totalInterestPaidLabel, 1, 11);
        	
        	
        	totalInterestAmount.setFont(Font.font("Tahoma", FontWeight.BOLD, 16));
        	totalInterestAmount.setFill(Color.color(.09, .46, .78));
        	rightColumn.add(totalInterestAmount, 1, 12);
        	
        
        	
    
        	
        	
	        
	        ObservableList<String> options = 
	        	    FXCollections.observableArrayList(
	        	        "Option 1",
	        	        "Option 2",
	        	        "Option 3"
	        	    );
	        	ComboBox comboBox = new ComboBox(options);
	        	comboBox.valueProperty().addListener(new ChangeListener<String>() {

	                @Override
	                public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
	                    updateLabels(newValue);
	                }
	            });
	        	leftColumn.add(comboBox, 1, 3);
	        	

	        
	        
	        
	        //Label creditScoreText = new Label("Based on your score, the average rate is " + rate1+ "% (new) or " + rate2+ "% (used).");
	        	creditScoreText.setWrapText(true);
	        	creditScoreText.setMinWidth(280);
	        	creditScoreText.setMaxWidth(280);
	        	creditScoreText.setFont(Font.font("Tahoma", FontWeight.NORMAL, 10));
	        	leftColumn.add(creditScoreText, 1, 5);
	        	
	        	Text carPriceLabel = new Text("Car Price ($)");
	        	carPriceLabel.setFont(Font.font("Tahoma", FontWeight.BOLD, 12));
	        	leftColumn.add(carPriceLabel, 1, 7);
	        	
	        	TextField carPriceField = new TextField();
	        	carPriceField.setMaxWidth(280);
	        	leftColumn.add(carPriceField, 1, 8);
	        	
	        	Text afterRegistration = new Text("After registration");
	        	afterRegistration.setFont(Font.font("Tahoma", 10));
	        	afterRegistration.setFill(Color.GRAY);
	        	leftColumn.add(afterRegistration, 1, 9);
	        	
	        	
	        	
	        	Text tradeInLabel = new Text("Trade-in / down payment ($)");
	        	tradeInLabel.setFont(Font.font("Tahoma", FontWeight.BOLD, 12));
	        	leftColumn.add(tradeInLabel, 1, 10);
	        	
	        	TextField tradeInField = new TextField();
	        	tradeInField.setMaxWidth(280);
	        	leftColumn.add(tradeInField, 1, 11);
	        	
	        	Text allOrPartOfDown = new Text("Your trade-in can be all or part of the down payment");
	        	allOrPartOfDown.setFont(Font.font("Tahoma", 10));
	        	allOrPartOfDown.setFill(Color.GRAY);
	        	leftColumn.add(allOrPartOfDown, 1, 12);
	        	
	        	
	        	Text nerdWallet = new Text("NerdWallet recommends putting at least 20% down in any combination of trade-in and payment");
	        	nerdWallet.setFont(Font.font("Tahoma", 10));
	        	nerdWallet.setWrappingWidth(280);
	        	leftColumn.add(nerdWallet, 1, 14);
	        	
	        	
	        	
	        	Text interestRateLabel = new Text("Interest rate ($)");
	        	interestRateLabel.setFont(Font.font("Tahoma", FontWeight.BOLD, 12));
	        	leftColumn.add(interestRateLabel, 1, 16);
	        	
	        	TextField interestRateField = new TextField();
	        	interestRateField.setMaxWidth(280);
	        	leftColumn.add(interestRateField, 1, 17);
	        	
	        	Text higherCreditScore = new Text("A higher credit score means lower interest rates");
	        	higherCreditScore.setFont(Font.font("Tahoma", 10));
	        	higherCreditScore.setFill(Color.GRAY);
	        	leftColumn.add(higherCreditScore, 1, 18);
	        	
	        	
	        	Text monthsLabel = new Text("Number of Months");
	        	monthsLabel.setFont(Font.font("Tahoma", FontWeight.BOLD, 12));
	        	leftColumn.add(monthsLabel, 1, 20);
	        	
	        	TextField monthsField = new TextField();
	        	monthsField.setMaxWidth(280);
	        	leftColumn.add(monthsField, 1, 21);
	        	
	        	Text suggestedMax = new Text("Suggested max: 36 months for used cars, 60 for new");
	        	suggestedMax.setFont(Font.font("Tahoma", 10));
	        	suggestedMax.setFill(Color.GRAY);
	        	leftColumn.add(suggestedMax, 1, 22);
	        	
	        	
	        	
	        	

	        Scene scene = new Scene(grid, 600, 550, Color.WHITE);
	        //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	        primaryStage.setScene(scene);
	        primaryStage.show();
	        primaryStage.setResizable(false);
	        //primaryStage.initStyle(StageStyle.UNDECORATED);
	    }
	        

	        
	        
	        
	        
	        
	 public static void main(String[] args) {
	        launch(args);
	    }
	 
	 
	 
	 private void updateLabels(String newValue) {
		    switch (newValue) {
		        case ("Option 1"):
		            rate1 = 3.08;
		        	rate2 = 3.76;
		        	creditScoreText.setText("Based on your score, the average rate is " + rate1+ "% (new) or " + rate2+ "% (used).");
		            break;
		        case ("Option 2"):
		        	rate1 = 3.99;
	        		rate2 = 5.45;
	        		creditScoreText.setText("Based on your score, the average rate is " + rate1+ "% (new) or " + rate2+ "% (used).");
		            break;
		        case ("Option 3"):
		        	rate1 = 6.83;
	        		rate2 = 9.98;
	        		creditScoreText.setText("Based on your score, the average rate is " + rate1+ "% (new) or " + rate2+ "% (used).");
		            break;
		        default:
		            System.out.println("treatment room not recognised");
		    }

		}
}
