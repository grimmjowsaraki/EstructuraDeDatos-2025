import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MatrixBase {

    private int m_rows;
    private int n_cols;
    private double[][] arr;

    public MatrixBase(int m, int n, double[][] arr) {
        this.m_rows = m;
        this.n_cols = n;
        this.arr = new double[m][n];
        for (int i = 0; i < this.m_rows; i++) {
            for (int j = 0; j < this.n_cols; j++) {
                this.arr[i][j] = 0;
            }
        }
    }

    public MatrixBase() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of array [rows] then [columns] separated by a space");
        String input = in.nextLine();
        StringTokenizer st = new StringTokenizer(input, "");
        this.m_rows = Integer.parseInt(st.nextToken().trim());
        this.n_cols = Integer.parseInt(st.nextToken().trim());

        this.arr = new double[this.m_rows][this.n_cols];

        System.out.println("Enter the array in format");

        for (int i = 0; i < this.m_rows; i++) {
            for (int j = 0; j < this.n_cols; j++) {
                System.out.println("X ");
            }
            System.out.println();
        }

        System.out.println("Column elements separated by space.\nRow elements separated by return");

        StringTokenizer st2;
        int token;
        for (int i = 0; i < this.m_rows; i++) {
            input = in.nextLine();
            st2 = new StringTokenizer(input, "");
            for (int j = 0; j < this.n_cols; j++) {
                token = Integer.parseInt(st2.nextToken().trim());

                this.arr[i][j] = token;
            }
        }

    }

    public MatrixBase(String filename) throws FileNotFoundException{
        Scanner inFile = new Scanner(new FileReader(filename));

        String arrSize = inFile.nextLine();
        StringTokenizer st = new StringTokenizer(arrSize, ",");
        this.m_rows = Integer.parseInt(st.nextToken());
        this.n_cols = Integer.parseInt(st.nextToken());

        this.arr = new  double[m_rows][n_cols];

        int i = 0;
        String rowData;
        StringTokenizer st2;
        while (inFile.hasNext()){

            rowData = inFile.nextLine();
            st2 = new StringTokenizer(rowData, ",");
            for (int j = 0; j < this.n_cols; j++) {
                this.arr[i][j] = Double.parseDouble(st2.nextToken());

            }
            i++;
        }
    }

}
