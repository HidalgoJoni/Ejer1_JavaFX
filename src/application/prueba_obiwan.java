package application;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;

public class prueba_obiwan extends Application {
	public static void main(String[] args) {
		
		launch(args);
	}

	@Override
	public void start(Stage stage) {
		//Mensaje de texto en ventana
		Label nombre = new Label("Introduce tu nombre");
		TextField nombreIntroducido = new TextField();
        Label msg = new Label();

        //crea los botones de la ventana
		Button saludar = new Button("Hola!");
        Button cerrar = new Button("Salir");

		//cerrar ventana
        cerrar.setOnAction(e -> Platform.exit());
        
        // Configura la accion del boton saludar
        saludar.setOnAction(e -> {
            if (nombreIntroducido.getText().equals("Obi Wan")) {
                msg.setText("¡General Kenobi!");
            } else {
                msg.setText("Hola " + nombreIntroducido);
            }
        });

        // Configura la accion del boton cerrar
        cerrar.setOnAction(e -> Platform.exit());

        // Crea organizacion VBox
        VBox raiz = new VBox();

        // Añade todo al VBox
        raiz.getChildren().addAll(nombre, nombreIntroducido, msg, saludar, cerrar);
        Scene escena = new Scene(raiz, 350, 150);
        stage.setScene(escena);
        stage.setTitle("Ejercicio Obi Wan");
        stage.setResizable(false);
        stage.show();
    }
};