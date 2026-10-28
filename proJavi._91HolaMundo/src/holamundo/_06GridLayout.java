package holamundo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class _06GridLayout extends Application{
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
		
		Button b1 = new Button("Boton 1");
		Button b2 = new Button("Boton 2");
		Button b3 = new Button("Boton 3");
		b3.setMaxWidth(Double.MAX_VALUE);
		Button b4 = new Button("Boton 4");
		Button b5 = new Button("Boton 5");
		b5.setMaxHeight(Double.MAX_VALUE);
		Button b6 = new Button("Boton 6");
		
		root.add(b1, 0, 0);
		root.add(b2, 1, 0);
		root.add(b3, 0, 1, 2 ,1);
		root.add(b4, 0, 2);
		
		root.add(b5, 1, 2, 1, 2);
		root.add(b6, 0, 3);
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
