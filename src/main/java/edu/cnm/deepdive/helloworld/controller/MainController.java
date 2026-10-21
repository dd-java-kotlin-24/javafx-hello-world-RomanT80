package edu.cnm.deepdive.helloworld.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class MainController {

  public Text counter;
  private int count;

  @FXML
  private void initialize() {
    updateCounter();
  }
  @FXML
  private void decrementCounter(ActionEvent actionEvent) {
    count--;
    updateCounter();
  }

  @FXML
  private void incrementCounter(ActionEvent actionEvent) {
    count++;
    updateCounter();
  }

  @FXML
  private void resetCounter(ActionEvent actionEvent) {
    count = 0;
    updateCounter();
  }

  private void updateCounter() {
    counter.setText(String.valueOf(count));
  }
}
