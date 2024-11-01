# Rendszerterv
## 1. A rendszer célja

## 2. Projekt terv
A projekt fejlesztése HTML, CSS, JavaScript, Java Swing és MySQL adatbázis segítségével történik.
 •	Frontend: HTML és CSS biztosítja a felhasználói felületet, míg a Java Swing a desktop alkalmazás GUI-ját.
 •	Backend: Java és MySQL használatával valósul meg, ahol a Java program kezeli a backend logikát, a MySQL pedig a rendszer adatbázisának kezelését biztosítja.

A projekt főbb felelősei:
 •	Józsa Arnold Albin
 •	Kovács Enikő
 •	Mariotti Lili
 •	Zerényi Boglárka

### 2.1 Projektszerepkörök, felelőségek:
   * Scrum masters:
   * Product owner: 
   * Üzleti szereplő:
     
### 2.2 Projektmunkások és felelőségek:
   * Frontend:
   * Backend:
   * Tesztelés:
     
### 2.3 Ütemterv:

|Funkció                  | Feladat                                | Prioritás | Becslés (nap) | Aktuális becslés (nap) | Eltelt idő (nap) | Becsült idő (nap) |
|-------------------------|----------------------------------------|-----------|---------------|------------------------|------------------|---------------------|
|Követelmény specifikáció |Megírás                                 |         1 |             1 |                      1 |                1 |                   1 |             
|Funkcionális specifikáció|Megírás                                 |         1 |             1 |                      1 |                1 |                   1 |
|Rendszerterv             |Megírás                                 |         1 |             1 |                      1 |                1 |                   1 |
|Program                  |Képernyőtervek elkészítése              |         2 |             1 |                      1 |                1 |                   1 |
|Program                  |Prototípus elkészítése                  |         3 |             8 |                      8 |                8 |                   8 |
|Program                  |Alapfunkciók elkészítése                |         3 |             8 |                      8 |                8 |                   8 |
|Program                  |Tesztelés                               |         4 |             2 |                      2 |                2 |                   2 |

### 2.4 Mérföldkövek:
   * Prototípus átadása

## 3. Üzleti folyamatok modellje

### 3.1 Üzleti szereplők
A rendszer fő szereplői az adminisztrátor és az alkalmazottak. Az adminisztrátor feladata az alkalmazottak hozzáférésének szabályozása és az üzleti folyamatok irányítása, míg az alkalmazottak a napi rendelés- és készletkezelést végzik.
### 3.2 Üzleti folyamatok
-Rendelés kezelése: Az alkalmazottak rögzítik az új rendeléseket a rendszerben, biztosítva a pontos nyilvántartást és a gyors feldolgozást.

-Készletkezelés: A készlet szintjét folyamatosan figyelik, és alacsony készlet esetén rendeléseket indítanak a hiányzó alapanyagok pótlására, ezáltal elkerülve a készlethiányokat.

-Értékesítési jelentés: Az adminisztrátor rendszeresen jelentéseket készít a rendszerből, amelyek támogatják a vállalkozás teljesítményének elemzését és segítik az üzleti döntések meghozatalát.

## 4. Követelmények
Webes és desktop környezetre is kifejlesztett megoldás.
A rendszer fejlesztése HTML, CSS, JavaScript, Java és MySQL segítségével
történik.
A rendszer rendelkezik egy átlátható grafikus felhasználói felülettel és támogatja a
felhasználói szerepköröket.
Megszakításmentes működés és folyamatos adatkapcsolat az adatbázissal.

### Funkcionális követelmények

| ID | Megnevezés | Leírás |
| --- | --- | --- |
| K1 | ... | ... |

### Nemfunkcionális követelmények

| ID | Megnevezés | Leírás |
| --- | --- | --- |
| K4 | ... | ... |

### Támogatott eszközök

## 5. Funkcionális terv

### 5.1 Rendszerszereplők

### 5.2 Menühierarchiák

## 6. Fizikai környezet
A rendszer fejlesztése HTML, CSS, JavaScript, Java Swing és MySQL technológiákkal történik, biztosítva a böngésző- és platformfüggetlen működést.

 •	Felépítés és dizájn: A weboldal struktúráját HTML és CSS kombinációja alkotja, 
   míg a desktop alkalmazásban a Java Swing biztosítja a felhasználói élményt.
 •	Platformfüggetlen elérhetőség: A rendszer platformfüggetlen, 
   így különböző eszközökön futtatható, például Windows, macOS, Linux környezetben.

### Vásárolt softwarekomponensek és külső rendszerek

### Hardver topológia

### Fizikai alrendszerek

### Fejlesztő eszközök


## 8. Architekturális terv
A rendszerhez szükséges egy webböngésző vagy egy asztali környezet, amely támogatja a
Java Swing futtatását. A Java és MySQL biztosítja a kliens és az adatbázis közötti
kommunikációt, így az adatokat közvetlenül a háttérrendszerbe továbbítja.

### Webszerver nem szükséges hozzá.

### Adatbázis rendszert a mySQL biztosítja.

## 9. Adatbázis terv
Szükség van egy adatbázisra ami tárolja a felhasználónevet,aktuális dátumot,egy azonosítókat.

## 10. Implementációs terv

## 11. Tesztterv

A tesztelések célja a rendszer és komponensei funkcionalitásának teljes vizsgálata,
ellenőrzése a rendszer által megvalósított üzleti szolgáltatások verifikálása.
A teszteléseket a fejlesztői csapat minden tagja elvégzi.
Egy teszt eredményeit a tagok dokumentálják külön fájlokba.

### Tesztesetek

 | Teszteset | Elvárt eredmény | 
 |-----------|-----------------| 
 | ... | ... |

### A tesztelési jegyzőkönyv kitöltésére egy sablon:

**Tesztelő:** Vezetéknév Keresztnév

**Tesztelés dátuma:** Év.Hónap.Nap

Tesztszám | Rövid leírás | Várt eredmény | Eredmény | Megjegyzés
----------|--------------|---------------|----------|-----------
például. Teszt #01 | Regisztráció | A felhasználó az adatok megadásával sikeresen regisztrálni tud  | A felhasználó sikeresen regisztrált | Nem találtam problémát.
... | ... | ... | ... | ...

## 12. Telepítési terv
A rendszer futtatásához telepíteni kell a Java környezetet, valamint szükséges egy megfelelő
adatbázis-kapcsolat a MySQL kiszolgálóhoz.

## 13. Karbantartási terv

Fontos ellenőrizni:
...

Figyelembe kell venni a felhasználó által jött visszajelzést is a programmal kapcsolatban.
Ha hibát talált, mielőbb orvosolni kell, lehet az:
*	Működéssel kapcsolatos
*	Kinézet, dizájnnal kapcsolatos
