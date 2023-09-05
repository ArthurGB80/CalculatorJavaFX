package com.example.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class Controller {

    public ToggleGroup angle;
    boolean radio_val = false;

    protected String dispText = "";

    Model model = new Model();

    @FXML
    private TextField displayTextField;

    @FXML
    protected void ACBtn() {
        dispText = "";
        displayTextField.clear();
        model.setFirstValue(0);
        model.setSecondValue(0);
    }

    @FXML
    protected void DeleteBtn() {
        dispText = dispText.substring(0, dispText.length() - 1);
        displayTextField.setText(dispText);
    }

    @FXML
    protected void SquareBtn() {
        model.setOperation(Model.Operation.sqr);
        model.setFirstValue(Double.parseDouble(displayTextField.getText()));
        displayTextField.clear();
        displayTextField.setText("Xª");
        dispText = "";
    }

    @FXML
    protected void SquareRootBtn() {
        model.setOperation(Model.Operation.sqrt);
        model.setFirstValue(Double.parseDouble(displayTextField.getText()));
        displayTextField.clear();
        displayTextField.setText("√χ");
        dispText = "";
    }

    @FXML
    protected void SevenBtn() {
        dispText += "7";
        displayTextField.setText(dispText);
    }

    @FXML
    protected void EightBtn() {
        dispText += "8";
        displayTextField.setText(dispText);
    }

    @FXML
    protected void NineBtn() {
        dispText += "9";
        displayTextField.setText(dispText);
    }

    @FXML
    protected void FournBtn() {
        dispText += "4";
        displayTextField.setText(dispText);
    }

    @FXML
    protected void FiveBtn() {
        dispText += "5";
        displayTextField.setText(dispText);
    }

    @FXML
    protected void SixBtn() {
        dispText += "6";
        displayTextField.setText(dispText);
    }

    @FXML
    protected void OneBtn() {
        dispText += "1";
        displayTextField.setText(dispText);
    }

    @FXML
    protected void TwoBtn() {
        dispText += "2";
        displayTextField.setText(dispText);
    }

    @FXML
    protected void ThreeBtn() {
        dispText += "3";
        displayTextField.setText(dispText);
    }

    @FXML
    protected void ZeroBtn() {
        dispText += "0";
        displayTextField.setText(dispText);
    }

    @FXML
    protected void PlusBtn() {
        model.setOperation(Model.Operation.add);
        model.setFirstValue(Double.parseDouble(displayTextField.getText()));
        displayTextField.clear();
        displayTextField.setText("+");
        dispText = "";
    }

    @FXML
    protected void MinusBtn() {
        model.setOperation(Model.Operation.sub);
        model.setFirstValue(Double.parseDouble(displayTextField.getText()));
        displayTextField.clear();
        displayTextField.setText("-");
        dispText = "";
    }

    @FXML
    protected void MultipleBtn() {
        model.setOperation(Model.Operation.mul);
        model.setFirstValue(Double.parseDouble(displayTextField.getText()));
        displayTextField.clear();
        displayTextField.setText("*");
        dispText = "";
    }

    @FXML
    protected void SubdivisionBtn() {
        model.setOperation(Model.Operation.div);
        model.setFirstValue(Double.parseDouble(displayTextField.getText()));
        displayTextField.clear();
        displayTextField.setText("/");
        dispText = "";
    }

    @FXML
    protected void DotBtn() {
        if (dispText.indexOf('.') == -1) {
            dispText += ".";
            displayTextField.setText(dispText);
        }
    }

    @FXML
    protected void PiBtn() {
        displayTextField.clear();
        dispText = "";
        displayTextField.setText("3.14159265");
    }

    @FXML
    protected void FactBtn() {
        dispText = "";
        displayTextField.setText(String.valueOf(Model.Factorial(Double.parseDouble(displayTextField.getText()))));
        model.setANS(Double.parseDouble(displayTextField.getText()));
    }

    @FXML
    protected void SinBtn(){
        dispText = "";
        if (radio_val) {
            displayTextField.setText(String.valueOf(Math.sin(Math.PI * Double.parseDouble(displayTextField.getText()) / 180)));
        }
        if (!radio_val){
            displayTextField.setText(String.valueOf(Math.sin(Double.parseDouble(displayTextField.getText()))));
        }
        model.setANS(Double.parseDouble(displayTextField.getText()));
    }

    @FXML
    protected void CosBtn(){
        dispText = "";
        if (radio_val) {
            displayTextField.setText(String.valueOf(Math.cos(Math.PI * Double.parseDouble(displayTextField.getText()) / 180)));
        }
        if (!radio_val){
            displayTextField.setText(String.valueOf(Math.cos(Double.parseDouble(displayTextField.getText()))));
        }
        model.setANS(Double.parseDouble(displayTextField.getText()));
    }
    @FXML
    protected void TanBtn(){
        dispText = "";
        if (radio_val) {
            displayTextField.setText(String.valueOf(Math.tan(Math.PI * Double.parseDouble(displayTextField.getText()) / 180)));
        }
        if (!radio_val){
            displayTextField.setText(String.valueOf(Math.tan(Double.parseDouble(displayTextField.getText()))));
        }
        model.setANS(Double.parseDouble(displayTextField.getText()));
    }

    @FXML
    protected void DegRad(){
        radio_val = true;
    }

    @FXML
    protected void RadRad(){
        radio_val = false;
    }

    @FXML
    protected void LgBtn(){
        dispText = "";
        displayTextField.setText(String.valueOf(Math.log10(Double.parseDouble(displayTextField.getText()))));
        model.setANS(Double.parseDouble(displayTextField.getText()));
    }

    @FXML
    protected void  LnBtn(){
        dispText = "";
        displayTextField.setText(String.valueOf(Math.log(Double.parseDouble(displayTextField.getText()))));
        model.setANS(Double.parseDouble(displayTextField.getText()));
    }
    @FXML
    protected void MBtn(){
        dispText = "";
        displayTextField.clear();
        displayTextField.setText(String.valueOf(model.getMVal()));
    }
    @FXML
    protected void MAddBtn(){
        dispText = "";
        model.setMVal(model.getMVal() + Double.parseDouble(displayTextField.getText()));
        displayTextField.clear();
    }
    @FXML
    protected void MSubBtn() {
        dispText = "";
        model.setMVal(model.getMVal() - Double.parseDouble(displayTextField.getText()));
        displayTextField.clear();
    }
    @FXML
    protected void CLRBtn(){
        dispText = "";
        displayTextField.clear();
        model.setMVal(0);
    }
    @FXML
    protected void ANS(){
        dispText = "";
        displayTextField.clear();
        displayTextField.setText(String.valueOf(model.getANS()));
    }
    @FXML
    protected void resultButtonClick() {
        if (model.operation == Model.Operation.div && Double.parseDouble(displayTextField.getText()) == 0) {
            displayTextField.clear();
            displayTextField.setText("∞");
            dispText = "";
            model.setFirstValue(0);
            model.setSecondValue(0);
        } else {
            model.setSecondValue(Double.parseDouble(displayTextField.getText()));
            displayTextField.clear();
            displayTextField.setText(String.valueOf(model.getResult()));
            model.setANS(Double.parseDouble(displayTextField.getText()));
        }
    }
}