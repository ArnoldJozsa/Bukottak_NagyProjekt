Tesztjegyzőkönyv
Teszteléseket végezte: Józsa Arnold

Operációs rendszer: Win11

Alfa teszt
Vizsgálat	Tesztelés időpontja	Elvárás	Eredmény	Hibák
Program futása	2024.11.01.	Zökkenőmentes működés	Nem megfelelő	Program nem indul el, hibák a funkciók futtatásakor
Az Alfa tesztelés során a vizsgált elemek között több hiba is előfordult. A program futása nem volt megfelelő volt, bizonyos funkciók nem megfelelően működtek. Ezek a hibák további javítást igényelnek a következő tesztelési fázis előtt.

Béta teszt
Vizsgálat	Tesztelés időpontja	Elvárás	Eredmény	Hibák
Program futása	2024.11.15.	Zökkenőmentes működés	Megfelelő	-
Alfa teszt során felmerülő hiba megoldása, package szerkezet ujra tervezése.
A Béta teszt sikeresen zajlott. Az előző fázisban azonosított hibák kijavításra kerültek, és a program immár megfelelően működik. Nem tapasztaltunk további problémákat.


Végleges teszt
Vizsgálat	Tesztelés időpontja	Elvárás	Eredmény	Hibák
Program futása	2022.10.10.	Zökkenőmentes működés	Megfelelő	-
A Végleges teszt lezajlott, Az adatbázis csatlakozás sikertelen. Esztétikailag is megfelelő a program.


## Alfa teszt

| Vizsgálat | Tesztelés időpontja | Elvárás | Eredmény | Hibák |
| :-: | --- | --- | --- | --- |
| Customers oldal | 2024.11.30 | Megjelenítés megfelelő legyen | Nem jelenik meg helyesen | CSS és adatbetöltési hiba |
| Dashboard oldal | 2024.12.02. | Megjelenik meg az összes adat | Nem jelenik meg az összes adat | Hiányos adatbetöltés |


Az Alfa tesztelés során a vizsgált elemek között volt ami nem megfelelően működött, ez a későbbiek során javításra szorul.
A legtöbb funkció nem működött megfelelően, kritikus hibák kerültek azonosításra.
Prioritásként kezeljük a hibák javítását, mielőtt a Béta teszt elkezdődne.

Következő tesztelésnél a többi funkció kerül vizsgálatra illetve elemzésre.
## Béta teszt

| Vizsgálat | Tesztelés időpontja | Elvárás | Eredmény | Hibák |
| :-: | --- | --- | --- | --- |
| Customers oldal | 2024.11.30 | Megjelenítés megfelelő legyen | Megfelelő megjelenítés | Nincs hiba |
| Dashboard oldal | 2024.12.02. | Megjelenik meg az összes adat | Megjelenik meg az összes adat | Nincs hiba |

A Béta teszt sikeresen zajlott.
A Béta teszt során akadtan hibák, mely(ek) javításra szorulnak.

A végleges tesztelés során az összes fent felsorolt vizsgálati elem újra ellenőrzésre kerül. Ezzel együtt az új funkciók is tesztelésre kerültek.

## Végleges teszt
| Vizsgálat | Tesztelés időpontja | Elvárás | Eredmény | Hibák |
| :-: | --- | --- | --- | --- |
| Customers oldal | 2024.11.30 | Megjelenítés megfelelő legyen | Megfelelő megjelenítés | Nincs hiba |
| Dashboard oldal | 2024.12.02. | Megjelenik meg az összes adat | Megjelenik meg az összes adat | Nincs hiba |

A Végleges teszt lezajlott és minden funkció rendesen működik, esztétikailag is megfelelő a program.
Átadásra készen áll a megrendelőnek.
Tesztelést végezte és írta: Józsa Arnold
Befejezve: 2024.12.04.

Adatbázis csatlakozási probléma megoldása folyamatban van.

Átadásra készen áll a megrendelőnek.

Tesztelést végezte és írta: Józsa Arnold

Befejezve: 2024.12.01.
