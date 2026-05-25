import java.util.Scanner;

public class ClimbStairs {

    // ── Função recursiva ───────────────────────────────────
    // Caso base: se n=1 ou n=2, o resultado é igual à entrada
    // Caso recursivo: F(n) = F(n-1) + F(n-2)
    static int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    // ── Exibe as chamadas recursivas para o professor ──────
    static void exibirExplicacao(int n) {
        System.out.println("\n── Como chegamos ao resultado ────────");
        for (int i = 1; i <= n; i++) {
            System.out.println("  F(" + i + ") = " + climbStairs(i) + " maneira(s)");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("         🪜  Climb Stairs              ");
        System.out.println("╚══════════════════════════════════════╝");

        // Validação: n deve ser maior que zero
        int n = 0;
        while (n < 1) {
            System.out.print("\nDigite o número de degraus (n > 0): ");
            n = scanner.nextInt();
            if (n < 1) System.out.println("⚠  Digite um número maior que zero!");
        }

        int resultado = climbStairs(n);

        System.out.println("\n✔  Com " + n + " degrau(s), há " + resultado + " maneira(s) distintas de subir!");

        exibirExplicacao(n);

        scanner.close();
    }
}
