package OtrosEjercicios;

public class Tienda {
    public static void main(String[] args) {
        float PorcentajeDescuento = 0.85f;
        final int TSHIRT = 25;
        final int PANTS = 30;
        
        float Descuento = ((TSHIRT + PANTS) * PorcentajeDescuento);
        System.out.println("El total de ambas con el descuento es: $" + Descuento);
        
        float PorcentajeDescuentoTshirt = TSHIRT*PorcentajeDescuento;
        PorcentajeDescuento += 0.1;
        float total = PorcentajeDescuentoTshirt + (PorcentajeDescuentoTshirt*PorcentajeDescuento);
        
        System.out.println("El precio de las camisas es: $" + total);
        
        
        
    }
}
