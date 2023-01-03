package com.example.internetmarketing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.example.internetmarketing.databinding.ActivityHomeOneBinding
import com.example.internetmarketing.databinding.ActivityHomeThreeBinding

class HomeThreeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeThreeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeThreeBinding.inflate(layoutInflater, null, false)
        setContentView(binding.root)


        supportActionBar!!.hide()
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        binding.textOne.text = "Internet-marketing afzalliklari\n" +
                "Internet-marketing an'anaviy marketingga nisbatan quyidagi \n" +
                "afzalliklarga ega:\n" +
                "\uF0B7 Kompaniyaning tez-tez o‘zgarib turadigan bozor sharoitlariga tez \n" +
                "moslashishi;\n" +
                "\uF0B7 Kompaniya internet-resurs (sayt)i foydalanuvchilaridan tezkor \n" +
                "qayta aloqaning mavjudligi;\n" +
                "\uF0B7 Kompaniya internet-resurs (sayt)iga kirgan potensial xaridorlar \n" +
                "soni haqidagi ma'lumotlarni avtomatik to‘plash;\n" +
                "\uF0B7 O‘z mahsulotini reklama qilish uchun cheklanmagan raqamli \n" +
                "maydon. Shu asnoda, yer sharining 56% dan ortiq aholisi \n" +
                "Internetdan foydalanadi [92].\n" +
                "\uF0B7 Rentabellik. Internet-marketing an'anaviy marketingdan arzonroq, \n" +
                "chunki katta miqdordagi tabiiy resurslardan foydalanishni talab \n" +
                "qilmaydi.\n" +
                "\uF0B7 Aniqlik. Internet-marketing texnologiyalari nuqtali reklama olib \n" +
                "borishga, ya'ni tovarlarni kerakli joyda, kerakli vaqtda, kerakli \n" +
                "mijozlarga reklama qilishga imkon beradi." +
                "Internet-marketing majmuasining asosiy elementlari\n" +
                "Elektron marketingda 4R marketing majmuasi elementlari \n" +
                "(Product, Price, Promotion, Place) va marketing munosabatlarining \n" +
                "umumiy modeli qo‘llaniladi. Biroq har bir element o‘z xususiyatlariga \n" +
                "ega. Internet nafaqat sotish yoki marketing kommunikasiyalari yangi \n" +
                "kanalidir, balki haqiqiy, jisman mavjud bo‘lgan tovarlar bilan qatorda \n" +
                "raqamli axborot tovarlari ham mavjud bo‘lgan yangi bozordir.\n" +
                "Product (Tovar) – Internet yordamida sotiladigan mahsulot bo‘lib, \n" +
                "munosib sifatga ega bo‘lishi lozim. U nafaqat boshqa saytlar bilan, balki \n" +
                "an'anaviy magazinlar bilan ham raqobat qiladi.\n" +
                "Price (Narx) – Internetdagi narxlar xarajatlarni tejash hisobidan \n" +
                "oddiy magazin narxlaridan pastroq, deb hisoblanadi.\n" +
                "Promotion (Reklama qilish) – sayt va umuman olganda mahsulotni \n" +
                "tarmoqda reklama qilish chora-tadbirlari majmuidir. U vositalarning \n" +
                "ulkan arsenalini o‘z ichiga oladi (qidiruv reklamasi, kontekstli reklama, \n" +
                "bannerli reklama, e - mail marketing, virusli marketing, yashirin \n" +
                "marketing, interaktiv marketing, bloglar bilan ishlash va hk.). \n" +
                "Place (Sotish joyi) – sotuvlar nuqtasi, ya'ni sayt. Saytning grafik \n" +
                "dizayni hamda yuzabilitisi (yuzabiliti – saytdan foydalanish qulayligi) \n" +
                "muhim rol' o‘ynaydi. Yuklanish tezligi, to‘lov tizimlari bilan ishlash, \n" +
                "yetkazib berish shartlari, mijozlar bilan sotishdan avval, sotish vaqtida \n" +
                "va sotishdan keyingi holatda ishlashga alohida e'tibor qaratish lozim.\n" +
                "Marketing elementlari integratsiyasi Internetning muhim \n" +
                "xususiyatidir. Klassik marketing majmuini (4R) internet-loyiha holatida \n" +
                "ajratish qiyin. Misol uchun, saytning dizayn va navigatsiyasi marketing \n" +
                "majmuining barcha 4 elementiga ham taalluqli." +
                "" +
                " Internet-marketing xususiyatlari\n" +
                "Elektron bozor taqdim etgan imkoniyatlardan samarali foydalanish \n" +
                "uchun ushbu bozorga chiqish qarorini qabul qilgan kompaniyalar o‘z \n" +
                "marketing faoliyatida muayyan harakatlarga tayyor turishlari kerak.\n" +
                "Internetning marketing xarakteristikalaridan muvaffaqiyatli \n" +
                "foydalanish uchun kompaniyalar quyidagi omillarga o‘z munosabatini \n" +
                "baholashlari lozim:\n" +
                "\uF0B7 Biznes-jarayonlar siqilishi va mijozlar talablariga javob berish \n" +
                "tezligining oshirilishi;\n" +
                "\uF0B7 Ko‘p sonli hamkorlar bilan birga ishlash;\n" +
                "\uF0B7 Individual xizmat ko‘rsatishga o‘tish;\n" +
                "\uF0B7 Biznesga bo‘lgan moslashuvchanlikning mavjudligi.\n" +
                "Biznes-jarayonlar siqilishi. Xaridor talabnomalariga javob berish \n" +
                "tezkorligi elektron biznes unumdorligini belgilaydi. Elektron bozorlar, \n" +
                "savdo-sotiq kataloglari va tizimlari, hamda Internetdagi qidiruv \n" +
                "xizmatlari shunday ochiq muhit yaratishadiki, unda buyurtma va uning \n" +
                "bajarilishi orasidagi vaqt lahzalar yoki daqiqalarda hisoblanadi. Elektron \n" +
                "biznesda muvaffaqiyatli faoliyat yuritayotgan kompaniyalar daromadli \n" +
                "Web-loyiha yaratish uchun ortiqcha amaliyotlardan voz kechishga \n" +
                "intiladi. Ko‘pincha urg‘u ketma-ket o‘zaro harakatlar seriyasiga emas, \n" +
                "balki korxonalarga buyurtmalarni real vaqtda bajarishga imkon \n" +
                "beradigan parallel muloqotga beriladi.\n" +
                "Internetdagi biznes – bu bir sutkada 24 soat, haftada 7 kun \n" +
                "ishlaydigan real vaqtdagi biznesdir. Iste'molchi boshqa ta'minlovchidan \n" +
                "har qanday mahsulotni yoki xizmatni olish uchun tugmachani bosishi \n" +
                "yetarligi bois, korxona tezkor ishlashi lozim. \n" +
                "Elektron biznesda kompaniya raqobatli kurashda o‘z pozisiyalarini \n" +
                "yangicha tushunishi va baholashi darkor. \n" +
                "Ko‘p sonli hamkorlar bilan birga ishlash. Elektron biznes oddiy \n" +
                "buyurtma va hisob-kitoblar doirasidan chiqqan munosabatlar \n" +
                "kompleksini qo‘llab-quvvatlashi kerak."


    }
}