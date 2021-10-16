package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {

	private static double num1, num2;
	private static String op;

	@FXML
	private Button btn1;

	@FXML
	private Button btnDvd;

	@FXML
	private Button btn2;

	@FXML
	private Button btn3;

	@FXML
	private TextField txt;

	@FXML
	private Button btn4;

	@FXML
	private Button btnMul;

	@FXML
	private Button btn5;

	@FXML
	private Button btn6;

	@FXML
	private Button btn7;

	@FXML
	private Button btnMinus;

	@FXML
	private Button btn8;

	@FXML
	private Button btn9;

	@FXML
	private Button btnDeci;

	@FXML
	private Button btnAdd;

	@FXML
	private Button btn0;

	@FXML
	private Button btnEq;

	@FXML
	private TextField txtHis;

	@FXML
	void Multi(ActionEvent event) {

		op = "x";
		num1 = Double.parseDouble(txt.getText());
		txt.setText("");

	}

	@FXML
	void Sub(ActionEvent event) {

		op = "-";
		num1 = Double.parseDouble(txt.getText());
		txt.setText("");

	}

	@FXML
	void dec(ActionEvent event) {

		txt.setText(txt.getText() + ".");

	}

	@FXML
	void devide(ActionEvent event) {

		op = "/";
		num1 = Double.parseDouble(txt.getText());
		txt.setText("");

	}

	@FXML
	void eight(ActionEvent event) {

		txt.setText(txt.getText() + "8");

	}

	@FXML
	void equals(ActionEvent event) {

		int result;

		num2 = Double.parseDouble(txt.getText());
		if (op.equals("+")) {
			result = (int) (num1 + num2);
			txt.setText(Integer.toString(result));
		}

		if (op.equals("-")) {
			result = (int) (num1 - num2);
			txt.setText(Integer.toString(result));
		}

		if (op.equals("x")) {
			result = (int) (num1 * num2);
			txt.setText(Integer.toString(result));

		}

		if (op.equals("/")) {
			if (num2 == 0) {
				txt.setText("INFINITY");
			}

			result = (int) (num1 / num2);
			if (result % 1 == 0) {
				txt.setText(Integer.toString(result));
			} else {
				txt.setText(Double.toString((double) result));
			}

		}
	}

	@FXML
	void five(ActionEvent event) {

		txt.setText(txt.getText() + "5");

	}

	@FXML
	void four(ActionEvent event) {

		txt.setText(txt.getText() + "4");

	}

	@FXML
	void nine(ActionEvent event) {

		txt.setText(txt.getText() + "9");

	}

	@FXML
	void one(ActionEvent event) {

		txt.setText(txt.getText() + "1");

	}

	@FXML
	void plus(ActionEvent event) {

		op = "/";
		num1 = Double.parseDouble(txt.getText());
		txt.setText("");

	}

	@FXML
	void seven(ActionEvent event) {

		txt.setText(txt.getText() + "7");

	}

	@FXML
	void six(ActionEvent event) {

		txt.setText(txt.getText() + "6");

	}

	@FXML
	void three(ActionEvent event) {

		txt.setText(txt.getText() + "3");

	}

	@FXML
	void two(ActionEvent event) {

		txt.setText(txt.getText() + "2");

	}

	@FXML
	void zero(ActionEvent event) {

		txt.setText(txt.getText() + "0");

	}

	@FXML
	void DvdO(MouseEvent event) {

		btnDvd.setStyle("-fx-background-color: white;");

	}

	@FXML
	void DveE(MouseEvent event) {

		btnDvd.setStyle("-fx-background-color: lightgray;");

	}

	@FXML
	void ThreeE(MouseEvent event) {

		btn3.setStyle("-fx-background-color: lightgray;");

	}

	@FXML
	void dotE(MouseEvent event) {

		btnDeci.setStyle("-fx-background-color: lightgray;");

	}

	@FXML
	void dotO(MouseEvent event) {

		btnDeci.setStyle("-fx-background-color: white;");

	}

	@FXML
	void eightE(MouseEvent event) {

		btn8.setStyle("-fx-background-color: lightgray;");

	}

	@FXML
	void eightO(MouseEvent event) {

		btn8.setStyle("-fx-background-color: white;");

	}

	@FXML
	void eqE(MouseEvent event) {

		btnEq.setStyle("-fx-background-color: lightgray;");

	}

	@FXML
	void eqO(MouseEvent event) {

		btnEq.setStyle("-fx-background-color: white;");

	}

	@FXML
	void fiveE(MouseEvent event) {

		btn5.setStyle("-fx-background-color: lightgray;");

	}

	@FXML
	void fiveO(MouseEvent event) {

		btn5.setStyle("-fx-background-color: white;");

	}

	@FXML
	void fourE(MouseEvent event) {

		btn4.setStyle("-fx-background-color: lightgray;");

	}

	@FXML
	void fourO(MouseEvent event) {

		btn4.setStyle("-fx-background-color: white;");

	}

	@FXML
	void minusE(MouseEvent event) {

		btnMinus.setStyle("-fx-background-color: lightgray;");

	}

	@FXML
	void minusO(MouseEvent event) {

		btnMinus.setStyle("-fx-background-color: white;");

	}

	@FXML
	void mulE(MouseEvent event) {

		btnMul.setStyle("-fx-background-color: lightgray;");

	}

	@FXML
	void mulO(MouseEvent event) {

		btnMul.setStyle("-fx-background-color: white;");

	}

	@FXML
	void nineE(MouseEvent event) {

		btn9.setStyle("-fx-background-color: lightgray;");

	}

	@FXML
	void nineO(MouseEvent event) {

		btn9.setStyle("-fx-background-color: white;");

	}

	@FXML
	void oneE(MouseEvent event) {

		btn1.setStyle("-fx-background-color: lightgray;");

	}

	@FXML
	void oneO(MouseEvent event) {

		btn1.setStyle("-fx-background-color: white;");

	}

	@FXML
	void plusE(MouseEvent event) {

		btnAdd.setStyle("-fx-background-color: lightgray;");

	}

	@FXML
	void plusO(MouseEvent event) {

		btnAdd.setStyle("-fx-background-color: white;");

	}

	@FXML
	void sevenE(MouseEvent event) {

		btn7.setStyle("-fx-background-color: lightgray;");

	}

	@FXML
	void sevenO(MouseEvent event) {

		btn7.setStyle("-fx-background-color: white;");

	}

	@FXML
	void sixE(MouseEvent event) {

		btn6.setStyle("-fx-background-color: lightgray;");

	}

	@FXML
	void sixO(MouseEvent event) {

		btn6.setStyle("-fx-background-color: white;");

	}

	@FXML
	void threeO(MouseEvent event) {

		btn3.setStyle("-fx-background-color: white;");

	}

	@FXML
	void twoE(MouseEvent event) {

		btn2.setStyle("-fx-background-color: lightgray;");

	}

	@FXML
	void twoO(MouseEvent event) {

		btn2.setStyle("-fx-background-color: white;");

	}

	@FXML
	void zeroE(MouseEvent event) {

		btn0.setStyle("-fx-background-color: lightgray;");

	}

	@FXML
	void zeroO(MouseEvent event) {

		btn0.setStyle("-fx-background-color: white;");

	}

}
