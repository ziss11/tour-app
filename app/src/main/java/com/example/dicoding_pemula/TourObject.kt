package com.example.dicoding_pemula

object TourObject {
    private val tourNames = arrayOf(
        "Pantai Parai Tenggiri",
        "Nusa Dua",
        "Gunung Rinjani",
        "Danau Toba",
        "Nusa Penida",
        "Taman Laut Bunaken",
        "Wakatobi",
        "Kepulauan Raja Ampat",
        "Gunung Bromo",
        "Pulau Komodo"
    )

    private val tourCity = arrayOf(
        "Bangka Belitung",
        "Bali",
        "Lombok, NTB",
        "Sumatera Utara",
        "Bali",
        "Sulawesi Utara",
        "Sulawesi Tenggara",
        "Papua Barat",
        "Jawa Timur",
        "Nusa Tenggara Timur",
    )

    private val tourImages = intArrayOf(
        R.drawable.pantai_parai_tenggiri,
        R.drawable.nusa_dua_bali,
        R.drawable.gunung_rinjani,
        R.drawable.danau_toba,
        R.drawable.nusa_penida,
        R.drawable.bunaken,
        R.drawable.wakatobi,
        R.drawable.raja_ampat,
        R.drawable.gunung_bromo,
        R.drawable.pulau_komodo,
    )

