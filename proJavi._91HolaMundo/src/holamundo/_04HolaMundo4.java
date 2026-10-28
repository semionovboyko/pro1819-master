package holamundo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class _04HolaMundo4 extends Application {
	VBox root;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		root = new VBox();
		
		Scene escena = new Scene(root, 400, 300);
		primaryStage.setScene(escena);
		inicializar();
		primaryStage.setTitle("Mi primera apliación");
		primaryStage.show();

	}

	public void inicializar() {
		TextField texto = new TextField("mundo ...");
		Button boton = new Button("Saludar'");

		boton.setOnAction((event) -> {
			Alert aviso = new Alert(AlertType.INFORMATION, "Hola "+ texto.getText() + "!!!", ButtonType.CLOSE);
			aviso.showAndWait();
			// aviso.show();
			System.out.println("Hola " + texto.getText());

		});

		root.getChildren().add(texto);
		root.getChildren().add(boton);

	}

}
