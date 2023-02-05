package Dz6;

import Dz6.Models.DeductModel;
import Dz6.Models.DividModel;
import Dz6.Models.MultyModel;
import Dz6.Models.SumModel;
import Dz6.complex.ComplexProgram;
import Dz6.presenter.Presenter;

import java.util.Scanner;

//Создать калькулятор для работы с рациональными и комплексными числами,
//        организовать меню, добавив в неё систему логирования.
public class MainCalculator {
    public static void main(String[] args) {

        while (true) {
            try (Scanner scanner = new Scanner(System.in)) {
                while (true) {
                    System.out.println("Выберите действие - +, -, *, / \n" +
                            "или введите i для операций с комплексными числами\n" +
                            "для разделения десятичных знаков используйте запятую ");
                    String key = scanner.next();
                    System.out.print("\033[H\033[J");
                    switch (key) {
                        case "+":
                            Presenter p = new Presenter(new SumModel(), new View());
                            p.buttonClick("+");

                            break;
                        case "-":
                            p = new Presenter(new DeductModel(), new View());
                            p.buttonClick("-");
                            break;
                        case "*":
                            p = new Presenter(new MultyModel(), new View());
                            p.buttonClick("*");
                            break;
                        case "/":
                            p = new Presenter(new DividModel(), new View());
                            p.buttonClick("/");
                            break;
                        case "i":
                            ComplexProgram.complex();

                        default:
                            System.out.println("Такой команды нет");
                            break;
                    }
                }
            }

        }
    }
}






