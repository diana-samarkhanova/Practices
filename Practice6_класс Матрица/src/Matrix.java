public class Matrix {
    public double[][] matrix;
    public int rows;
    public int columns;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = new double[rows][columns];
    }
    public void setElement(int row, int column, double value) {
        if (row >= 0 && row < rows && column >= 0 && column < columns) {
            matrix[row][column] = value;
        } else {
            System.out.println("Некорректный ввод");
        }
    }
    //сложение с другой матрицей
    public Matrix add(Matrix other) {
        if (rows != other.rows || columns != other.columns) {
            System.out.println("Нельзя выполнить сложение. Разный размер матриц.");
            return null;
        }

        Matrix result = new Matrix(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.matrix[i][j] = this.matrix[i][j] + other.matrix[i][j];
            }
        }
        return result;
    }
    //умножение на число
    public Matrix multiply(double number) {
        Matrix result = new Matrix(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.matrix[i][j] = this.matrix[i][j] * number;
            }
        }
        return result;
    }
    //умножение на другую матрицу
    public Matrix multiply(Matrix other) {
        if (columns != other.rows) {
            System.out.println("Нельзя выполнить умножение. Разный размер матриц.");
            return null;
        }

        Matrix result = new Matrix(rows, other.columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < other.columns; j++) {
                for (int k = 0; k < columns; k++) {
                    result.matrix[i][j] += this.matrix[i][k] * other.matrix[k][j];
                }
            }
        }
        return result;
    }
    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
