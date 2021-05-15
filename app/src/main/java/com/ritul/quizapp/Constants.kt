package com.ritul.quizapp

object Constants {

    const val TOTAL_QUESTIONS: String = "Total_question"
    const val CORRECT_ANSWER: String = "correct_answer"

    fun getQuestion1(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1,"What is the only even prime number?",
            "3", "44",
            "11", "none of the above", 4
        )
        questionList.add(que1)

        val que2 = Question(
            2, "What is the smallest perfect number?",
            "11", "6",
            "100", "12", 2
        )

        questionList.add(que2)


        val que3 = Question(
            3, "Is Pi a rational or irrational number?",
            "Pi is not a number", "Rational",
            "there is no correct answer", "Irrational", 4
        )

        questionList.add(que3)

        // 4
        val que4 = Question(
            4, "What are the only prime numbers that end in 2 and 5?",
            "22 and 55", "2 and 5",
            "15 and 2", "5 and 12", 2
        )

        questionList.add(que4)

        // 5
        val que5 = Question(
            5, "How many colors are needed on a map to make sure that no border will share a color?",
            "7", "23",
            "4", "31", 3
        )

        questionList.add(que5)

        // 6
        val que6 = Question(
            6, "What is the perimeter of a circle called?",
            "The circumference", "Area",
            "Surface", "none of these", 1
        )

        questionList.add(que6)

        // 7
        val que7 = Question(
            7, "Which number is greater?",
            "A googol", "A quadrillion",
            "A billion", "A million", 1
        )

        questionList.add(que7)

        // 8
        val que8 = Question(
            8, "How many sides does a nonagon have?",
            "Ninety", "Five",
            "Nineteen", "Nine", 4
        )

        questionList.add(que8)

        // 9
        val que9 = Question(
            9, "What is an angle called if it’s greater than 90 degrees?",
            "Acute ", "Obtuse",
            "Straight ", "Right ", 2
        )

        questionList.add(que9)

        // 10
        val que10 = Question(
            10, "What does the Roman numeral “X” equal?",
            "10", "5",
            "11", "50", 1
        )

