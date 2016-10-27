
import java.util.ArrayList;
import java.util.Optional;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.scene.control.ChoiceDialog;
import javafx.stage.Stage;

public class Role extends Application {

	public static void main(String[] args) {
		launch(args);
	
}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		ArrayList<String> choices = new ArrayList<String>();
		choices.add("Administrator");
		choices.add("Faculty");
		choices.add("Staff");
		choices.add("Student");
		choices.add("Guest");
		ChoiceDialog<String> dialog = new ChoiceDialog<String>(null, "Administrator","Faculty", "Staff", "Student", "Guest");
		Optional<String> input = dialog.showAndWait();
		String value = input.get();

		switch (value) {
		case "Administrator":
			JOptionPane.showMessageDialog(null, "Welcome " + value);
			break;
		case "Faculty":
			JOptionPane.showMessageDialog(null, "Welcome " + value);
			break;
		case "Staff":
			JOptionPane.showMessageDialog(null, "Welcome " + value);
			break;
		case "Student":
			JOptionPane.showMessageDialog(null, "Welcome " + value);
			break;
		case "Guest":
			JOptionPane.showMessageDialog(null, "Welcome " + value);
			break;
		}
	}
}
