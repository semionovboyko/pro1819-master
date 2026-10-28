package calculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;

public class FXMLCalculadoraController {
	@FXML
	private TextField num1TextField;
	@FXML
	private TextField num2TextField;
	@FXML
	private TextField resultadoTextField;

	// Event Listener on Button.onAction
	@FXML
	public void botonMasAction(ActionEvent event) {
		double num1 = Double.parseDouble(num1TextField.getText());
		double num2 = Double.parseDouble(num2TextField.getText());
		double res = num1 + num2;
		resultadoTextField.setText(""+ res);
	}
	// Event Listener on Button.onAction
	@FXML
	public void botonMenosAction(ActionEvent event) {
		double num1 = Double.parseDouble(num1TextField.getText());
		double num2 = Double.parseDouble(num2TextField.getText());
		double res = num1 - num2;
		resultadoTextField.setText(""+ res);
	}
	// Event Listener on Button.onAction
	@FXML
	public void operacionAction(ActionEvent event) {
		double num1 = Double.parseDouble(num1TextField.getText());
		double num2 = Double.parseDouble(num2TextField.getText());
		double res;
		
		String id = ((Node)(event.getSource())).getId();
		if(id.equals("producto")){
			res = num1 * num2;
		} else {
			res = num1 / num2;
		}
	
		resultadoTextField.setText(""+ res);
	}
	
}
