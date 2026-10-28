package holamundo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class _07Calculadora extends Application{
	GridPane root ;
	@Override
	public void start(Stage primaryStage) throws Exception {
		root = new GridPane();
		inicializar();
		Scene scene = new Scene(root, 400,200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Propiedades contenedor....");
		primaryStage.show();
	}
	
	private void inicializar(){
		
		root.setHgap(20);
		root.setVgap(10);
		root.setAlignment(Pos.CENTER);
		
		
		Button bSuma  = new Button("+");
		Button bResta = new Button("-");
		Button bMult = new Button("*");
		Button bDiv  = new Button("/");
		bSuma.setMaxWidth(Double.MAX_VALUE);
		bResta.setMaxWidth(Double.MAX_VALUE);
		bMult.setMaxWidth(Double.MAX_VALUE);
		bDiv.setMaxWidth(Double.MAX_VALUE);

		VBox botonera = new VBox();
		botonera.setSpacing(1);
		botonera.getChildren().add(bSuma);
		botonera.getChildren().add(bResta);
		botonera.getChildren().add(bMult);
		botonera.getChildren().add(bDiv);
		
		
		TextField tfNum1 = new TextField("0");
		TextField tfNum2 = new TextField("0");
		
		Label lbl1 = new Label ("Número 1: ");
		Label lbl2 = new Label ("Número 2: ");
		Label lbl3 = new Label ("Resultado: ");
		Label lblR = new Label ("0");
		
		
		root.add(lbl1, 0, 0);
		root.add(lbl2, 0, 1);
		root.add(lbl3, 0, 2);
		
		root.add(tfNum1, 1, 0);
		root.add(tfNum2, 1, 1);
		root.add(lblR, 1, 2);
		
		root.add(botonera, 2, 0,1,3);

	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
