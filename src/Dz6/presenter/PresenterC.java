package Dz6.presenter;

import Dz6.complex.ComplexNum;
import Dz6.modelInterface.ModelC;
import Dz6.View;

public class PresenterC {
    private ModelC modelC;
    private View view;
    private String log;

    public PresenterC(ModelC m, View v) {
        modelC = m;
        view = v;
    }


    public void buttonClick(String operation){
        double a = view.getValue("Рациональная часть 1-го числа: ");
        double b=view.getValue("Комплексная часть 1-го числа: ");
        ComplexNum x = modelC.setComplexNum(a,b);
         a = view.getValue("Рациональная часть 2-го числа: ");
         b=view.getValue("Комплексная часть 2-го числа: ");
        ComplexNum y = modelC.setComplexNum(a,b);
        ComplexNum result = modelC.result(x,y);
        log = x + operation + y + " = " + result ;
        view.printC(log);

    }
}
