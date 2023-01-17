package com.example.internetmarketing.Papka

import com.mindorks.example.pythonplus.quiz_section.QuestionsList

object QuestionsBank {

    private fun python1_Questions(): List<QuestionsList> {
        val questionsLists: MutableList<QuestionsList> = ArrayList()

        //Create object of QuestionsList class and pass a questions along with options and answer
        val question1 = QuestionsList(
            "Marketing nima ?",
            "bu alohida shaxslar va tashkilotlar maqsadlarini qoniqtiradigan ayirboshlash orqali fikrni rejalashtirish va amalga oshirish, narx belgilash, g‘oya, tovar va xizmatlarni targ‘ib etish va realizasiyasi jarayonidir",
            "boshqa nomga ham ega – shaxs marketingi",
            "bu inson obro‘-e'tibori, uning boshqa kishilar" +
                    "ongidagi obrazidir. Personal brendlar ko‘pincha taniqli shaxslar" +
                    "(sportchilar, siyosatchilar, artistlar va hk.) uchun yaratiladi",
            "ommaviy ishlab chiqarish va uni bozorda iste'molchi uchun qulaylik",
            "bu alohida shaxslar va tashkilotlar maqsadlarini qoniqtiradigan ayirboshlash orqali fikrni rejalashtirish va amalga oshirish, narx belgilash, g‘oya, tovar va xizmatlarni targ‘ib etish va realizasiyasi jarayonidir",
            ""
        )
        val question2 = QuestionsList(
            "Nechanchi yilda Amazon kompaniyasi o‘zining internet-magazinini ochdi ?",
            "1992-yilda",
            "1995 yilda",
            "1990-yilda",
            "1993-yilda",
            "1995 yilda",
            ""
        )
        val question3 = QuestionsList(
            "Price nima ?",
            "Mahsulot",
            "Reklama",
            "Unday so'z yo'q",
            "Narx",
            "Narx",
            ""
        )
        val question4 = QuestionsList(
            "Internetdagi biznesi nima ?",
            "bu bir sutkada 24 soat, haftada 7 kun,ishlaydigan real vaqtdagi biznesdir",
            "Ora orada ishlaydigan bisnes",
            "Foyda orqali ishlaydigan biznes",
            "Unday bisnez yo'q",
            "bu bir sutkada 24 soat, haftada 7 kun,ishlaydigan real vaqtdagi biznesdir",
            ""
        )
        val question5 = QuestionsList(
            "Nechanchi asrda Marketingning fan va biznes amaliyoti sifatidagi rivojlanishi boshlanadi",
            "XX asrda",
            "IV asrda",
            "X asrda",
            "VI asrda",
            "XX asrda",
            ""
        )
        val question6 = QuestionsList(
            "Nechanchi yilda First Virtual kompaniyasi tovarlarni internet-magazinda sotib olganda to‘lov qiladigan birinchi to‘lov tizimiga aylandi",
            "1990-yil",
            "1987-yil",
            "1993-yil",
            "1994-yil",
            "1994-yil",
            ""
        )

        val question7 = QuestionsList(
            "Nechanchi yillar o‘rtasida Google kompaniyasi AdWords kontekstli reklamasi \n" +
                    "xizmatini ishga tushurdi, va shu yildan e'tiboran Yahoo va Google \n" +
                    "bozorda kontekstli reklamani asosiy ishlab chiqaruvchilari bo‘ldi",
            "2000-yil",
            "1900-yil",
            "2020-yil",
            "1994-yil",
            "2000-yil",
            ""
        )

        val question8 = QuestionsList(
            " – bu foydalanuvchilarga ularning qidiruv \n" +
                    "talabnomalari, qiziqishlari yoki internetdagi xulq-atvoriga muvofiq \n" +
                    "ravishda ko‘rsatiladigan turli e'lonlar",
            "Kontekstli reklama",
            "obot reklama",
            "Several reklama",
            "Yeye reklama",
            "Kontekstli reklama",
            ""
        )

        val question9 = QuestionsList(
            "Qaysi reklama eng mashhur reklama bo‘lib \n" +
                    "hisoblanadi. ",
            "Several reklama",
            "obot rekalam",
            "Koteksli reklama",
            "Qidiruv kontekstli ",
            "Qidiruv kontekstli ",
            ""
        )

        val question10 = QuestionsList(
            "Targeting nima ?",
            " (Google, Yandex) da berilgan \n" +
                    "kalit so‘zlarga mos joylashtirish joylarini avtomatik tanlash uchun \n" +
                    "qo‘llaniladi. Targetingning ushbu turi reklamaning maksimal \n" +
                    "samaradorligi va konversiya arzonligi qiziqtiradigan reklama \n" +
                    "beruvchilarga to‘g‘ri keladi, chunki e'lonlar sizning xabaringizga \n" +
                    "relevant bo‘lgan resurslarda ko‘rsatiladi",
            "butun auditoriya ichidan qidiruvning berilgan \n" +
                    "mezonlariga javob beradigan qismini ajratib olishga va reklamani aynan \n" +
                    "unga ko‘rsatishga imkon beradigan reklama mexanizmidir",
            " bu tashrif buyuruvchilar sonining maqsadli harakatni, \n" +
                    "ya'ni internet-resurs sohibiga foyda keltiradigan harakatni amalga \n" +
                    "oshirgan foydalanuvchilar soniga nisbatidir.",
            " bu qidiruv talabnomasining foydalanuvchi kutgan \n" +
                    "natijasiga muvofiqligi darajasi",
            "butun auditoriya ichidan qidiruvning berilgan \n" +
                    "mezonlariga javob beradigan qismini ajratib olishga va reklamani aynan \n" +
                    "unga ko‘rsatishga imkon beradigan reklama mexanizmidir",
            ""
        )

        val question11 = QuestionsList(
            " - Google AdWords mutaxassislari tomonidan ishlab \n" +
                    "chiqilgan Internet-marketing vositasidir. Remarketing texnologiyasi \n" +
                    "reklama beruvchilar saytlarida foydalanuvining hulq-atvoriga \n" +
                    "yo‘naltirilgan bo‘lib, u ko‘rgan, savatchaga qo‘shgan tovar va xizmatlar \n" +
                    "reklamasini ko‘rsatadi.\n",
            "Remarketing",
            "Relevantlilik",
            "Konversiya",
            "Targeting",
            "Remarketing",
            ""
        )

        val question12 = QuestionsList(
            " - bu reklama xarakterdagi grafik blokdir. U matn, video, \n" +
                    "statik va animasiyali tasvirlardan iborat bo‘lishi mumkin.\n",
            "Konversiya",
            "Grafik",
            "Banner",
            "Google kontekstli",
            "Banner",
            ""
        )

        val question13 = QuestionsList(
            " - reklama kampaniyasini olib borish texnikasi \n" +
                    "bo‘lib, bunda kompaniyaning tovar yoki xizmatlari to‘g‘risidagi \n" +
                    "ma'lumotni asosiy tarqatuvchisi maqsadli auditoriya vakillarining o‘zi \n" +
                    "bo‘ladi. Bu turdagi yondashuvda an'anaviy tovar afzalliklarining ta'rifi \n" +
                    "va uni xarid qilishga da'vat yo‘q bo‘lib, hattoki tovarga to‘g‘ri ishora \n" +
                    "ham har doim bo‘lmaydi.\n",
            "Virussiz marketing",
            "Anti marketing",
            "Virusli marketing",
            "Koko marketing",
            "Virusli marketing",
            ""
        )

        val question14 = QuestionsList(
            " - foydalanuvchilarga ma'lum harakatlari \n" +
                    "evaziga bonus va'da qiladi. Maqsad bu holatda tovar yoki xizmatni \n" +
                    "oddiy targ‘ib etish emas, balki maqsadli auditoriya bilan uzoq muddatli \n" +
                    "va unumdor aloqalar uchun asos yaratishdir. ",
            "Centivised viral (undov)",
            "Incent viral (undov)",
            "V viral (undov)",
            "Incentivised viral (undov)",
            "Incentivised viral (undov)",
            ""
        )

        val question15 = QuestionsList(
            " -  xavfli usul bo‘lib, u har vaqt ham to‘g‘ri \n" +
                    "bo‘lmaydi, ba'zan brendga zarar keltirishi ham mumkin. Maqsad – har \n" +
                    "qanday yo‘l bilan auditoriya e'tiborini jalb qilish.",
            "Buzz (mish-mishlar) ",
            "Incentivised viral (undov)",
            "Virus",
            "Internet",
            "Buzz (mish-mishlar) ",
            ""
        )

        val question16 = QuestionsList(
            "Ijtimoiy marketingni tashkil qilish nechta bosqichdan iborat",
            "4 ta",
            "10 ta",
            "8 ta",
            "3 ta",
            "10 ta",
            ""
        )

        val question17 = QuestionsList(
            "Ijtimoiy tarmoqlardagi marketing (SMM) atamasi o‘tgan asrning \n" +
                    "nechanchi yillarida ishlatila boshlandi.",
            "10",
            "50",
            "70",
            "90",
            "70",
            ""
        )

        val question18 = QuestionsList(
            "... -  Ushbu resurslar joylashgan hududda iqtisodiyotni \n" +
                    "yaxshilash maqsadida resurslarni birlashtirishga qaratilgan chora\u0002tadbirlar.\n",
            "Fandrayzing",
            "Marketing",
            "Xayriya ishlari.",
            "Homiylik",
            "Fandrayzing",
            ""
        )

        val question19 = QuestionsList(
            "  - Mashhur bo‘lgan ijtimoiy marketingning turlaridan biri. \n" +
                    "U ba'zi guruh insonlarga yordam ko‘rsatishdan iborat. Kam \n" +
                    "ta'minlangan oilalarni qo‘llab-quvvatlash, sport musobaqalarini \n" +
                    "tashkil qilish va hk.lar bunga misol bo‘ladi.\n",
            "Fandrayzing",
            "Marketing",
            "Xayriya ishlari.",
            "Homiylik",
            "Homiylik",
            ""
        )

        val question20 = QuestionsList(
            "SMM maqsadi ?",
            "xizmat ko‘rsatish yoki tovar sotishlarni \n" +
                    "jamiyat uchun foydali loyihalar bilan birlashtirish hisobiga potensial \n" +
                    "mijozlar sodiqligini oshirishdir",
            "  - Mashhur bo‘lgan ijtimoiy marketingning turlaridan biri. \\n\" +\n" +
                    "                    \"U ba'zi guruh insonlarga yordam ko‘rsatishdan iborat. Kam \\n\" +\n" +
                    "                    \"ta'minlangan oilalarni qo‘llab-quvvatlash, sport musobaqalarini \\n\" +\n" +
                    "                    \"tashkil qilish va hk.lar bunga misol bo‘ladi.\\n",
            "Bunga mijozlarda xayriya ishlariga yoki jamiyat \n" +
                    "uchun foydali bo‘lgan tadbirlarga aloqadorlik hissini \n" +
                    "shakllantiradigan aksiyalar kiradi",
            "Ushbu resurslar joylashgan hududda iqtisodiyotni \n" +
                    "yaxshilash maqsadida resurslarni birlashtirishga qaratilgan chora\u0002tadbirlar",
            "xizmat ko‘rsatish yoki tovar sotishlarni \n" +
                    "jamiyat uchun foydali loyihalar bilan birlashtirish hisobiga potensial \n" +
                    "mijozlar sodiqligini oshirishdir",
            ""
        )

        //add all questions to List<QuestionsList>
        questionsLists.add(question1)
        questionsLists.add(question2)
        questionsLists.add(question3)
        questionsLists.add(question4)
        questionsLists.add(question5)
        questionsLists.add(question6)
        questionsLists.add(question7)
        questionsLists.add(question8)
        questionsLists.add(question9)
        questionsLists.add(question10)
        questionsLists.add(question11)
        questionsLists.add(question12)
        questionsLists.add(question13)
        questionsLists.add(question14)
        questionsLists.add(question15)
        questionsLists.add(question16)
        questionsLists.add(question17)
        questionsLists.add(question18)
        questionsLists.add(question19)
        questionsLists.add(question20)
        questionsLists.shuffle()
        return questionsLists
    }

