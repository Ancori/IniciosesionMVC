package aplication;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class Vista extends Application {

	public void start(Stage primaryStage) {

		primaryStage.setTitle("Iniciar sesion");
		VBox root = new VBox();
		Scene escena = new Scene(root, 300, 250);
		Text text = new Text("Usuario: ");
		final TextField texto1 = new TextField();
		HBox usuario = new HBox();
		usuario.setSpacing(50);
		usuario.setAlignment(Pos.CENTER);
		usuario.getChildren().addAll(text, texto1);

		Text text2 = new Text("Contraseña: ");
		final PasswordField texto2 = new PasswordField();
		HBox contraseña = new HBox();
		contraseña.setSpacing(30);
		contraseña.setAlignment(Pos.CENTER);
		contraseña.getChildren().addAll(text2, texto2);

		Button acceder = new Button("Acceder");
		Button cancelar = new Button("Cancelar");
		HBox botones = new HBox();
		botones.setSpacing(30);
		botones.setAlignment(Pos.CENTER);
		botones.getChildren().addAll(acceder, cancelar);

		root.setSpacing(5);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(usuario, contraseña, botones);

		primaryStage.setScene(escena);

		primaryStage.show();
	}

	public static void main(String[] args) {

		launch(args);
	}

}
