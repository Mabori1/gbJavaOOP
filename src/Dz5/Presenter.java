package Dz5;

public class Presenter {
    View view;
    Model model;
    String log;

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
