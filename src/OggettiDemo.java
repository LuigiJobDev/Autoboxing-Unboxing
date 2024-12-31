public class OggettiDemo {
    public static void mostraEsempio() {
        String testo = "Ciao, sono un oggetto!"; /*Oggetto String*/
        Integer numeroOggetto = 20; /*Oggetto Integer*/
        Double decimaleOggetto = 15.5; /*Oggetto Double*/

        System.out.println("Testo (String): " + testo);
        System.out.println("Numero Oggetto (Integer): " + numeroOggetto);
        System.out.println("Decimale Oggetto (Double): " + decimaleOggetto);

        /*Metodi sugli Oggetti*/
        System.out.println("Lunghezza del testo: " + testo.length());
        System.out.println("Numero Oggetto in formato esadecimale: " + Integer.toHexString(numeroOggetto));
    }
}
