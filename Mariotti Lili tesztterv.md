# Tesztjegyzőkönyv

Teszteléseket végezte: Mariotti Lili

Operációs rendszer: Windows 10

Ebben a dokumentumban lesz felsorolva az elvégzett tesztek elvárásai és eredményei, illetve időpontjai (Alfa, Béta és Végleges verzió).

## Alfa teszt

| Vizsgálat | Tesztelés időpontja | Elvárás | Eredmény | Hibák |
| :---: | --- | --- | --- | --- |
| Import kép | 2024.11.24. | Kép importálása sikeresen működjön. | Kép importálása sikertelen. | Nem támogatott fájlformátum. |
| Menü oldal (Pay gomb) | 2024.11.26. | Fizetés gomb hibátlanul működjön. | A pay gomb nem működik. | Hibás backend művelet. |
| Menü oldal (Remove gomb) | 2024.11.28. | Elemek törlése sikeresen történjen. | Az elemek törlése nem működik. | Törlési művelet hibát jelez. |

A legtöbb funkció nem működött megfelelően, kritikus hibák kerültek azonosításra. Prioritásként kezeljük a hibák javítását, mielőtt a Béta teszt elkezdődne.

Következő tesztelésnél a többi funkció kerül vizsgálatra illetve elemzésre.
## Béta teszt

| Vizsgálat | Tesztelés időpontja | Elvárás | Eredmény | Hibák |
| :---: | --- | --- | --- | --- |
| Import kép | 2024.11.25. | Kép importálása sikeresen működjön. | A képek importálása még nem működik. | Nem jeleníti meg a képet. |
| Menü oldal (Pay gomb) | 2024.11.27. | Fizetés gomb hibátlanul működjön. | A pay gomb mostmár működik. | Nincs hiba. |
| Menü oldal (Remove gomb) | 2024.11.29. | Elemek törlése sikeresen történjen. | Az elemek törlése mostmár működik. | Nincs hiba. |

A Béta teszt sikeresen zajlott.
A Béta teszt során is akadtak még hibák, egy elem szorul javításra.
A Béta teszt sikeresen lezárult, és a tesztelt funkciók majdnem teljes mértékben működnek.

A végleges tesztelés során az összes fent felsorolt vizsgálati elem újra ellenőrzésre kerül.
## Végleges teszt
| Vizsgálat | Tesztelés időpontja | Elvárás | Eredmény | Hibák |
| :---: | --- | --- | --- | --- |
| Import kép | 2024.11.26. | Kép importálása sikeresen működjön. | Kép importálása sikeresen végrehajtódott. | Nincs hiba. |
| Menü oldal (Pay gomb) | 2024.11.28. | Fizetés gomb hibátlanul működjön. | A fizetés gomb működik. | Nincs hiba. |
| Menü oldal (Remove gomb) | 2024.11.30. | Elemek törlése sikeresen történjen. | Elemek törlése sikeres. | Nincs hiba. |

A Végleges teszt lezajlott és minden funkció rendesen működik, esztétikailag is megfelelő a program.

Átadásra készen áll a megrendelőnek.

Tesztelést végezte és írta: Mariotti Lili

Befejezve: 2024.12.04.