    private fun python2_Questions(): List<QuestionsList> {
        val questionsLists: MutableList<QuestionsList> = ArrayList()

        //Create object of QuestionsList class and pass a questions along with options and answer
        val question1 = QuestionsList(
            "%- ?",
            "Qoldiqli bo'lish",
            "Inkor",
            "Bo'lish",
            "Ko'paytirish",
            "Qoldiqli bo'lish",
            ""
        )
        val question2 = QuestionsList(
            "and operatorining vazifasi qanday ?",
            "Agar ikkala shart ham rost bo’lsa, rost qiymat qaytaradi.",
            "Kamida bitta shart rost bo’lsa ham rost qiymat qaytaradi",
            "Shart qiymatini teskarisiga o’zgartiradi, ya’ni rost bo’lsa yolg’on, yolg’on bo’lsa rost bo’ladi",
            "To'g'ri javob yo'q",
            "Agar ikkala shart ham rost bo’lsa, rost qiymat qaytaradi.",
            ""
        )
        val question3 = QuestionsList(
            "	is aniqlash operatorining vazifasi qanday?",
            "Obyektlar bir xil bo’lmasa rost, aks holda yolg’on qiymat qaytaradi",
            "Ikkala o’zgaruvchi ham bir xil obyekt bo’lsa rost, aks holda yolg’on qiymat qaytaradi",
            "Agar ikkala shart ham rost bo’lsa, rost qiymat qaytaradi.",
            "Kamida bitta shart rost bo’lsa ham rost qiymat qaytaradi",
            "Ikkala o’zgaruvchi ham bir xil obyekt bo’lsa rost, aks holda yolg’on qiymat qaytaradi",
            ""
        )
        val question4 = QuestionsList(
            "is not aniqlash operatorining vazifasi qanday?",
            "Obyektlar bir xil bo’lmasa rost, aks holda yolg’on qiymat qaytaradi",
            "Ikkala o’zgaruvchi ham bir xil obyekt bo’lsa rost, aks holda yolg’on qiymat qaytaradi",
            "Agar ikkala shart ham rost bo’lsa, rost qiymat qaytaradi.",
            "Kamida bitta shart rost bo’lsa ham rost qiymat qaytaradi",
            "Obyektlar bir xil bo’lmasa rost, aks holda yolg’on qiymat qaytaradi",
            ""
        )
        val question5 = QuestionsList(
            "in qanday operator turi?",
            "A'zolik operatori",
            "Aniqlash operatori",
            "Mantiqiy operatori",
            "Bitli operator",
            "A'zolik operatori",
            ""
        )

        //add all questions to List<QuestionsList>
        questionsLists.add(question1)
        questionsLists.add(question2)
        questionsLists.add(question3)
        questionsLists.add(question4)
        questionsLists.add(question5)
        return questionsLists
    }

