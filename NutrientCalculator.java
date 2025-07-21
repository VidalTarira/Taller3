import java.util.Scanner;

public class NutrientCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double calorias = 0, proteinas = 0, grasas = 0, carbohidratos = 0;

        System.out.print("¿Cuántos ingredientes consumió? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nIngrediente #" + (i + 1));
            System.out.print("Cantidad en gramos: ");
            double gramos = scanner.nextDouble();

            System.out.print("Grupo (caloria, proteina, grasa, carbohidrato): ");
            String grupo = scanner.next().toLowerCase();

            switch (grupo) {
                case "caloria":
                    calorias += gramos;
                    break;
                case "proteina":
                    proteinas += gramos;
                    break;
                case "grasa":
                    grasas += gramos;
                    break;
                case "carbohidrato":
                    carbohidratos += gramos;
                    break;
                default:
                    System.out.println("Grupo no válido. Ignorado.");
            }
        }

        // Mostrar resumen
        System.out.println("\n--- Resultado Nutricional ---");
        System.out.println("Total Calorías: " + calorias + " kcal");
        System.out.println("Total Proteínas: " + proteinas + " g");
        System.out.println("Total Grasas: " + grasas + " g");
        System.out.println("Total Carbohidratos: " + carbohidratos + " g");

        // Evaluación nutricional
        boolean aceptable = calorias <= 2000 && proteinas <= 50 && grasas <= 70 && carbohidratos <= 300;

        if (aceptable) {
            System.out.println("✅ El valor nutricional es ACEPTABLE.");
        } else {
            System.out.println("⚠️ El valor nutricional NO es aceptable.");
        }

        scanner.close();
    }
}

