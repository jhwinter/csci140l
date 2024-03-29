import java.util.Scanner; // import scanner

/**
 * Create a program that uses an array of cars and allows a user to search the
 * array for an element.
 * 
 * In your main method declare and initialize the array, prompt the user for a
 * search string, call the search method, then print out the results of the
 * search. If the term was found then return the element that contained the
 * search string. If the term wasn't found then print a message stating that it
 * wasn't found.
 * 
 * In the search method you should take 2 parameters (an array to be searched
 * and a search term). The method should return null or the element from the
 * array if the search term was found. Write your search method to where it
 * ignores case.
 * 
 * November 10, 2015
 * 
 * @author Jonathan Winters
 *
 */
public class Lab19 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // create a scanner

		System.out.print("Please enter a car to search for: "); // print
		// user input is set to all lowercase
		String modelSearch = in.nextLine().toLowerCase();
		// cars is a list of car models
		String[] cars = { "amc ambassador dpl", "amc gremlin", "amc hornet", "amc rebel sst", "buick estate wagon (sw)",
				"buick skylark 320", "chevrolet chevelle malibu", "chevrolet impala", "chevrolet monte carlo",
				"chevy c20", "dodge challenger se", "dodge d200", "ford f250", "ford galaxie 500", "ford maverick",
				"ford torino", "hi 1200d", "plymouth 'cuda 340", "plymouth duster", "plymouth fury iii",
				"plymouth satellite", "pontiac catalina", "audi 100 ls", "bmw 2002", "peugeot 504", "saab 99e",
				"volkswagen 1131 deluxe sedan", "datsun pl510", "toyota corona mark ii", "amc gremlin",
				"amc hornet sportabout (sw)", "amc matador", "chevrolet chevelle malibu", "chevrolet impala",
				"chevrolet vega (sw)", "chevrolet vega 2300", "dodge monaco (sw)", "ford country squire (sw)",
				"ford galaxie 500", "ford mustang", "ford torino 500", "mercury capri 2000", "plymouth cricket",
				"plymouth fury iii", "plymouth satellite custom", "pontiac catalina brougham", "pontiac firebird",
				"pontiac safari (sw)", "fiat 124b", "opel 1900", "peugeot 304", "volkswagen model 111", "datsun 1200",
				"datsun pl510", "toyota corolla 1200", "toyota corona", "amc ambassador sst", "amc matador (sw)",
				"buick lesabre custom", "chevrolet chevelle concours (sw)", "chevrolet impala", "chevrolet vega",
				"chrysler newport royal", "dodge colt (sw)", "dodge colt hardtop", "ford galaxie 500",
				"ford gran torino (sw)", "ford pinto (sw)", "ford pinto runabout", "mercury marquis",
				"oldsmobile delta 88 royale", "plymouth fury iii", "plymouth satellite custom (sw)", "pontiac catalina",
				"peugeot 504 (sw)", "renault 12 (sw)", "volkswagen 411 (sw)", "volkswagen type 3", "volvo 145e (sw)",
				"datsun 510 (sw)", "mazda rx2 coupe", "toyota corolla 1600 (sw)", "toyota corona hardtop",
				"toyouta corona mark ii (sw)", "amc ambassador brougham", "amc gremlin", "amc hornet", "amc matador",
				"buick century 350", "buick electra 225 custom", "chevrolet caprice classic", "chevrolet impala",
				"chevrolet malibu", "chevrolet monte carlo s", "chevrolet nova custom", "chevrolet vega",
				"chrysler new yorker brougham", "dodge coronet custom", "dodge dart custom", "ford country",
				"ford gran torino", "ford ltd", "ford maverick", "ford pinto", "mercury capri v6",
				"mercury marquis brougham", "oldsmobile omega", "oldsmobile vista cruiser", "plymouth custom suburb",
				"plymouth duster", "plymouth fury gran sedan", "plymouth valiant", "pontiac grand prix", "audi 100ls",
				"fiat 124 sport coupe", "fiat 128", "opel manta", "saab 99le", "volkswagen super beetle", "volvo 144ea",
				"datsun 610", "maxda rx3", "toyota carina", "toyota mark ii", "amc hornet", "amc matador",
				"amc matador (sw)", "buick century luxus (sw)", "chevrolet chevelle malibu classic", "chevrolet nova",
				"chevrolet vega", "dodge colt", "dodge coronet custom (sw)", "ford gran torino",
				"ford gran torino (sw)", "ford pinto", "plymouth duster", "plymouth satellite sebring", "audi fox",
				"fiat 124 tc", "fiat 128", "fiat x1.9", "opel manta", "volkswagen dasher", "datsun 710", "datsun b210",
				"honda civic", "subaru", "toyota corolla 1200", "toyota corona", "amc gremlin", "amc matador",
				"amc pacer", "buick century", "buick skyhawk", "chevroelt chevelle malibu", "chevrolet bel air",
				"chevrolet monza 2+2", "chevrolet nova", "ford ltd", "ford maverick", "ford mustang ii", "ford pinto",
				"ford pinto", "mercury monarch", "plymouth fury", "plymouth grand fury", "plymouth valiant custom",
				"pontiac astro", "pontiac catalina", "audi 100ls", "peugeot 504", "saab 99le", "volkswagen dasher",
				"volkswagen rabbit", "volvo 244dl", "datsun 710", "honda civic cvcc", "toyota corolla", "toyota corona",
				"amc hornet", "amc matador", "amc pacer d/l", "cadillac seville", "capri ii",
				"chevrolet chevelle malibu classic", "chevrolet chevette", "chevrolet nova", "chevrolet woody",
				"chevy c10", "dodge aspen se", "dodge colt", "dodge coronet brougham", "dodge d100", "ford f108",
				"ford gran torino", "ford granada ghia", "ford maverick", "ford pinto", "plymouth valiant",
				"plymouth volare premier v8", "pontiac ventura sj", "fiat 131", "mercedes-benz 280s", "opel 1900",
				"peugeot 504", "renault 12tl", "volkswagen rabbit", "volvo 245", "vw rabbit", "datsun b-210",
				"honda civic", "toyota corolla", "toyota mark ii", "buick opel isuzu deluxe", "buick skylark",
				"chevrolet caprice classic", "chevrolet chevette", "chevrolet concours", "chevrolet monte carlo landau",
				"chrysler cordoba", "dodge colt m/m", "dodge monaco brougham", "ford granada", "ford mustang ii 2+2",
				"ford thunderbird", "mercury cougar brougham", "oldsmobile cutlass supreme", "plymouth arrow gs",
				"plymouth volare custom", "pontiac grand prix lj", "pontiac sunbird coupe", "bmw 320i", "renault 5 gtl",
				"volkswagen dasher", "volkswagen rabbit custom", "datsun 810", "datsun f-10 hatchback",
				"honda accord cvcc", "mazda rx-4", "subaru dl", "toyota corolla liftback", "amc concord",
				"amc concord d/l", "buick century special", "buick regal sport coupe (turbo)", "chevrolet chevette",
				"chevrolet malibu", "chevrolet monte carlo landau", "dodge aspen", "dodge diplomat", "dodge magnum xe",
				"dodge omni", "ford fairmont (auto)", "ford fairmont (man)", "ford fiesta", "ford futura",
				"mercury monarch ghia", "mercury zephyr", "oldsmobile cutlass salon brougham", "oldsmobile starfire sx",
				"plymouth sapporo", "plymouth volare", "pontiac phoenix lj", "audi 5000", "peugeot 604sl", "saab 99gle",
				"volkswagen rabbit custom diesel", "volkswagen scirocco", "volvo 264gl", "datsun 200-sx", "datsun 510",
				"datsun b210 gx", "honda accord lx", "honda civic cvcc", "mazda glc deluxe",
				"toyota celica gt liftback", "toyota corona", "amc concord dl 6", "amc spirit dl",
				"buick estate wagon (sw)", "buick skylark limited", "cadillac eldorado", "chevrolet caprice classic",
				"chevrolet citation", "chevrolet malibu classic (sw)", "chrysler lebaron town @ country (sw)",
				"dodge aspen 6", "dodge colt hatchback custom", "dodge st. regis", "ford country squire (sw)",
				"ford fairmont 4", "ford ltd landau", "mercury grand marquis", "mercury zephyr 6",
				"oldsmobile cutlass salon brougham", "oldsmobile omega brougham", "plymouth horizon",
				"plymouth horizon tc3", "pontiac lemans v6", "pontiac phoenix", "fiat strada custom",
				"mercedes benz 300d", "peugeot 504", "vw rabbit custom", "datsun 210", "maxda glc deluxe",
				"amc concord", "chevrolet chevette", "chevrolet citation", "dodge aspen", "dodge colt", "ford fairmont",
				"audi 4000", "audi 5000s (diesel)", "mercedes-benz 240d", "triumph tr7 coupe", "vokswagen rabbit",
				"vw dasher (diesel)", "vw rabbit", "vw rabbit c (diesel)", "datsun 210", "datsun 280-zx", "datsun 310",
				"datsun 510 hatchback", "honda accord", "honda civic 1500 gl", "mazda 626", "mazda glc",
				"mazda rx-7 gs", "subaru dl", "toyota corolla", "toyota corolla tercel", "toyota corona liftback",
				"buick century", "buick skylark", "chevrolet citation", "chrysler lebaron salon",
				"dodge aries wagon (sw)", "ford escort 2h", "ford escort 4w", "ford granada gl",
				"oldsmobile cutlass ls", "plymouth champ", "plymouth horizon 4", "plymouth reliant", "plymouth reliant",
				"peugeot 505s turbo diesel", "volkswagen jetta", "volvo diesel", "datsun 200sx", "datsun 210 mpg",
				"datsun 810 maxima", "honda civic 1300", "honda prelude", "mazda 626", "mazda glc 4", "subaru",
				"toyota corolla", "toyota cressida", "toyota starlet", "toyota tercel", "buick century limited",
				"chevrolet camaro", "chevrolet cavalier", "chevrolet cavalier 2-door", "chevrolet cavalier wagon",
				"chevy s-10", "chrysler lebaron medallion", "dodge aries se", "dodge charger 2.2", "dodge rampage",
				"ford fairmont futura", "ford granada l", "ford mustang gl", "ford ranger", "mercury lynx l",
				"oldsmobile cutlass ciera (diesel)", "plymouth horizon miser", "pontiac j2000 se hatchback",
				"pontiac phoenix", "volkswagen rabbit l", "vw pickup", "datsun 310 gx", "honda accord", "honda civic",
				"honda civic (auto)", "mazda glc custom", "mazda glc custom l", "nissan stanza xe", "toyota celica gt",
				"toyota corolla" };

		in.close(); // close the scanner

		// set carFound = to whatever the search method returns
		String carFound = search(cars, modelSearch);
		// if carFound returns null, print that the model requested was not
		// found
		if (carFound == null) {
			System.out.println("'" + modelSearch + "'" + " wasn't found!");
		} else { // else print whatever the search method returns
			System.out.println(carFound);
		}

	}

	/**
	 * This method searches the string array cars to see if any of the strings
	 * are equal to the user input
	 * 
	 * @param cars
	 *            String array that holds all of the available cars
	 * @param modelSearch
	 *            user input
	 * @return returns either null or whatever cars[i] is
	 */
	public static String search(String[] cars, String modelSearch) {
		// i continues to increment until the model is found
		for (int i = 0; i < cars.length; i++) {
			// if the user input matches one of the cars listed in the cars
			// array, then return whatever cars[i] is
			if (cars[i].indexOf(modelSearch) != -1) {
				return cars[i];
			}
		}
		return null; // if the user input does not match any of the cars listed
						// in the cars array, then return null
	}
}
