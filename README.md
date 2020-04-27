# Lab10java

Protocolul este de tip TCP.

GameServer:
serverSocket asculta ceririle de conexiune ale clientilor.Metoda accept lasa
serverSocket sa faca o conexiune, creand un Socket care corespunde cu conexiunea
particulara pe care a acceptat-o. Dupa ce socket-ul este creat apelam ClientThread
pentru a comunica cu respectivul client.

ClientThread: Primeste ca parametru un socket, apoi creem un BufferedReader
care citeste din acel socket. Intr-un loop primim mesajul(mesajele), iar un
obiect PrintWriter este creat pentru a da clientului un raspuns.
Thread-ul primeste mesajele si ii trimite clientului mesajele corespunzatoare,
in functie de ce a trimis. Daca primeste mesajul stop socket-ul este inchis ce duce
la intreruperea conexiunii.

GameClient: Creeaza un socket cu adresa si PORT-ul serverului,apoi clientului
ii sunt acordate cateva proprietati: prin PrintWriter emite mesaje catre
server iar BufferedReader receptioneaza mesajele serverului. Clientul trimite
request-uri pana cand primeste ca raspuns "exit", caz in care instanta este
terminata.