    private fun python3_Questions(): List<QuestionsList> {
        val questionsLists: MutableList<QuestionsList> = ArrayList()

        //Create object of QuestionsList class and pass a questions along with options and answer
        val question1 = QuestionsList(
            "is operatori qanday operator?",
            "A'zolik operatori",
            "Aniqlash operatori",
            "Mantiqiy operatori",
            "Bitli operator",
            "Aniqlash operatori",
            ""
        )
        val question2 = QuestionsList(
            "is  not operatori qanday operator?",
            "A'zolik operatori",
            "Aniqlash operatori",
            "Mantiqiy operatori",
            "Bitli operator",
            "Aniqlash operatori",
            ""
        )
        val question3 = QuestionsList(
            "and operatori qanday operator?",
            "A'zolik operatori",
            "Aniqlash operatori",
            "Mantiqiy operatori",
            "Bitli operator",
            "Mantiq operatori",
            ""
        )
        val question4 = QuestionsList(
            "or operatori qanday operator?",
            "A'zolik operatori",
            "Aniqlash operatori",
            "Mantiqiy operatori",
            "Bitli operator",
            "Mantiq operatori",
            ""
        )
        val question5 = QuestionsList(
            "not operatori qanday operator?",
            "A'zolik operatori",
            "Aniqlash operatori",
            "Mantiqiy operatori",
            "Bitli operator",
            "Mantiq operatori",
            ""
        )
        val question6 = QuestionsList(
            "not in  operatori qanday operator?",
            "A'zolik operatori",
            "Aniqlash operatori",
            "Mantiqiy operatori",
            "Bitli operator",
            "A'zolik operatori",
            ""
        )

        //add all questions to List<QuestionsList>
        questionsLists.add(question1)
        questionsLists.add(question2)
        questionsLists.add(question3)
        questionsLists.add(question4)
        questionsLists.add(question5)
        questionsLists.add(question6)
        return questionsLists
    }

