package lista3;

public class ex_01 {
    
}

class Salario {

    public float sal_bruto(float h_normais, float h_extras) {
        float total_normal = 0, total_extra = 0, bruto = 0;

        total_normal = h_normais * 12f;
        total_extra = h_extras * 15.50f;
        bruto = total_extra + total_normal;

        return bruto;
    }

    public float sal_liquido(float sal_bruto) {
        float liquido = 0;

        liquido = sal_bruto * 0.1f;
        liquido = sal_bruto - liquido;

        return liquido;
    }
}