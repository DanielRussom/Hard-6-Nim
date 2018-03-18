package application.view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DisplayController {
	@FXML
	Label firstHeapLbl;
	@FXML
	Label secondHeapLbl;
	@FXML
	Label thirdHeapLbl;
	@FXML
	TextField firstHeapInput;
	@FXML
	TextField secondHeapInput;
	@FXML
	TextField thirdHeapInput;

	public void updateFirstHeapLabel() {

	}

	public void updateSecondHeapLabel() {

	}

	public void updateThirdHeapLabel() {

	}

	public void removeFromHeap1() {

	}

	public void removeFromHeap2() {

	}

	public void removeFromHeap3() {

	}
	
	public void init() {
		firstHeapInput.textProperty().addListener((observable, oldValue, newValue) -> {
		    secondHeapInput.setText("0");
		    thirdHeapInput.setText("0");
		});
	}
}
