package com.ritul.quizapp

object ResConst {


    fun getRes(): ArrayList<Resource>{
        val infoList = ArrayList<Resource>()
        
        val res1 = Resource(

            1,
            "Resources",
            "1. Khan Academy has videos and lessons for all grades.\n" +
                    "\n" +
                    "2. Hippocampus has pre-algebra and geometry lessons and practice games. \n" +
                    "\n" +
                    "3. Education Possible has a list of over 50 fun and interactive math games for middle schoolers.\n" +
                    "\n" +
                    "4. Math Snacks has games, animation and interactive tools to help middle schoolers with basic concepts.\n" +
                    "\n" +
                    "5. Prodigy offers fun math games for middle schoolers. Many teachers use it in class and report it turns math haters into math lovers. \n" +
                    "\n" +
                    "6. Math TV is like Netflix for math! Videos are broken down by skill. \n" +
                    "\n" +
                    "7. CoolMath offers lessons and games in pre-algebra, algebra, and pre-calculus. \n" +
                    "\n" +
                    "8. Online Math has games broken down by grade level from 1 – 8. \n" +
                    "\n" +
                    "9. Math Is Fun offers lessons, games, worksheets and puzzles on all sorts of math concepts including speed and velocity, money and geometry.\n" +
                    "\n" +
                    "10. Illustrative Mathematics offers problem-based curriculum for grades 6-8.\n" +
                    "\n" +
                    "11. Multiplication.com is great for middle schoolers who are a little rusty on those multiplication facts. It’s designed for elementary – high school students with age-appropriate games so kids don’t feel self-conscious about their skills."
        )
        infoList.add(res1)




        return infoList
    }
}