    private val tourDetails = arrayOf(
        "Berbeda dengan pantai lain pada umumnya, Parai Tenggiri memiliki struktur pantai yang " +
                "landai dengan air laut berwarna hijau toska serta pasir putihnya yang lembut. " +
                "Ombak di pantai ini juga tenang sehingga menjadi salah satu alasan yang menarik " +
                "bagi wisatawan yang senang berenang. " +
                "Tidak hanya berenang, kamu juga bisa menikmati aktivitas memancing, parasailing, " +
                "menyelam, snorkeling, dan masih banyak lainnya. ",
        "Pulau Seribu Dewa satu ini memang tidak perlu diragukan lagi terkait keindahan dan " +
                "pesonanya dalam memikat para wisatawan dalam negeri maupun mancanegara. " +
                "Di Bali, ada satu tempat wisata yang begitu cantik, yakni Nusa Dua. " +
                "Objek wisata pantai ini memiliki pasir putih yang lembut dan air laut yang " +
                "berwarna biru jernih. Kamu akan dimanjakan dengan berbagai fasilitas saat " +
                "berkunjung ke tempat satu ini. Mulai dari penginapan dan resort yang berkelas, " +
                "restoran, pusat perbelanjaan, hingga aktivitas berselancar di pantainya.",
        "Selain Gili Trawangan, di Nusa Tenggara Barat juga terdapat wisata yang tak kalah populer " +
                "dan cocok bagi kamu yang suka mendaki, yakni Gunung Rinjani. Gunung ini adalah " +
                "gunung berapi tertinggi kedua yang ada di Indonesia.Gunung Rinjani memiliki " +
                "pemandangan terindah se-Asia dengan hamparan bunga edelweis dan Danau Segara Anak. " +
                "Di tempat ini juga bisa menjadi spot menarik bagi para pendaki untuk mendirikan " +
                "tenda, mandi air hangat, maupun memancing ikan.Namun sebelum itu, buatlah " +
                "persiapan yang matang sebelum memutuskan untuk mendaki. Kamu juga perlu menyiapkan " +
                "bekal mental dan stamina agar tidak menyerah di tengah jalan.",
        "Danau Toba sudah lama terkenal sebagai salah satu objek wisata Indonesia favorit yang " +
                "sering dikunjungi sejak tahun 1980-an lho! Objek wisata Indonesia yang terkenal " +
                "di dunia ini memiliki luas 1.145 kilometer persegi. Di tengah danau terdapat Pulau Samosir yang luasnya hampir sebanding " +
                "dengan negara Singapura. Bisa bayangin kan Toppers, betapa megahnya Danau " +
                "Toba ini? Selain terluas, danau ini juga termasuk salah satu danau " +
                "terdalam di dunia dengan kedalaman sekitar 450 meter.",
        "Pulau Bali, sudah tidak bisa dipungkiri lagi namanya memang merajalela ke seluruh dunia " +
                "karena pemandangannya yang indah, budayanya yang masih kental terasa dan pantai " +
                "nya yang eksotis.Saat Toppers berkunjung ke Bali jangan heran kalau banyak " +
                "banget turis berlalu lalang di sana, bahkan beberapa ada yang menetap di Bali lho!" +
                "Salah satu objek wisata di Bali yang populer di mata dunia saat ini adalah " +
                "Nusa Penida. Tempat wisata Indonesia favorit ini adalah pilihan tepat untuk " +
                "Toppers yang suka melakukan Island Hoping, dan menikmati keindahan bawah laut " +
                "dengan snorkeling. Dengan panorama pantai yang indah Nusa Penida dan " +
                "pulau-pulau kecil sekitarnya menawarkan pengalaman berbeda dan tentunya akan " +
                "memanjakan Toppers yang juga memiliki hobi fotografi.",
        "Destinasi wisata di Indonesia yang populer di mancanegara selanjutnya adalah Taman Laut " +
                "Bunaken yang berada di Teluk Manado. Bunaken menjadi salah satu objek wisata " +
                "di Indonesia yang mengundang decak kagum karena keindahan taman bawah lautnya " +
                "yang sulit ditemukan di negara lain. Berkunjung ke Taman Laut Bunaken, " +
                "Toppers akan menemukan keindahan kehidupan di dalam laut yang membuat mata " +
                "kamu tidak bisa berhenti memandangnya. Di dalam taman laut ini terdapat 13 " +
                "jenis terumbu karang yang didominasi dengan bebatuan laut. Selain itu, " +
                "pemandangan yang paling menarik adalah adanya terumbu karang terjal vertikal " +
                "yang menjulang ke bawah sedalam 25 – 50 meter. Tidak sampai di situ, mata " +
                "kita akan dimanjakan dengan 91 jenis ikan yang ada di dalamnya. Tidak heran " +
                "kalau Taman Laut Bunaken menjadi salah satu destinasi bagi para wisatawan " +
                "terutama para pecinta laut. Apalagi tujuan wisata Indonesia favorit " +
                "wisatawan asing ini menyediakan fasilitas untuk scuba diving dengan 20 titik " +
                "penyelaman terbaik, di mana penyelam dapat kesempatan berenang di dasar laut " +
                "dengan beragam biota laut yang menakjubkan.",
        "Masih di Pulau Sulawesi, Taman Nasional Wakatobi juga merupakan salah satu tujuan wisata " +
                "bawah laut yang populer dan mendunia. Dengan luas mencapai 13.900 km2, " +
                "tujuan wisata terkenal asal Indonesia ini memiliki tak kurang dari 112 jenis " +
                "terumbu karang yang bersimbiosis dengan ikan-ikan bawah laut sehingga menciptakan " +
                "panorama bawah laut yang tiada tanding. Semuanya itu menjadikan Wakatobi " +
                "sebagai salah satu surga menyelam bagi para traveler dari berbagai penjuru dunia.",
        "Surga dunia di Indonesia selanjutnya adalah kepulauan Raja Ampat yang terletak di Papua " +
                "Barat dengan kekayaan laut terlengkap di bumi. Raja Ampat atau Empat Raja " +
                "merupakan 4 pulau indah yang merupakan penghasil lukisan batu kuno. Empat pulau " +
                "utama yang dimaksud adalah Waigeo, Salawati, Batanta, dan Misool. Nama-nama " +
                "tersebut berasal dari mitos lokal dari warga di sekitar pulau Raja Ampat. " +
                "Keindahan dan kemegahan dari objek wisata populer asal Indonesia ini mampu " +
                "mengundang para wisatawan dari seluruh dunia untuk datang ke sini dan merasakan " +
                "pengalaman sekaligus pemandangan yang tidak akan terlupakan. Dengan wilayah " +
                "pulau mencakup hingga 4,6 juta hektar tanah dan laut, kita bisa menemukan 540 " +
                "jenis karang, 1.511 spesies ikan, serta 700 jenis moluska.",
        "Salah satu gunung berapi yang masih aktif ini memiliki pesona khas berupa gurun pasir " +
                "yang sangat luat. Meskipun bukan salah satu gunung tertinggi di Indonesia, " +
                "namun keindahan Gunung Bromo tidak ada duanya dan membuat para pengunjung dapat " +
                "merasakan pemandangan yang fantastis dan spektakuler. Wisatawan dapat " +
                "berkuda dan mendaki gunung bromo untuk menikmati keindahan yang menawan saat " +
                "matahari terbit dan terbenam. Bisa jadi pengalaman secara langsung " +
                "yang tidak terlupakan lho Toppers! Dengan keindahan yang menakjubkan itu " +
                "tidak heran jika objek wisata di Indonesia satu ini menjadi para wisatawan " +
                "mancanegara yang berkunjung ke Indonesia.",
        "Destinasi wisata Indonesia yang tersohor di mata dunia selanjutnya adalah Pulau Komodo. " +
                "Pulau yang berlokasi di Kepulauan Nusa Tenggara Timur ini merupakan rumah bagi " +
                "ratusan Komodo, hewan endemik yang hanya ada di Indonesia. Selain bisa " +
                "mengamati perilaku dan mengeksplorasi habitat dari hewan purba ini, Pulau Komodo " +
                "juga menawarkan panorama alam yang menakjubkan. Salah satunya adalah pantai " +
                "dengan pasir berwarna merah muda yang dikenal dengan nama “Pink Beach“. " +
                "Pantai seperti ini hanya terdapat tujuh di seluruh dunia sehingga menjadikannya " +
                "sebagai salah satu tujuan wisata Indonesia yang mendunia."
    )

    val listTour: ArrayList<Tour>
        get() {
            val list = arrayListOf<Tour>()
            for (position in tourNames.indices) {
                val tour = Tour()
                tour.name = tourNames[position]
                tour.city = tourCity[position]
                tour.detail = tourDetails[position]
                tour.photo = tourImages[position]
                list.add(tour)
            }
            return list
        }
}