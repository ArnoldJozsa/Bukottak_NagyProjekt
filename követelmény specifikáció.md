# Követelmény specifikáció

## 1. Áttekintés
A projekt célja egy ingyenesen elérhető, könnyen használható asztali alkalmazás fejlesztése, amely támogatja a kávézók személyzetét a rendeléskezelés, számlázás és adminisztratív teendők hatékonyabb ellátásában. Az alkalmazás Java Swing keretrendszerre épül, amely biztosítja az egyszerű, átlátható felhasználói felületet és a gördülékeny működést. A szoftver célja a kávézók napi működésének felgyorsítása és leegyszerűsítése, különös figyelmet fordítva a könnyű használatra és az átláthatóságra.

## 2. A jelenlegi helyzet leírása
Számos kávézó még mindig manuálisan, papíralapú nyilvántartásokkal vagy egyszerű táblázatokkal kezeli a rendeléseket és számlázást. Ezek a módszerek időigényesek, gyakran hibalehetőségekkel járnak, és nem támogatják a gyorsan növekvő igényeket. Ez a projekt célja, hogy egy modern, könnyen használható, asztali megoldást biztosítson, amely gyors rendeléskezelést, automatizált számlázást és egyszerű adminisztrációt kínál.

## 3. Vágyálomrendszer
A projekt célja egy olyan egyszerű, letisztult felületű, Java Swing alapú kávézó-kezelő
alkalmazás létrehozása, amely gyorsan, hatékonyan támogatja a rendelésfelvételt, a

számlázást és a termékek árazását. Az alkalmazás segítségével a személyzet gyorsan
rögzítheti a rendeléseket, kezelheti a számlázást és adminisztrációs feladatokat, akár
minimális számítógépes ismeretekkel is. A rendszer célja az is, hogy egyszerűen kezelhető
legyen a termékek hozzáadása és árazása, valamint hogy egy egyszerű, de átfogó napi
összesítést biztosítson az értékesítésekről és bevételekről.

## 4. Funkcionális követelmények
Az alkalmazás egy egyszerű asztali környezetben fut, amely Java alapú, és a következő fő funkciókkal rendelkezik:
Rendelések felvétele és módosítása: Lehetőséget biztosít új rendelés rögzítésére, a meglévő rendelés módosítására, valamint a termékek kiválasztására és darabszám megadására.
Számlázási funkció: Automatikusan kiszámítja a rendelés teljes összegét, és lehetőséget biztosít a számla nyomtatására.
Termékek kezelése: A termékek árát és elérhetőségét a személyzet egyszerűen frissítheti vagy módosíthatja az adminisztrációs felületen.
Napi összesítés: Összegzi a napi eladásokat és bevételeket, amely támogatja az adminisztratív folyamatokat és nyomon követi a napi teljesítményt.


## 5. Jelenlegi üzleti folyamatok modellje
A jelenlegi üzleti folyamatok többnyire manuálisak, papíralapú rendelésfelvétellel, amely időigényes és hajlamos a hibákra. A kávézók nagy része nehezen követi nyomon a napi bevételeket, és nincs megfelelő rendszer a termékek árainak gyors módosítására vagy a rendelési adatok összegzésére.

## 6. Rendszerre vonatkozó törvények, szabványok, ajánlások
 - Általános adatvédelmi szabályok: A rendszer nem tárol érzékeny adatokat, ezért nem esik szigorú adatvédelmi szabályozás alá.
 - Számlázási szabványok: A rendszer egyszerű, papíralapú számlát nyomtat, amely megfelel az alapvető kereskedelmi szabványoknak.
 - Felhasználói hozzáférés: A rendszer biztosítja a felhasználók számára a napi bevételek összegzését, de nem gyűjt személyes adatokat, így teljes mértékben           adatvédelmi szempontból biztonságos.

## 7. Igényelt üzleti folyamatok modellje
Az alkalmazásnak egyszerűen kezelhetőnek kell lennie, és lehetőséget kell biztosítania a
személyzet számára a rendelések, termékek és árak könnyű kezelésére, anélkül, hogy
ehhez külön számítógépes képzésre lenne szükség. A rendszer egyszerű rendeléskezelést,
gyors számlázást, valamint termékárak és mennyiségek frissítését biztosítja. A napi
összesítési funkció segítségével a személyzet könnyen nyomon követheti a bevételeket és a
napi teljesítményt.
## 8. Követelménylista

| Id | Modul | Név | Leírás |
| :---: | --- | --- | --- |
| K1 | ... | ... | ... |

## 9. Fogalomtár
•	Rendelés: Az ügyfél által kiválasztott termékek egy tranzakcióhoz kapcsolódó listája.
•	Számla: A rendelés végösszegét tartalmazó dokumentum, amely az ügyfél számára átadható.
•	Adminisztráció: A termékek és árak kezelése, valamint a bevételek nyomon követése.
