import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tipo de combustível: ");
        String tipoCombustivel = scanner.nextLine();

        System.out.print("Informe o valor do litro de gasolina: R$");
        double valorLitroGasolina = scanner.nextDouble();

        System.out.print("Informe a quantidade de gasolina na bomba: ");
        double quantidadeCombustivelGasolina = scanner.nextDouble();

        System.out.print("Informe o valor do litro de diesel: R$");
        double valorLitroDiesel = scanner.nextDouble();

        System.out.print("Informe a quantidade de diesel na bomba: ");
        double quantidadeCombustivelDiesel = scanner.nextDouble();

        BombaCombustivel bomba = new BombaCombustivel(tipoCombustivel, valorLitroGasolina, valorLitroDiesel,
                quantidadeCombustivelGasolina, quantidadeCombustivelDiesel);

        System.out.println("Bomba de Combustível");
        System.out.println("Tipo de combustível: " + bomba.getTipoCombustivel());
        System.out.println("Valor do litro de gasolina: R$" + bomba.getValorLitroGasolina());
        System.out.println("Quantidade de gasolina na bomba: " + bomba.getQuantidadeCombustivelGasolina() + " litros");
        System.out.println("Valor do litro de diesel: R$" + bomba.getValorLitroDiesel());
        System.out.println("Quantidade de diesel na bomba: " + bomba.getQuantidadeCombustivelDiesel() + " litros");

        System.out.print("Informe a quantidade de litros para abastecimento de gasolina: ");
        double litrosGasolina = scanner.nextDouble();
        bomba.abastecerPorLitro("gasolina", litrosGasolina);

        System.out.print("Informe o valor para abastecimento de gasolina: R$");
        double valorGasolina = scanner.nextDouble();
        bomba.abastecerPorValor("gasolina", valorGasolina);

        System.out.print("Informe a quantidade de litros para abastecimento de diesel: ");
        double litrosDiesel = scanner.nextDouble();
        bomba.abastecerPorLitro("diesel", litrosDiesel);

        System.out.print("Informe o valor para abastecimento de diesel: R$");
        double valorDiesel = scanner.nextDouble();
        bomba.abastecerPorValor("diesel", valorDiesel);

        System.out.print("Informe o novo valor do litro de gasolina: R$");
        double novoValorLitroGasolina = scanner.nextDouble();
        bomba.setValorLitroGasolina(novoValorLitroGasolina);

        System.out.print("Informe o novo valor do litro de diesel: R$");
        double novoValorLitroDiesel = scanner.nextDouble();
        bomba.setValorLitroDiesel(novoValorLitroDiesel);

        System.out.print("Informe a nova quantidade de gasolina na bomba: ");
        double novaQuantidadeGasolina = scanner.nextDouble();
        bomba.setQuantidadeCombustivelGasolina(novaQuantidadeGasolina);

        System.out.print("Informe a nova quantidade de diesel na bomba: ");
        double novaQuantidadeDiesel = scanner.nextDouble();
        bomba.setQuantidadeCombustivelDiesel(novaQuantidadeDiesel);

        System.out.println(
                "Quantidade de gasolina restante na bomba: " + bomba.getQuantidadeCombustivelGasolina() + " litros");
        System.out.println(
                "Quantidade de diesel restante na bomba: " + bomba.getQuantidadeCombustivelDiesel() + " litros");

        scanner.close();
    }
}
