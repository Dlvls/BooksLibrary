package com.example.bookslib

object BookData {
    private val id = intArrayOf(
        9786020633176.toInt(),
        9786233463034.toInt(),
        9780070131439.toInt(),
        9786027720749.toInt(),
        9780062316097.toInt(),
        9780062641540.toInt(),
        9781910701874.toInt(),
        9780857380975.toInt(),
        9780857197689.toInt(),
        9781544507859.toInt()
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
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla ornare augue dui, lacinia imperdiet turpis tempor luctus. Praesent sit amet diam dictum, lacinia magna sed, accumsan quam. Nunc accumsan sapien sapien, quis consectetur libero rutrum ultrices. Mauris a sapien nisi. Donec sit amet nunc mauris. Integer lacinia non tortor vel dictum. Mauris vel eros at orci viverra feugiat.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla ornare augue dui, lacinia imperdiet turpis tempor luctus. Praesent sit amet diam dictum, lacinia magna sed, accumsan quam. Nunc accumsan sapien sapien, quis consectetur libero rutrum ultrices. Mauris a sapien nisi. Donec sit amet nunc mauris. Integer lacinia non tortor vel dictum. Mauris vel eros at orci viverra feugiat.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla ornare augue dui, lacinia imperdiet turpis tempor luctus. Praesent sit amet diam dictum, lacinia magna sed, accumsan quam. Nunc accumsan sapien sapien, quis consectetur libero rutrum ultrices. Mauris a sapien nisi. Donec sit amet nunc mauris. Integer lacinia non tortor vel dictum. Mauris vel eros at orci viverra feugiat.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla ornare augue dui, lacinia imperdiet turpis tempor luctus. Praesent sit amet diam dictum, lacinia magna sed, accumsan quam. Nunc accumsan sapien sapien, quis consectetur libero rutrum ultrices. Mauris a sapien nisi. Donec sit amet nunc mauris. Integer lacinia non tortor vel dictum. Mauris vel eros at orci viverra feugiat.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla ornare augue dui, lacinia imperdiet turpis tempor luctus. Praesent sit amet diam dictum, lacinia magna sed, accumsan quam. Nunc accumsan sapien sapien, quis consectetur libero rutrum ultrices. Mauris a sapien nisi. Donec sit amet nunc mauris. Integer lacinia non tortor vel dictum. Mauris vel eros at orci viverra feugiat.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla ornare augue dui, lacinia imperdiet turpis tempor luctus. Praesent sit amet diam dictum, lacinia magna sed, accumsan quam. Nunc accumsan sapien sapien, quis consectetur libero rutrum ultrices. Mauris a sapien nisi. Donec sit amet nunc mauris. Integer lacinia non tortor vel dictum. Mauris vel eros at orci viverra feugiat.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla ornare augue dui, lacinia imperdiet turpis tempor luctus. Praesent sit amet diam dictum, lacinia magna sed, accumsan quam. Nunc accumsan sapien sapien, quis consectetur libero rutrum ultrices. Mauris a sapien nisi. Donec sit amet nunc mauris. Integer lacinia non tortor vel dictum. Mauris vel eros at orci viverra feugiat.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla ornare augue dui, lacinia imperdiet turpis tempor luctus. Praesent sit amet diam dictum, lacinia magna sed, accumsan quam. Nunc accumsan sapien sapien, quis consectetur libero rutrum ultrices. Mauris a sapien nisi. Donec sit amet nunc mauris. Integer lacinia non tortor vel dictum. Mauris vel eros at orci viverra feugiat.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla ornare augue dui, lacinia imperdiet turpis tempor luctus. Praesent sit amet diam dictum, lacinia magna sed, accumsan quam. Nunc accumsan sapien sapien, quis consectetur libero rutrum ultrices. Mauris a sapien nisi. Donec sit amet nunc mauris. Integer lacinia non tortor vel dictum. Mauris vel eros at orci viverra feugiat.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla ornare augue dui, lacinia imperdiet turpis tempor luctus. Praesent sit amet diam dictum, lacinia magna sed, accumsan quam. Nunc accumsan sapien sapien, quis consectetur libero rutrum ultrices. Mauris a sapien nisi. Donec sit amet nunc mauris. Integer lacinia non tortor vel dictum. Mauris vel eros at orci viverra feugiat.",
    )
    private val publisher = arrayOf(
        "Gramedia Pustaka Utama",
        "Pbk",
        "Gramedia Pustaka Utama",
        "Gramedia Pustaka Utama",
        "Gramedia Pustaka Utama",
        "Gramedia Pustaka Utama",
        "Gramedia Pustaka Utama",
        "Gramedia Pustaka Utama",
        "Gramedia Pustaka Utama",
        "Gramedia Pustaka Utama",
    )

    private val img = intArrayOf(
        R.drawable.atomic_habits,
        R.drawable.filosofi_teras,
        R.drawable.introduction_to_algorithm,
        R.drawable.islam_yang_saya_anut,
        R.drawable.sapeins,
        R.drawable.seni_untuk_bersikap_bodo_amat,
        R.drawable.homo_deus,
        R.drawable.sejarah_dunia_yang_disembunyikan,
        R.drawable.pyschology_of_money,
        R.drawable.cant_hurt,
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