/**
 *
 * @author Hongru Xiang
 */
//creditos al repositorio de https://github.com/orionHong/MatrixCalculator.git
import Controlador.MatrixCalculatorController;
import Modelo.MatrixCalculator;
import Vista.MatrixCalculatorGUI;

public class RunMatrixCalculator {
    public static void main(String[] args) {
        MatrixCalculator m = new MatrixCalculator();

        MatrixCalculatorGUI gui = new MatrixCalculatorGUI();

        MatrixCalculatorController c = new MatrixCalculatorController();

        c.addMatrixCalculator(m);
        c.addMatrixCalculatorGUI(gui);

        gui.addController(c);
        gui.setVisible(true);
        gui.setResizable(false);
    }
}
