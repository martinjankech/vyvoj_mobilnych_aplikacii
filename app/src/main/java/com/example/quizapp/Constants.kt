package com.example.quizapp

object Constants{
    const val USER_NAME:String="user_name"
    const val TOTAL_QUESTIOMS:String="total_question"
    const val CORRECT_ANSWERS:String="correct_answers"

    fun getQuestion():ArrayList<Question>{
        val questionsList=ArrayList<Question>()
        val que1 = Question(
            1, "Akej firme patrí logo?",
            R.drawable.ic_coca_cola,
            "Coca-Cola", "Colgate-Palmolive",
            "Chemetron", "Chanel", 1
        )
        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Akej firme patrí logo?",
            R.drawable.apple,
            "Amazon", "Apple",
            "Adecco", "Accenture", 2
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Akej firme patrí logo?",
            R.drawable.lipton,
            "Louis Vuitton", "LinkedIn",
            "Lipton", "L'Oréal", 3
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Akej firme patrí logo?",
            R.drawable.mastercard,
            "PayPal", "Visa",
            "Maestro", "Mastercard", 4
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Akej firme patrí logo?",
            R.drawable.starbucks,
            "Costa Coffee", "Starbucks",
            "McCafé", "Spotify", 2
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Akej firme patrí logo?",
            R.drawable.walmart,
            "Sunflow Metals", "Walmart",
            "Sky Gold", "Whirlpool", 2
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Akej firme patrí logo?",
            R.drawable.rolex,
            "Rolex", "Casio",
            "Swatch", "Seiko", 1
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "Akej firme patrí logo?",
            R.drawable.swarovski,
            "Dior", "Gucci",
            "Swarovski", " Pandora", 3
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Akej firme patrí logo?",
            R.drawable.dominos,
            "Papa John's", "Pizza Hut",
            "Subway", "Dominos", 4
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "Akej firme patrí logo?",
            R.drawable.tesla,
            "Tesla", "Chevrolet",
            "BMW", "Audi", 1
        )

        questionsList.add(que10)

        return questionsList
    }


}