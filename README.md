## Inleiding
Welkom bij de eerste huiswerkopdracht die jullie gaan maken voor de Backend leerlijn. Je hebt als het goed is de eerste hoofdstukken gelezen en de eerste les van de cursus Java gevolgd. In deze opdracht ga je oefenen met wat je tot nu geleerd hebt over beslissingsstructuren en methodes.

## Opzetten van een nieuw Java project

1. Open IntelliJ op je computer.

2. Kies rechts bovenin voor _New project_.

3. Op het volgende scherm zie je linksboven dat _Java_ blauw geselecteerd is. Daar klik je op _Next_.

4. Op het volgende scherm hoeven we niks te selecteren en kunnen we gewoon op _Next_ klikken.

5. Op het volgende scherm kunnen we een naam meegeven aan het project. Kies altijd een beschrijvende naam die iets zegt over je project zodat je ook weet wat erin staat. Bijvoorbeeld "javaOpdracht1".

6. Klik daarna op 'Finish'. Gefeliciteerd! Je hebt zojuist je eerste project aangemaakt.

## Opdrachtbeschrijving

Maak in het nieuwe Java project dat je hebt gemaakt een main klasse en een `public static void` main methode. Maak daarnaast ook de volgende methodes:
- `hello()`
- `positiveOrNegative(int number)`
- `postiveOrZeroOrNegativ(int number)`
- `bartender(String name)`
- `sum(int input1, int input2)`

Maak de volgende variabelen aan in de main methode:
- `int number`
- `int input1`
- `int input2`
- `String name`

Het gedrag van de methoden is als volgt:
- De `hello`-methode print de regel "Hello, world!";
- De `positiveOrNegative`-methode print aan de hand van een _if else_ statement "This number is positive!" of "This number is negative!";
- De `positiveOrZeroOrNegative`-methode print aan de hand van een _if else if else_ statement "This number is positive!", "This number is zero!" of "This number is - negative!";
- De `bartender`-methode print aan de hand van een _switch_ statement, het drankje dat deze persoon graag drinkt;
- De `sum`-methode print de uitkomst van de twee nummers die bij elkaar zijn opgeteld.

De waarde van `number` is 6.
De waarde van `input1` is 4.
De waarde van `input2` is 20.
De waarde van `name` is Henk.

Roep alle methodes aan vanuit de main methode, verander de waardes en kijk wat eruit komt als je de waardes aanpast en opnieuw draait.

![Drinks](./assets/drankjes.jpg)


## Randvoorwaarden
De opdracht moet voldoen aan de volgende voorwaarden:

- minimaal 4 _variabelen_
- minimaal 5 _methodes_
- 1 _if/else_ statement
- 1 _if/else if/else_ statement
- 1 _switch_ statement


## Stappenplan
Let op: het is uitdagender om jouw eigen stappenplan te maken. Als je niet zo goed weet waar je moet beginnen, kun je onderstaand stappenplan gebruiken.

1. Maak een nieuw project aan in IntelliJ.

2. Maak een nieuwe klasse aan genaamd  `Main`. Doe dit door met de rechter muisknop op de map `SRC` te klikken, vervolgens klik je op `New` en dan op `Java class`.

3. Maak een `public static void main` methode aan.

4. Maak in de `public static void main` methode de variabelen aan die hierboven genoemd zijn met de juiste waarden.

5. Maak na de `}` van de `public static void main` methode een nieuwe public static void methode met de naam `hello`. Laat deze methode een regel printen door `System.out.println` te gebruiken. Kijk hierboven voor de juiste tekst. Deze methode krijgt geen _variabelen_ mee gestuurd.

6. Roep de `hello` methode aan in de `public static void main` methode. Laat nu de applicatie draaien door op de play-knop in de goot van IntelliJ te drukken.

7. Maak een `public static void` mehode aan met de naam `positiveOrNegative` en geef deze de juiste _parameters_ mee. Zet in deze methode een _if else_ statement. De voorwaarde van de _if_ is `(number > 0)`. Bij de _if_ moet de methode de tekst: "This number is positive!" printen. Bij de _else_ mag de tekst: "This number is negative!".

8. Roep deze methode aan in de `public static void main` methode en geef het juiste _argument_ mee. Laat de applicatie weer draaien door op de play-knop te drukken.

9. Verander de waarde van `number` naar -6 en draai de applicatie opnieuw. Wat is er nu veranderd? En wat als `number` de waarde 0 heeft? Klopt dit?

10. Maak een nieuwe `public static void` methode aan genaamd `positiveOrZeroOrNegative` en geef deze de juiste _attributen_ mee. Plaats in deze methode een _if else if else_ statement. Deze lijkt veel op de _if else_ statement van de `positiveOrNegative` methode, echter staat er tussen de _if_ en de _else_ nog een _else if_ met de volgende voorwaarde: `(number == 0) {System.out.println("This number is zero!}`.

11. Roep ook deze methode aan vanuit de `public static void main` methode en geef ook hier de juiste _argument_ aan mee.

12. Maak een nieuwe `public static void` methode genaamd `bartender` en geef deze de juiste _parameter_ mee. Gebruik in deze methode de _switch_ methode om aan de hand van de `string name` het drankje van verschillende personen te printen.

13. Roep ook deze methode aan vanuit de `public static void main` methode en speel met verschillende namen die je in de _ switch_ cases hebt gezet.

14. Maak nog een `public static void` methode aan genaamd `sum` en geef deze de juiste _parameters_ mee. Laat deze methode de volgende tekst printen: "input1 summed by input2 = 24".

15. Roep deze methode ook aan in de `public static void main` methode en speel met verschillende waardes.

## Bonus

Is het je gelukt om deze opdracht te maken en wil je nog meer oefenen?
In de "Bonus" map op deze repository staan 2 sets met opdrachten, 1 met if/else/switch opdrachten en 1 met for/while opdrachten.
Deze opdrachten mag je proberen te maken ter oefening.
Je kunt zelf natuurlijk ook scenario's bedenken zoals in deze opdrachtjes staan beschreven en daar een oplossing voor proberen te programmeren.

Lukt het nog niet helemaal om deze bonusopdrachten te maken? Laat ze dan nog  even liggen en kom er later op terug.
