public class BombaCombustivel {
    private String tipoCombustivel;
    private double valorLitroGasolina;
    private double valorLitroDiesel;
    private double quantidadeCombustivelGasolina;
    private double quantidadeCombustivelDiesel;

    public BombaCombustivel(String tipoCombustivel, double valorLitroGasolina, double valorLitroDiesel,
            double quantidadeCombustivelGasolina, double quantidadeCombustivelDiesel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitroGasolina = valorLitroGasolina;
        this.valorLitroDiesel = valorLitroDiesel;
        this.quantidadeCombustivelGasolina = quantidadeCombustivelGasolina;
        this.quantidadeCombustivelDiesel = quantidadeCombustivelDiesel;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getValorLitroGasolina() {
        return valorLitroGasolina;
    }

    public void setValorLitroGasolina(double valorLitroGasolina) {
        this.valorLitroGasolina = valorLitroGasolina;
    }

    public double getValorLitroDiesel() {
        return valorLitroDiesel;
    }

    public void setValorLitroDiesel(double valorLitroDiesel) {
        this.valorLitroDiesel = valorLitroDiesel;
    }

    public double getQuantidadeCombustivelGasolina() {
        return quantidadeCombustivelGasolina;
    }

    public void setQuantidadeCombustivelGasolina(double quantidadeCombustivelGasolina) {
        this.quantidadeCombustivelGasolina = quantidadeCombustivelGasolina;
    }

    public double getQuantidadeCombustivelDiesel() {
        return quantidadeCombustivelDiesel;
    }

    public void setQuantidadeCombustivelDiesel(double quantidadeCombustivelDiesel) {
        this.quantidadeCombustivelDiesel = quantidadeCombustivelDiesel;
    }

    public void abastecerPorValor(String tipoCombustivel, double valor) {
        if (tipoCombustivel.equalsIgnoreCase("gasolina")) {
            double litrosAbastecidos = valor / valorLitroGasolina;
            if (litrosAbastecidos <= quantidadeCombustivelGasolina) {
                quantidadeCombustivelGasolina -= litrosAbastecidos;
                System.out.println("Foram abastecidos " + litrosAbastecidos + " litros de gasolina.");
            } else {
                System.out.println("Não há gasolina suficiente na bomba.");
            }
        } else if (tipoCombustivel.equalsIgnoreCase("diesel")) {
            double litrosAbastecidos = valor / valorLitroDiesel;
            if (litrosAbastecidos <= quantidadeCombustivelDiesel) {
                quantidadeCombustivelDiesel -= litrosAbastecidos;
                System.out.println("Foram abastecidos " + litrosAbastecidos + " litros de diesel.");
            } else {
                System.out.println("Não há diesel suficiente na bomba.");
            }
        } else {
            System.out.println("Tipo de combustível inválido.");
        }
    }

    public void abastecerPorLitro(String tipoCombustivel, double litros) {
        if (tipoCombustivel.equalsIgnoreCase("gasolina")) {
            double valorPagar = litros * valorLitroGasolina;
            if (litros <= quantidadeCombustivelGasolina) {
                quantidadeCombustivelGasolina -= litros;
                System.out.println("Valor a pagar pela gasolina: R$" + valorPagar);
            } else {
                System.out.println("Não há gasolina suficiente na bomba.");
            }
        } else if (tipoCombustivel.equalsIgnoreCase("diesel")) {
            double valorPagar = litros * valorLitroDiesel;
            if (litros <= quantidadeCombustivelDiesel) {
                quantidadeCombustivelDiesel -= litros;
                System.out.println("Valor a pagar pelo diesel: R$" + valorPagar);
            } else {
                System.out.println("Não há diesel suficiente na bomba.");
            }
        } else {
            System.out.println("Tipo de combustível inválido.");
        }
    }
}
