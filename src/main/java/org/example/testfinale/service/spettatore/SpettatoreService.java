package org.example.testfinale.service.spettatore;

public interface SpettatoreService {
    //funzionalità che restituisca un valore booleano
    // per determinare la minore o maggiore età
    boolean isMaggiorenne();
    //funzionalità che restituisca l'età dello spettatore come valore intero
    void ageAsInt();

    //funz get sconto --> 10% > 70 e 50% < 5
    void getSconto();

}
