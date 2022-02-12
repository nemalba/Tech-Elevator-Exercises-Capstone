package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		// ### EXAMPLE:
		int birdsOnABranch = 4;
		int birdsThatFlyAway = 1;
		int birdsRemaining = birdsOnABranch - birdsThatFlyAway;
		System.out.println();
		System.out.print("Exercise 1 Answer - ");
         System.out.println("Birds remaining: " + birdsRemaining);

        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;
		System.out.println();
		System.out.print("Exercise 2 Answer - ");
		System.out.printf("There %d more birds than nests.\n", numberOfExtraBirds);

        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int raccoonsPlaying = 3;
		int raccoonsEatDinner = 2;
		int raccoonsLeftInWoods = raccoonsPlaying - raccoonsEatDinner;
		System.out.println();
		System.out.print("Exercise 3 Answer - ");
		System.out.printf("%d raccoon left in the woods.\n", raccoonsLeftInWoods);


        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
			int numberOfFlowers = 5;
			int numberOfBees = 3;
			int flowersLessBees = numberOfFlowers - numberOfBees;
			System.out.println();
			System.out.print("Exercise 4 Answer - ");
			System.out.printf("There\'s %d less bees than flowers.\n", flowersLessBees);

        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
            int numberOfPigeon = 1;
            int anotherPigeon = 1;
            int numberPigeonEating = numberOfPigeon + anotherPigeon;
			System.out.println();
			System.out.print("Exercise 5 Answer - ");
            System.out.printf("The total number of pigeons eating breadcrumbs now is %d.\n", numberPigeonEating);

        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
			int owlsSitting = 3;
			int owlsJoined = 2;
			int numberOfOwlsOnFence = owlsSitting + owlsJoined;
			System.out.println();
			System.out.print("Exercise 6 Answer - ");
			System.out.printf("The number of owls on the fence now is %d.\n", numberOfOwlsOnFence);

        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int beaversWorkingHome= 2;
		int beaverWentToSwim = 1;
		int numberOfBeaverStillWorkHome = beaversWorkingHome - beaverWentToSwim;
		System.out.println();
		System.out.print("Exercise 7 Answer - ");
		System.out.printf("The number of beaver still working from home is %d.\n", numberOfBeaverStillWorkHome);

        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int toucansSittingOnTree= 2;
		int numberOfToucansJoined = 1;
		int totalToucans = toucansSittingOnTree + numberOfToucansJoined;
		System.out.println();
		System.out.print("Exercise 8 Answer - ");
		System.out.printf("The total number of toucans is equal to %d.\n", totalToucans);

        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int squirrelsOnTree= 4;
		int numberOfNuts = 2;
		int squirrelsMoreThanNuts = squirrelsOnTree - numberOfNuts;
		System.out.println();
		System.out.print("Exercise 9 Answer - ");
		System.out.printf("There are %d more squirrels than nuts.\n", squirrelsMoreThanNuts);

        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		int numberQuarter= 1;
		int numberOfDime = 1;
		int numberOfNickel = 2;
		double totalMoneyFoundInCents = (numberQuarter * .25) + (numberOfDime * .10) + (numberOfNickel * .05);
		System.out.println();
		System.out.print("Exercise 10 Answer - ");
