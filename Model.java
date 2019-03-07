package sample;

public class Model {

    public void Plus1(View view) {
        int number = Integer.parseInt(view.getText());
        number += 1;
        view.setText(String.valueOf(number));
    }
    public void Plus10(View view) {
        int number = Integer.parseInt(view.getText());
        number += 10;
        view.setText(String.valueOf(number));
    }
    public void Minus1(View view) {
        int number = Integer.parseInt(view.getText());
        number -= 1;
        view.setText(String.valueOf(number));
    }
    public void Minus10(View view) {
        int number = Integer.parseInt(view.getText());
        number -= 10;
        view.setText(String.valueOf(number));
    }
};
