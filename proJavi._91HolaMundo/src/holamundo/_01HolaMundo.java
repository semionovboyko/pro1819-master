package holamundo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class _01HolaMundo extends Application {
	VBox root;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Los componentes del programa se colocarán sobre un contenedor.
		// root es el contenedor principal sobre el que colocaremos otros
		// componentes.
		// El tipo de Pane utilizado (Stack en este caso) determinará cómo
		// se distribuyen los elementos en el Pane (y por tanto en la pantalla)
		// Distintos tipos de Pane tienen distintos layouts
		root = new VBox();

		// El Scene es el contenedor principal de la aplicación
		// Al crearlo indicamos las dimensiones que queremos que tenga
		// y añadimos el contenedor root
		Scene escena = new Scene(root, 400, 300);

		// Asociamos la escena con el escenario.
		primaryStage.setScene(escena);

		// Inicializar componentes
		inicializar();

		// Damos título a la ventana y la mostramos
		primaryStage.setTitle("Mi primera apliación");
		primaryStage.show();

	}

	public void inicializar() {
		Button boton1 = new Button("Di 'Hola mundooooooooo'");
		Button boton2 = new Button("Di 'Hello world'");

		boton1.setOnAction(new ManejadorBtnHola());
		boton2.setOnAction(new ManejadorBtnHello());

		root.getChildren().add(boton1);
		root.getChildren().add(boton2);

	}

	private class ManejadorBtnHola implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			Alert aviso = new Alert(AlertType.INFORMATION, 
					"Hola mundo!!!", ButtonType.CLOSE);
			aviso.showAndWait();
			// aviso.show();
			System.out.println("Hola Mundo");
		}
	}

	private class ManejadorBtnHello implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			Alert aviso = new Alert(AlertType.INFORMATION, 
					"Hello World!!!", ButtonType.CLOSE);
			//aviso.showAndWait();
			aviso.show();
			System.out.println("Hello World");
		}
	}
}
