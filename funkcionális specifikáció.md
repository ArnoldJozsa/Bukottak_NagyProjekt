# Funkcionális specifikáció
## 1. Áttekintés
A Cafe Shop Management System egy olyan asztali alkalmazás, amely lehetővé teszi
kávézók és éttermek számára az értékesítési folyamatok egyszerűsítését, a rendelés
kezelését és a számlázást. Az alkalmazás célja, hogy a kávézók mindennapi adminisztratív
feladatait gyorsan és hatékonyan végezze el, felhasználóbarát felületen, könnyű
kezelhetőséggel. A rendszer a Java Swing könyvtárra épül, amely grafikus felhasználói
felületet biztosít, és lehetővé teszi az egyszerű adathozzáférést, az adminisztrációs
feladatokat és a kávézó teljes körű működésének támogatását.

## 2. Jelenlegi helyzet leírása
A legtöbb kávézó és kis vendéglátóhely gyakran manuálisan, papíralapú nyilvántartásokon vagy egyszerű digitális eszközökön végzi a rendelésfelvételt és számlázást, amely időigényes és pontatlan lehet. A megrendelő egy könnyen kezelhető, minden alapvető funkciót biztosító asztali alkalmazást igényel, amely a rendelési folyamatokat és a fizetések adminisztrálását támogatja.

## 3. Jelenlegi üzleti folyamatok modellje

## 4. Igényelt üzleti folyamatok modellje
A Cafe Shop Management System az alábbi alapelveket követi:

 - Egyszerű használat: Az alkalmazás grafikus felhasználói felülete egyszerű
      kezelhetőséget biztosít a rendelésfelvétel, számlázás és adminisztráció során.
 - Gyors működés: Az alkalmazás lehetővé teszi, hogy a rendeléseket gyorsan
      rögzítsék és feldolgozzák, csökkentve a várakozási időt.
 - Pontosság és adatvédelem: A rendelési adatok biztonságosan tárolódnak, és a
      számlázás automatikusan történik, minimalizálva az emberi hibák lehetőségét.
 - Skálázhatóság: A rendszer új tételekkel és funkciókkal bővíthető, igény szerint
      alkalmazkodva a különféle vendéglátóhelyek igényeihez.

## 5. Követelménylista
A Cafe Shop Management System az alábbi alapelveket követi:
Egyszerű használat: Az alkalmazás grafikus felhasználói felülete egyszerű
kezelhetőséget biztosít a rendelésfelvétel, számlázás és adminisztráció során.
Gyors működés: Az alkalmazás lehetővé teszi, hogy a rendeléseket gyorsan
rögzítsék és feldolgozzák, csökkentve a várakozási időt.
Pontosság és adatvédelem: A rendelési adatok biztonságosan tárolódnak, és a
számlázás automatikusan történik, minimalizálva az emberi hibák lehetőségét.

Skálázhatóság: A rendszer új tételekkel és funkciókkal bővíthető, igény szerint
alkalmazkodva a különféle vendéglátóhelyek igényeihez.

## 6. Használati esetek
1.	Rendelés hozzáadása: A felhasználó hozzáadhat új rendelést az alkalmazáson belül a termék kiválasztásával, darabszám megadásával, majd a rendelés rögzítésével.
   
2.	Számla készítése és nyomtatása: Miután a rendelés véglegesítésre került, a rendszer kiszámítja a végösszeget, és lehetőséget biztosít a számla nyomtatására.
   
3.	Termékek és árak módosítása: Az alkalmazás lehetőséget biztosít a felhasználó számára, hogy új termékeket adjon hozzá vagy módosítsa a meglévő termékek árát.

4. Napi összegzés: Az alkalmazás összegzi az aznapi rendeléseket és bevételeket, amely segíti az adminisztratív munkát.

## 7. Megfeleltetés, hogyan fedik le a használati eseteket a követelményeket
Rendelés kezelése: A rendszer gyors és intuitív rendeléskezelést biztosít, lehetővé
téve az új rendelés rögzítését, módosítását és törlését.
2. Számlázási funkciók: Az alkalmazás automatikusan kiszámítja a rendelés teljes
   összegét, és nyomtatási funkcióval ellátott számlázási modult biztosít.
3. Termékek kezelése: A felhasználó hozzáadhat vagy módosíthat termékeket, árakat,
   így biztosítva a kínálat és árak frissítését.
4. Napi adminisztráció: A rendszer automatikusan összegzi a napi rendeléseket és
   bevételt, ezzel segítve az üzleti folyamatok nyomon követését.
## 8. Képernyőtervek

![képnév](gitlink ahol a kép van)

## 9. Forgatókönyvek

## 10. Funkció - követelmény megfeleltetése

Az alkalmazás biztosítja az összes alapvető követelményt:
•	Rendelés és termékek kezelése: A termékek könnyű kezelése, hozzáadásuk és módosításuk.
•	Számlázás és nyomtatás: A rendszer automatikusan kiszámítja a végösszeget, és lehetővé teszi a nyomtatást.
•	Adminisztráció és összegzés: Az alkalmazás napi szinten összegzi a rendeléseket, és nyomon követi a bevételeket

| Id | Követelmény | Funkció |
| :---: | --- | --- |
| K4 | ... | ... |

## 11 Fogalomszótár
Szereplők: Felhasználó (kávézó személyzete) és a Cafe Shop Management System
alkalmazás.
1. A felhasználó megnyitja az alkalmazást, és új rendelést kezd.
2. A rendelés részletező oldalon kiválasztja a rendelni kívánt termékeket, megadja a
   darabszámot, és véglegesíti a rendelést.
3. Az alkalmazás automatikusan kiszámítja a végösszeget, amely megjelenik a
   számlaképernyőn.

4. A felhasználó kinyomtatja a számlát, és lezárja a rendelést.
5. Az alkalmazás nap végén összegzi a rendeléseket és bevételeket, amelyet az
   adminisztrációs felületén jelenít meg.
