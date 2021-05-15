package com.ritul.quizapp

object MoreInfoConst {

    const val TOTAL_QUESTIONS: String = "Total_question"

    fun getInfo1(): ArrayList<Information>{
        val infoList = ArrayList<Information>()
        
        val inf1 = Information(
            1,
            R.drawable.primes,
            "Prime numbers",
            "A prime number is a positive integer that has " +
                    "exactly two distinct whole number factors (or divisors), namely 1 and the number itself." +
                    "The number 2 is prime. (It is the only even prime.)"
        )
        infoList.add(inf1)

        val inf2 = Information(
            2,
            R.drawable.perfect_num,"Perfect numbers",
            "In number theory, a perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself. For instance, 6 has divisors 1, 2 and 3 (excluding itself), and 1 + 2 + 3 = 6, so 6 is a perfect number."
        )

        infoList.add(inf2)

        // 3
        val inf3 = Information(
            3,
            R.drawable.ratitral,"Rational and irrational numbers",
            "What are rational and irrational numbers? Rational numbers are the numbers that can be expressed in the form of a ratio (P/Q & Q≠0) and irrational numbers cannot be expressed as a fraction. But both the numbers are real numbers and can be represented in a number line." +
                    "Pi is an irrational number\n" +
                    "π is an irrational number which has value 3.142…and is a never-ending and non-repeating number."
        )

        infoList.add(inf3)

        // 4
        val inf4 = Information(
            4,
            R.drawable.primes,"Primes",
            "We need to find the two prime numbers which end with the digits 2 and 5.\n" +
                    "\n" +
                    "As,\n" +
                    "\n" +
                    "We know that the Prime number is a number which has only two multiples which are 1 and the number itself.\n" +
                    "\n" +
                    "So,\n" +
                    "\n" +
                    "There are only two numbers 2 and 5 which end with 2 and 5 and are also prime.\n" +
                    "\n" +
                    "All the other numbers ending with these digits are never prime.\n" +
                    "\n" +
                    "Therefore, the correct answer is 2 and 5."
        )

        infoList.add(inf4)

        // 5
        val inf5 = Information(
            5,
            R.drawable.coloringpb,"Four-colour map problem",
            "Four-colour map problem, problem in topology, originally posed in the early 1850s and not solved until 1976, that required finding the minimum number of different colours required to colour a map such that no two adjacent regions (i.e., with a common boundary segment) are of the same colour. Three colours are not enough, since one can draw a map of four regions with each region contacting the three other regions. It had been proved mathematically by the English attorney Alfred Bray Kempe in 1879 that five colours will always suffice; and no map had ever been found on which four colours would not do."
        )

        infoList.add(inf5)

        // 6
        val inf6 = Information(
            6,
            R.drawable.circumference,"Circumference",
            "The circumference of a circle is the linear distance of a circle's edge. It is the same as the perimeter of a geometric figure, but the term 'perimeter' is used exclusively for polygons.\n" +
                    "\n" +
                    "Circumference is often misspelled as circumfrence."
        )

        infoList.add(inf6)

        // 7
        val inf7 = Information(
            7,
            R.drawable.googol,"A googol",
            "A googol is the large number 10100. In decimal notation, it is written as the digit 1 followed by one hundred zeroes."
        )

        infoList.add(inf7)

        // 8
        val inf8 = Information(
            8,
            R.drawable.nonagon,"Nonagone",
            "Ireland"
        )

        infoList.add(inf8)

        // 9
        val inf9 = Information(
            9,
            R.drawable.obang,"Obtuse angle",
            "An obtuse angle is a type of angle that is always larger than 90° but less than 180°. In other words, it lies between 90° and 180°."
        )

        infoList.add(inf9)

        // 10
        val inf10 = Information(
            10,
            R.drawable.roman,"Roman numerals",
            "Roman numerals are a numeral system that originated in ancient Rome and remained the usual way of writing numbers throughout Europe well into the Late Middle Ages. Numbers in this system are represented by combinations of letters from the Latin alphabet. Modern usage employs seven symbols, each with a fixed integer value"
        )

        infoList.add(inf10)
        return infoList
    }
    fun getInfo2(): ArrayList<Information>{
        val infoList = ArrayList<Information>()

        val inf1 = Information(
            1,
            R.drawable.concave,"Convex Shape",
            "A convex shape is a shape where all of its parts \"point outwards.\" In other words, no part of it points inwards. For example, a full pizza is a convex shape as its full outline (circumference) points outwards."
        )
        infoList.add(inf1)

        val inf2 = Information(
            2,
            R.drawable.ratitral,"Integers",
            "An integer (from the Latin integer meaning \"whole\")[a] is colloquially defined as a number that can be written without a fractional component. For example, 21, 4, 0, and −2048 are integers, while 9.75, 5+\n" +
                    "1\n" +
                    "/\n" +
                    "2\n" +
                    ", and √2 are not." +
                    "ℤ is a subset of the set of all rational numbers ℚ, which in turn is a subset of the real numbers ℝ. Like the natural numbers, ℤ is countably infinite."
        )

        infoList.add(inf2)

        // 3
        val inf3 = Information(
            3,
            R.drawable.square,"Square Number",
            "When you multiply an integer (a “whole” number, positive, negative or zero) times itself, the resulting product is called a square number, or a perfect square or simply “a square.” So, 0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144, and so on, are all square numbers." +
                    "A square number is a number of the form n × n or n2 where n is any integer." +
                    "The name “square number” comes from the fact that these particular numbers of objects can be arranged to fill a perfect square."
        )

        infoList.add(inf3)

        // 4
        val inf4 = Information(
            4,
            R.drawable.probs,"Probabilities",
            "Probability is the branch of mathematics concerning numerical descriptions of how likely an event is to occur, or how likely it is that a proposition is true. The probability of an event is a number between 0 and 1, where, roughly speaking, 0 indicates impossibility of the event and 1 indicates certainty." +
                    "Probability of an event = (# of ways it can happen) / (total number of outcomes)"
        )

        infoList.add(inf4)

        // 5
        val inf5 = Information(
            5,
            R.drawable.scalene,"Scalene Triangles",
            "In geometry, Scalene Triangle is a triangle that has all its sides of different lengths. It means all the sides of a scalene triangle are unequal and all the three angles are also of different measures. This is one of the three types of triangles, based on sides."
        )

        infoList.add(inf5)

        // 6
        val inf6 = Information(
            6,
            R.drawable.calculus,"Calculus",
            "Today, calculus has widespread uses in science, engineering, and economics. In mathematics education, calculus denotes courses of elementary mathematical analysis, which are mainly devoted to the study of functions and limits."
        )

        infoList.add(inf6)

        // 7
        val inf7 = Information(
            7,
            R.drawable.digits,"π",
            "The number π (/paɪ/) is a mathematical constant. It is defined as the ratio of a circle's circumference to its diameter, and it also has various equivalent definitions. It appears in many formulas in all areas of mathematics and physics." +
                    "Being an irrational number, π cannot be expressed as a common fraction, although fractions such as 22/7 are commonly used to approximate it. Equivalently, its decimal representation never ends and never settles into a permanently repeating pattern. Its decimal (or other base) digits appear to be randomly distributed, and are conjectured to satisfy a specific kind of statistical randomness.\n" +
                    "\n"
        )

        infoList.add(inf7)

        // 8
        val inf8 = Information(
            8,
            R.drawable.obelus,"Obelus",
            "The form of the obelus as a horizontal line with a dot above and a dot below, ÷, was first used as a symbol for division by the Swiss mathematician Johann Rahn in his book Teutsche Algebra in 1659. This gave rise to the modern mathematical symbol ÷, used in anglophone countries as a division sign.[16][17] This usage, though widespread in Anglophone countries, is neither universal nor recommended: the ISO 80000-2 standard for mathematical notation recommends only the solidus / or fraction bar for division, or the colon : for ratios; it says that ÷ should not be used for division"
        )

        infoList.add(inf8)

        // 9
        val inf9 = Information(
            9,
            R.drawable.full,"360",
            "There are 360 degrees in one Full Rotation (one complete circle around)." +
                    "Why 360 degrees? Probably because old calendars (such as the Persian Calendar) used 360 days for a year - when they watched the stars they saw them revolve around the North Star one degree per day."
        )

        infoList.add(inf9)

        // 10
        val inf10 = Information(
            10,
            R.drawable.triangle,"Triangles",
            "A three-sided polygon is a triangle. There are several different types of triangle (see diagram), including:\n" +
                    "\n" +
                    "Equilateral – all the sides are equal lengths, and all the internal angles are 60°.\n" +
                    "Isosceles – has two equal sides, with the third one a different length. Two of the internal angles are equal.\n" +
                    "Scalene – all three sides, and all three internal angles, are different.\n"
        )

        infoList.add(inf10)
        return infoList
    }
    fun getInfo3(): ArrayList<Information>{
        val infoList = ArrayList<Information>()

        val inf1 = Information(
            1,
            R.drawable.kilo,"More info on this",
            "Physical Quantity\tName of Unit\tAbbreviation\n" +
                    "Length\tMeter\tm\n" +
                    "Mass\tKilogram\tkg\n" +
                    "Temperature\tKelvin\tK\n" +
                    "Time\tSecond\ts\n" +
                    "Amount of Substance\tMole\tmol\n" +
                    "Electric Current\tAmpere\tI\n" +
                    "Luminous Intensity\tLumen\tIv"
        )
        infoList.add(inf1)

        val inf2 = Information(
            2,
            R.drawable.ml,"ml to L",
            ""
        )

        infoList.add(inf2)

        // 3
        val inf3 = Information(
            3,
            R.drawable.butterfly,"The butterfly effect",
            "the butterfly effect is the sensitive dependence on initial conditions in which a small change in one state of a deterministic nonlinear system can result in large differences in a later state." +
                    " butterfly effect is derived from the metaphorical example of the details of a tornado (the exact time of formation, the exact path taken) being influenced by minor perturbations such as a distant butterfly flapping its wings several weeks earlier."
        )

        infoList.add(inf3)

        // 4
        val inf4 = Information(
            4,
            R.drawable.lcm,"LCM",
            "In arithmetic and number theory, the least common multiple, lowest common multiple, or smallest common multiple of two integers a and b, usually denoted by lcm(a, b), is the smallest positive integer that is divisible by both a and b."
        )

        infoList.add(inf4)

        // 5
        val inf5 = Information(
            5,
            R.drawable.coloringpb,"Map coloring",
            "4"
        )

        infoList.add(inf5)

        // 6
        val inf6 = Information(
            6,
            R.drawable.division,"Division Theorem",
            "If n is any integer and d is a positive integer, there\n" +
                    "exist unique integers q and r such that\n" +
                    "n = dq + r and 0 ≤ r < d.\n" +
                    "In this theorem, you should think of n as “the number” or “the dividend,” d as “the\n" +
                    "divisor,” q as “the quotient,” and r as “the remainder.”"
        )

        infoList.add(inf6)

        // 7
        val inf7 = Information(
            7,
            R.drawable.frdec,"Fractions and decimals",
            "The line in a fraction that separates the numerator and denominator can be rewritten using the division symbol. So, to convert a fraction to a decimal, divide the numerator by the denominator. If required, you can use a calculator to do this. This will give us our answer as a decimal."
        )

        infoList.add(inf7)

        // 8
        val inf8 = Information(
            8,
            R.drawable.comparison,"Fraction comparison",
            "To compare fractions with unlike denominators, you need to find the least common denominator (LCD), or the smallest multiple the denominators share. So what fraction of your favorite candy bar would be more: 2/3 or 4/5? The two fractions have different denominators, so we need to find the LCD."
        )

        infoList.add(inf8)

        // 9
        val inf9 = Information(
            9,
            R.drawable.run,"Running",
            "From Monday through Friday there are 5 days. Each day Joseph runs 3km." +
                    "So from Mon to Fri he runs 3X5=15km " +
                    "On Saturday he runs 10km, same as on Sunday, so he runs 2X10 on the weekend" +
                    "Therefore he runs 20+15=35(km) in a week"
        )

        infoList.add(inf9)

        // 10
        val inf10 = Information(
            10,
            R.drawable.lcm,"LCM",
            "One way to find the least common multiple of two numbers is to first list the prime factors of each number. Then multiply each factor the greatest number of times it occurs in either number. If the same factor occurs more than once in both numbers, you multiply the factor the greatest number of times it occurs"
        )

        infoList.add(inf10)
        return infoList
    }
    fun getInfo4(): ArrayList<Information>{
        val infoList = ArrayList<Information>()

        val inf1 = Information(
            1,
            R.drawable.primes,"19",
            "The prime numbers that are less than 20 are: 2, 3, 5, 7, 11, 13, 17, and 19.\n"
        )
        infoList.add(inf1)

        val inf2 = Information(
            2,
            R.drawable.factorizing,"Factorization",
            "In mathematics, factorization or factoring consists of writing a number or another mathematical object as a product of several factors, usually smaller or simpler objects of the same kind. For example, 3 × 5 is a factorization of the integer 15, and (x – 2)(x + 2) is a factorization of the polynomial x2 – 4."
        )

        infoList.add(inf2)

        // 3
        val inf3 = Information(
            3,
            R.drawable.simplify,"Simplify",
            "Simplifying (or reducing) fractions means to make the fraction as simple as possible." +
                    "To simplify a fraction, divide both the top and bottom of the fraction by the Greatest Common Factor"
        )

        infoList.add(inf3)

        // 4
        val inf4 = Information(
            4,
            R.drawable.sequence,"Next number",
            "First, find the common difference for the sequence. Subtract the first term from the second term. Subtract the second term from the third term. To find the next value, add to the last given number."
        )

        infoList.add(inf4)

        // 5
        val inf5 = Information(
            5,
            R.drawable.density,"Density",
            "Density is the mass of an object divided by its volume. Density often has units of grams per cubic centimeter (g/cm3). Remember, grams is a mass and cubic centimeters is a volume (the same volume as 1 milliliter)."
        )

        infoList.add(inf5)

        // 6
        val inf6 = Information(
            6,
            R.drawable.unknown,"Unknowns",
            "In mathematics, an unknown is a number we do not know. They are commonly used in algebra, where they are also known as variables and represented by symbols such as x, y and z."
        )

        infoList.add(inf6)

        // 7
        val inf7 = Information(
            7,
            R.drawable.oppangles,"Vertically Opposite Angles",
            "The angles opposite each other when two lines cross. They are always equal.\n" +
                    "\n" +
                    "In this example a° and b° are vertically opposite angles.\n" +
                    "\n" +
                    "\"Vertical\" refers to the vertex (where they cross), NOT up/down."
        )

        infoList.add(inf7)

        // 8
        val inf8 = Information(
            8,
            R.drawable.adjang,"Adjacent angles",
            "The adjacent angles will have the common side and the common vertex. Two angles are said to be supplementary angles if the sum of both the angles is 180 degrees. If the two supplementary angles are adjacent to each other then they are called linear pair."
        )

        infoList.add(inf8)

        // 9
        val inf9 = Information(
            9,
            R.drawable.obtang,"Obtuse angles",
            "An obtuse angle is a type of angle that is always larger than 90° but less than 180°. In other words, it lies between 90° and 180°."
        )

        infoList.add(inf9)

        // 10
        val inf10 = Information(
            10,
            R.drawable.adjacentangles,"Adjacent angles",
            "When two angles have a common arm and common vertex and their non-common arm are the either side of common arm, then they are called adjacent angles."
        )

        infoList.add(inf10)
        return infoList
    }
    fun getInfo5(): ArrayList<Information>{
        val infoList = ArrayList<Information>()

        val inf1 = Information(
            1,
            R.drawable.variables,"Replacement",
            "Replace X Y and Z with the given values and then compute the sum"
        )
        infoList.add(inf1)

        val inf2 = Information(
            2,
            R.drawable.absval,"Absolute values",
            "In mathematics, the absolute value or modulus of a real number x, denoted |x|, is the non-negative value of x without regard to its sign. Namely, |x| = x if x is positive, and |x| = −x if x is negative (in which case −x is positive), and |0| = 0."
        )

        infoList.add(inf2)

        // 3
        val inf3 = Information(
            3,
            R.drawable.percentages,"Similar example",
            "A Skateboard is reduced 25% in price in a sale.\n" +
                    "The old price was \$120.\n" +
                    "Find the new price.\n" +
                    " \n" +
                    "\n" +
                    "First, find 25% of \$120:\n" +
                    "\n" +
                    "25% =  25100 \n" +
                    "\n" +
                    "And   25100  × \$120 = \$30\n" +
                    "\n" +
                    "25% of \$120 is \$30\n" +
                    "\n" +
                    "So the reduction is \$30\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Take the reduction from the original price\n" +
                    "\n" +
                    "\$120 − \$30 = \$90\n" +
                    "\n" +
                    "The Price of the Skateboard in the sale is \$90"
        )

        infoList.add(inf3)

        // 4
        val inf4 = Information(
            4,
            R.drawable.solution,"Supplementary",
            "Two Angles are Supplementary when they add up to 180 degrees. These two angles (140° and 40°) are Supplementary Angles, because they add up to 180°: Notice that together they make a straight angle. But the angles don't have to be together."
        )

        infoList.add(inf4)

        // 5
        val inf5 = Information(
            5,
            R.drawable.solution,"Non integers",
            "The integers are ..., -4, -3, -2, -1, 0, 1, 2, 3, 4, ... -- all the whole numbers and their opposites (the positive whole numbers, the negative whole numbers, and zero). Fractions and decimals are not integers."
        )

        infoList.add(inf5)

        // 6
        val inf6 = Information(
            6,
            R.drawable.fibo,"Fibonacci",
            "In mathematics, the Fibonacci numbers, commonly denoted Fn, form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1"
        )

        infoList.add(inf6)

        // 7
        val inf7 = Information(
            7,
            R.drawable.percentages,"Percentages",
            "How To Calculate Percent\n" +
                    "Determine the total or whole amount.\n" +
                    "Divide the number to be expressed as a percent by the total. In most cases, you'll divide the smaller number by the larger number.\n" +
                    "Multiple the resulting value by 100."
        )

        infoList.add(inf7)

        // 8
        val inf8 = Information(
            8,
            R.drawable.sinecosine,"Sine and Cosine",
            "Note that the domain of the function y=sin(x) ) is all real numbers (sine is defined for any angle measure), the range is −1≤y≤1 . The graph of the cosine function looks like this: The domain of the function y=cos(x) is all real numbers (cosine is defined for any angle measure), the range is −1≤y≤1."
        )

        infoList.add(inf8)

        // 9
        val inf9 = Information(
            9,
            R.drawable.radius,"Radius",
            "The radius is a line segment extending from the center of a circle or sphere to the circumference or bounding surface"
        )

        infoList.add(inf9)

        // 10
        val inf10 = Information(
            10,
            R.drawable.circumference,"Circumference",
            "To calculate the circumference of a circle, multiply the diameter of the circle with π (pi). The circumference can also be calculated by multiplying 2×radius with pi (π=3.14)."
        )

        infoList.add(inf10)
        return infoList
    }
    fun getInfo6(): ArrayList<Information>{
        val infoList = ArrayList<Information>()

        val inf1 = Information(
            1,
            R.drawable.area,"Triangle area",
            "The area of a triangle is (height × width) ÷ 2.\n" +
                    "\n" +
                    "In other words you can work out the area of a triangle in the same way as the area for a square or parallelogram, then just divide your answer by 2.\n" +
                    "\n" +
                    "The height of a triangle is measured as a right-angled line from the bottom line (base) to the ‘apex’ (top point) of the triangle."
        )
        infoList.add(inf1)

        val inf2 = Information(
            2,
            R.drawable.solution,"pb",
            "solve"
        )

        infoList.add(inf2)

        // 3
        val inf3 = Information(
            3,
            R.drawable.circlearea,"Circle Area",
            "The area of a circle is pi times the radius squared (A = π r²)."
        )

        infoList.add(inf3)

        // 4
        val inf4 = Information(
            4,
            R.drawable.percentages,"Percentages",
            "Bahamas"
        )

        infoList.add(inf4)

        // 5
        val inf5 = Information(
            5,
            R.drawable.probability,"Probability",
            "Probability is the branch of mathematics concerning numerical descriptions of how likely an event is to occur, or how likely it is that a proposition is true. The probability of an event is a number between 0 and 1, where, roughly speaking, 0 indicates impossibility of the event and 1 indicates certainty."
        )

        infoList.add(inf5)

        // 6
        val inf6 = Information(
            6,
            R.drawable.solution,"Solution",
            "up and down translation impacts the y-value in the (x,y) coordinate pair.\n" +
                    "\n" +
                    "left and right translation impacts the x-value in the (x,y) coordinate pair.\n" +
                    "\n" +
                    "reflection about the x-axis would reverse the sign of the y-value in the (x,y) coordinate pair.\n" +
                    "\n" +
                    "reflection about the y-axis would reverse the sign of the x-value in the (x,y) coordinate pair.\n" +
                    "\n" +
                    "your point starts off at the (x,y) coordinate pair of (2,2)\n" +
                    "\n" +
                    "2 units up changes this point from (2,2) to (2,4).\n" +
                    "\n" +
                    "\n" +
                    "your point is now at (2,4).\n" +
                    "\n" +
                    "5 units to the left changes this point from (2,4) to (-3,4).\n" +
                    "\n" +
                    "your point is now at (-3,4).\n" +
                    "\n" +
                    "reflection about the x-axis changes this point from (-3,4) to (-3,-4).\n" +
                    "\n" +
                    "your point is now at (-3,-4).\n"
        )

        infoList.add(inf6)

        // 7
        val inf7 = Information(
            7,
            R.drawable.solution,"Solution",
            "Here we have to first find the side of the original cube and then find the area of the face of the original cube.\n" +
                    "\n" +
                    "Solution:\n" +
                    "\n" +
                    "Let a be the length of side of the original cube.\n" +
                    "\n" +
                    "Hence length of side of new cube would be 2a\n" +
                    "\n" +
                    "The volume of a cube is given by the formula\n" +
                    "\n" +
                    "Volume of a cube a³\n" +
                    "\n" +
                    "Volume of new cube = (2a)³\n" +
                    "\n" +
                    "8a = 64000\n" +
                    "a = 8000\n" +
                    "a = ³√8000\n" +
                    "a = 20 cm\n" +
                    "Hence the length of side of the original cube = 20 cm.\n" +
                    "Area of one face of a cube is given by the formula,\n" +
                    "\n" +
                    "Area of one face = a²\n" +
                    "\n" +
                    "Substituting the datas we get,\n" +
                    "\n" +
                    "Area of one face = 20 x 20\n" +
                    "\n" +
                    "Area of one face 400 cm²\n" +
                    "\n"
        )

        infoList.add(inf7)

        // 8
        val inf8 = Information(
            8,
            R.drawable.solution,"Heron",
            "Heron's formula states that the area of a triangle whose sides have lengths a, b, and c is\n" +
                    "\n" +
                    "{\\displaystyle A={\\sqrt {s(s-a)(s-b)(s-c)}},}A = \\sqrt{s(s-a)(s-b)(s-c)},\n" +
                    "where s is the semi-perimeter of the triangle; that is,\n" +
                    "\n" +
                    "{\\displaystyle s={\\frac {a+b+c}{2}}.}s=\\frac{a+b+c}{2}."
        )

        infoList.add(inf8)

        // 9
        val inf9 = Information(
            9,
            R.drawable.solution,"Solution",
            "Whenever a circle is inscribed in a square the side of square is equal to the diameter of the circle .\n" +
                    "\n" +
                    "Now solve the question\n" +
                    "\n" +
                    "According to question the side of square is 20 cm it means that the diameter of inscribed circle is 20 cm.\n" +
                    "\n" +
                    "Diameter of the circle= 20cm\n" +
                    "\n" +
                    "Radius of the circle = 10cm\n" +
                    "\n" +
                    "Circumference of the circle = 2×22÷7×10\n" +
                    "\n" +
                    "=440÷7\n" +
                    "\n" +
                    "=62.85"
        )

        infoList.add(inf9)

        // 10
        val inf10 = Information(
            10,
            R.drawable.solution,"Pentagon",
            "Here's a pentagon, a 5-sided polygon. From vertex A we can draw two diagonals which separates the pentagon into three triangles. We multiply 3 times 180 degrees to find the sum of all the interior angles of a pentagon, which is 540 degrees.\n" +
                    "\n" +
                    "sum of angles = (n – 2)180°\n" +
                    "= (5 – 2)180° = (3)180° = 540°"
        )

        infoList.add(inf10)
        return infoList
    }
}