//		System.out.printf(" The total money found by Mrs. Hilt is %d cents.\n", totalMoneyFoundInCents);
		System.out.println("  The total money found by Mrs. Hilt is " + totalMoneyFoundInCents + " cents.");


        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int muffinsBakedBrierClass= 18;
		int muffinsBakedMacAdamsClass= 20;
		int muffinsBakedFlanneryClass= 17;
		int totalMuffinsBaked = muffinsBakedBrierClass + muffinsBakedMacAdamsClass + muffinsBakedFlanneryClass;
		System.out.println();
		System.out.print("Exercise 11 Answer - ");
		System.out.printf(" The first grade classes baked a total of %d muffins.\n", totalMuffinsBaked);

        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		double yoyoCost= 0.24;
		double whistleCost= 0.14;
		double totalSpendingOnToys = yoyoCost + whistleCost;
		System.out.println();
		System.out.print("Exercise 12 Answer - ");
		System.out.printf(" Mrs. Hilt spent a total of %.2f cents for all the two toys.\n", totalSpendingOnToys);

        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispies Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */

		int numberLargeMarshmallows = 8;
		int numberMiniMarsmallows = 10;
		int totalMarshmallows = numberLargeMarshmallows + numberMiniMarsmallows;
		System.out.println();
		System.out.print("Exercise 13 Answer - ");
		System.out.printf(" Mrs. Hilt used a total of %d marshmallows altogether.\n", totalMarshmallows);


        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int snowInHiltHouse = 29; // snow measured in inches
		int snowInBrecknockSchool = 17;
		int snowDifference = snowInHiltHouse - snowInBrecknockSchool;
		System.out.println();
		System.out.print("Exercise 14 Answer - ");
		System.out.printf(" Mrs. Hilt got %d inches more of snow than Brecknock Elementary School.\n", snowDifference);

        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */

		double initialMoney = 10;
		double spendingOnToyTruck = 3;
		double spendingOnPencil = 2;
		double totalMoneyLeft = initialMoney - (spendingOnToyTruck + spendingOnPencil);
		System.out.println();
		System.out.print("Exercise 15 Answer - ");
		System.out.printf(" Mrs. Hilt has $%.2f money left.\n", totalMoneyLeft );


        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int  totalMarbles = 16;
		int  lostMarbles = 7;
		int  remainingMarbles = totalMarbles - lostMarbles ;
		System.out.println();
		System.out.print("Exercise 16 Answer - ");
		System.out.printf("Josh still have %d marbles left.\n", remainingMarbles);

        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int numSeashells = 19 ;
		int marbleCollectionCount = 25;
		int marbleToBeCollected = marbleCollectionCount - numSeashells;
		System.out.println();
		System.out.print("Exercise 17 Answer - ");
		System.out.printf("Megan has to find %d more.\n", marbleToBeCollected );

        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int totalBalloons = 17;
		int numRedBalloons = 8;
		int numGreenBalloons = totalBalloons - numRedBalloons;
		System.out.println();
		System.out.print("Exercise 18 Answer - ");
		System.out.printf("Brad has %d green balloons.\n", numGreenBalloons);


        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int  numBooksOnShelf = 38;
		int  numBooksAdded = 10;
		int  totalBooks = numBooksOnShelf + numBooksAdded;
		System.out.println();
		System.out.print("Exercise 19 Answer - ");
		System.out.printf("There are %d books on the shelf now.\n", totalBooks);


        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int beeNumberLegs = 6;
		int numBees = 8;
		int totalBeeLegs =  beeNumberLegs * numBees;
		System.out.println();
		System.out.print("Exercise 20 Answer - ");
		System.out.printf("A bee has %d legs. %d bees have %d legs.\n", beeNumberLegs, numBees, totalBeeLegs);


        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		double  iceCreamConeCost = .99;
		int  numCone = 2 ;
		double  totalCost = iceCreamConeCost * numCone ;
		System.out.println();
		System.out.print("Exercise 21 Answer - ");
		System.out.printf("%d ice cream cones cost %.2f cents.\n", numCone, totalCost);

        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int  numRocks = 64;
		int  numRocksToComplete = 125;
		int  numRocksNeeded = numRocksToComplete - numRocks;
		System.out.println();
		System.out.print("Exercise 22 Answer - ");
		System.out.printf("Mrs. Hilt still needs %d rocks to complete the border.\n", numRocksNeeded);


        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int  numMarbles = 38;
		int  marblesLost = 15;
		int  marblesLeft = numMarbles - marblesLost;
		System.out.println();
		System.out.print("Exercise 23 Answer - ");
		System.out.printf("Mrs. Hilt has %d marbles. She lost %d. Now she has only %d marbles left.\n", numMarbles, marblesLost, marblesLeft);

        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int  milesToDriven = 78;
		int  milesDriven = 32;
		int  milesLeftToDrive = milesToDriven - milesDriven;
		System.out.println();
		System.out.print("Exercise 24 Answer - ");
		System.out.printf("Mrs. Hilt and her sister still have to drive %d miles to reach the concert venue.\n", milesLeftToDrive);


        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */
		int  timeSpentShovelingSatAM = 60 + 30; // converted 1 hour in minutes which is equal to 60 minutes
		int  timeSpentShovelingSatPM=  45;
		int  totalTimeSpentShoveling = timeSpentShovelingSatAM + timeSpentShovelingSatPM;
		System.out.println();
		System.out.print("Exercise 25 Answer - ");
		System.out.printf("Mrs. Hilt spent %d minutes shoveling snow.\n", totalTimeSpentShoveling);


        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		int numHotDogs = 6;
		double eachhotDogCost = 0.50; // per hot dog costs in cents
		double  totalSpent = numHotDogs * eachhotDogCost;
		System.out.println();
		System.out.print("Exercise 26 Answer - ");
		System.out.printf("Mrs. Hilt paid %.2f cents for all of the hot dogs.\n", totalSpent);


        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		int  initMoney = 50; // money in cents
		int  pencilCost = 7 ; // pencil cost in cents
		int  numberOfPencils = initMoney / pencilCost;
		System.out.println();
		System.out.print("Exercise 27 Answer - ");
		System.out.printf("Mrs. Hilt can buy %d pencils with the %d cents she has.\n", numberOfPencils, initMoney);


        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int numButterflies = 33;
		int numOrangeButteflies = 20;
		int numRedButterflies = numButterflies - numOrangeButteflies;
		System.out.println();
		System.out.print("Exercise  Answer - ");
		System.out.printf("There are %d red butterflies.\n", numRedButterflies);


        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		double moneyPaid = 1.00 ; // 1$ converted to cents which is equal to 100 cents
		double  candyCost = 0.54;
		double  change = moneyPaid - candyCost;
		System.out.println();
		System.out.print("Exercise 29 Answer - ");
		System.out.printf("Kate should get back %.2f cents.\n", change);


        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
       */
		int  numTrees = 13;
		int  numPlantsAdded = 12;
		int  totalTrees = numTrees + numPlantsAdded;
		System.out.println();
		System.out.print("Exercise 30 Answer - ");
		System.out.printf("Mark has a total of %d trees in his backyard.\n", totalTrees);


        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int  numDays = 2;
		final int hoursInADay = 24;
		int  numHours = numDays * hoursInADay;
		System.out.println();
		System.out.print("Exercise 31 Answer - ");
		System.out.printf("Joy will see her grandma in %d hours.\n", numHours);


        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int numCousins = 4;
		int numGumToGiveEach = 5;
		int totalGumNeeded = numCousins * numGumToGiveEach;
		System.out.println();
		System.out.print("Exercise 32 Answer - ");
		System.out.printf("Kim will need %d gums to give to her %d cousins.\n", totalGumNeeded, numCousins);


        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		double moneyOnHand = 3;
		double candyBarCost = 1 ;
		double  moneyLeft = moneyOnHand - candyBarCost;
		System.out.println();
		System.out.print("Exercise 33 Answer - ");
		System.out.printf("Dan has $%.2f left.\n", moneyLeft);

        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int  numBoatsInLake = 5;
		int  numPeopleInEachBoat = 3;
		int  totalPeopleOnBoats = numBoatsInLake * numPeopleInEachBoat;
		System.out.println();
		System.out.print("Exercise 34 Answer - ");
		System.out.printf("There are %d people on boats in the lake.\n", totalPeopleOnBoats);

        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int numLegos = 380;
		int numLegosLost = 57 ;
		int legosLeft = numLegos - numLegosLost;
		System.out.println();
		System.out.print("Exercise 35 Answer - ");
		System.out.printf("Ellen has %d legos left.\n", legosLeft);


        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int numMuffins = 35;
		int totalMuffins = 83;
		int numMuffinsToBake = totalMuffins - numMuffins;
		System.out.println();
		System.out.print("Exercise  Answer - ");
		System.out.printf("Arthur has to bake %d muffins to have %d muffins.\n", numMuffinsToBake, totalMuffins);


        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int numWillyCrayons = 1400;
		int numLucyCrayons = 290;
		int crayonDifference = numWillyCrayons - numLucyCrayons;
		System.out.println();
		System.out.print("Exercise 37 Answer - ");
		System.out.printf("Willy has %d more crayons than Lucy.\n", crayonDifference);


        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int numStickersOnPage = 10;
		int numPages = 22;
		int totalNumberStickers = numStickersOnPage * numPages;
		System.out.println();
		System.out.print("Exercise 38 Answer - ");
		System.out.printf("I have %d stickers.\n", totalNumberStickers);


        /* Exercise 39
        39. There are 100 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		double  numCupCakes = 100;
		int  numChildren = 8;
		double  equalShare = numCupCakes / numChildren;
		System.out.println();
		System.out.print("Exercise 39 Answer - ");
		System.out.printf("Each person will get %.2f cupcakes, if they share the cupcakes equally.\n", equalShare);

        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies, how many
        cookies will not be placed in a jar?
        */
		int  numCookies = 47;
		int  jarCookies = 6;
		int  remainCookies = numCookies % jarCookies;
		System.out.println();
		System.out.print("Exercise 40 Answer - ");
		System.out.printf("There will be %d cookies that will not be placed in a jar.\n", remainCookies);


        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received an equal number of croissants,
        how many will be left with Marian?
        */
		int  numCroissants = 59;
		int  numNeighbor = 8;
		int  remain = numCroissants % numNeighbor;
		System.out.println();
		System.out.print("Exercise 41 Answer - ");
		System.out.printf("There will be %d croissants that will be left with Marian.\n", remain);


        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int  cookiesPerTray = 12;
		int  cookiesToPrepare = 276;
		int  traysNeeded = cookiesToPrepare / cookiesPerTray;
		System.out.println();
		System.out.print("Exercise 42 Answer - ");
		System.out.printf("Marian will need %d trays to prepare %d oatmeal cookies at a time.\n", traysNeeded, cookiesToPrepare);


        /* Exercise 43
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int numPretzels = 480;
		int perServingSize = 12;
		int numServings = numPretzels / perServingSize;
		System.out.println();
		System.out.print("Exercise 43 Answer - ");
		System.out.printf("Marian was able to prepare %d servings of bite-sized pretzels.\n", numServings);


        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int  cupCakesBaked = 53;
		final int cupCakesLeft = 2;
		final int numCakesPerBox = 3;
		int  boxesCupCakesGiven = (cupCakesBaked - cupCakesLeft) / numCakesPerBox;
		System.out.println();
		System.out.print("Exercise 44 Answer - ");
		System.out.printf("There were %d boxes with %d lemon cupcakes that were given away.\n", boxesCupCakesGiven, numCakesPerBox);

        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int numCarrots = 74;
		int numPeople = 12 ;
		int leftUnEaten = numCarrots % numPeople;
		System.out.println();
		System.out.print("Exercise 45 Answer - ");
		System.out.printf("There were %d carrot sticks that were left uneaten.\n", leftUnEaten);


        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int numBears = 98;
		int numBearPerShelf = 7;
		int shelvesFilled = numBears / numBearPerShelf;
		System.out.println();
		System.out.print("Exercise 46 Answer - ");
		System.out.printf("There will be %d shelves that will be filled.\n", shelvesFilled);


        /* Exercise 47
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int  picPerAlbum = 20;
		int  numPictures = 480;
		int  numAlbum = numPictures / picPerAlbum;
		System.out.println();
		System.out.print("Exercise 47 Answer - ");
		System.out.printf("Susie will need %d albums.\n", numAlbum);

        /* Exercise 48
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
         */
		int  numCards = 94;
		int  cardsPerBoxHold = 8;
		int  numFullBox = numCards / cardsPerBoxHold;
		int  numCardsInUnfilledBox = numCards % cardsPerBoxHold;
		System.out.println();
		System.out.print("Exercise 48 Answer - ");
		System.out.printf("There will be %d filled boxes and %d cards in unfilled box.\n", numFullBox, numCardsInUnfilledBox);

        /* Exercise 49
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int  numBooks = 210;
		int  numShelvesRepaired = 10 ;
		int  numBooksPerShelf = numBooks / numShelvesRepaired;
		System.out.println();
		System.out.print("Exercise 49 Answer - ");
		System.out.printf("Each shelf will contain %d books.\n", numBooksPerShelf);

        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		double numBakedCroissants = 17;
		int  numGuest = 7;
		double  numCroissantsPerGuest = numBakedCroissants / numGuest;
		System.out.println();
		System.out.print("Exercise 50 Answer - ");
		System.out.printf("Each of the guest will have %.2f croissants.\n", numCroissantsPerGuest);


	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 12 x 14 rooms?
	    Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
	    */
		double billHrRate = (12*14) / 2.15; // Bill can paint room per hr
		double jillHrRate = (12*14) /1.9 ;  // Jill can paint room per hr
		double combinedHrRate = billHrRate + jillHrRate;
		double totalWallsInFeet = (12*14) * 5;
		double hrsToPaint5Rooms = totalWallsInFeet / combinedHrRate;
		System.out.println();
		System.out.print("Exercise 51 Answer - ");
		System.out.printf("It will take %.1f hours for two painters working together to paint 5 12 x 14 rooms.\n", hrsToPaint5Rooms);


	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,
		build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" —> "Smith, John D."
		*/
		String firstName = "Grace";
		String lastName  = "Hopper";
		String middleInitial = "B" ;
		String fullName = (lastName + "," + " "+ firstName + " " + middleInitial + ".");
		System.out.println();
		System.out.print("Exercise 52 Answer - ");
		System.out.print(fullName);

	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */
		double distanceNYnChicago = 800; // distance in miles
		double distanceTrainTravelled = 537;// distance in miles
		int percentTravelCompleted = (int)((distanceTrainTravelled / distanceNYnChicago) * 100);
		System.out.println();
		System.out.println();
		System.out.print("Exercise 53 Answer - ");
		System.out.printf("%d%% of the trip has been completed.\n", percentTravelCompleted);


	}

}
