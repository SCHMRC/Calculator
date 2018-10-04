package people;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PeopleController {

    @FXML
    private TextField str1;

    @FXML
    private TextField str2;

    @FXML
    private Button btnCalcola;

    @FXML
    private TextField strRisultato;

    @FXML
    void somma(ActionEvent event) {
    	
    	strRisultato.clear();
    	try {
    	int a = Integer.parseInt(str1.getText());
    	int b = Integer.parseInt(str2.getText());
    	Integer somma = a+b; 
    	strRisultato.appendText(somma.toString());}catch(NumberFormatException ex) {
    		strRisultato.appendText("Inserisci un numero non una lettera");
    	}
    	
    	
    	
    	

    	
    	

    }

}
