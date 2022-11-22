package com.farlan.foodrecipe.`object`

import com.farlan.foodrecipe.R
import com.farlan.foodrecipe.model.FoodRecipe

object FoodRecipeData {
    private val names = arrayOf(
        "Rendang",
        "Rawon",
        "Sate Ayam Madura",
        "Tahu Tempe Bacem",
        "Soto Ayam",
        "Sop Buntut",
        "Mie Goreng",
        "Ayam Goreng",
        "Ayam Panggang Bumbu Merah",
        "Sambal Petai Udang",
        "Nasi Goreng",
    )

    private val descriptions = arrayOf(
        "Rendang atau randang dalam bahasa Minangkabau adalah Masakan Minangkabau yang berbahan dasar daging yang berasal dari Sumatra Barat, Indonesia.",
        "Rawon adalah masakan Indonesia berupa sup daging berkuah hitam dengan campuran bumbu khas yang menggunakan kluwek.",
        "Sate Ayam Madura adalah sate ayam yang memiliki bumbu khas Madura.",
        "Tahu Tempe Bacem merupakan sajian panganan dari daerah Mataraman seperti kota Semarang, Surakarta dan Magelang di Jawa Tengah dan DI Yogyakarta.",
        "Soto Ayam adalah makanan khas Indonesia yang berupa sejenis sup ayam dengan kuah yang berwarna kekuningan.",
        "Sop Buntut adalah salah satu masakan populer dalam masakan Indonesia. Terbuat dari potongan ekor sapi yang dibumbui kemudian dibakar atau digoreng dan dimasukkan ke dalam kuah kaldu sapi yang agak bening bersama irisan kentang, wortel, tomat, daun bawang, seledri dan taburan bawang goreng.",
        "Mi Goreng berarti \"mi yang digoreng\" adalah hidangan mie yang dimasak dengan digoreng tumis khas Indonesia.",
        "Ayam Goreng adalah hidangan Indonesia yang merupakan ayam yang digoreng dalam minyak goreng.",
        "Ayam Panggang Bumbu Merah merupakan sajian ayam yang panggang yang memiliki cita rasa sedikit pedas dan sentuhan rasa manis sebagai penyeimbang rasa.",
        "Sambal Petai Udang merupakan masakan Indonesia yang memiliki perpaduan manis udang dan aroma khas petai. Dimasak dengan bumbu balado yang pedas gurih, disajikan bersama nasi hangat.",
        "Nasi Goreng adalah makanan berupa nasi yang digoreng dan dicampur dalam minyak goreng, margarin atau mentega.",
    )

    private val images = intArrayOf(
        R.drawable.rendang,
        R.drawable.rawon,
        R.drawable.sate_ayam_madura,
        R.drawable.tahu_tempe_bacem,
        R.drawable.soto_ayam,
        R.drawable.sop_buntut,
        R.drawable.mie_goreng,
        R.drawable.ayam_goreng,
        R.drawable.ayam_panggang_bumbu_merah,
        R.drawable.sambal_petai_udang,
        R.drawable.nasi_goreng,
    )

    val listData: ArrayList<FoodRecipe>
        get() {
            val list = arrayListOf<FoodRecipe>()
            for (position in names.indices) {
                val foodRecipe = FoodRecipe()
                foodRecipe.name = names[position]
                foodRecipe.description = descriptions[position]
                foodRecipe.image = images[position]
                list.add(foodRecipe)
            }

            return list
        }
}