        questionList.add(que10)
        return questionList
    }

    fun getQuestion2(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1,"How does a convex shape curve?",
            "Inward", "Outward",
            "It doesn't curve", "Both inward and outward", 2
        )
        questionList.add(que1)

        val que2 = Question(
            2, "Negative four (-4)",
            "Is a natural number", "Is an integer",
            "Has a real square root", "Is from the set of natural number", 2
        )

        questionList.add(que2)


        val que3 = Question(
            3, "What is bigger, 100, or 10 squared?",
            "100", "you cannot compare them",
            "they are the same", "10 squared", 3
        )

        questionList.add(que3)

        // 4
        val que4 = Question(
            4, "WHAT IS THE MATH TERM DESCRIBED AS THE LIKELIHOOD THAT SOMETHING WILL HAPPEN?",
            "Probability", "Statistic",
            "Percentage", "Chance", 1
        )

        questionList.add(que4)

        // 5
        val que5 = Question(
            5, "WHAT IS THE NAME GIVEN TO A TRIANGLE WITH ALL SIDES OF A DIFFERENT LENGTH?",
            "Equilateral", "Isosceles",
            "Scalene", "Acute", 3
        )

        questionList.add(que5)

        // 6
        val que6 = Question(
            6, "WHAT WAS DEVELOPED AS A TOOL USED TO INVESTIGATE A CHANGE IN NATURAL SCIENCES?",
            "Calculus", "Algebra",
            "Trigonometry", "Statistics", 1
        )

        questionList.add(que6)

        // 7
        val que7 = Question(
            7, "HOW MANY DIGITS OF PI ARE THERE?",
            "Infinity", "A quadrillion",
            "A billion", "A million", 1
        )

        questionList.add(que7)

        // 8
        val que8 = Question(
            8, "WHAT IS THE SYMBOL OF DIVISION CALLED?",
            "Div", "Divisor",
            "Nobel", "Obelus", 4
        )

        questionList.add(que8)

        // 9
        val que9 = Question(
            9, "HOW MANY DEGREES IN A FULL CIRCLE?",
            "180", "360",
            "90 ", "30 ", 2
        )

        questionList.add(que9)

        // 10
        val que10 = Question(
            10, "WHAT IS THE NAME FOR A 3 SIDED POLYGON?",
            "Triangle", "Square",
            "You cannot have a 3 sided polygon", "Rectangle", 1
        )

        questionList.add(que10)
        return questionList
    }

    fun getQuestion3(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1,"What is the basic metric unit of mass?",
            "an ounce", "a cup",
            "a liter", "a kilogram", 4
        )
        questionList.add(que1)

        val que2 = Question(
            2, "How many milliliters are in one liter?",
            "11,000", "1,000",
            "100", "12", 2
        )

        questionList.add(que2)


        val que3 = Question(
            3, "What mathematical theory explains the randomness of nature?",
            "Pythagoras' Theorem", "Thales' Theorem",
            "The chaos theory", "The butterfly effect", 4
        )

        questionList.add(que3)

        // 4
        val que4 = Question(
            4, "WHAT IS THE SMALLEST NUMBER THAT CAN BE EXACTLY DIVIDED BY ALL THE NUMBERS 1 TO 10?",
            "1234", "2520",
            "5023401", "2521", 2
        )

        questionList.add(que4)

        // 5
        val que5 = Question(
            5, "How many colors are needed on a map to make sure that no border will share a color?",
            "7", "23",
            "4", "31", 3
        )

        questionList.add(que5)

        // 6
        val que6 = Question(
            6, "If 6 Children Share 145 Sweets Equally, How Many Sweets Will Remain?",
            "1", "145",
            "2", "none", 1
        )

        questionList.add(que6)

        // 7
        val que7 = Question(
            7, "5/10 To Decimal",
            "0.5", "5.10",
            "10.5", "1/2", 1
        )

        questionList.add(que7)

        // 8
        val que8 = Question(
            8, "Order From Greatest To Least The Fractions 1/3 , 1/6 , 1/2 , 1/7.",
            "1/3 , 1/2 , 1/7, 1/6", "1/6 , 1/2 , 1/3 , 1/7",
            "1/2 , 1/7, 1/3 , 1/6", "1/2 , 1/3 , 1/6 , 1/7", 4
        )

        questionList.add(que8)

        // 9
        val que9 = Question(
            9, "Mr joseph Runs 3 Kilometers Everyday From Monday To Friday. He Also Runs 10 Kilometers A Day On Saturday And Sunday. How Many Kilometers Does Joshua Run In A Week?",
            "36km ", "35km",
            "34km ", "40km ", 2
        )

        questionList.add(que9)

        // 10
        val que10 = Question(
            10, "Least Common Multiple (LCM) Of 40, 50 And 70",
            "1400", "1405",
            "500", "50", 1
        )

        questionList.add(que10)
        return questionList
    }

    fun getQuestion4(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1,"Largest Prime Number Less Than 20 Is",
            "3", "there are no prime numbers smaller than 20",
            "11", "19", 4
        )
        questionList.add(que1)

        val que2 = Question(
            2, "Factorizing 3x – 15xy – 30z we get",
            "3x - 5(3xy - 6z)", "3(X – 5y – 10z)",
            "3(x - 10z) - 15xy", "cannot be factorized", 2
        )

        questionList.add(que2)


        val que3 = Question(
            3, "Out Of Following Rational Numbers 4⁄8, 2⁄6, 9⁄12 And 10⁄17, Greatest Rational Number Is",
            "1/2", "4/8",
            "3/4", "none of the above", 3
        )

        questionList.add(que3)

        // 4
        val que4 = Question(
            4, "In Following Sequence 79, 76, 73, 70, Next Three Numbers In Sequence Are",
            " 82, 85, 88", "67,64,61",
            "67,63,61", "69,64,61", 2
        )

        questionList.add(que4)

        // 5
        val que5 = Question(
            5, "What Is The Unit Of Density Measurement?",
            "KILOGRAM/CM", "GRAM/CM",
            "GRAM/CM CUBED", "GRAM", 3
        )

        questionList.add(que5)

        // 6
        val que6 = Question(
            6, "Sum Of 2a + B + 5c And -5a – 2b + 3c Is",
            "−3a – B + 8c", "−3A – b + 8C",
            "3a + B - 8c", "none of these", 1
        )

        questionList.add(que6)

        // 7
        val que7 = Question(
            7, "Angles Formed When Two Straight Lines Intersect Each Other Are Classified As",
            "Vertically Opposite Angles", "Reflex Angles",
            "Parallel Angles", "Composed Angles", 1
        )

        questionList.add(que7)

        // 8
        val que8 = Question(
            8, "On A Line, Sum Of Adjacent Angles Is Equal To",
            "60", "360",
            "90", "180", 4
        )

        questionList.add(que8)

        // 9
        val que9 = Question(
            9, "What is an angle called if it’s greater than 90 degrees?",
            "Acute ", "Obtuse",
            "Straight ", "Right ", 2
        )

        questionList.add(que9)

        // 10
        val que10 = Question(
            10, "Angles That Have Common Vertex And A Common Side On A Line Are Classified As",
            "Adjacent Angles", "Opposite Angles",
            "Obtuse Angles", "Acute Angles", 1
        )

        questionList.add(que10)
        return questionList
    }

    fun getQuestion5(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1,"Considering Formula 1⁄W = 1⁄X + 1⁄Y + 1⁄Z, Then If X = 5, Y = 10, And Z = 15, Value Of 1⁄W Is",
            "30", "44/33",
            "11", "11/30", 4
        )
        questionList.add(que1)

        val que2 = Question(
            2, "Absolute Value Of Integers |-10| And |-12| Are",
            "-10 and 12", "10 and -12",
            "10 and 12", "-10 and -12", 3
        )

        questionList.add(que2)


        val que3 = Question(
            3, "If A Book Is Sold For $250 At 15% Loss On Cost Then Cost Price Of Book Is",
            "$300", "$293",
            "$200", "$294", 4
        )

        questionList.add(que3)

        // 4
        val que4 = Question(
            4, "Angles In Opposite Segments Are Classified As?",
            "Primary", "Supplementary",
            "Segmental", "Complementary", 2
        )

        questionList.add(que4)

        // 5
        val que5 = Question(
            5, "Which Of These Numbers Is Not An Integer -2, 0, 100, 1/2?",
            "-2", "0",
            "1/2", "100", 3
        )

        questionList.add(que5)

        // 6
        val que6 = Question(
            6, "What Comes Next In The Fibonacci Sequence 0,1,1,2,3,5,8,13,—?",
            "21", "22",
            "15", "33", 1
        )

        questionList.add(que6)

        // 7
        val que7 = Question(
            7, "In A City Book Store, 70% Of Books Are Classified As Fiction and Remainder As non-fiction. There Are Total 2400 more fiction Books than non-fiction books. At an average cost of $22, owner wants to increase Fiction Books By 5%. Cost Of New Fiction Books Is?",
            "$4,620", "$4,600",
            "$4,000", "$400", 1
        )

        questionList.add(que7)

        // 8
        val que8 = Question(
            8, "Two Trignometrical Ratios Whose Values Cannot Be Greater Than 1 Are?",
            "Arctangent and Cotangent", "Arcsine and Arccosine",
            "Tangent and Cotangent", "Sine And Cosine", 4
        )

        questionList.add(que8)

        // 9
        val que9 = Question(
            9, "In Formula 2πr, ‘R’ Is Considered As",
            "Rectangle ", "Radius",
            "Root ", "Right ", 2
        )

        questionList.add(que9)

        // 10
        val que10 = Question(
            10, "Formula Used To Measure Circumference Of Circle Is",
            "2πr", "52πr",
            "2π", "2r", 1
        )

        questionList.add(que10)
        return questionList
    }

    fun getQuestion6(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1,"Formula For Area Of A Triangle Is",
            "Base X Height", "1/2 X Base",
            "1/2 X Height X Height", "1/2 X Base X Height", 4
        )
        questionList.add(que1)

        val que2 = Question(
            2, "If A = 16.5 Cm, Angle B = 52° And C = 10 Cm Then Area Of Δ ABC Is",
            "65 Cm²", "65.01 Cm²",
            "67.1 Cm²", "65.1 Cm²", 2
        )

        questionList.add(que2)


        val que3 = Question(
            3, "Formula Used To Measure Area Of Circle Is",
            "2Πr²", "2r²",
            "r²", "Πr²", 4
        )

        questionList.add(que3)

        // 4
        val que4 = Question(
            4, "If A Handbag Is Sold For $2000 At Gain Of 20% On Cost Price Then Cost Is",
            "$1,000", "$1,666",
            "$3,666", "$1,766", 2
        )

        questionList.add(que4)

        // 5
        val que5 = Question(
            5, "A Six-Sided Die Is Rolled Once. What Is The Probability That The Number Rolled Is An Even Number Greater Than 2?",
            "2/3", "3",
            "1/3", "4/3", 3
        )

        questionList.add(que5)

        // 6
        val que6 = Question(
            6, "Point A Has The Coordinates (2,2). What Are The Coordinates Of Its Image Point If It Is Translated 2 Units Up And 5 Units To The Left, And Reflected In The X Axis?",
            "(-3,-4)", "(-1,-4)",
            "(-1,-6)", "(-3,-5)", 1
        )

        questionList.add(que6)

        // 7
        val que7 = Question(
            7, "If The New Cube Has A Volume Of 64,000 Cubic Centimeters, What Is The Area Of One Face Of The Original Cube?",
            "400 Square Cm", "400 Cm",
            "4,000 Square Cm", "450 Square Cm", 1
        )

        questionList.add(que7)

        // 8
        val que8 = Question(
            8, "One Leg Of A Right Triangle Is 18 Cm And Its Area Is 108 Square Cm. Find Its Primeter.",
            "51.6 Cm square", "51 Cm",
            "50 Cm", "51.6 Cm", 4
        )

        questionList.add(que8)

        // 9
        val que9 = Question(
            9, "Find The Circumference Of A Circle Inscribed Inside A Square With A Side Of 20 Meters.",
            "20 Meter ", "20pi Meter",
            "21pi Meter ", "30pi Meter ", 2
        )

        questionList.add(que9)

        // 10
        val que10 = Question(
            10, "Polygon with 5 sides have the sum of interior angles?",
            "9180 Degrees", "59180 Degrees",
            "180 Degrees", "360 Degrees", 1
        )

        questionList.add(que10)
        return questionList
    }
}