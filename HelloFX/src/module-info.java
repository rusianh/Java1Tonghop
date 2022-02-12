module HelloFX {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens HelloFX to javafx.graphics, javafx.fxml;
}
