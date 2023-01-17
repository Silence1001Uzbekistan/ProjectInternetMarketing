package com.example.internetmarketing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.example.internetmarketing.databinding.ActivityHomeOneBinding

class HomeActivityFour : AppCompatActivity() {

    lateinit var binding: ActivityHomeOneBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeOneBinding.inflate(layoutInflater, null, false)
        setContentView(binding.root)


        supportActionBar!!.hide()
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )



        binding.textOne.text = "Ijtimoiy tarmoqlardagi marketing (SMM – social media \n" +
                "marketing) – nisbatan yangi va istiqbolli yo‘nalish bo‘lib, nafaqat \n" +
                "marketingning zamonaviy dunyodagi pozitsiyalarini o‘rnatishga, balki \n" +
                "muvozanatli va barqaror rivojlanishni ta'minlashga marketing \n" +
                "yondashuvi yordamida hal etish mumkin bo‘lgan muammolar doirasini \n" +
                "kengaytirishga imkon beradi.\n" +
                "Ijtimoiy tarmoqlardagi marketing (SMM) marketing va \n" +
                "kommunikasion strategiyaning bir qismidir. Bu kompaniya yoki brendni \n" +
                "targ‘ib etish va boshqa biznes-muammolarni hal etish uchun kanallar \n" +
                "sifatida ijtimoiy medialardan foydalanish bo‘yicha chora-tadbirlar \n" +
                "majmuidir [58].\n" +
                "Ijtimoiy tarmoqlardagi marketing (SMM) atamasi o‘tgan asrning \n" +
                "70-yillarida ishlatila boshlandi. U ba'zi ijtimoiy muammolarni hal etish \n" +
                "maqsadida o‘tkaziladigan tadbirlardan iborat edi.\n" +
                "Har qanday kompaniya o‘tkazadigan ijtimoiy tarmoqlardagi \n" +
                "marketing (SMM) maqsadi – xizmat ko‘rsatish yoki tovar sotishlarni \n" +
                "jamiyat uchun foydali loyihalar bilan birlashtirish hisobiga potensial \n" +
                "mijozlar sodiqligini oshirishdir.\n" +
                "SMM ning asosiy vazifalari quyidagilar:\n" +
                "\uF0B7 Kompaniya brendiga maqsadli auditoriyani jalb qilish;\n" +
                "\uF0B7 Maqsadli auditoriya ko‘zida kompaniyaning ijobiy imidjini \n" +
                "yaratish;\n" +
                "\uF0B7 Mijozlar bilan teskari aloqani tashkil etish;\n" +
                "\uF0B7 Saytga qo‘shimcha trafikni jalb qilish;\n" +
                "\uF0B7 Foydalanuvchi sodiqligini oshirish ustida ishlash.\n" +
                "SMM usullar" +
                "Xayriya ishlari. Bunga mijozlarda xayriya ishlariga yoki jamiyat \n" +
                "uchun foydali bo‘lgan tadbirlarga aloqadorlik hissini \n" +
                "shakllantiradigan aksiyalar kiradi.\n" +
                "\uF0B7 Fandrayzing. Ushbu resurslar joylashgan hududda iqtisodiyotni \n" +
                "yaxshilash maqsadida resurslarni birlashtirishga qaratilgan chora\u0002tadbirlar.\n" +
                "\uF0B7 Homiylik. Mashhur bo‘lgan ijtimoiy marketingning turlaridan biri. \n" +
                "U ba'zi guruh insonlarga yordam ko‘rsatishdan iborat. Kam \n" +
                "ta'minlangan oilalarni qo‘llab-quvvatlash, sport musobaqalarini \n" +
                "tashkil qilish va hk.lar bunga misol bo‘ladi.\n" +
                "Ijtimoiy tarmoqlardagi marketingning turlari\n" +
                "Bugungi kunda ijtimoiy tarmoqlardagi marketingning quyidagi \n" +
                "turlari keng tarqalgan:\n" +
                "\uF0B7 Sog‘liqni saqlash sohasidagi ijtimoiy marketing;\n" +
                "\uF0B7 Dindagi ijtimoiy marketing;\n" +
                "\uF0B7 Madaniyat sohasidagi ijtimoiy marketing;\n" +
                "\uF0B7 Sport sohasidagi ijtimoiy marketing;\n" +
                "\uF0B7 Atrof-muhitni muhofaza qilishdagi ijtimoiy marketing;\n" +
                "\uF0B7 Xayriya ishlari sohasidagi ijtimoiy marketing;\n" +
                "\uF0B7 Ta'lim sohasidagi ijtimoiy marketing.\n" +
                "Ijtimoiy (SMM) marketingni tashkil qilish\n" +
                "Ijtimoiy marketingni tashkil qilish quyidagi bosqichlardan iborat:\n" +
                "1-bosqich. Muammoni aniqlash\n" +
                "Ushbu bosqichda muammoning mohiyati aniqlanadi. Agar \n" +
                "muammo to‘liq bo‘lmay va sifatsiz aniqlansa, bu samarasiz dastur \n" +
                "ishlanishiga olib keladi. Muammo dastur qaratilgan o‘sha maqsadli \n" +
                "auditoriya nuqtai nazaridan ko‘rilishi lozim.\n" +
                "2-bosqich. Maqsadli auditoriyani tanlash bo‘yicha faoliyat\n" +
                "Muammo aniqlangach, maqsadli auditoriya shakllanadi. Uni kichik \n" +
                "guruhlarga bo‘lishadi, so‘ngra bitta yoki bir nechtasini ijtimoiy \n" +
                "marketing dasturi uchun asos sifatida tanlashadi. Agar ushbu dastur \n" +
                "davlat tomonidan moliyalashtirilsa, u holda bu dastur aholining nochor \n" +
                "qatlamlarini qamrab olishi kerak. \n" +
                "3-bosqich. Maqsadli auditoriya bo‘yicha qo‘shimcha \n" +
                "tadqiqotlar o‘tkazish\n" +
                "Bu bosqichda tanlangan guruh o‘rganilib, kelajak dasturni amalga \n" +
                "oshirish uchun foydali bo‘lgan ma'lumotlar to‘planadi.\n" +
                "4-bosqich. Reja ishlab chiqish jarayoni\n" +
                "Reja puxta tuzilib, o‘z ichiga bir necha muhim qismlarni olishi \n" +
                "kerak:\n" +
                "\uF0B7 Avvalgisi o‘rniga qanday mahsulot taklif etiladi;\n" +
                "\uF0B7 Qanday qilib internet-resurs foydalanuvchisi ushbu mahsulotga \n" +
                "ega bo‘lishi mumkin;\n" +
                "\uF0B7 Kutilgan yakuniy natija;\n" +
                "\uF0B7 Ushbu reja amalga oshadigan davr.\n" +
                "5-bosqich. Xulq-atvor o‘zgarishi tahlili\n" +
                "SMM marketing bo‘yicha mutaxassislar xulq-atvor o‘zgarishidagi \n" +
                "aynan qaysisini auditoriyaga taklif etishni aniq tushunishlari lozim. \n" +
                "Odatda odamlar yangi mahsulotni, uning ijobiy ta'sirini tushunganda, \n" +
                "ushbu mahsulot afzalliklarini baholash va uni avvalgisi bilan solishtirish \n" +
                "imkoni mavjud bo‘lganda, qabul qilishadi.\n" +
                "6-bosqich. Mahsulot ishlab chiqish jarayoni\n" +
                "SMM marketing bilan shug‘ullanadigan mutaxassislar ko‘pincha \n" +
                "aholiga iste'molchi xulq-atvorini o‘zgartira oladigan muayyan \n" +
                "mahsulotni taklif etishadi. Bunday o‘zgarishlarga undaydigan \n" +
                "mahsulotlar ishlab chiqiladi, ijtimoiy marketingni boshqa \n" +
                "metodikalardan ajratib turadigan ham budir.\n" +
                "7-bosqich. Mahsulot narxini nazorat qilish jarayoni\n" +
                "SMM marketing kontekstida gapiradigan bo‘lsak, mahsulot narxi \n" +
                "aynan moliyaviy ifodada ko‘pincha hisobga olinmaydi, lekin psixologik \n" +
                "xarajatlar, ya'ni sarflangan vaqt, qilingan sa'y-harakatlar, jiddiy bo‘lishi \n" +
                "mumkin. Marketing nuqtai nazaridan, odamlar eski mahsulot o‘rniga \n" +
                "yangi mahsulot olishlari yoki xulq-atvorning biron yangi modelini qabul \n" +
                "qilishlari lozim. SMM marketingda narxni minimalgacha tushirish \n" +
                "imkonsiz. Iste'molchi bunday holatda faqat o‘z inersiyasini bartaraf \n" +
                "etish, qandaydir qiziqishlarni o‘zgartirish bo‘yicha xarajatlar qiladi" +
                "8-bosqich. Dastur ularning yordamlari bilan bajarilishi kerak \n" +
                "bo‘lgan ishtirokchilar tanlovini amalga oshirish\n" +
                "Mahsulot ishlab chiqaruvchisi uni tarqatish yo‘llarini tashkil \n" +
                "etishga muhtojdir. Tayyor mahsulotni iste'molchilarga yetkazish talab \n" +
                "etiladi. Ijtimoiy marketing dasturlarining bir qismi iste'molchi jismoniy \n" +
                "jihatdan olishi kerak bo‘lgan mahsulotlarni taklif etishadi. Boshqalar \n" +
                "esa, aksincha, mahsulot bilan ishlamaydi, lekin o‘z dasturlari to‘liq \n" +
                "bajarilishi uchun turli guruhlar bilan o‘zaro ta'sirda bo‘lishlari lozim.\n" +
                "9-bosqich. Axborot komponentini ishlab chiqish\n" +
                "Ijtimoiy marketing dasturining axborot komponenti reklama \n" +
                "tadbirlarini, iste'molchilar bilan muloqotni va bir qator boshqa \n" +
                "variantlarni o‘z ichiga oladi. U yangi mahsulotni mashhur qilish \n" +
                "maqsadida ishlab chiqiladi. Albatta, reklama bu holda eng samarali \n" +
                "vositadir, chunki aynan u aniq dasturning mohiyatini tushuntirib beradi.\n" +
                "Auditoriya tanlanib, xabarlar tayyorlanadi, so‘ngra iste'molchida \n" +
                "qiziqish uyg‘otish uchun ularni ijtimoiy marketingga uzatishadi.\n" +
                "Kerakli samaraga erishish uchun, axborotning har bir komponentini \n" +
                "puxta o‘ylash, hamda uni oldindan maqsadli auditoriyada sinash lozim. \n" +
                "Biron murakkabliklar yuzaga kelsa, nimadir o‘zgartirishga, tuzatishga \n" +
                "imkon bo‘ladi. \n" +
                "10-bosqich. Ishlangan dastur samaradorligini tahlil etish\n" +
                "SMM marketingning har qanday dasturi samaradorlikni nazorat \n" +
                "qilishga va tahlil etishga muhtoj. Uning har bir komponenti bajarilishiga \n" +
                "qarab, kamchiliklarni, bajarish uchun to‘siqlarni aniqlash, hamda \n" +
                "xatolarni tuzatish uchun, kuzatib boriladi. Bunday dasturlarning ko‘p \n" +
                "qismini davlat tuzilmalari moliyalashtiradi, shu sababli ularning byudjeti \n" +
                "qat'iy cheklangan. Bajarilish natijalari tahlili esa keyin qaysi yo‘nalishda \n" +
                "yurish kerakligini va umuman buni qilish kerak-kerakmasligini \n" +
                "aniqlashga yordam beradi.\n"

    }
}