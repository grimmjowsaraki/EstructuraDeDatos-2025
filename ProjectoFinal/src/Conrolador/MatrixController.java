package Conrolador;
import Modelo.Matrix;
import Vista.MatrixView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

public class MatrixController {
    private MatrixView view;

    public MatrixController(MatrixView view) {
        this.view = view;

        view.addButton.addActionListener(new OperationListener("add"));
        view.subtractButton.addActionListener(new OperationListener("subtract"));
        view.multiplyButton.addActionListener(new OperationListener("multiply"));
        view.determinantButton.addActionListener(new OperationListener("determinant"));
        view.inverseButton.addActionListener(new OperationListener("inverse"));
        view.clearButton.addActionListener(e -> view.clearFields());
    }

    class OperationListener implements ActionListener {
        private String operation;

        public OperationListener(String operation) {
            this.operation = operation;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                Matrix m1 = parseMatrix(view.getMatrixAInput());
                Matrix m2 = null;
                if (!view.getMatrixBInput().isBlank()) {
                    m2 = parseMatrix(view.getMatrixBInput());
                }

                Matrix result = null;
                String output = "";

                switch (operation) {
                    case "add":
                        result = m1.add(m2);
                        output = result.toString();
                        break;
                    case "subtract":
                        result = m1.subtract(m2);
                        output = result.toString();
                        break;
                    case "multiply":
                        result = m1.multiply(m2);
                        output = result.toString();
                        break;
                    case "determinant":
                        output = "Determinante: " + m1.determinant();
                        break;
                    case "inverse":
                        result = m1.inverse();
                        output = result.toString();
                        break;
                }

                view.setResultOutput(output);
            } catch (Exception ex) {
                view.setResultOutput("Error: " + ex.getMessage());
            }
        }
    }

    private Matrix parseMatrix(String input) {
        StringTokenizer rowTokenizer = new StringTokenizer(input, "\n");
        int rows = rowTokenizer.countTokens();
        String firstRow = rowTokenizer.nextToken();
        StringTokenizer colTokenizer = new StringTokenizer(firstRow, " ");
        int cols = colTokenizer.countTokens();

        Matrix matrix = new Matrix(rows, cols);

        String[] rowLines = input.split("\n");
        for (int i = 0; i < rows; i++) {
            String[] tokens = rowLines[i].trim().split("\\s+");
            for (int j = 0; j < cols; j++) {
                matrix.arr[i][j] = Double.parseDouble(tokens[j]);
            }
        }

        return matrix;
    }
}
