package holamundo;

import javax.swing.GroupLayout.Alignment;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class _05PropiedadesContenedor extends Application{
	VBox root ;
	@Override
	public void start(Stage primaryStage) throws Exception {
		root = new VBox();
		inicializar();
		Scene scene = new Scene(root, 400,200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Propiedades contenedor....");
		primaryStage.show();
	}
	
	private void inicializar(){
		Button b1 = new Button("Boton 1");
		Button b2 = new Button("Boton 2");
		Button b3 = new Button("Boton 3");
		Button b4 = new Button("Boton 4");
		Button b5 = new Button("Otro boton");
		root.getChildren().add(b1);
		root.getChildren().add(b2);
		root.getChildren().add(b3);
		root.getChildren().add(b4);
		root.getChildren().add(b5);
		
		//Espaciado entre botones
		root.setSpacing(10);
		
		//Espaciado del contenido con respecto al contenedor 
		root.setPadding(new Insets(5, 10, 15, 20));
		
		//Alineación dentro del contenedor
		root.setAlignment(Pos.TOP_CENTER);
		
		//Tamaño de los controles
		//Podemos cambiar el tamaño por defecto
		b1.setPrefWidth(130);
		b1.setPrefHeight(60);
		
		//Podemos establecer un tamaño minimo
		b1.setMinWidth(80);
		b1.setMinHeight(40);
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
