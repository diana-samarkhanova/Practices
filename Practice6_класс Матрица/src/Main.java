public class Main {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 2);
        matrix1.setElement(0, 0, 1);
        matrix1.setElement(0, 1, 2);
        matrix1.setElement(1, 0, 4);
        matrix1.setElement(1, 1, 5);

        Matrix matrix2 = new Matrix(2, 2);
        matrix2.setElement(0, 0, 7);
        matrix2.setElement(0, 1, 8);
        matrix2.setElement(1, 0, 9);
        matrix2.setElement(1, 1, 10);

        System.out.println("Матрица 1:");
        matrix1.print();

        System.out.println("Матрица 2:");
        matrix2.print();

        // Сложение матриц
        System.out.println("Сумма матриц:");
        Matrix sum = matrix1.add(matrix2);
        sum.print();

        // Умножение матриц на число
        System.out.println("Умножение матрицы на число:");
        Matrix multiplyByNumber = matrix1.multiply(2);
        multiplyByNumber.print();

        // Умножение матриц
        System.out.println("Умножение матриц:");
        Matrix product = matrix1.multiply(matrix2);
        product.print();

    }
}