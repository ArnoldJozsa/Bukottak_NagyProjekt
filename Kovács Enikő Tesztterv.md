# Tesztjegyzőkönyv

Teszteléseket végezte: Kovács Enikő
Operációs rendszer: Windows 11

Ebben a dokumentumban lesz felsorolva az elvégzett tesztek elvárásai és eredményei, illetve időpontjai (Alfa, Béta és Végleges verzió).

## Alfa teszt

| Vizsgálat | Tesztelés időpontja | Elvárás | Eredmény | Hibák |
| :-: | --- | --- | --- | --- |
| Regisztráció | 2024.11.06. | A felhasználó sikeresen regisztráljon. | Nem sikerült regisztrálni. | Hibaüzenet jelenik meg mentésnél. |
| :-: | --- | --- | --- | --- |
| Bejelentkezés.(login) | 2024.11.08. |Bejelentkezés sikeresen működjön. | Bejelentkezés sikertelen. | Érvényes adatokkal
sem működik. |
| :-: | --- | --- | --- | --- |
| Elfelejtett jelszó | 2024.11.10. | Új jelszó beállítható, biztonsági kérdéssel. | Nem lehet beállítani új jelszót. | Adatbázis hiba. |
| :-: | --- | --- | --- | --- |
| Oldalsó gombok működése | 2024.11.12. | Dashboard, Inventory,Menu, Customers működjenek. | Gombok nem reagálnak kattintásra. | Hibás gomb-hozzárendelések. |

Az Alfa tesztelés során a vizsgált elemek között volt ami nem megfelelően működött, ez a későbbiek során javításra szorul.
A legtöbb funkció nem működött megfelelően, kritikus hibák kerültek azonosításra.
Prioritásként kezeljük a hibák javítását, mielőtt a Béta teszt elkezdődne.

Következő tesztelésnél a többi funkció kerül vizsgálatra illetve elemzésre.
## Béta teszt

| Vizsgálat | Tesztelés időpontja | Elvárás | Eredmény | Hibák |
| :---: | --- | --- | --- | --- |
| Regisztráció | 2024.11.07. | A felhasználó sikeresen regisztráljon. | A regisztráció sikeresen működik. | Nincs hiba. |
| :-: | --- | --- | --- | --- |
| Bejelentkezés.(login) | 2024.11.09. |Bejelentkezés sikeresen működjön. | A bejelentkezés sikeresen működik. | Nincs hiba. |
| :-: | --- | --- | --- | --- |
| Elfelejtett jelszó | 2024.11.11. | Új jelszó beállítható, biztonsági kérdéssel. | A biztonsági kérdéses új jelszó beállítása sikertelen. | Adatbázis hiba. |
| :-: | --- | --- | --- | --- |
| Oldalsó gombok működése | 2024.11.13. | Dashboard, Inventory,Menu, Customers működjenek. | Gombok nem reagálnak kattintásra. | Gomb hiba. |

A Béta teszt sikeresen zajlott.
A Béta teszt során akadtan hibák, mely(ek) javításra szorulnak.

A végleges tesztelés során az összes fent felsorolt vizsgálati elem újra ellenőrzésre kerül. Ezzel együtt az új funkciók is tesztelésre kerültek.

## Végleges teszt
| Vizsgálat | Tesztelés időpontja | Elvárás | Eredmény | Hibák |
| :---: | --- | --- | --- | --- |
| Regisztráció | 2024.11.08. | A felhasználó sikeresen regisztráljon. | Minden funkció megfelelően működik. | Nincs hiba. |
| :-: | --- | --- | --- | --- |
| Bejelentkezés.(login) | 2024.11.10. |Bejelentkezés sikeresen működjön. | A bejelentkezés sikeres. | Nincs hiba. |
| :-: | --- | --- | --- | --- |
| Elfelejtett jelszó | 2024.11.12. | Új jelszó beállítható, biztonsági kérdéssel. | Az új jelszó sikeresen beállítható. | Nincs hiba. |
| :-: | --- | --- | --- | --- |
| Oldalsó gombok működése | 2024.11.14. | Dashboard, Inventory,Menu, Customers működjenek. | Minden gomb reagál. | Nincs hiba. |

A Végleges teszt lezajlott és minden funkció rendesen működik, esztétikailag is megfelelő a program.
Átadásra készen áll a megrendelőnek.
Tesztelést végezte és írta: Vezetéknév Keresztnév
Befejezve: 2024.12.04.