    private fun python4_Questions(): List<QuestionsList> {
        val questionsLists: MutableList<QuestionsList> = ArrayList()

        //Create object of QuestionsList class and pass a questions along with options and answer
        val question1 = QuestionsList(
            "Python kim tomonidan yaratilgan?",
            "Guido van Rossum ",
            "Tim Breness-Lii",
            "Rasmus Lerdof",
            "Brendan Eyx",
            "Guido van Rossum ",
            ""
        )
        val question2 = QuestionsList(
            "Python dasturlash tili nechanchi yil yaratilgan?",
            "1992-yil",
            "1991-yil",
            "1990-yil",
            "1993-yil",
            "1991-yil",
            ""
        )
        val question3 = QuestionsList(
            "Python qasyi sohalarda ishlatiladi?",
            "Web dasturlash (serverlar bilan",
            "Dasturiy ta’minot",
            "Tizim skriptlari",
            "Barcha javob to'g'ri",
            "Barcha javob to'g'ri",
            ""
        )
        val question4 = QuestionsList(
            "Izoh qoldirish qaysi belgi yordamida bajariladi?",
            "//",
            "*",
            "#",
            "$",
            "#",
            ""
        )
        val question5 = QuestionsList(
            "Pythonda o'zgaruvchilar tiplari e'lon qiinadimi?",
            "Ha",
            "Yo'q",
            "Bilmayman",
            "Mumkin",
            "Yo'q",
            ""
        )
        val question6 = QuestionsList(
            "O'zaruvchi nomlari qanday yozilishi kerak?",
            "O’zgaruvchi nomi raqam bilan boshlanishi kerak",
            "	O’zgaruvchi nomlari katta-kichik harflarni farqlamaydi ",
            "O’zgaruvchi nomi orasida bo’shliq (probel) bo’lishi kerak",
            "	O’zgaruvchi nomi faqat harflar, raqamlar va tag chiziqdan iborat bo’lishi mumkin",
            "O’zgaruvchi nomi faqat harflar, raqamlar va tag chiziqdan iborat bo’lishi mumkin",
            ""
        )

        //add all questions to List<QuestionsList>
        questionsLists.add(question1)
        questionsLists.add(question2)
        questionsLists.add(question3)
        questionsLists.add(question4)
        questionsLists.add(question5)
        questionsLists.add(question6)
        return questionsLists
    }


