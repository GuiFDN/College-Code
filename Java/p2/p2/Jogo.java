public class Jogo {
    public static void main(String[] args) throws InterruptedException {
        Personagem cassador = new Personagem("John", 10, 0, 0);
        Personagem soneca = new Personagem("Soneca", 2, 6, 4);
        Personagem cueio = new Personagem("Coelho", 8, 2, 1);

        while (true) {
            cassador.cassar();
            cueio.dormir();
            soneca.dormir();
            
            cassador.comer();
            cueio.cassar();
            soneca.dormir();
            
            cassador.dormir();
            cueio.cassar();
            soneca.dormir();
            
            cassador.cassar();
            cueio.comer();
            soneca.comer();
            
            cassador.cassar();
            cueio.comer();
            soneca.cassar();
            
            System.out.println("====================");
            Thread.sleep(8000);
        }
    }
}
