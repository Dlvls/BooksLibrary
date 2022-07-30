package com.example.bookslib

object BookData {
    private val id = intArrayOf(
        9786020633176.toInt(),
        9786233463034.toInt(),
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        10
    )
    private val title = arrayOf(
        "Atomic Habits",
        "Filosofi Teras",
        "Introduction To Algorithm",
        "Islam yang Saya Anut",
        "Sapiens : A Brief History of Humankind",
        "Seni Untuk Bersikap Bodo Amat",
        "Homo Deus : A Brief History of Tomorrow",
        "Sejarah Dunia yang Disembunyikan",
        "The Psychology of Money",
        "Can't Hurt Me: Master Your Mind and Defy the Odds"
    )
    private val writer = arrayOf(
        "James Clear",
        "Henry Manampiring",
        "Belum diisi",
        "Belum diisi",
        "Belum diisi",
        "Belum diisi",
        "Belum diisi",
        "Belum diisi",
        "Belum diisi",
        "Belum diisi",
    )
    private val pages = intArrayOf(
        356,
        298,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
    )
    private val desc = arrayOf(
        "Pakar kebiasaan terkenal kelas dunia James Clear telah menemukan sebuah cara lain. Ia tahu bahwa perubahan nyata berasal dari efek gabungan ratusan keputusan kecil—dari mengerjakan dua push-up sehari, bangun lima menit lebih awal, sampai menahan sebentar hasrat untuk menelepon. Ia menyebut semua tadi atomic habits." ,
        "Stoisisme, atau Filosofi Teras, adalah filsafat Yunani-Romawi kuno yang bisa membantu kita mengatasi emosi negatif dan menghasilkan mental yang tangguh dalam menghadapi naik-turun nya kehidupan. Jauh dari kesan filsafat sebagai topik berat dan mengawang-awang, Filosofi Teras justru bersifat praktis dan relevan dengan kehidupan Generasi Milenial dan Gen-Z masa kini.",
        "Belum diisi",
        "Belum diisi",
        "Belum diisi",
        "Belum diisi",
        "Belum diisi",
        "Belum diisi",
        "Belum diisi",
        "Belum diisi",
    )
    private val publisher = arrayOf(
        "Gramedia Pustaka Utama",
        "Pbk",
        "Belum diisi",
        "Belum diisi",
        "Belum diisi",
        "Belum diisi",
        "Belum diisi",
        "Belum diisi",
        "Belum diisi",
        "Belum diisi",
    )

    private val img = intArrayOf(
        R.drawable.atomic_habits,
        R.drawable.book1,
        R.drawable.book1,
        R.drawable.book1,
        R.drawable.book1,
        R.drawable.book1,
        R.drawable.book1,
        R.drawable.book1,
        R.drawable.book1,
        R.drawable.book1,
    )

    val listData: ArrayList<BookModel>
        get() {
            val list = arrayListOf<BookModel>()
            for (position in id.indices) {
                val books = BookModel()
                books.id = id[position]
                books.title = title[position]
                books.writer = writer[position]
                books.pages = pages[position]
                books.desc = desc[position]
                books.publisher = publisher[position]
                books.img = img[position]

                list.add(books)
            }
            return list
        }
}