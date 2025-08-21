package Vista;
import javax.swing.*;
import java.awt.*;

public class MatrixView extends JFrame {
    public JTextArea matrix1Area;
    public JTextArea matrix2Area;
    public JButton addButton;
    public JButton subtractButton;
    public JButton multiplyButton;
    public JButton determinantButton;
    public JButton inverseButton;

    public MatrixView() {
        setTitle("Operaciones con Matrices");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        matrix1Area = new JTextArea(5, 20);
        matrix2Area = new JTextArea(5, 20);
        addButton = new JButton("Sumar");
        subtractButton = new JButton("Restar");
        multiplyButton = new JButton("Multiplicar");
        determinantButton = new JButton("Determinante (M1)");
        inverseButton = new JButton("Inversa (M1)");

        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(new JScrollPane(matrix1Area));
        panel.add(new JScrollPane(matrix2Area));

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(addButton);
        buttonPanel.add(subtractButton);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(determinantButton);
        buttonPanel.add(inverseButton);

        add(panel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }
}
