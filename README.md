## Introduzione
Questo README fornisce le istruzioni necessarie per testare l'algoritmo e visualizzare i risultati ottenuti. Seguire i passaggi descritti per eseguire i test e analizzare i dati.

## Esecuzione dell'Algoritmo
1. **Aprire la cartella `model`**: All'interno della cartella `model`, troverete una classe chiamata `Main`.
2. **Eseguire il metodo `main`**: Eseguendo il metodo `main`, sarà possibile visualizzare a schermo i risultati ottenuti, inclusi i tempi di esecuzione.

## Visualizzazione dei Risultati
- **File `performance.csv`**: Per visualizzare in modo semplice e veloce tutti i tempi delle varie esecuzioni, aprire il file `performance.csv`.
- **File `performance_dijkstra_grafico.xlsx`**: I valori ottenuti possono essere inseriti opzionalmente all'interno del file `performance_dijkstra_grafico.xlsx`. Questo file contiene una tabella con i valori di un test eseguito a fini di esempio e un relativo grafico. Modificando tali dati, sarà possibile visualizzare graficamente le differenze evidenziate all'interno della tesina in termini di prestazioni.

## Esecuzione di Test Personalizzati
Per eseguire test sul numero di vertici o sulla densità del grafo, seguire questi passaggi:
1. **Modificare le costanti nella classe `Main`**: Cambiare i valori delle costanti presenti nella classe `Main`. Queste costanti riguardano la densità iniziale e finale, e il numero di grafi su cui si esegue l'algoritmo. Il numero di vertici è fissato.
2. **Scelta del numero di vertici**: La scelta del numero di vertici fisso è stata fatta a seguito di test sperimentali, che hanno permesso di identificare un intervallo ottimale per apprezzare la differenza di calcolo del cammino minimo, senza utilizzare un numero eccessivo di risorse.
3. **Rieseguire il metodo `main`**: Dopo aver scelto i parametri desiderati, rieseguire il metodo `main` e visualizzare i tempi di esecuzione nel file `performance.csv`.

## Conclusione
Seguendo queste istruzioni, sarà possibile testare l'algoritmo, visualizzare i risultati e personalizzare i parametri di test per analizzare le prestazioni in diverse condizioni.