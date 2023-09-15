import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do lado do Quadrado:");
        double ladoQuadrado = scanner.nextDouble();
        Quadrado quadrado = new Quadrado(ladoQuadrado, ladoQuadrado);

        System.out.println("Digite o valor da base do Triângulo Retângulo:");
        double baseTriangulo = scanner.nextDouble();
        System.out.println("Digite o valor da altura do Triângulo Retângulo:");
        double alturaTriangulo = scanner.nextDouble();
        TrianguloRetangulo triangulo = new TrianguloRetangulo(baseTriangulo, alturaTriangulo);
        System.out.println("Voce sabe o valor da hipotenusa? \n1-Sim\n2-nao:");
        int sabeHipo = scanner.nextInt();
        if(sabeHipo == 1){
            System.out.println("Digite o valor da hipotenusa do Triângulo Retângulo:");
            double hipo = scanner.nextDouble();
            triangulo.setHipotenusa(hipo);
        }


        System.out.println("Escolha uma operação:");
        System.out.println("1 - Calcular Perímetro do Quadrado");
        System.out.println("2 - Calcular Área do Quadrado");
        System.out.println("3 - Calcular Perímetro do Triângulo Retângulo");
        System.out.println("4 - Calcular Área do Triângulo Retângulo");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Perímetro do Quadrado: " + quadrado.calcPerimetro());
                break;
            case 2:
                System.out.println("Área do Quadrado: " + quadrado.calcArea());
                break;
            case 3:
                System.out.println("Perímetro do Triângulo Retângulo: " + triangulo.calcPerimetro());
                break;
            case 4:
                System.out.println("Área do Triângulo Retângulo: " + triangulo.calcArea());
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        scanner.close();
    }
}
