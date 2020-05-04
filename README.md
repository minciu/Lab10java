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
la intreruperea conexiunii.Totusichiar daca Thread-ul este "omorat" alti clienti se pot
conecta la servar atata vreme cat au adresa si PORT-ul potrivite.

GameClient: Creeaza un socket cu adresa si PORT-ul serverului,apoi clientului
ii sunt acordate cateva proprietati: prin PrintWriter emite mesaje catre
server iar BufferedReader receptioneaza mesajele serverului. Clientul trimite
request-uri pana cand primeste ca raspuns "exit", caz in care instanta este
terminata.

OPTIONAL- primele 3 puncte:

Proiectul ar trebui rulat in felul urmator:
1 Se ruleaza o instanta de server si cel putin 2 de clienti.

2 Pentru a incepe jocul trebuie sa introducem cateva comenzi exacte. Daca nu
introducem o comanda valabila vom primi un mesaj care ne atentioneaza faptul
ca am introdus o comanda invalida si ne recomanda sa introducem comanda
'show' pentru a vizualiza comenzile posibile.

3(Opt) Putem da clientilor nume cu ajutorul comenzii set-name.
Exemplu: 'set-name Alin'.
Numele default al clientului este null.

4 Un client trebuie sa introduca comanda 'create-game' si sa astepte pana cand
va fi provocat. Un alt client se poate alatura cu 'join-game x', unde x este
numarul/id-ul jocului. Pentru primul joc se va tasta 'join-game 0'.

5 Acum a inceput jocul de Five in a row, creatorul jocului avand ca bila alba
un x iar pretendentul un 0.O mutare va fi facuta folosind comanda 'submit-move'
,care va fi scrisa automat alaturi de coordonatele sale.La fiecare mutare va
fi creata o matrice specifica cu toate mutarile facute pana in acel moment.
Odata folosita o coordonata nu mai poate fi folosita.
Exemplu submit-move 1 3.

6 Jocul se va incheia cand unul dintre competitori
va obtine un lant de 5 'bile' de aceasi culoare in matrice.