    private fun python5_Questions(): List<QuestionsList> {
        val questionsLists: MutableList<QuestionsList> = ArrayList()

        //Create object of QuestionsList class and pass a questions along with options and answer
        val question1 = QuestionsList(
            "%- ?",
            "Qoldiqli bo'lish",
            "Inkor",
            "Bo'lish",
            "Ko'paytirish",
            "Qoldiqli bo'lish",
            ""
        )
        val question2 = QuestionsList(
            "and operatorining vazifasi qanday ?",
            "Agar ikkala shart ham rost bo’lsa, rost qiymat qaytaradi.",
            "Kamida bitta shart rost bo’lsa ham rost qiymat qaytaradi",
            "Shart qiymatini teskarisiga o’zgartiradi, ya’ni rost bo’lsa yolg’on, yolg’on bo’lsa rost bo’ladi",
            "To'g'ri javob yo'q",
            "Agar ikkala shart ham rost bo’lsa, rost qiymat qaytaradi.",
            ""
        )
        val question3 = QuestionsList(
            "	is aniqlash operatorining vazifasi qanday?",
            "Obyektlar bir xil bo’lmasa rost, aks holda yolg’on qiymat qaytaradi",
            "Ikkala o’zgaruvchi ham bir xil obyekt bo’lsa rost, aks holda yolg’on qiymat qaytaradi",
            "Agar ikkala shart ham rost bo’lsa, rost qiymat qaytaradi.",
            "Kamida bitta shart rost bo’lsa ham rost qiymat qaytaradi",
            "Ikkala o’zgaruvchi ham bir xil obyekt bo’lsa rost, aks holda yolg’on qiymat qaytaradi",
            ""
        )
        val question4 = QuestionsList(
            "is not aniqlash operatorining vazifasi qanday?",
            "Obyektlar bir xil bo’lmasa rost, aks holda yolg’on qiymat qaytaradi",
            "Ikkala o’zgaruvchi ham bir xil obyekt bo’lsa rost, aks holda yolg’on qiymat qaytaradi",
            "Agar ikkala shart ham rost bo’lsa, rost qiymat qaytaradi.",
            "Kamida bitta shart rost bo’lsa ham rost qiymat qaytaradi",
            "Obyektlar bir xil bo’lmasa rost, aks holda yolg’on qiymat qaytaradi",
            ""
        )
        val question5 = QuestionsList(
            "in qanday operator turi?",
            "A'zolik operatori",
            "Aniqlash operatori",
            "Mantiqiy operatori",
            "Bitli operator",
            "A'zolik operatori",
            ""
        )

        //add all questions to List<QuestionsList>
        questionsLists.add(question1)
        questionsLists.add(question2)
        questionsLists.add(question3)
        questionsLists.add(question4)
        questionsLists.add(question5)
        return questionsLists
    }

