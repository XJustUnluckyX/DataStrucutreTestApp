# DataStrucutreTestApp_Appendix <img src="https://img.icons8.com/color/512/android-studio--v3.png" style="width:32px;"/>   <img src="https://upload.wikimedia.org/wikipedia/commons/5/52/Apache_Maven_logo.svg" style="width:64px;"/> <img src="https://camo.githubusercontent.com/f93ac6c787736f5dd26e31ba2b3f4654bf1b7475c52d2e305408633207ce79d9/687474703a2f2f77616c612e736f75726365666f7267652e6e65742f77696b692f696d616765732f392f39342f57414c412d62616e6e65722e706e67" style="width:64px;"/> <img src="https://cdn.icon-icons.com/icons2/159/PNG/256/arduino_22429.png" style="width:32px;"/>
## Table of contents
* [Tecnologie](#technologies)

### Tecnologie

#### 1. [Android Studio](https://developer.android.com/studio) Bumblebee | 2021.1.1 Patch 3 

Android Studio è un ambiente di sviluppo integrato (IDE) per lo sviluppo per la piattaforma Android. È stato annunciato il 16 maggio 2013 in occasione della conferenza Google I/O tenuta dal Product Manager Google, Katherine Chou. Android Studio è disponibile gratuitamente sotto licenza Apache 2.0.\newline
Basato sul software di JetBrains IntelliJ IDEA, Android Studio è stato progettato specificamente per lo sviluppo di applicazioni Android. È disponibile il download su Windows, Mac OS X e Linux e sostituisce gli Android Development Tools (ADT) di Eclipse, diventando l'IDE primario di per lo sviluppo nativo di applicazioni Android.

#### 2. [Maven](https://maven.apache.org/) version 3.8.6
Apache Maven è uno strumento di comprensione e gestione dei progetti software. Basato sul concetto di modello a oggetti di progetto (POM), Maven può gestire la creazione, il reporting e la documentazione di un progetto.\newline
L'obiettivo principale di Maven è consentire a uno sviluppatore di comprendere lo stato completo di uno sviluppo nel più breve periodo di tempo. Per raggiungere questo obiettivo, Maven agisce su diverse aree di interesse, tra cui:

* la semplificazione del processo di costruzione
* la dotazione di un sistema di costruzione uniforme
* la reperibilità di informazioni di qualità sul progetto
* l'incentivo all'applicazione di migliori pratiche di sviluppo

#### 3. [WALA](https://github.com/wala/WALA) version 1.5.8
Le librerie T. J. Watson per l'analisi (WALA) forniscono funzionalità di analisi statica per bytecode Java, linguaggi correlati e per JavaScript. Il sistema è concesso in licenza in base alla Eclipse Public License, che è stata approvata dall'OSI (Open Source Initiative) come licenza open source completamente certificata. L'infrastruttura WALA iniziale è stata sviluppata in modo indipendente nell'ambito del progetto di ricerca DOMO presso l'IBM T.J. Centro di ricerca Watson. Nel 2006, IBM ha donato il software alla comunità.

Le funzionalità di WALA includono:

  * una libreria d'analisi della gerarchia delle classi

  * un framework che supporta linguaggio sorgente Java e JavaScript

  * una libreria d'nalisi interprocedurale del flusso di dati (risolutore RHS)

  * uno slicer sensibile al contesto basato sulla tabulazione

  * una libreria d'analisi dei puntatori e di costruzione di call graphs

  * un linguaggio di trasferimento dei registri basato su SSA IR

  * un framework generale per flussi di dati iterativi

  * metodi di analisi per strutture dati

  * una libreria di strumentazione bytecode (Shrike)

### 4. [ArduinoIDE](https://www.arduino.cc/en/software) version 2.0.2
Arduino IDE (Integrated Development Environment), è un'applicazione multipiattaforma in Java, ed è derivata dall'IDE creato per il linguaggio di programmazione Processing e per il progetto Wiring. 
Per abilitare la stesura del codice sorgente, l'IDE include un editore di testo dotato di syntax highlighting, controllo delle parentesi e indentazione automatica. L'editor è inoltre in grado di compilare e caricare sulla scheda Arduino il programma eseguibile in un solo comando e con un solo click.\newline
L'ambiente di sviluppo integrato di Arduino è fornito di una libreria software C/C++, chiamata "Wiring" (dall'omonimo progetto Wiring): la disponibilità della libreria rende molto più semplice implementare via software le comuni operazioni di input/output. I programmi di Arduino sono scritti in linguaggio derivato dal C/C++, ma all'utilizzatore, per poter creare un file eseguibile, si richiede solo di definire due funzioni:


```c++ 
void setup () //funzione invocata una sola volta all'inizio di un programma, da utilizzare per i settaggi iniziali che rimarranno invariati durante l'esecuzioni; 
```

```c++ 
void loop () //unzione invocata ripetutamente, si interrompe solo quando si toglie l'alimentazione alla scheda; 
```

