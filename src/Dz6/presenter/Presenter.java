package Dz6.presenter;

import Dz6.modelInterface.Model;
import Dz6.View;

public class Presenter {
    private View view;
    private Model model;
    private String log;

    public Presenter(Model m, View v) {
        model = m;
        view = v;
    }

    public void buttonClick(String operation){
        double a = view.getValue("a: ");
        double b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);
        double result = model.result();
        log = a + operation + b + " = " + result;
        view.print( log);
    }

}
