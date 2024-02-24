public class hilo class MiRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hilo en ejecución: " + i);
            try {
                Thread.sleep(1000); // Duerme el hilo durante 1 segundo
            } catch (InterruptedException e) {
                System.out.println("El hilo ha sido interrumpido.");
            }
        }
        System.out.println("Hilo terminado.");
    }
}

public class Main {
    public static void main(String[] args) {
        MiRunnable miRunnable = new MiRunnable();

        Thread hilo1 = new Thread(miRunnable);
        Thread hilo2 = new Thread(miRunnable);

        hilo1.start(); // Inicia el primer hilo
        hilo2.start(); // Inicia el segundo hilo
    }
}{
}