    private fun python6_Questions(): List<QuestionsList> {
        val questionsLists: MutableList<QuestionsList> = ArrayList()

        //Create object of QuestionsList class and pass a questions along with options and answer
        val question1 = QuestionsList(
            "is operatori qanday operator?",
            "A'zolik operatori",
            "Aniqlash operatori",
            "Mantiqiy operatori",
            "Bitli operator",
            "Aniqlash operatori",
            ""
        )
        val question2 = QuestionsList(
            "is  not operatori qanday operator?",
            "A'zolik operatori",
            "Aniqlash operatori",
            "Mantiqiy operatori",
            "Bitli operator",
            "Aniqlash operatori",
            ""
        )
        val question3 = QuestionsList(
            "and operatori qanday operator?",
            "A'zolik operatori",
            "Aniqlash operatori",
            "Mantiqiy operatori",
            "Bitli operator",
            "Mantiq operatori",
            ""
        )
        val question4 = QuestionsList(
            "or operatori qanday operator?",
            "A'zolik operatori",
            "Aniqlash operatori",
            "Mantiqiy operatori",
            "Bitli operator",
            "Mantiq operatori",
            ""
        )
        val question5 = QuestionsList(
            "not operatori qanday operator?",
            "A'zolik operatori",
            "Aniqlash operatori",
            "Mantiqiy operatori",
            "Bitli operator",
            "Mantiq operatori",
            ""
        )
        val question6 = QuestionsList(
            "not in  operatori qanday operator?",
            "A'zolik operatori",
            "Aniqlash operatori",
            "Mantiqiy operatori",
            "Bitli operator",
            "A'zolik operatori",
            ""
        )

        //add all questions to List<QuestionsList>
        questionsLists.add(question1)
        questionsLists.add(question2)
        questionsLists.add(question3)
        questionsLists.add(question4)
        questionsLists.add(question5)
        questionsLists.add(question6)
        return questionsLists
    }

    @JvmStatic
    fun getQuestions(selectedTopicName: String?): List<QuestionsList> {
        return when (selectedTopicName) {
            "2-qism" -> python2_Questions()
            "3-qism" -> python3_Questions()
            "4-qism" -> python4_Questions()
            "5-qism" -> python5_Questions()
            "6-qism" -> python6_Questions()
            else -> python1_Questions()
        }
    }
}